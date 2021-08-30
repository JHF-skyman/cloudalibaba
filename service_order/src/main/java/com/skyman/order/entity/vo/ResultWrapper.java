package com.skyman.order.entity.vo;


import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

/**
 * Copyright © 2021 虎彩印艺股份有限公司. All rights reserved.
 *
 * @author JiaHF
 * @description
 * @since 2021/8/16
 */
public class ResultWrapper<T> {

  @ApiModelProperty(name = "响应码")
  private Integer code;

  @ApiModelProperty(name = "响应信息")
  private String msg;

  @ApiModelProperty(name = "响应数据")
  private T data;

  @ApiModelProperty(name = "响应时间")
  private Long timestamp;

  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }

  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }


  private ResultWrapper<T> result(int statusCode, String statusMsg, T data) {
    this.code = statusCode;
    this.msg = statusMsg;
    this.data = data;
    this.timestamp = LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli();
    return this;
  }

  public ResultWrapper<T> ok(T result) {
    return result(200,"操作成功",result);
  }

  public ResultWrapper<T> ok(String statusMsg,T result) {
    return result(200,statusMsg,null);
  }
}
