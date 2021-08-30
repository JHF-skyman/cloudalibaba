package com.skyman.order.mapper;

import com.skyman.order.domain.LongText;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
 * Copyright © 2021 虎彩印艺股份有限公司. All rights reserved.
 *
 * @author JiaHF
 * @description
 * @since 2021/7/12
 */
@Mapper
public interface LongTextMapper {

  /**
   * lll
   * @return LongText
   */
  List<LongText> selectList();

  /**
   * lll
   * @param longText LongText
   * @return Integer
   */
  Integer insertList(LongText longText);
}
