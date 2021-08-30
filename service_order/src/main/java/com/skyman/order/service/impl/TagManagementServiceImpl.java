package com.skyman.order.service.impl;

import com.google.common.collect.Lists;
import com.skyman.order.entity.dto.TagManagementDto;
import com.skyman.order.entity.vo.TagManagementQo;
import com.skyman.order.entity.vo.TagManagementVo;
import com.skyman.order.mapper.TagManagementMapper;
import com.skyman.order.service.TagManagementService;
import java.util.List;
import javax.annotation.Resource;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StopWatch;

/**
 * Copyright © 2021 太空人科技有限公司. All rights reserved.
 *
 * @author JiaHF
 * @description
 * @since 2021/8/12
 */
@Service
public class TagManagementServiceImpl implements TagManagementService {

  private static final Logger LOGGER = LogManager.getLogger(TagManagementServiceImpl.class);

  @Resource
  private TagManagementMapper tagManagementMapper;

  @Override
  public int insertTag(TagManagementDto dto) {
    LOGGER.info("插入Tag的信息：{}", dto);
    return tagManagementMapper.insertTag(dto);
  }

  @Override
  public List<TagManagementVo> listSimpleTagInfo(TagManagementQo qo) {
    List<TagManagementVo> tagManagementVos = tagManagementMapper.listSimpleTagInfo(qo);
    if (!CollectionUtils.isEmpty(tagManagementVos)) {
      return tagManagementVos;
    }
    return Lists.newArrayList();
  }

  @Override
  public TagManagementDto getDetailTagInfo(Integer id) {
    LOGGER.info("查询明细的ID：{}", id);
    TagManagementDto detailTagInfo = tagManagementMapper.getDetailTagInfo(id);
    if (null != detailTagInfo) {
      return detailTagInfo;
    }
    return new TagManagementDto();
  }
}
