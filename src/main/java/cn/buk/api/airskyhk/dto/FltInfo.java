package cn.buk.api.airskyhk.dto;


import java.util.List;

public class FltInfo {

    private String fltNo;
    private String classCode;
    private String fltDate;
    private String orgCity;
    private String dstCity;
    private String depTime;
    private String arrTime;

    /**
     * Y舱价格
     */
    private float yClassPrice;
    /**
     * 公布价格
     */
    private float price;

    /**
     * price / yClassPrice 得出的折扣数
     */
    private int discount;

    private List<PassengerInfo> passengers;

    public String getFltNo() {
        return fltNo;
    }

    public void setFltNo(String fltNo) {
        this.fltNo = fltNo;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public String getFltDate() {
        return fltDate;
    }

    public void setFltDate(String fltDate) {
        this.fltDate = fltDate;
    }

    public String getOrgCity() {
        return orgCity;
    }

    public void setOrgCity(String orgCity) {
        this.orgCity = orgCity;
    }

    public String getDstCity() {
        return dstCity;
    }

    public void setDstCity(String dstCity) {
        this.dstCity = dstCity;
    }

    public String getDepTime() {
        return depTime;
    }

    public void setDepTime(String depTime) {
        this.depTime = depTime;
    }

    public String getArrTime() {
        return arrTime;
    }

    public void setArrTime(String arrTime) {
        this.arrTime = arrTime;
    }

    public float getyClassPrice() {
        return yClassPrice;
    }

    public void setyClassPrice(float yClassPrice) {
        this.yClassPrice = yClassPrice;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }



    public List<PassengerInfo> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<PassengerInfo> passengers) {
        this.passengers = passengers;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
