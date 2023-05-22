package com.microsoft.asademo.controller;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {

    @Value("${fileName:xxx}")
    private String fileName;

    @GetMapping("printLogs")
    public String printLogs(){
        int totalLines = 100000;
        for (int i = 0; i < totalLines; i++) {
            log.info("asa demo test logs --- {}", i);
        }
        return String.format("Will print %d lines logs", totalLines);
    }

    @GetMapping("testConfig")
    public String testConfig(){
        return fileName;
    }
}
