/*
package com.nowcoder.community;

import com.nowcoder.community.util.MailClient;
import org.aspectj.lang.annotation.After;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class MailTests {

    @Autowired
    private MailClient mailClient;

    */
/**
     * 注入模板引擎测试html页面
     *//*

    @Autowired
    private TemplateEngine templateEngine;

    @Test
    public void testMail(){
        mailClient.sendMail("2043727856@qq.com","TEST","hello");
    }

    @Test
    public void testHtml(){
        Context context = new Context();
        context.setVariable("username","sun");

        String content = templateEngine.process("/mail/demo", context);

        System.out.println(content);
        mailClient.sendMail("2043727856@qq.com","html",content);
    }



}
*/
