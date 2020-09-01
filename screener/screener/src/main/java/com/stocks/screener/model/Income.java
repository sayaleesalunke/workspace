package com.stocks.screener.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import javax.persistence.*;
import java.util.Date;

@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@AllArgsConstructor
@Entity
@IdClass(StockId.class)
public class Income {

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

    @Column(name = "TotalRevenue")
    private Float incTrev;

    @Column(name = "RawMaterials")
    private Float incRaw;

    @Column(name = "PowerFuelCost")
    private Float incPfc;

    @Column(name = "EmployeeCost")
    private Float incEpc;

    @Column(name = "SellingAdministrativeExpenses")
    private Float incSga;

    @Column(name = "OperatingAndOtherexpenses")
    private Float incOpe;

    @Column(name = "EBITDA")
    private Float incEbi;

    @Column(name = "DepreciationAmortization")
    private Float incDep;

    @Column(name = "PBIT")
    private Float incPbi;

    @Column(name = "InterestAndOtherItems")
    private Float incIoi;

    @Column(name = "PBT")
    private Float incPbt;

    @Column(name = "TaxesAndOtherItems")
    private Float incToi;

    @Column(name = "NetIncome")
    private Float incNinc;

    @Column(name = "EPS")
    private Float incEps;

    @Column(name = "DPS")
    private Float incDps;

    @Column(name = "PayoutRatio")
    private Float incPyr;

    public Income() {
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
    public Integer getYear() {
        return Integer.parseInt(displayPeriod.substring(3));
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Float getIncTrev() {
        return incTrev;
    }

    public void setIncTrev(Float incTrev) {
        this.incTrev = incTrev;
    }

    public Float getIncRaw() {
        return incRaw;
    }

    public void setIncRaw(Float incRaw) {
        this.incRaw = incRaw;
    }

    public Float getIncPfc() {
        return incPfc;
    }

    public void setIncPfc(Float incPfc) {
        this.incPfc = incPfc;
    }

    public Float getIncEpc() {
        return incEpc;
    }
    public String getId() {
        return stockname+"_"+displayPeriod;
    }

    public void setIncEpc(Float incEpc) {
        this.incEpc = incEpc;
    }

    public Float getIncSga() {
        return incSga;
    }

    public void setIncSga(Float incSga) {
        this.incSga = incSga;
    }

    public Float getIncOpe() {
        return incOpe;
    }

    public void setIncOpe(Float incOpe) {
        this.incOpe = incOpe;
    }

    public Float getIncEbi() {
        return incEbi;
    }

    public void setIncEbi(Float incEbi) {
        this.incEbi = incEbi;
    }

    public Float getIncDep() {
        return incDep;
    }

    public void setIncDep(Float incDep) {
        this.incDep = incDep;
    }

    public Float getIncPbi() {
        return incPbi;
    }

    public void setIncPbi(Float incPbi) {
        this.incPbi = incPbi;
    }

    public Float getIncIoi() {
        return incIoi;
    }

    public void setIncIoi(Float incIoi) {
        this.incIoi = incIoi;
    }

    public Float getIncPbt() {
        return incPbt;
    }

    public void setIncPbt(Float incPbt) {
        this.incPbt = incPbt;
    }

    public Float getIncToi() {
        return incToi;
    }

    public void setIncToi(Float incToi) {
        this.incToi = incToi;
    }

    public Float getIncNinc() {
        return incNinc;
    }

    public void setIncNinc(Float incNinc) {
        this.incNinc = incNinc;
    }

    public Float getIncEps() {
        return incEps;
    }

    public void setIncEps(Float incEps) {
        this.incEps = incEps;
    }

    public Float getIncDps() {
        return incDps;
    }

    public void setIncDps(Float incDps) {
        this.incDps = incDps;
    }

    public Float getIncPyr() {
        return incPyr;
    }

    public void setIncPyr(Float incPyr) {
        this.incPyr = incPyr;
    }
}
