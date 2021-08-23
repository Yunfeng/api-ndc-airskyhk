package cn.buk.api.airskyhk.dto;


import java.util.List;

public class FareInfo {

    /**
     * 0 公布运价
     * 1 私有运价
     * 2 规则运价（新增）
     * 3 直减运价（新增）
     * 4 定向白名单运价(新增)
     */
    private int fareType;

    /**
     * 运价产品ID
     * 除了公布运价没有运价ID，其它都有
     */
    private String fareId;

    private String fareCode;

    /**
     * 成人票面价
     */
    private float adultPrice;

    /**
     * 基础代理费率
     */
    private float baseFeeRate;

    /**
     * 附加代理费率
     */
    private float addFeeRate;

    /**
     * 机场税
     */
    private float airportDuty;

    /**
     * 燃油税
     */
    private float oilTax;

    /**
     * 后返费率
     */
    private float backRate;

    /**
     * 固定代理费
     */
    private float fixedFee;

    /**
     * 直减费率
     */
    private float minusRate;

    private List<FltInfo> fltInfos;

    public int getFareType() {
        return fareType;
    }

    public void setFareType(int fareType) {
        this.fareType = fareType;
    }

    public String getFareId() {
        return fareId;
    }

    public void setFareId(String fareId) {
        this.fareId = fareId;
    }

    public float getAdultPrice() {
        return adultPrice;
    }

    public void setAdultPrice(float adultPrice) {
        this.adultPrice = adultPrice;
    }

    public float getBaseFeeRate() {
        return baseFeeRate;
    }

    public void setBaseFeeRate(float baseFeeRate) {
        this.baseFeeRate = baseFeeRate;
    }

    public float getAddFeeRate() {
        return addFeeRate;
    }

    public void setAddFeeRate(float addFeeRate) {
        this.addFeeRate = addFeeRate;
    }

    public float getAirportDuty() {
        return airportDuty;
    }

    public void setAirportDuty(float airportDuty) {
        this.airportDuty = airportDuty;
    }

    public float getOilTax() {
        return oilTax;
    }

    public void setOilTax(float oilTax) {
        this.oilTax = oilTax;
    }

    public float getBackRate() {
        return backRate;
    }

    public void setBackRate(float backRate) {
        this.backRate = backRate;
    }

    public float getFixedFee() {
        return fixedFee;
    }

    public void setFixedFee(float fixedFee) {
        this.fixedFee = fixedFee;
    }

    public float getMinusRate() {
        return minusRate;
    }

    public void setMinusRate(float minusRate) {
        this.minusRate = minusRate;
    }

    public List<FltInfo> getFltInfos() {
        return fltInfos;
    }

    public void setFltInfos(List<FltInfo> fltInfos) {
        this.fltInfos = fltInfos;
    }

    public String getFareCode() {
        return fareCode;
    }

    public void setFareCode(String fareCode) {
        this.fareCode = fareCode;
    }
}
