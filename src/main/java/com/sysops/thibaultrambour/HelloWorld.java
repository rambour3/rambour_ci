package com.sysops.thibaultrambour;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
@GetMapping
    public String HelloWorld() {
    return  "hello world";
}
}

