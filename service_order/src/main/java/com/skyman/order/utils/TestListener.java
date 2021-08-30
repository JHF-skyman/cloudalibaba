package com.skyman.order.utils;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Copyright © 2021 虎彩印艺股份有限公司. All rights reserved.
 *
 * @author JiaHF
 * @description   暂时没什么用，帮小老弟解决个问题
 * @since 2021/8/26
 */
public class TestListener implements ServletContextListener {

  private static final Logger LOGGER = LogManager.getLogger(TestListener.class);

  @Override
  public void contextInitialized(ServletContextEvent sce) {
    LOGGER.info("do something");
  }
  @Override
  public void contextDestroyed(ServletContextEvent sce) {
    LOGGER.info("do nothing");
  }

}
