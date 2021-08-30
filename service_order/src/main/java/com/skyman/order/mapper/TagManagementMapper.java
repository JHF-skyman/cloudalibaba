package com.skyman.order.mapper;

import com.skyman.order.entity.dto.TagManagementDto;
import com.skyman.order.entity.vo.TagManagementQo;
import com.skyman.order.entity.vo.TagManagementVo;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Copyright © 2021 虎彩印艺股份有限公司. All rights reserved.
 *
 * @author JiaHF
 * @description
 * @since 2021/8/13
 */
@Mapper
public interface TagManagementMapper {

  int insertTag(TagManagementDto dto);

  List<TagManagementVo> listSimpleTagInfo(TagManagementQo qo);

  TagManagementDto getDetailTagInfo(@Param("id") Integer id);

}
