package com.skyman.order.entity.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Copyright © 2021 虎彩印艺股份有限公司. All rights reserved.
 *
 * @author JiaHF
 * @description
 * @since 2021/8/16
 */
@Data
@ApiModel("查询标签信息入参")
public class TagManagementQo implements Serializable {

  @NotNull
  private Integer pageNum;

  @NotNull(message = "页大小不能为空")
  private Integer pageSize;

  @ApiModelProperty(value = "标签名称")
  private String tagName;

  @ApiModelProperty(value = "所属系统")
  private String whichSystem;

  @ApiModelProperty(value = "所属分支")
  private String whichBranch;

  /**
   * 入参-LocalDateTime:
   *
   * @JsonFormat---》只能完成反序列化，不能完成时间格式的转换
   * @DateTimeFormat---》反序列化不可完成
   */
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private LocalDateTime commitTime;

}
