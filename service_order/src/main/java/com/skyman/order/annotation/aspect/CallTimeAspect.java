package com.skyman.order.annotation.aspect;

import com.skyman.order.domain.LongText;
import com.skyman.order.mapper.LongTextMapper;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * Copyright © 2021 虎彩印艺股份有限公司. All rights reserved.
 *
 * @author JiaHF
 * @description
 * @since 2021/6/30
 */
@Aspect
@Component
public class CallTimeAspect {

  private static final Logger LOGGER = LoggerFactory.getLogger(CallTimeAspect.class);

  @Resource
  private LongTextMapper longTextMapper;

  @Pointcut("execution(public * com.skyman.order.controller.OrderController.selectText(..))")
  public void log(){}
  //,execution(public * com.skyman.order.controller.*.*(..))

  /**
   * 统计请求的处理时间
   */
  ThreadLocal<Long> startTime = new ThreadLocal<>();

  @Before("log()")
  public void doBefore(JoinPoint joinPoint){
    startTime.set(System.currentTimeMillis());
    //接收到请求，记录请求内容
    ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
    HttpServletRequest request = attributes.getRequest();
    //记录请求的内容
    LOGGER.info("============Aspect_URL: {}",request.getRequestURL().toString());
    LOGGER.info("============Aspect_Method:{}",request.getMethod());
  }

  @AfterReturning(returning = "ret" , pointcut = "log()")
  public void doAfterReturning(Object ret){
    //处理完请求后，返回内容
    //LOGGER.info("=============方法执行结果:{}",ret);
    LOGGER.info("=============方法执行时间:{}",System.currentTimeMillis() - startTime.get());
    longTextMapper.insertList(new LongText("1233366"));
  }
}
