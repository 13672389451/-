package com.nowcoder.community;

import com.nowcoder.community.entity.Comment;
import com.nowcoder.community.service.CommentService;
import com.nowcoder.community.service.DiscussPostService;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.Date;

@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class commentTest {
    private static final Logger logger = LoggerFactory.getLogger(commentTest.class);

    @Autowired
    private CommentService commentService;

    @Autowired
    private DiscussPostService discussPostService;

    @Test
    public void test(){

//        private int id;
//        private int userId;
//        private int entityType;
//        private int entityId;
//        private int targetId;
//        private String content;
//        private int status;
//        private Date createTime;

//        Comment comment = new Comment(1,111,1,228,132,"ddfsdf",0,new Date());

//
//         int i = commentService.addComment(comment);
//        System.out.println(i);
//        discussPostService.updateCommentCount(284,5);


    }

}
