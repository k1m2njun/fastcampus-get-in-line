package com.k1m2njun.getinline.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/places")
public class PlaceController {
    @GetMapping("/")
    public String places() {
        return "place/index";
    }

    @GetMapping("/{placeId}")
    public String placeDetail(@PathVariable Integer placeId) {
        return "place/detail";
    }
}
