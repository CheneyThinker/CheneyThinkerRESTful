package com.cheney.thinker.greeting.controller;

import com.cheney.thinker.core.Result;
import com.cheney.thinker.core.ResultGenerator;
import com.cheney.thinker.greeting.entity.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Result greeting(@RequestParam(value = "name", defaultValue = "Welcome to CheneyThinkerRESTFul!") String name) {
        return ResultGenerator.genSuccessResult(new Greeting(counter.incrementAndGet(), String.format(template, name)));
    }

}
