package cn.buk.api.airskyhk.dto;


public class ApiFareQueryResponse extends BaseHeaderResponse {

    private FareQueryInfo fareQueryInfo;

    public FareQueryInfo getFareQueryInfo() {
        return fareQueryInfo;
    }

    public void setFareQueryInfo(FareQueryInfo fareQueryInfo) {
        this.fareQueryInfo = fareQueryInfo;
    }
}
