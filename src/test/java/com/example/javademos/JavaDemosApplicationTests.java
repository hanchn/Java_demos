package com.example.javademos;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

/**
 * Spring Boot应用测试类
 */
@SpringBootTest
@ActiveProfiles("test")
class JavaDemosApplicationTests {

    /**
     * 测试应用上下文加载
     */
    @Test
    void contextLoads() {
        // 这个测试确保Spring应用上下文能够正常加载
        // 如果应用配置有问题，这个测试会失败
    }

}