package cn.buk.api.airskyhk.dto;

import java.util.List;

public class FareQueryInfo {

    private String pnr;

    private List<PassengerInfo> passengers;

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
}
