package cn.buk.api.airskyhk.dto;

public class BaseCouponShoppingRequest {
  /**
   * 分页
   */
  private PaginationInfo pagination = new PaginationInfo();

  /**
   * 优惠券状态
   */
  private int status;



  public int getStatus() {
    return status;
  }

  public void setStatus(int status) {
    this.status = status;
  }

  public PaginationInfo getPagination() {
    return pagination;
  }

  public void setPagination(PaginationInfo pagination) {
    this.pagination = pagination;
  }
}
