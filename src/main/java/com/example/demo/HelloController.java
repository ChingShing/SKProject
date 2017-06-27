package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Sophie on 2017/6/26.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String say() {
        // demo part
        return "Hello Java";
    }
}
