package com.skyman.order.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * Copyright © 2021 虎彩印艺股份有限公司. All rights reserved.
 *
 * @author JiaHF
 * @description
 * @since 2021/8/12
 */
@Data
@TableName("tag_management")
public class TagManagement implements Serializable {

  @TableId("id")
  private Integer id;

  @TableField("tagId")
  private String tagId;

  @TableField("tagName")
  private String tagName;

  @TableField("whichSystem")
  private String whichSystem;

  @TableField("whichBranch")
  private String whichBranch;

  @TableField("environment")
  private String environment;

  @TableField("operator")
  private String operator;

  @TableField("commitTime")
  private LocalDateTime commitTime;

  @TableField("status")
  private Integer status;

  @TableField("message")
  private String message;

  @TableField("detail")
  private String detail;

}
