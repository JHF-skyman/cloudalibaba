package com.skyman.order.config;

import com.skyman.order.utils.TestListener;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Copyright © 2021 虎彩印艺股份有限公司. All rights reserved.
 *
 * @author JiaHF
 * @description
 * @since 2021/6/30
 */
@Configuration
public class AspectConfig {

  @Bean
  ServletListenerRegistrationBean <TestListener> servletListenerRegistrationBean(){
    ServletListenerRegistrationBean<TestListener> listener = new ServletListenerRegistrationBean<>();
    listener.setListener(new TestListener());
    listener.setEnabled(true);
    listener.setOrder(1);
    return listener;
  }
}
