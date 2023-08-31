package com.example.Sample.Auth0.Controller;

import com.example.Sample.Auth0.Services.EmailService;
import com.example.Sample.Auth0.models.EmailRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
    @Autowired
    private EmailService emailService;

    @PostMapping("/send-email")
    public ResponseEntity<String> sendEmail(@RequestBody EmailRequest emailRequest) {
        String to = emailRequest.getTo();
        String subject = emailRequest.getSubject();
        String content = emailRequest.getContent();

        emailService.sendEmail(to, subject, content);

        return new ResponseEntity<>("Mail Sent Successfully.", HttpStatus.OK);
    }
}
