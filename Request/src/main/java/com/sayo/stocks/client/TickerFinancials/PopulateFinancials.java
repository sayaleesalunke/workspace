package com.sayo.stocks.client.TickerFinancials;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class PopulateFinancials {
    public static void runLogic(String  stockName,String stockCode,String sector,String type)
    {
        String inputData = "",response="";
        JSONArray jsonarr_1;
        JSONObject jobj;
        JSONParser jsonParser = new JSONParser();
        HttpURLConnection getConnection=null,postConnection=null;
        try
        {
            getConnection=getGETConnection( stockCode, type);
            getConnection.connect();
            int responsecode = getConnection.getResponseCode();
            System.out.println("Response code is: " +responsecode);
            if(responsecode != 200)
                throw new RuntimeException("HttpResponseCode: " +responsecode);
            else
            {
                Scanner sc = new Scanner(getConnection.getInputStream());
                while(sc.hasNext())
                {
                    inputData+=sc.nextLine();
                }
                sc.close();
            }

            jobj = (JSONObject) jsonParser.parse(inputData);
            jsonarr_1 = (JSONArray) jobj.get("data");
            for (int i = 0; i < jsonarr_1.size(); i++)
            {
                ((JSONObject)jsonarr_1.get(i)).put("stockname",stockName);
                ((JSONObject)jsonarr_1.get(i)).put("sector",sector);

            }
            System.out.println(jsonarr_1);

            postConnection=getPOSTConnection(type);
            OutputStream os = postConnection.getOutputStream();
            BufferedWriter writer = new BufferedWriter(
                    new OutputStreamWriter(os, "UTF-8"));
            writer.write(jsonarr_1.toJSONString());
            writer.flush();
            writer.close();
            os.close();
            int responseCode=postConnection.getResponseCode();
            if (responseCode == 200) {
                String line;
                BufferedReader br=new BufferedReader(new InputStreamReader(postConnection.getInputStream()));
                while ((line=br.readLine()) != null) {
                    response+=line;
                }
            }
            else {
                response="";

            }

            System.out.println("--------------"+response+"--------------");
            getConnection.disconnect();
            postConnection.disconnect();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }


    }

    public static HttpURLConnection getGETConnection(String stockCode,String type)
    {
        HttpURLConnection getConnection=null;
        try {
            URL url = new URL("https://api.tickertape.in/stocks/financials/"+type+"/"+stockCode+"/annual/normal?count=10");
             getConnection = (HttpURLConnection)url.openConnection();
            getConnection.setRequestMethod("GET");

        }
        catch(Exception e)
        {}

        return getConnection;
    }
    public static HttpURLConnection getPOSTConnection(String type)
    {
        HttpURLConnection postConnection=null;
        try {
            URL posturl = new URL("http://localhost:8081/"+type+"/addAll");
            postConnection = (HttpURLConnection) posturl.openConnection();
            postConnection.setRequestMethod("POST");
            postConnection.setRequestProperty("Content-Type", "application/json; utf-8");
            postConnection.setRequestProperty("Accept", "application/json");
            postConnection.setDoOutput(true);
        }
        catch(Exception e)
        {}
        return postConnection;
    }

}
