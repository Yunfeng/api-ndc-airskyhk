package cn.buk.api.airskyhk.dto;

import java.util.List;

public class CategoryInfo {

  /**
   * 规则内容
   */
  private List<String> text;

  /**
   * 规则类型
   */
  private String type;

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public List<String> getText() {
    return text;
  }

  public void setText(List<String> text) {
    this.text = text;
  }
}
