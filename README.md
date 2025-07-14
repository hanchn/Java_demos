# Java Demos

这是一个Java示例项目集合，包含各种Java编程示例和演示代码。

## 项目结构

```
Java_demos/
├── src/
│   ├── main/
│   │   └── java/
│   └── test/
│       └── java/
├── lib/
├── docs/
├── .gitignore
└── README.md
```

## 环境要求

- Java 8 或更高版本
- Maven 3.6+ 或 Gradle 6.0+（如果使用构建工具）

## 快速开始

### 编译和运行

1. 克隆项目到本地：
   ```bash
   git clone <repository-url>
   cd Java_demos
   ```

2. 编译Java文件：
   ```bash
   javac -d bin src/main/java/**/*.java
   ```

3. 运行示例：
   ```bash
   java -cp bin <MainClassName>
   ```

### 使用Maven（可选）

如果项目包含`pom.xml`文件：

```bash
# 编译项目
mvn compile

# 运行测试
mvn test

# 打包项目
mvn package
```

### 使用Gradle（可选）

如果项目包含`build.gradle`文件：

```bash
# 编译项目
./gradlew build

# 运行测试
./gradlew test

# 运行应用
./gradlew run
```

## Java学习路径

### 🎯 学习路线图

本项目为Java学习者提供了一个系统化的学习路径，从零基础到高级应用，帮助你逐步掌握Java编程技能。

#### 第一阶段：Java基础 (1-2个月)

**学习目标**：掌握Java基本语法和编程思维

- **环境搭建**
  - JDK安装与配置
  - IDE选择（IntelliJ IDEA/Eclipse）
  - 第一个Hello World程序

- **基础语法**
  - 变量与数据类型
  - 运算符与表达式
  - 控制流程（if-else, switch, 循环）
  - 数组的使用

- **方法与函数**
  - 方法定义与调用
  - 参数传递
  - 方法重载
  - 递归思想

**实践项目**：计算器、简单游戏（猜数字）、学生成绩管理

#### 第二阶段：面向对象编程 (2-3个月)

**学习目标**：理解OOP思想，掌握类与对象

- **类与对象**
  - 类的定义与实例化
  - 构造方法
  - 成员变量与方法
  - this关键字

- **封装、继承、多态**
  - 访问修饰符
  - 继承与super关键字
  - 方法重写
  - 抽象类与接口
  - 多态的实现

- **常用类库**
  - String类详解
  - 包装类
  - Math类
  - 日期时间API

**实践项目**：图书管理系统、银行账户管理、动物园管理系统

#### 第三阶段：核心API与集合框架 (2-3个月)

**学习目标**：掌握Java核心类库和集合操作

- **异常处理**
  - 异常体系结构
  - try-catch-finally
  - 自定义异常
  - 异常处理最佳实践

- **集合框架**
  - List（ArrayList, LinkedList）
  - Set（HashSet, TreeSet）
  - Map（HashMap, TreeMap）
  - 集合遍历与操作
  - 泛型的使用

- **文件I/O操作**
  - 文件读写
  - 字节流与字符流
  - 缓冲流
  - 序列化

**实践项目**：文件管理器、日志系统、数据持久化应用

#### 第四阶段：高级特性 (2-3个月)

**学习目标**：掌握Java高级编程技术

- **多线程编程**
  - 线程创建与管理
  - 线程同步（synchronized, Lock）
  - 线程池
  - 并发集合

- **网络编程**
  - Socket编程
  - HTTP客户端
  - 网络协议基础

- **反射与注解**
  - 反射机制
  - 动态代理
  - 自定义注解

- **Lambda表达式与Stream API**
  - 函数式编程思想
  - Lambda语法
  - Stream操作

**实践项目**：多线程下载器、简单Web服务器、聊天室应用

#### 第五阶段：框架与工具 (3-4个月)

**学习目标**：掌握主流开发框架和工具

- **构建工具**
  - Maven项目管理
  - Gradle构建工具
  - 依赖管理

- **数据库操作**
  - JDBC基础
  - 连接池
  - MyBatis/Hibernate ORM

- **Web开发**
  - Servlet与JSP
  - Spring Framework
  - Spring Boot
  - RESTful API设计

- **测试**
  - JUnit单元测试
  - Mockito模拟测试
  - 集成测试

**实践项目**：博客系统、电商网站、RESTful API服务

#### 第六阶段：企业级开发 (持续学习)

**学习目标**：掌握企业级开发技能

- **微服务架构**
  - Spring Cloud
  - 服务注册与发现
  - 配置中心
  - 网关

- **消息队列**
  - RabbitMQ
  - Apache Kafka
  - 异步处理

- **缓存技术**
  - Redis
  - 缓存策略
  - 分布式缓存

- **性能优化**
  - JVM调优
  - 代码优化
  - 数据库优化

**实践项目**：分布式系统、高并发应用、企业级项目

### 📚 推荐学习资源

#### 书籍推荐
- 《Java核心技术》- Cay S. Horstmann
- 《Effective Java》- Joshua Bloch
- 《Java并发编程实战》- Brian Goetz
- 《Spring实战》- Craig Walls

#### 在线资源
- [Oracle官方Java文档](https://docs.oracle.com/javase/)
- [菜鸟教程Java](https://www.runoob.com/java/)
- [廖雪峰Java教程](https://www.liaoxuefeng.com/wiki/1252599548343744)

#### 练习平台
- [LeetCode](https://leetcode.cn/) - 算法练习
- [牛客网](https://www.nowcoder.com/) - 编程练习
- [GitHub](https://github.com/) - 开源项目学习

### 💡 学习建议

1. **循序渐进**：按照学习路径逐步推进，不要跳跃式学习
2. **多动手练习**：理论结合实践，每个知识点都要编写代码验证
3. **项目驱动**：通过实际项目来巩固所学知识
4. **阅读源码**：学习优秀开源项目的代码实现
5. **持续学习**：技术更新快，保持学习的习惯

## 示例内容

本项目包含以下类型的Java示例，对应上述学习路径的各个阶段：

- **基础语法示例** - 对应第一阶段
- **面向对象编程** - 对应第二阶段
- **集合框架使用** - 对应第三阶段
- **多线程编程** - 对应第四阶段
- **文件I/O操作** - 对应第三阶段
- **网络编程** - 对应第四阶段
- **设计模式实现** - 对应第四、五阶段
- **框架应用示例** - 对应第五、六阶段

## 贡献指南

1. Fork 本项目
2. 创建特性分支 (`git checkout -b feature/AmazingFeature`)
3. 提交更改 (`git commit -m 'Add some AmazingFeature'`)
4. 推送到分支 (`git push origin feature/AmazingFeature`)
5. 开启 Pull Request

## 许可证

本项目采用 MIT 许可证 - 查看 [LICENSE](LICENSE) 文件了解详情。

## 联系方式

如有问题或建议，请通过以下方式联系：

- 邮箱：your.email@example.com
- GitHub Issues：[项目Issues页面](https://github.com/username/Java_demos/issues)

---

**注意**：请确保在运行示例代码前已正确配置Java开发环境。