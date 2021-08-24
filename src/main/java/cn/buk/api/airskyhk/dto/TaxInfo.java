package cn.buk.api.airskyhk.dto;

public class TaxInfo {
  /**
   * 税费代码
   */
  private String taxCode;

  /**
   * 税费金额
   */
  private double amount;

  public String getTaxCode() {
    return taxCode;
  }

  public void setTaxCode(String taxCode) {
    this.taxCode = taxCode;
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }
}
