package cn.buk.api.airskyhk.dto;

import java.util.List;

public class BaseOrderViewResponse {
   private OrderInfo order; //订单信息(参考 OrderInfo 说明)
   private List<FlightInfo> flights; //航班信息(参考 FlightInfo 说明)
   private List<PassengerInfo> passengers; //乘机人信息(参考 Passenger 说明)
   private List<ServiceDefinition> serviceDefinitionList; //服务列表(参考 ServiceDefinition 说明)
   private List<TicketInfo> tickets; // 客票列表(参考 TicketInfo 说明
}
