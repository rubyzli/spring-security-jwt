package com.codecool.securityjwt.endpoint;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("messages")
public class MessageEndpoint {
    @GetMapping
    String unauthorized(){
        return "This will never be displayed due to lack of authorization";
    }
}
