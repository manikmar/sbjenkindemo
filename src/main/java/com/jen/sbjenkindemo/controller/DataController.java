package com.jen.sbjenkindemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @GetMapping("/data")
    public String data(){
        return "Hello World...!";
    }

    @GetMapping("/invokeMethod")
    public String invokeMethod(){
        return "Hello World...!";
    }

    @GetMapping("/mani")
    public String maniMethod(){
        return "Hello Mani World...!";
    }

    @GetMapping("/uspass")
    public String unAndPassUpdate(){
        return "updated existing user name and password";
    }
}
