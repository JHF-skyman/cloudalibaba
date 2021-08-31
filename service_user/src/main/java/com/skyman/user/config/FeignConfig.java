package com.skyman.user.config;

import feign.Logger.Level;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Copyright © 2021 虎彩印艺股份有限公司. All rights reserved.
 *
 * @author JiaHF
 * @description
 * @since 2021/6/25
 */
@Configuration
public class FeignConfig {

  @Bean
  public Level feignLogLevel(){
    return Level.BASIC;
  }
}
