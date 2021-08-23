package cn.buk.api.airskyhk.dto;


public class ApiOrderListResponse extends BaseHeaderResponse {


    private OrderListInfo orderListInfo;

    public OrderListInfo getOrderListInfo() {
        return orderListInfo;
    }

    public void setOrderListInfo(OrderListInfo orderListInfo) {
        this.orderListInfo = orderListInfo;
    }
}
