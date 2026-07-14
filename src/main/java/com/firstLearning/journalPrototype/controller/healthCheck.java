package com.firstLearning.journalPrototype.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class healthCheck {

    @GetMapping("/health")
    public String checkCondition() {
        return "All Systems Running!";
    }
}
