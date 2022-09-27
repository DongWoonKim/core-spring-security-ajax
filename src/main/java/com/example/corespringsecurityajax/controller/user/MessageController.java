package com.example.corespringsecurityajax.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessageController {

    @GetMapping("/message")
    public String messages() {
        return "user/messages";
    }

}
