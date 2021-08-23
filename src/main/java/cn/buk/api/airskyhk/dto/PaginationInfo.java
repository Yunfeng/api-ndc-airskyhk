package cn.buk.api.airskyhk.dto;

public class PaginationInfo {

  /**
   * 结束记录数
   */
  private int start;

  /**
   * 开始记录数
   */
  private int end;

  public int getStart() {
    return start;
  }

  public void setStart(int start) {
    this.start = start;
  }

  public int getEnd() {
    return end;
  }

  public void setEnd(int end) {
    this.end = end;
  }
}
