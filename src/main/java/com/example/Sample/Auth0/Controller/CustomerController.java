package com.example.Sample.Auth0.Controller;

import com.example.Sample.Auth0.models.EmailRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @GetMapping("/public")
    public ResponseEntity<String> publicRoute() {
        return new ResponseEntity<>("Public Route.", HttpStatus.OK);
    }

    @GetMapping("/private")
    public ResponseEntity<String> privateRoute() {
        return new ResponseEntity<>("Private Route.", HttpStatus.OK);
    }
}
