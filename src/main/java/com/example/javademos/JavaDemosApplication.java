package com.example.javademos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Java学习示例项目主应用类
 * 
 * @author Your Name
 * @version 1.0.0
 */
@SpringBootApplication
public class JavaDemosApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaDemosApplication.class, args);
        System.out.println("\n==================================");
        System.out.println("🚀 Java Demos Application Started!");
        System.out.println("📚 Ready for learning Java & Spring Boot");
        System.out.println("🌐 Access: http://localhost:8080");
        System.out.println("==================================\n");
    }
}