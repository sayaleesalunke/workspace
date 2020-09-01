package com.stocks.screener.model;

public class InputValues {
    String StockName;
    Integer Year;
    Float EBIDTA;
    Float TotalRevenue;
    Float OtherIncome;
    Float PAT;
    Float ShareholdersEquity;
    Float AverageAsset;
    Float PBIT;
    Float ShortTerm_Debt;
    Float LongTerm_Debt;
    Float Interest;
    Float TotalAsset;
    Float TotalAssetPreviousYR;
    Float CurrentAsset;
    Float CurrentAssetPreviousYR;
    Float CurrentLiabilities;
    Float CurrentLiabilitiesPreviousYR;
    Float OperatingRevenue;
    Float AverageTotalAsset;
    Float WorkingCapital;
    Float WorkingCapitalPreviousYR;
    Float AverageWorkingCapital;

    InputValues(){}
    public InputValues(String StockName,Integer Year,Float EBIDTA,Float TotalRevenue,
                       Float OtherIncome,Float PAT,Float ShareholdersEquity,
                       Float AverageAsset,Float PBIT,Float ShortTerm_Debt,
                       Float LongTerm_Debt,Float Interest, Float TotalAsset,
                       Float TotalAssetPreviousYR, Float CurrentAsset,
                       Float CurrentAssetPreviousYR, Float CurrentLiabilities,
                       Float CurrentLiabilitiesPreviousYR,
                       Float OperatingRevenue,Float AverageTotalAsset,Float WorkingCapital,
                       Float WorkingCapitalPreviousYR,Float AverageWorkingCapital)
    {this.StockName=this.StockName;this.Year=Year;this.EBIDTA=EBIDTA;
     this.TotalRevenue=TotalRevenue; this.OtherIncome=OtherIncome;this.PAT=PAT;
     this.ShareholdersEquity=ShareholdersEquity;this.AverageAsset=AverageAsset;
     this.PBIT=PBIT;this.ShortTerm_Debt=ShortTerm_Debt;this.LongTerm_Debt=LongTerm_Debt;
     this.Interest=Interest;this.TotalAsset=TotalAsset;this.TotalAssetPreviousYR=TotalAssetPreviousYR;
     this.CurrentAsset=CurrentAsset;this.CurrentAssetPreviousYR=CurrentAssetPreviousYR;
     this.CurrentLiabilities=CurrentLiabilities;this.CurrentLiabilitiesPreviousYR=CurrentLiabilitiesPreviousYR;
     this.OperatingRevenue=OperatingRevenue;this.AverageTotalAsset=AverageTotalAsset;
     this.WorkingCapital=WorkingCapital;this.WorkingCapitalPreviousYR=WorkingCapitalPreviousYR;
     this.AverageWorkingCapital=AverageWorkingCapital;
    }


    public String getStockName() {
        return StockName;
    }

    public void setStockName(String stockName) {
        StockName = stockName;
    }

    public Integer getYear() {
        return Year;
    }

    public void setYear(Integer year) {
        Year = year;
    }

    public Float getEBIDTA() {
        return EBIDTA;
    }

    public void setEBIDTA(Float EBIDTA) {
        this.EBIDTA = EBIDTA;
    }

    public Float getTotalRevenue() {
        return TotalRevenue;
    }

    public void setTotalRevenue(Float totalRevenue) {
        TotalRevenue = totalRevenue;
    }

    public Float getOtherIncome() {
        return OtherIncome;
    }

    public void setOtherIncome(Float otherIncome) {
        OtherIncome = otherIncome;
    }

    public Float getPAT() {
        return PAT;
    }

    public void setPAT(Float PAT) {
        this.PAT = PAT;
    }

    public Float getShareholdersEquity() {
        return ShareholdersEquity;
    }

    public void setShareholdersEquity(Float shareholdersEquity) {
        ShareholdersEquity = shareholdersEquity;
    }

    public Float getAverageAsset() {
        return AverageAsset;
    }

    public void setAverageAsset(Float averageAsset) {
        AverageAsset = averageAsset;
    }

    public Float getPBIT() {
        return PBIT;
    }

    public void setPBIT(Float PBIT) {
        this.PBIT = PBIT;
    }

    public Float getShortTerm_Debt() {
        return ShortTerm_Debt;
    }

    public void setShortTerm_Debt(Float shortTerm_Debt) {
        ShortTerm_Debt = shortTerm_Debt;
    }

    public Float getLongTerm_Debt() {
        return LongTerm_Debt;
    }

    public void setLongTerm_Debt(Float longTerm_Debt) {
        LongTerm_Debt = longTerm_Debt;
    }

    public Float getInterest() {
        return Interest;
    }

    public void setInterest(Float interest) {
        Interest = interest;
    }

    public Float getTotalAsset() {
        return TotalAsset;
    }

    public void setTotalAsset(Float totalAsset) {
        TotalAsset = totalAsset;
    }

    public Float getTotalAssetPreviousYR() {
        return TotalAssetPreviousYR;
    }

    public void setTotalAssetPreviousYR(Float totalAssetPreviousYR) {
        TotalAssetPreviousYR = totalAssetPreviousYR;
    }

    public Float getCurrentAsset() {
        return CurrentAsset;
    }

    public void setCurrentAsset(Float currentAsset) {
        CurrentAsset = currentAsset;
    }

    public Float getCurrentAssetPreviousYR() {
        return CurrentAssetPreviousYR;
    }

    public void setCurrentAssetPreviousYR(Float currentAssetPreviousYR) {
        CurrentAssetPreviousYR = currentAssetPreviousYR;
    }

    public Float getCurrentLiabilities() {
        return CurrentLiabilities;
    }

    public void setCurrentLiabilities(Float currentLiabilities) {
        CurrentLiabilities = currentLiabilities;
    }

    public Float getCurrentLiabilitiesPreviousYR() {
        return CurrentLiabilitiesPreviousYR;
    }

    public void setCurrentLiabilitiesPreviousYR(Float currentLiabilitiesPreviousYR) {
        CurrentLiabilitiesPreviousYR = currentLiabilitiesPreviousYR;
    }

    public Float getOperatingRevenue() {
        return OperatingRevenue;
    }

    public void setOperatingRevenue(Float operatingRevenue) {
        OperatingRevenue = operatingRevenue;
    }

    public Float getAverageTotalAsset() {
        return AverageTotalAsset;
    }

    public void setAverageTotalAsset(Float averageTotalAsset) {
        AverageTotalAsset = averageTotalAsset;
    }

    public Float getWorkingCapital() {
        return WorkingCapital;
    }

    public void setWorkingCapital(Float workingCapital) {
        WorkingCapital = workingCapital;
    }

    public Float getWorkingCapitalPreviousYR() {
        return WorkingCapitalPreviousYR;
    }

    public void setWorkingCapitalPreviousYR(Float workingCapitalPreviousYR) {
        WorkingCapitalPreviousYR = workingCapitalPreviousYR;
    }

    public Float getAverageWorkingCapital() {
        return AverageWorkingCapital;
    }

    public void setAverageWorkingCapital(Float averageWorkingCapital) {
        AverageWorkingCapital = averageWorkingCapital;
    }
}
