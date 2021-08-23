package cn.buk.api.airskyhk.dto;

/**
 * 机场相关的航班信息
 */
public class SegmentType {

  /**
   * 航班日期
   */
  private String scheduledDate;

  /**
   * 航班时间
   */
  private String scheduledTime;

  /**
   * 机场三字代码
   */
  private String airportCode;

  /**
   * 机场名称
   */
  private String stationName;

  /**
   * 航站楼
   */
  private String terminalName;

  public String getScheduledDate() {
    return scheduledDate;
  }

  public void setScheduledDate(String scheduledDate) {
    this.scheduledDate = scheduledDate;
  }

  public String getScheduledTime() {
    return scheduledTime;
  }

  public void setScheduledTime(String scheduledTime) {
    this.scheduledTime = scheduledTime;
  }

  public String getAirportCode() {
    return airportCode;
  }

  public void setAirportCode(String airportCode) {
    this.airportCode = airportCode;
  }

  public String getStationName() {
    return stationName;
  }

  public void setStationName(String stationName) {
    this.stationName = stationName;
  }

  public String getTerminalName() {
    return terminalName;
  }

  public void setTerminalName(String terminalName) {
    this.terminalName = terminalName;
  }
}
