package com.stocks.screener.controller;

import com.stocks.screener.service.RatioCalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RatioCalculatorController {

    @Autowired
    RatioCalculatorService ratioCalculatorService;

    @ResponseBody
    @RequestMapping(value = "/ratio/getAll",method = RequestMethod.GET)
    public String getAllRatios()
    {
        return this.ratioCalculatorService.calculateRatio();
    }
}
