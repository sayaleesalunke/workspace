package com.stocks.screener.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@AllArgsConstructor
@Entity
@IdClass(StockId.class)
public class BalanceSheet {

    @Id
    @Column(name = "stockname")
    private String stockname;

    @Id
    @Column(name = "displayPeriod")
    private String displayPeriod;

    @Column(name = "SECTOR")
    private String sector;

    @Column(name = "CashandShortTermInvestments")
    private Float balCsti;

    @Column(name = "TotalReceivables")
    private Float balTrec;

    @Column(name = "TotalInventory")
    private Float balTinv;

    @Column(name = "OtherCurrentAssets")
    private Float balOca;

    @Column(name = "CurrentAssets")
    private Float balTca;

    @Column(name = "NetPropertyPlantEquipment")
    private Float balNppe;

    @Column(name = "GoodwillAndIntangibles")
    private Float balGint;

    @Column(name = "LongTermInvestments")
    private Float balLti;

    @Column(name = "OtherAssets")
    private Float balOtha;

    @Column(name = "NonCurrentAssets")
    private Float balNca;

    @Column(name = "TotalAssets")
    private Float balTota;

    @Column(name = "AccountsPayable")
    private Float balAccp;

    @Column(name = "OtherCurrentLiabilities")
    private Float balOcl;

    @Column(name = "CurrentLiabilities")
    private Float balTcl;

    @Column(name = "TotalLongTermDebt")
    private Float balTltd;

    @Column(name = "NetDeferredTaxLiabilities")
    private Float balDit;

    @Column(name = "OtherLiabilities")
    private Float balOthl;

    @Column(name = "NonCurrentLiabilities")
    private Float balNcl;

    @Column(name = "TotalLiabilities")
    private Float balTotl;

    @Column(name = "CommonStock")
    private Float balComs;

    @Column(name = "AdditionalPaidInCapital")
    private Float balApic;

    @Column(name = "ReservesAndSurplus")
    private Float balRtne;

    @Column(name = "MinorityInterest")
    private Float balMint;

    @Column(name = "OtherEquity")
    private Float balOeq;

    @Column(name = "TotalEquity")
    private Float balTeq;

    @Column(name = "TotalLiabilitiesAndShareholderEquity")
    private Float balTlse;

    @Column(name = "TotalCommonSharesOutstanding")
    private Float balTcso;

    public BalanceSheet() {
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

    public Float getBalCsti() {
        return balCsti;
    }

    public void setBalCsti(Float balCsti) {
        this.balCsti = balCsti;
    }

    public Float getBalTrec() {
        return balTrec;
    }

    public void setBalTrec(Float balTrec) {
        this.balTrec = balTrec;
    }

    public Float getBalTinv() {
        return balTinv;
    }

    public void setBalTinv(Float balTinv) {
        this.balTinv = balTinv;
    }

    public Float getBalOca() {
        return balOca;
    }

    public void setBalOca(Float balOca) {
        this.balOca = balOca;
    }

    public Float getBalTca() {
        return balTca;
    }
    public Integer getYear() {
        return Integer.parseInt(displayPeriod.substring(3));
    }
    public void setBalTca(Float balTca) {
        this.balTca = balTca;
    }

    public Float getBalNppe() {
        return balNppe;
    }

    public void setBalNppe(Float balNppe) {
        this.balNppe = balNppe;
    }

    public Float getBalGint() {
        return balGint;
    }

    public void setBalGint(Float balGint) {
        this.balGint = balGint;
    }

    public Float getBalLti() {
        return balLti;
    }

    public void setBalLti(Float balLti) {
        this.balLti = balLti;
    }

    public Float getBalOtha() {
        return balOtha;
    }

    public void setBalOtha(Float balOtha) {
        this.balOtha = balOtha;
    }

    public Float getBalNca() {
        return balNca;
    }

    public void setBalNca(Float balNca) {
        this.balNca = balNca;
    }

    public Float getBalTota() {
        return balTota;
    }

    public void setBalTota(Float balTota) {
        this.balTota = balTota;
    }

    public Float getBalAccp() {
        return balAccp;
    }

    public void setBalAccp(Float balAccp) {
        this.balAccp = balAccp;
    }

    public Float getBalOcl() {
        return balOcl;
    }

    public void setBalOcl(Float balOcl) {
        this.balOcl = balOcl;
    }

    public Float getBalTcl() {
        return balTcl;
    }

    public void setBalTcl(Float balTcl) {
        this.balTcl = balTcl;
    }

    public Float getBalTltd() {
        return balTltd;
    }

    public void setBalTltd(Float balTltd) {
        this.balTltd = balTltd;
    }

    public Float getBalDit() {
        return balDit;
    }

    public void setBalDit(Float balDit) {
        this.balDit = balDit;
    }

    public Float getBalOthl() {
        return balOthl;
    }

    public void setBalOthl(Float balOthl) {
        this.balOthl = balOthl;
    }

    public Float getBalNcl() {
        return balNcl;
    }

    public void setBalNcl(Float balNcl) {
        this.balNcl = balNcl;
    }

    public Float getBalTotl() {
        return balTotl;
    }

    public void setBalTotl(Float balTotl) {
        this.balTotl = balTotl;
    }

    public Float getBalComs() {
        return balComs;
    }
    public String getId() {
        return stockname+"_"+displayPeriod;
    }

    public void setBalComs(Float balComs) {
        this.balComs = balComs;
    }

    public Float getBalApic() {
        return balApic;
    }

    public void setBalApic(Float balApic) {
        this.balApic = balApic;
    }

    public Float getBalRtne() {
        return balRtne;
    }

    public void setBalRtne(Float balRtne) {
        this.balRtne = balRtne;
    }

    public Float getBalMint() {
        return balMint;
    }

    public void setBalMint(Float balMint) {
        this.balMint = balMint;
    }

    public Float getBalOeq() {
        return balOeq;
    }

    public void setBalOeq(Float balOeq) {
        this.balOeq = balOeq;
    }

    public Float getBalTeq() {
        return balTeq;
    }

    public void setBalTeq(Float balTeq) {
        this.balTeq = balTeq;
    }

    public Float getBalTlse() {
        return balTlse;
    }

    public void setBalTlse(Float balTlse) {
        this.balTlse = balTlse;
    }

    public Float getBalTcso() {
        return balTcso;
    }

    public void setBalTcso(Float balTcso) {
        this.balTcso = balTcso;
    }
}
