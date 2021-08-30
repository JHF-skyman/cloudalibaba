package com.skyman.order.controller;

import java.time.LocalDateTime;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Copyright © 2021 虎彩印艺股份有限公司. All rights reserved.
 *
 * @author JiaHF
 * @description
 * @since 2021/7/5
 */
public class DemoTest {

  private static final Logger LOGGER = LoggerFactory.getLogger(DemoTest.class);

  @Test
  public void t0705(){
    for (int i = 0; i < 200; i++) {
      LOGGER.info("info信息");
      LOGGER.warn("warn信息");
    }
    System.out.println(LOGGER.getClass());
    for (int i = 0; i < 100; i++) {
      System.out.println("系统信息============================="+ LocalDateTime.now());
    }
  }


}
