package br.com.erudio.spring_boot_rest_java_2025.controllers;

import br.com.erudio.spring_boot_rest_java_2025.model.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(
            @RequestParam(value = "name", defaultValue = "World")
            String name){
        return new Greeting(counter.incrementAndGet(),String.format(template, name));
    }
}
