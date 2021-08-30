package com.skyman.order.domain;

import java.io.Serializable;
import javax.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

/**
 * Copyright © 2021 虎彩印艺股份有限公司. All rights reserved.
 *
 * @author JiaHF
 * @description
 * @since 2021/7/12
 */

public class LongText implements Serializable {

  private Integer id;

  @NotBlank(message = "text不能为空")
  @Length(max = 20,message = "超出20个字符了")
  private String text;

  private Integer nums;

  public Integer getNums() {
    return nums;
  }

  public void setNums(Integer nums) {
    this.nums = nums;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public LongText(
      @NotBlank(message = "text不能为空") @Length(max = 20, message = "超出20个字符了") String text) {
    this.text = text;
  }

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }

  public LongText(Integer id,
      @NotBlank(message = "text不能为空") @Length(max = 20, message = "超出20个字符了") String text,
      Integer nums) {
    this.id = id;
    this.text = text;
    this.nums = nums;
  }


  @Override
  public String toString() {
    return "LongText{" +
        "id=" + id +
        ", text='" + text + '\'' +
        ", nums=" + nums +
        '}';
  }
}
