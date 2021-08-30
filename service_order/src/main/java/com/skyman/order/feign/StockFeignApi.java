package com.skyman.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Copyright © 2021 虎彩印艺股份有限公司. All rights reserved.
 *
 * @author JiaHF
 * @description
 * @since 2021/6/25
 * FeignClient也可以配置Feign的日志级别，针对固定的服务，加上configuration参数即可，或者yml也可配置
 */
@FeignClient(name = "stock-service",path = "/stock")
public interface StockFeignApi {

  @PostMapping("/deductStock")
  String deductStock();
}
