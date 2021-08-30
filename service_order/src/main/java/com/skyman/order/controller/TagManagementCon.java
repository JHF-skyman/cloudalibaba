package com.skyman.order.controller;

import com.skyman.order.entity.dto.TagManagementDto;
import com.skyman.order.entity.vo.ResultWrapper;
import com.skyman.order.entity.vo.TagManagementQo;
import com.skyman.order.entity.vo.TagManagementVo;
import com.skyman.order.service.TagManagementService;
import com.skyman.order.utils.PageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright © 2021 太空人科技有限公司. All rights reserved.
 *
 * @author JiaHF
 * @description
 * @since 2021/8/12
 */
@RestController
@RequestMapping("/tagManagement")
@Api(tags = "标签管理工具")
public class TagManagementCon {

  @Resource
  private TagManagementService tagManagementService;

  @PostMapping("/insertTag")
  @ApiOperation(value = "增加Tag信息", notes = "增加Tag信息")
  public ResultWrapper<String> insertTag(@RequestBody TagManagementDto dto) {
    int i = tagManagementService.insertTag(dto);
    if (1 == i) {
      return new ResultWrapper<String>().ok("添加成功");
    }
    return new ResultWrapper<String>().ok("失败了FW");
  }

  @PostMapping("/listSimpleTagInfo")
  @ApiOperation(value = "获取简略Tag列表", notes = "简略Tag列表")
  public ResultWrapper<PageUtil<TagManagementVo>> listSimpleTagInfo(
      @Validated @RequestBody TagManagementQo qo) {
    List<TagManagementVo> tagManagementVos = tagManagementService.listSimpleTagInfo(qo);
    PageUtil<TagManagementVo> pageUtil = new PageUtil<>();
    return new ResultWrapper<PageUtil<TagManagementVo>>()
        .ok(pageUtil.listToPage(qo.getPageNum(), qo.getPageSize(), tagManagementVos));

  }

  @GetMapping("/getDetailTagInfo/{id}")
  @ApiOperation(value = "根据ID获取完整Tag信息", notes = "完整Tag信息")
  public ResultWrapper<TagManagementDto> getDetailTagInfo(@PathVariable("id") Integer id) {
    return new ResultWrapper<TagManagementDto>().ok(tagManagementService.getDetailTagInfo(id));
  }
}
