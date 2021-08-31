package com.skyman.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Copyright © 2021 虎彩印艺股份有限公司. All rights reserved.
 *
 * @author JiaHF
 * @description
 * @since 2021/8/31
 */
@SpringBootApplication
@EnableFeignClients
public class UserManagementStarter {

  public static void main(String[] args) {
    SpringApplication.run(UserManagementStarter.class,args);
  }
}
