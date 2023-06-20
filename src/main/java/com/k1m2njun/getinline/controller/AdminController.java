package com.k1m2njun.getinline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/admin") // admin 기본 도메인, 우선 매핑 됨.
@Controller
public class AdminController {

    @GetMapping("/places")
    public String adminPlaces() {
        return "admin/places";
    }

    @GetMapping("/places/{placeId}") // 경로 상의 일부분을 변수로 인식함
    public String adminPlaceDetail(@PathVariable Integer placeId) {
        return "admin/place-detail";
    }

    @GetMapping("/events")
    public String adminEvents() {
        return "admin/events";
    }

    @GetMapping("/events/{eventId}")
    public String adminEventDetail(@PathVariable Integer eventId) {
        return "admin/event-detail";
    }
}
