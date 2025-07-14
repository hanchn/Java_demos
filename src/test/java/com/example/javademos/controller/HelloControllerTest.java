package com.example.javademos.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * HelloController 单元测试
 * 演示Spring Boot Web层测试
 */
@WebMvcTest(HelloController.class)
class HelloControllerTest {

    @Autowired
    private MockMvc mockMvc;

    /**
     * 测试基本的hello接口
     */
    @Test
    void testHello() throws Exception {
        mockMvc.perform(get("/api/hello"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json"))
                .andExpect(jsonPath("$.message").value("Hello, Welcome to Java Demos!"))
                .andExpect(jsonPath("$.status").value("success"));
    }

    /**
     * 测试带参数的hello接口
     */
    @Test
    void testHelloWithName() throws Exception {
        String testName = "JavaLearner";
        mockMvc.perform(get("/api/hello/" + testName))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json"))
                .andExpect(jsonPath("$.message").value("Hello, " + testName + "! Welcome to Java Learning Journey!"))
                .andExpect(jsonPath("$.user").value(testName))
                .andExpect(jsonPath("$.status").value("success"));
    }

    /**
     * 测试应用信息接口
     */
    @Test
    void testGetAppInfo() throws Exception {
        mockMvc.perform(get("/api/info"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json"))
                .andExpect(jsonPath("$.appName").value("Java Demos"))
                .andExpect(jsonPath("$.version").value("1.0.0"))
                .andExpect(jsonPath("$.framework").value("Spring Boot 3.2.0"));
    }
}