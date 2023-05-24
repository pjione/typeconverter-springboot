package com.example.typeconverter.controller;

import com.example.typeconverter.type.IpPort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(@RequestParam Integer data){
        return "ok";
    }
    @GetMapping("/hello2")
    public IpPort hello2(@RequestParam IpPort ipPort){
        return ipPort;
    }
}
