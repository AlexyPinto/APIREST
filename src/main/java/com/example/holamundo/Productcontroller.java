package com.example.holamundo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Productcontroller {
    @GetMapping(path = "/producto")
    public  String getHolaMundo(){
        return  "GET from /producto";
    }
}
