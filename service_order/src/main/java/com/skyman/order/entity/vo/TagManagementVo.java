package com.skyman.order.entity.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * Copyright © 2021 太空人科技有限公司. All rights reserved.
 *
 * @author JiaHF
 * @description
 * @since 2021/8/12
 */
@Data
public class TagManagementVo implements Serializable {

  private Integer id;

  private String tagName;

  private String whichBranch;

  private String operator;

  /**
   * 出参-LocalDateTime:
   *      @JsonFormat---》能完成序列化，也能完成时间格式的转换
   *      @DateTimeFormat---》序列化可完成，但不能完成时间格式转换
   */
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
  private LocalDateTime commitTime;

  private String whichSystem;

}
