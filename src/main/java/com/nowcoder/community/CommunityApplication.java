package com.nowcoder.community;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class CommunityApplication {

    @PostConstruct
    public void init() {
        // 解决netty启动冲突问题
        // see Netty4Utils.setAvailableProcessors()
        System.setProperty("es.set.netty.runtime.available.processors", "false");
    }


    public static void main(String[] args) {

        // 解决不要查es 的netty
        System.setProperty("es.set.netty.runtime.available.processors","false");
        SpringApplication.run(CommunityApplication.class, args);
    }

}
