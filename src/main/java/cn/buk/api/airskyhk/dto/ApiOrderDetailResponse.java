package cn.buk.api.airskyhk.dto;


public class ApiOrderDetailResponse extends BaseHeaderResponse {


    private OrderDetailInfo orderDetailInfo;

    public OrderDetailInfo getOrderDetailInfo() {
        return orderDetailInfo;
    }

    public void setOrderDetailInfo(OrderDetailInfo orderDetailInfo) {
        this.orderDetailInfo = orderDetailInfo;
    }
}
