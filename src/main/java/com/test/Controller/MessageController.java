package com.test.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MessageController {

    @GetMapping("/get/message")
    public String getMessage(){
        return "hello!docker";
    }
}
