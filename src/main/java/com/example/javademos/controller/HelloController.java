package com.example.javademos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * Hello World 控制器示例
 * 演示Spring Boot基本的REST API开发
 */
@RestController
@RequestMapping("/api")
public class HelloController {

    /**
     * 基本的Hello World接口
     * @return 欢迎信息
     */
    @GetMapping("/hello")
    public Map<String, Object> hello() {
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Hello, Welcome to Java Demos!");
        response.put("timestamp", LocalDateTime.now());
        response.put("status", "success");
        return response;
    }

    /**
     * 带参数的Hello接口
     * @param name 用户名
     * @return 个性化欢迎信息
     */
    @GetMapping("/hello/{name}")
    public Map<String, Object> helloWithName(@PathVariable String name) {
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Hello, " + name + "! Welcome to Java Learning Journey!");
        response.put("timestamp", LocalDateTime.now());
        response.put("user", name);
        response.put("status", "success");
        return response;
    }

    /**
     * 获取应用信息
     * @return 应用基本信息
     */
    @GetMapping("/info")
    public Map<String, Object> getAppInfo() {
        Map<String, Object> info = new HashMap<>();
        info.put("appName", "Java Demos");
        info.put("version", "1.0.0");
        info.put("description", "Java学习示例项目集合");
        info.put("framework", "Spring Boot 3.2.0");
        info.put("javaVersion", System.getProperty("java.version"));
        info.put("timestamp", LocalDateTime.now());
        return info;
    }
}