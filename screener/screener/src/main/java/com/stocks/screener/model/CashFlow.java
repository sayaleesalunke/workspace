package com.stocks.screener.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.util.Date;

@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@AllArgsConstructor
@Entity
@IdClass(StockId.class)
public class CashFlow {

/*    @Id
    @GeneratedValue
    long id;*/
    @Id
    @Column(name = "stockname")
    private String stockname;

    @Id
    @Column(name = "displayPeriod")
    private String displayPeriod;

    @Column(name = "SECTOR")
    private String sector;

    @Column(name = "END_DATE")
    private Date endDate;

    @Column(name = "ChgWorkingCapital")
    private Float cafCiwc;

    @Column(name = "CashOpsActivity")
    private Float cafCfoa;

    @Column(name = "CapExpenditure")
    private Float cafCexp;

    @Column(name = "CashFromInvesting")
    private Float cafCfia;

    @Column(name = "cafTcdp")
    private Float cafTcdp;

    @Column(name = "CashFromFin")
    private Float cafCffa;

    @Column(name = "cafFee")
    private Float cafFee;

    @Column(name = "NetChgInCash")
    private Float cafNcic;

    @Column(name = "FreeCashFlow")
    private Float cafFcf;

    public CashFlow() {
    }


    public String getStockname() {
        return stockname;
    }

    public void setStockname(String stockname) {
        this.stockname = stockname;
    }

    public String getDisplayPeriod() {
        return displayPeriod;
    }

    public void setDisplayPeriod(String displayPeriod) {
        this.displayPeriod = displayPeriod;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Float getCafCiwc() {
        return cafCiwc;
    }

    public void setCafCiwc(Float cafCiwc) {
        this.cafCiwc = cafCiwc;
    }

    public Float getCafCfoa() {
        return cafCfoa;
    }

    public void setCafCfoa(Float cafCfoa) {
        this.cafCfoa = cafCfoa;
    }

    public Float getCafCexp() {
        return cafCexp;
    }

    public void setCafCexp(Float cafCexp) {
        this.cafCexp = cafCexp;
    }

    public Float getCafCfia() {
        return cafCfia;
    }

    public void setCafCfia(Float cafCfia) {
        this.cafCfia = cafCfia;
    }

    public Float getCafTcdp() {
        return cafTcdp;
    }

    public void setCafTcdp(Float cafTcdp) {
        this.cafTcdp = cafTcdp;
    }

    public Float getCafCffa() {
        return cafCffa;
    }

    public void setCafCffa(Float cafCffa) {
        this.cafCffa = cafCffa;
    }

    public Float getCafFee() {
        return cafFee;
    }
    public String getId() {
        return stockname+"_"+displayPeriod;
    }
    public Integer getYear() {
        return Integer.parseInt(displayPeriod.substring(3));
    }

    public void setCafFee(Float cafFee) {
        this.cafFee = cafFee;
    }

    public Float getCafNcic() {
        return cafNcic;
    }

    public void setCafNcic(Float cafNcic) {
        this.cafNcic = cafNcic;
    }

    public Float getCafFcf() {
        return cafFcf;
    }

    public void setCafFcf(Float cafFcf) {
        this.cafFcf = cafFcf;
    }
}



    //constructor, setters and getters omitted for brevity

