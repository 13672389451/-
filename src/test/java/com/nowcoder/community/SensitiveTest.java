package com.nowcoder.community;

import com.nowcoder.community.util.SensitiveFilter;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)

public class SensitiveTest {


    @Autowired
    private SensitiveFilter sensitiveFilter;

    @Test
    public void test(){
        String text = "这里可以赌@博，可以开@票，@吸@毒@老六";
        text = sensitiveFilter.filter(text);
        System.out.println(text);
    }


}
