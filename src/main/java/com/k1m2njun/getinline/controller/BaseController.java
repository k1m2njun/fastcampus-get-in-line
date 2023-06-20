package com.k1m2njun.getinline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BaseController {

    @GetMapping("/")
    public String root() {
        return "index"; // Controller는 index에 해당하는 view를 찾아서 렌더링해서 화면에 보여준다.
    }
}
