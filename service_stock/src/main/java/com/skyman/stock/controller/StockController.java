package com.skyman.stock.controller;

import org.springframework.web.bind.annotation.PostMapping;
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
@RequestMapping("/stock")
public class StockController {

  @PostMapping("/deductStock")
  public String deductStock(){
    System.out.println("库存已扣减");
    return "扣了10件";
  }

}
