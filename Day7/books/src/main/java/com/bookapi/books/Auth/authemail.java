package com.bookapi.books.Auth;

import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class authemail {
    @Autowired
    private JavaMailSender javaMailSender;

    @PostMapping("/send/{email}")
    String sendEmail(@PathVariable String email) {
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo(email);

        Random random = new Random();
        String n = String.format("%04d", random.nextInt(10000));

        
        msg.setSubject("Authenticate hahahahha");
        msg.setText("Your code is : " + n);

        try {
            javaMailSender.send(msg);
            return n+"";
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}