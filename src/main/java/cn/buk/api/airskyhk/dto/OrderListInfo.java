package cn.buk.api.airskyhk.dto;

import java.util.List;

public class OrderListInfo {

    private List<OrderDetailInfo> orders;

    public List<OrderDetailInfo> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderDetailInfo> orders) {
        this.orders = orders;
    }

}
