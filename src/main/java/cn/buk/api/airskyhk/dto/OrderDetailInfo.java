package cn.buk.api.airskyhk.dto;


import java.util.Date;
import java.util.List;

public class OrderDetailInfo {

    private String pnr;

    private List<PassengerInfo> passengers;


    private String orderNo; // 	订单号	String	订单号	否	FX2013111314590967

    private float fixedFee; //固定代理费

    private Date bookTime; // 	订单时间	String	订单时间	否	2013-11-14 09:24:20
    private int orderStatus;// 	订单状态	String	订单状态（0、未出票，1、已出票，7、订单已取消，8、等待出票，9、正在出票）
    private int paymentStatus; //	支付状态	String	订单支付状态（0、未支付，1、已支付，2、差错退款，3、等待支付，4、支付中）	否	0
    private float totalPrice; //	总票面价	String	总票面价	否	550.0
    private float totalTax; //	总税费	String	总税费	否	300.0
    private float paymentMoney; // 	支付金额	String	支付金额	否	1450.0
    private float agencyMoney; // 	代理费金额	String	代理费金额	否	123.0
    private String paymentNo; // 	支付号	String	支付号	否	910925271121012
    private String booker; // 	订票人	String	订票人	否	深圳市深港联航空服务有限公司

    private int passengerCount;
    private float agencyFee;

    private List<FltInfo> fltInfos;

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public List<PassengerInfo> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<PassengerInfo> passengers) {
        this.passengers = passengers;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Date getBookTime() {
        return bookTime;
    }

    public void setBookTime(Date bookTime) {
        this.bookTime = bookTime;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(int paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public float getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(float totalTax) {
        this.totalTax = totalTax;
    }

    public float getPaymentMoney() {
        return paymentMoney;
    }

    public void setPaymentMoney(float paymentMoney) {
        this.paymentMoney = paymentMoney;
    }

    public float getAgencyMoney() {
        return agencyMoney;
    }

    public void setAgencyMoney(float agencyMoney) {
        this.agencyMoney = agencyMoney;
    }

    public String getPaymentNo() {
        return paymentNo;
    }

    public void setPaymentNo(String paymentNo) {
        this.paymentNo = paymentNo;
    }

    public String getBooker() {
        return booker;
    }

    public void setBooker(String booker) {
        this.booker = booker;
    }

    public float getFixedFee() {
        return fixedFee;
    }

    public void setFixedFee(float fixedFee) {
        this.fixedFee = fixedFee;
    }

    public List<FltInfo> getFltInfos() {
        return fltInfos;
    }

    public void setFltInfos(List<FltInfo> fltInfos) {
        this.fltInfos = fltInfos;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public float getAgencyFee() {
        return agencyFee;
    }

    public void setAgencyFee(float agencyFee) {
        this.agencyFee = agencyFee;
    }
}
