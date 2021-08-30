package com.skyman.order.config;

import com.github.xiaoymin.knife4j.spring.annotations.EnableSwaggerBootstrapUi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Copyright © 2021 虎彩印艺股份有限公司. All rights reserved.
 *
 * @author JiaHF
 * @description
 * @since 2021/8/12
 */
@Configuration
@EnableSwagger2
@EnableSwaggerBootstrapUi
public class SwaggerConfig {

  @Bean
  @Order(value = 1)
  public Docket createRestApi() {
    return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
        .select()
        .apis(RequestHandlerSelectors.basePackage("com.skyman.order.controller"))
        .paths(PathSelectors.any())
        .build();
  }

  private static ApiInfo apiInfo() {
    return new ApiInfoBuilder()
        .title("OrderManagement")
        .description("订单管理工具")
        .version("1.0").license("太空人科技").licenseUrl("skyman")
        .contact(new Contact("太空人", "", ""))
        .build();
  }
}
