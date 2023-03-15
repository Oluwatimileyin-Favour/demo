package com.demo.controller;

import com.demo.DemoApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@org.springframework.stereotype.Controller
@RestController
public class Controller {

    @GetMapping("/calculator")
    public String calc () {
        return Integer.toString(DemoApplication.x) + "+" + Integer.toString(DemoApplication.y) + " = " + Integer.toString(DemoApplication.x + DemoApplication.y);
    }


}
