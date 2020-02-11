package com.zyphoid.bryantest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @GetMapping("/test")
    public ResponseEntity testGet() {
        return new ResponseEntity("It Worked!!", HttpStatus.OK);
    }

}
