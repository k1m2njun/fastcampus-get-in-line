package com.k1m2njun.getinline.controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController // @ResponseBody 포함되어있다. -> 데이터를 그대로 Body로 응답해줌
public class APIAuthController {

    @GetMapping("/sign-up")
    public String signUp() {
        return "done.";
    }

    @GetMapping("/login")
    public String logIn() {
        return "done.";
    }


}
