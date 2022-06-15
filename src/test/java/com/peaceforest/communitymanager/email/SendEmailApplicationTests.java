package com.peaceforest.communitymanager.email;
 

import com.peaceforest.communitymanager.service.impl.EmailServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SendEmailApplicationTests {

    @Autowired
    private EmailServiceImpl mailService;

    @Test
    public void sendmail() {
        mailService.sendSimpleMail("3174219976@qq.com","主题：你好普通邮件","内容：第一封邮件");
    }
 
    @Test
    public void sendmailHtml(){
        mailService.sendHtmlMail("3174219976@qq.com","主题：你好html邮件","<h1>内容：第一封html邮件</h1>");
    }
}