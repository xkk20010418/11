package com.example.gims.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Login_Controller {
    @RequestMapping("login")
    public String Login(){
        return "login";
    }
}
