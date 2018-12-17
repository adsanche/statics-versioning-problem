package com.adsanche.statics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class StaticsController {

    @GetMapping
    public String view() {

        return "index";
    }
}
