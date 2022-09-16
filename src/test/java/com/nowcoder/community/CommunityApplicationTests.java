package com.nowcoder.community;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
class CommunityApplicationTests {

    @Test
    void contextLoads() {
    }


   private static final Logger logger = LoggerFactory.getLogger(CommunityApplicationTests.class);

    @Test
    public void testLogger(){
        System.out.println(logger.getClass());
        logger.debug("degub log");
        logger.warn("warm");
        logger.error("error");
    }


}
