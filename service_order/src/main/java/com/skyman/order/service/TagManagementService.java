package com.skyman.order.service;

import com.skyman.order.entity.dto.TagManagementDto;
import com.skyman.order.entity.vo.TagManagementQo;
import com.skyman.order.entity.vo.TagManagementVo;
import java.util.List;

/**
 * Copyright © 2021 太空人科技有限公司. All rights reserved.
 *
 * @author JiaHF
 * @description
 * @since 2021/8/12
 */
public interface TagManagementService {

  int insertTag(TagManagementDto dto);

  List<TagManagementVo> listSimpleTagInfo(TagManagementQo qo);

  TagManagementDto getDetailTagInfo(Integer id);

}
