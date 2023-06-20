package com.k1m2njun.getinline.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController implements ErrorController { // 에러 페이지 제어권을 가지려면 ErrorController를 구현해야 함.

    @GetMapping("/")
    public String root() {
        return "index"; // Controller는 index에 해당하는 view를 찾아서 렌더링해서 화면에 보여준다.
    }

    @RequestMapping("/error")
    public String error() {
        return "error";
    }
}
