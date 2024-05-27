package com.lucky.notionapi.aop;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lucky.notionapi.annotation.NotionException;
import com.lucky.notionapi.exception.NotionResponseException;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * notion请求异常的拦截切面
 *
 * @author jiahe
 */
@Aspect
@Slf4j
@Component
public class NotionExceptionAspect {

    //设置切入点：这里直接拦截被@NotionException
    @Pointcut("@annotation(com.lucky.notionapi.annotation.NotionException)")
    public void pointcut() {
    }

    /**
     * 在方法执行之前，打印出请求的参数
     *
     * @param joinPoint 切入点
     */
    @Before("pointcut()")
    public void before(JoinPoint joinPoint) {
        MethodSignature sign = (MethodSignature) joinPoint.getSignature();
        Method method = sign.getMethod();
        NotionException annotation = method.getAnnotation(NotionException.class);
        Object[] args = joinPoint.getArgs();
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            log.info("{}的请求参数-->{}", annotation.value(), objectMapper.writeValueAsString(args));
        } catch (JsonProcessingException e) {
            log.error("{}请求参数转换异常：{}", annotation.value(), e.getMessage());
        }
    }

    @AfterReturning(value = "pointcut()", returning = "returnValue")
    public void after(JoinPoint joinPoint, Object returnValue) {
        MethodSignature sign = (MethodSignature) joinPoint.getSignature();
        Method method = sign.getMethod();
        NotionException annotation = method.getAnnotation(NotionException.class);
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            log.info("{}的执行结果-->{}", annotation.value(), objectMapper.writeValueAsString(returnValue));
        } catch (JsonProcessingException e) {
            log.error("{}响应结果转换异常：{}", annotation.value(), e.getMessage());
        }
    }

    /**
     * 当有ModelView的注解的方法抛出异常的时候，做如下的处理
     */
    @AfterThrowing(pointcut = "pointcut()", throwing = "e")
    public void afterThrowable(Throwable e) {
        if (e instanceof NotionResponseException) {
            log.error("notion请求异常：{}", ((NotionResponseException) e).getError().getMessage() + ":" + e.getMessage());
        }
    }

}
