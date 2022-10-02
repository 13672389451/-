package com.nowcoder.community.aspect;


import com.nowcoder.community.controller.LoginController;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@Aspect
public class ServiceLogAspect {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Pointcut("execution(* com.nowcoder.community.service.*.*(..))")
    public void pointcut(){

    }
@Before("pointcut()")
    public void before(JoinPoint joinPoint){
        //记录日志
        //获取id
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        //获取时间
        String ip = request.getRemoteHost();
        String now = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        String target = joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName();
        logger.info(String.format("用户[%s],在[%s],访问了[%s].",ip,now,target));
    }


}
