package com.skyman.order.controller;

import com.skyman.order.annotation.CallTime;
import com.skyman.order.domain.LongText;
import com.skyman.order.feign.StockFeignApi;
import com.skyman.order.mapper.LongTextMapper;
import java.util.List;
import javax.annotation.Resource;
import javax.validation.Valid;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright © 2021 虎彩印艺股份有限公司. All rights reserved.
 *
 * @author JiaHF
 * @description
 * @since 2021/6/24
 */
@RestController
@RequestMapping("/order")
public class OrderController {

  private static final Logger LOGGER = LogManager.getLogger(OrderController.class);

  @Resource
  private StockFeignApi stockFeignApi;
  @Resource
  private LongTextMapper longTextMapper;

  @GetMapping("/createOrder")
  @CallTime
  public String createOrder(){
    LOGGER.info("info信息");
    LOGGER.warn("warn信息");
    String stock = stockFeignApi.deductStock();
    return "Hello world" + stock;
  }

  @GetMapping("/selectLongText")
  public List<LongText> selectText(){
    List<LongText> longText = longTextMapper.selectList();
    /*longText.forEach(vo -> {
      String text = vo.getText();
      LOGGER.info("============={}",text.length());
      LOGGER.info("*************{}",text.toCharArray().length);

    });*/
    return longText;
  }

  @PostMapping("/insertList")
  public Integer insertList(@RequestBody @Valid LongText longText){
    return longTextMapper.insertList(longText);
  }
}
