package com.skyman.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Copyright © 2021 虎彩印艺股份有限公司. All rights reserved.
 *
 * @author JiaHF
 * @description
 * @since 2021/8/26
 */
@EnableDiscoveryClient
@SpringBootApplication
public class GatewayStarter {

  public static void main(String[] args) {
    SpringApplication.run(GatewayStarter.class,args);
  }

}
