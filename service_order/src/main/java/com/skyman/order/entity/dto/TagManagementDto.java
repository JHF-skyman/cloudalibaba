package com.skyman.order.entity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 * Copyright © 2021 太空人科技有限公司. All rights reserved.
 *
 * @author JiaHF
 * @description
 * @since 2021/8/12
 */
@Data
@ApiModel("添加Tag信息入参")
public class TagManagementDto implements Serializable {

  @ApiModelProperty(value = "标签ID", example = "ae2ef28312894a9e2b42a6e85580b666b383f66e")
  private String tagId;

  @ApiModelProperty(value = "标签名称", example = "Saas.2.7.2-alpha.18")
  private String tagName;

  @ApiModelProperty(value = "所属系统", example = "tsbeer")
  private String whichSystem;

  @ApiModelProperty(value = "所属分支", example = "feature-210901")
  private String whichBranch;

  @ApiModelProperty(value = "执行环境", example = "DEV")
  private String environment;

  @ApiModelProperty(value = "操作人", example = "LCS")
  private String operator;

  //@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
  @ApiModelProperty(value = "提交时间", example = "yyyy-MM-dd HH:mm:ss")
  private LocalDateTime commitTime;

  @ApiModelProperty(value = "标签注释", example = "修改：商品分类详情分页参数")
  private String message;

  @ApiModelProperty(value = "发行说明", example = "detail")
  private String detail;

}
