package org.example.spring;

import org.springframework.web.bind.annotation.*;

@RestController
public class Hellocontroller {

    @GetMapping("/hello/{name}")
    public Helloresponse helloparam(@PathVariable String name) {
        return new Helloresponse("Hello " + name);
    }

    @GetMapping("/hello")
    public Helloresponse sayHello() {
        return new Helloresponse("Hello Spring Boot!");
    }

    @PostMapping("/hello")
    public String hellopost(@RequestBody String body) {
        return "Hello" + body;
    }
}
