/*
package com.nowcoder.community;

import com.nowcoder.community.dao.DiscussPostMapper;
import com.nowcoder.community.dao.LoginTicketMapper;
import com.nowcoder.community.dao.MessageMapper;
import com.nowcoder.community.entity.DiscussPost;
import com.nowcoder.community.entity.LoginTicket;
import com.nowcoder.community.entity.Message;
import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class MapperTests {

    @Autowired
    DiscussPostMapper discussPostMapper;

    @Autowired
    private MessageMapper mapper;

    @Autowired
    LoginTicketMapper loginTicketMapper;

    @Test
    public void testSelectPosts(){
        List<DiscussPost> list = discussPostMapper.selectDiscussPosts(149, 0, 10);
        int i = discussPostMapper.selectDiscussPostRows(0);
        System.out.println(i);
        for(DiscussPost post : list){
            System.out.println(post);
        }

    }


    @Test
    public void testInsertTicket(){
        LoginTicket loginTicket = new LoginTicket();
        loginTicket.setUserId(101);
        loginTicket.setTicket("abc");
        loginTicket.setStatus(0);
        loginTicket.setExpired(new Date(System.currentTimeMillis()+1000*60*10));

        loginTicketMapper.insertLoginTicket(loginTicket);
    }


    @Test
    public void testTicket(){


        LoginTicket abc = loginTicketMapper.selectByTicket("abc");

        System.out.println(abc);

        loginTicketMapper.updateStatus("abc1",1);


    }


     @Test
    public void testSelectLetter(){
          List<Message> list = mapper.selectConversation(111, 0, 20);
         for (Message message : list) {
             System.out.println(message);
         }

          int count = mapper.selectConversationCount(111);
          System.out.println(count);

         list= mapper.selectLetters("111_112", 0, 10);

         for (Message message : list) {
             System.out.println(message);
         }

         count = mapper.selectLetterCount("111_112");
         System.out.println(count);

        count = mapper.selectLetterUnreadCount(131,"111_131");
         System.out.println(count);


     }




}
*/
