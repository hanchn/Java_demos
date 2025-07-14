# Java 代码示例大全

这是一个系统化的Java学习示例项目，包含从基础到高级的各种代码示例，帮助开发者逐步掌握Java编程技能。

## 📚 示例大纲

### 第一部分：Java基础语法 (basic)

#### 1.1 基本数据类型与变量
- [x] 基本数据类型示例 (`BasicDataTypes.java`) ✅
  - 8种基本数据类型：byte, short, int, long, float, double, char, boolean
  - 数据类型范围和默认值
  - 类型转换（自动转换和强制转换）
  - 常量定义和使用
- [x] 变量声明与作用域 (`VariableDeclaration.java`) ✅
  - 类变量、实例变量、局部变量
  - 变量命名规范
  - 变量初始化和默认值
  - 变量作用域演示

#### 1.2 运算符
- [x] 运算符综合示例 (`OperatorExamples.java`) ✅
  - 算术运算符 (+, -, *, /, %)
  - 关系运算符 (==, !=, >, <, >=, <=)
  - 逻辑运算符 (&&, ||, !)
  - 位运算符 (&, |, ^, ~, <<, >>, >>>)
  - 赋值运算符 (=, +=, -=, *=, /=, %=)
  - 一元运算符 (++, --, +, -)
  - 三元运算符 (? :)
  - 运算符优先级演示

#### 1.3 控制流程
- [x] 控制流综合示例 (`ControlFlowExamples.java`) ✅
  - 条件语句：if, if-else, if-else if-else, 嵌套if
  - switch语句：传统switch, switch表达式, 字符串switch, 枚举switch
  - 循环语句：for, 增强for, while, do-while, 无限循环, 嵌套循环
  - 跳转语句：break, continue, 标签break/continue, return
  - 实际应用：菜单驱动程序、数据验证、搜索排序算法

#### 1.4 数组操作
- [x] 数组操作综合示例 (`ArrayOperations.java`) ✅
  - 一维数组：声明、初始化、访问、遍历
  - 多维数组：二维数组、三维数组、锯齿数组
  - 数组工具方法：复制、排序、搜索、填充、比较
  - 数组作为方法参数和返回值
  - 可变参数（varargs）
  - 数组注意事项：引用类型、长度不可变、默认值

#### 1.5 方法定义与使用
- [x] 方法综合示例 (`MethodExamples.java`) ✅
  - 方法定义和调用
  - 参数传递：值传递 vs 引用传递
  - 方法重载：按参数数量、类型、顺序重载
  - 可变参数方法
  - 递归方法：阶乘、斐波那契、数字求和、字符串反转、二分查找、汉诺塔
  - 静态方法 vs 实例方法
  - 访问修饰符：public, private, protected, 包私有
  - 实用工具方法

#### 1.6 字符串操作
- [x] 字符串操作综合示例 (`StringOperations.java`) ✅
  - 字符串创建：字面量、new关键字、字符数组、字节数组
  - 字符串比较：==, equals(), equalsIgnoreCase(), compareTo()
  - 字符串查找：indexOf(), lastIndexOf(), contains(), startsWith(), endsWith()
  - 字符串操作：substring(), split(), replace(), trim(), toUpperCase(), toLowerCase()
  - 字符串格式化：printf(), String.format(), MessageFormat
  - StringBuilder和StringBuffer使用
  - 字符串转换：基本类型转换、进制转换、字符数组转换
  - 正则表达式：Pattern, Matcher, 常用正则模式
  - 字符串工具方法：连接、验证、截断、填充
  - 性能考虑和最佳实践

### 第二部分：面向对象编程 (oop)

#### 2.1 类与对象
- [x] 类和对象综合示例 (`ClassAndObjectDemo.java`) ✅
  - 类的定义和对象创建
  - 构造方法和方法重载
  - this关键字的使用
  - 成员变量和方法
  - 静态成员和静态方法
  - 对象生命周期演示

#### 2.2 封装
- [x] 封装综合示例 (`EncapsulationDemo.java`) ✅
  - 访问修饰符详解
  - getter和setter方法
  - 数据隐藏和验证
  - 不可变类设计
  - 属性访问控制

#### 2.3 继承
- [x] 继承综合示例 (`InheritanceDemo.java`) ✅
  - 类继承基础
  - super关键字使用
  - 方法重写
  - 构造方法链
  - 访问修饰符在继承中的作用
  - final关键字
  - 抽象类基础

#### 2.4 多态
- [ ] 多态基础概念 (`PolymorphismBasicsDemo.java`)
- [ ] 运行时多态 (`RuntimePolymorphismDemo.java`)
- [ ] instanceof操作符 (`InstanceofDemo.java`)

#### 2.5 抽象类与接口
- [ ] 抽象类 (`AbstractClassDemo.java`)
- [ ] 接口定义与实现 (`InterfaceDemo.java`)
- [ ] 接口多继承 (`MultipleInheritanceDemo.java`)
- [ ] 默认方法与静态方法 (`DefaultStaticMethodsDemo.java`)

### 第三部分：Java核心类库 (core)

#### 3.1 String类
- [ ] String基本操作 (`StringBasicsDemo.java`)
- [ ] String方法详解 (`StringMethodsDemo.java`)
- [ ] StringBuilder和StringBuffer (`StringBuilderBufferDemo.java`)
- [ ] 字符串格式化 (`StringFormattingDemo.java`)
- [ ] 正则表达式 (`RegexDemo.java`)

#### 3.2 包装类
- [ ] 基本类型包装类 (`WrapperClassesDemo.java`)
- [ ] 自动装箱拆箱 (`AutoboxingUnboxingDemo.java`)
- [ ] 数值转换 (`NumberConversionDemo.java`)

#### 3.3 日期时间API
- [ ] Date类使用 (`DateDemo.java`)
- [ ] Calendar类 (`CalendarDemo.java`)
- [ ] Java 8时间API (`LocalDateTimeDemo.java`)
- [ ] 时间格式化 (`DateFormattingDemo.java`)

#### 3.4 Math类
- [ ] 数学运算方法 (`MathOperationsDemo.java`)
- [ ] 随机数生成 (`RandomNumberDemo.java`)
- [ ] 数学常量 (`MathConstantsDemo.java`)

### 第四部分：集合框架 (collections)

#### 4.1 List集合
- [ ] ArrayList使用 (`ArrayListDemo.java`)
- [ ] LinkedList使用 (`LinkedListDemo.java`)
- [ ] Vector使用 (`VectorDemo.java`)
- [ ] List性能比较 (`ListPerformanceDemo.java`)

#### 4.2 Set集合
- [ ] HashSet使用 (`HashSetDemo.java`)
- [ ] LinkedHashSet使用 (`LinkedHashSetDemo.java`)
- [ ] TreeSet使用 (`TreeSetDemo.java`)
- [ ] Set操作示例 (`SetOperationsDemo.java`)

#### 4.3 Map集合
- [ ] HashMap使用 (`HashMapDemo.java`)
- [ ] LinkedHashMap使用 (`LinkedHashMapDemo.java`)
- [ ] TreeMap使用 (`TreeMapDemo.java`)
- [ ] Properties使用 (`PropertiesDemo.java`)

#### 4.4 集合工具类
- [ ] Collections工具类 (`CollectionsUtilDemo.java`)
- [ ] Arrays工具类 (`ArraysUtilDemo.java`)
- [ ] 集合排序 (`CollectionSortingDemo.java`)
- [ ] 集合搜索 (`CollectionSearchingDemo.java`)

#### 4.5 泛型
- [ ] 泛型基础 (`GenericsBasicsDemo.java`)
- [ ] 泛型类 (`GenericClassDemo.java`)
- [ ] 泛型方法 (`GenericMethodDemo.java`)
- [ ] 通配符 (`WildcardsDemo.java`)

### 第五部分：异常处理 (exceptions)

#### 5.1 异常基础
- [ ] 异常体系结构 (`ExceptionHierarchyDemo.java`)
- [ ] try-catch语句 (`TryCatchDemo.java`)
- [ ] finally块 (`FinallyBlockDemo.java`)
- [ ] 多重catch (`MultipleCatchDemo.java`)

#### 5.2 异常处理进阶
- [ ] 抛出异常 (`ThrowingExceptionsDemo.java`)
- [ ] 自定义异常 (`CustomExceptionDemo.java`)
- [ ] 异常链 (`ExceptionChainingDemo.java`)
- [ ] try-with-resources (`TryWithResourcesDemo.java`)

### 第六部分：文件I/O操作 (io)

#### 6.1 文件操作
- [ ] File类使用 (`FileClassDemo.java`)
- [ ] 文件创建删除 (`FileCreateDeleteDemo.java`)
- [ ] 目录操作 (`DirectoryOperationsDemo.java`)
- [ ] 文件属性 (`FileAttributesDemo.java`)

#### 6.2 字节流
- [ ] FileInputStream/FileOutputStream (`FileByteStreamDemo.java`)
- [ ] BufferedInputStream/BufferedOutputStream (`BufferedByteStreamDemo.java`)
- [ ] 对象序列化 (`ObjectSerializationDemo.java`)

#### 6.3 字符流
- [ ] FileReader/FileWriter (`FileCharStreamDemo.java`)
- [ ] BufferedReader/BufferedWriter (`BufferedCharStreamDemo.java`)
- [ ] 字符编码 (`CharacterEncodingDemo.java`)

#### 6.4 NIO
- [ ] NIO基础 (`NIOBasicsDemo.java`)
- [ ] Channel和Buffer (`ChannelBufferDemo.java`)
- [ ] 文件复制 (`FileCopyDemo.java`)

### 第七部分：多线程编程 (multithreading)

#### 7.1 线程基础
- [ ] 线程创建方式 (`ThreadCreationDemo.java`)
- [ ] 线程生命周期 (`ThreadLifecycleDemo.java`)
- [ ] 线程优先级 (`ThreadPriorityDemo.java`)
- [ ] 守护线程 (`DaemonThreadDemo.java`)

#### 7.2 线程同步
- [ ] synchronized关键字 (`SynchronizedDemo.java`)
- [ ] 同步方法 (`SynchronizedMethodDemo.java`)
- [ ] 同步代码块 (`SynchronizedBlockDemo.java`)
- [ ] 死锁问题 (`DeadlockDemo.java`)

#### 7.3 线程通信
- [ ] wait/notify机制 (`WaitNotifyDemo.java`)
- [ ] 生产者消费者模式 (`ProducerConsumerDemo.java`)
- [ ] 线程间数据传递 (`ThreadDataSharingDemo.java`)

#### 7.4 并发工具类
- [ ] Lock接口 (`LockDemo.java`)
- [ ] ReentrantLock (`ReentrantLockDemo.java`)
- [ ] CountDownLatch (`CountDownLatchDemo.java`)
- [ ] CyclicBarrier (`CyclicBarrierDemo.java`)
- [ ] Semaphore (`SemaphoreDemo.java`)

#### 7.5 线程池
- [ ] Executor框架 (`ExecutorDemo.java`)
- [ ] ThreadPoolExecutor (`ThreadPoolExecutorDemo.java`)
- [ ] ScheduledExecutorService (`ScheduledExecutorDemo.java`)
- [ ] Future和Callable (`FutureCallableDemo.java`)

### 第八部分：网络编程 (networking)

#### 8.1 网络基础
- [ ] InetAddress类 (`InetAddressDemo.java`)
- [ ] URL和URI (`URLURIDemo.java`)
- [ ] 网络协议基础 (`NetworkProtocolsDemo.java`)

#### 8.2 Socket编程
- [ ] TCP客户端 (`TCPClientDemo.java`)
- [ ] TCP服务器 (`TCPServerDemo.java`)
- [ ] UDP通信 (`UDPDemo.java`)
- [ ] 多客户端服务器 (`MultiClientServerDemo.java`)

#### 8.3 HTTP编程
- [ ] HTTP客户端 (`HTTPClientDemo.java`)
- [ ] RESTful API调用 (`RESTfulAPIDemo.java`)
- [ ] JSON数据处理 (`JSONProcessingDemo.java`)

### 第九部分：反射与注解 (reflection)

#### 9.1 反射机制
- [ ] Class类使用 (`ClassDemo.java`)
- [ ] 获取类信息 (`ClassInfoDemo.java`)
- [ ] 动态创建对象 (`DynamicObjectCreationDemo.java`)
- [ ] 调用方法 (`MethodInvocationDemo.java`)
- [ ] 访问字段 (`FieldAccessDemo.java`)

#### 9.2 注解
- [ ] 内置注解 (`BuiltInAnnotationsDemo.java`)
- [ ] 自定义注解 (`CustomAnnotationDemo.java`)
- [ ] 注解处理器 (`AnnotationProcessorDemo.java`)
- [ ] 运行时注解 (`RuntimeAnnotationDemo.java`)

#### 9.3 动态代理
- [ ] JDK动态代理 (`JDKProxyDemo.java`)
- [ ] CGLIB代理 (`CGLIBProxyDemo.java`)
- [ ] 代理模式应用 (`ProxyPatternDemo.java`)

### 第十部分：函数式编程 (functional)

#### 10.1 Lambda表达式
- [ ] Lambda基础语法 (`LambdaBasicsDemo.java`)
- [ ] 函数式接口 (`FunctionalInterfaceDemo.java`)
- [ ] 方法引用 (`MethodReferenceDemo.java`)
- [ ] 构造器引用 (`ConstructorReferenceDemo.java`)

#### 10.2 Stream API
- [ ] Stream创建 (`StreamCreationDemo.java`)
- [ ] 中间操作 (`StreamIntermediateOpsDemo.java`)
- [ ] 终端操作 (`StreamTerminalOpsDemo.java`)
- [ ] 并行流 (`ParallelStreamDemo.java`)
- [ ] 收集器 (`CollectorsDemo.java`)

#### 10.3 Optional类
- [ ] Optional基础 (`OptionalBasicsDemo.java`)
- [ ] Optional操作方法 (`OptionalOperationsDemo.java`)
- [ ] 避免空指针 (`NullPointerAvoidanceDemo.java`)

### 第十一部分：设计模式 (patterns)

#### 11.1 创建型模式
- [ ] 单例模式 (`SingletonPatternDemo.java`)
- [ ] 工厂方法模式 (`FactoryMethodPatternDemo.java`)
- [ ] 抽象工厂模式 (`AbstractFactoryPatternDemo.java`)
- [ ] 建造者模式 (`BuilderPatternDemo.java`)
- [ ] 原型模式 (`PrototypePatternDemo.java`)

#### 11.2 结构型模式
- [ ] 适配器模式 (`AdapterPatternDemo.java`)
- [ ] 装饰器模式 (`DecoratorPatternDemo.java`)
- [ ] 外观模式 (`FacadePatternDemo.java`)
- [ ] 代理模式 (`ProxyPatternDemo.java`)
- [ ] 组合模式 (`CompositePatternDemo.java`)

#### 11.3 行为型模式
- [ ] 观察者模式 (`ObserverPatternDemo.java`)
- [ ] 策略模式 (`StrategyPatternDemo.java`)
- [ ] 命令模式 (`CommandPatternDemo.java`)
- [ ] 模板方法模式 (`TemplateMethodPatternDemo.java`)
- [ ] 状态模式 (`StatePatternDemo.java`)

### 第十二部分：Spring Boot应用 (springboot)

#### 12.1 Web开发
- [ ] REST API开发 (`RestAPIDemo.java`)
- [ ] 请求参数处理 (`RequestParametersDemo.java`)
- [ ] 响应数据格式 (`ResponseFormatsDemo.java`)
- [ ] 异常处理 (`ExceptionHandlingDemo.java`)

#### 12.2 数据访问
- [ ] JPA实体类 (`JPAEntityDemo.java`)
- [ ] Repository接口 (`RepositoryDemo.java`)
- [ ] 数据库操作 (`DatabaseOperationsDemo.java`)
- [ ] 事务管理 (`TransactionDemo.java`)

#### 12.3 配置管理
- [ ] 配置文件使用 (`ConfigurationDemo.java`)
- [ ] 环境配置 (`ProfilesDemo.java`)
- [ ] 自定义配置 (`CustomConfigDemo.java`)

#### 12.4 测试
- [ ] 单元测试 (`UnitTestDemo.java`)
- [ ] 集成测试 (`IntegrationTestDemo.java`)
- [ ] Mock测试 (`MockTestDemo.java`)

### 第十三部分：实战项目 (projects)

#### 13.1 控制台应用
- [ ] 学生管理系统 (`StudentManagementSystem.java`)
- [ ] 图书管理系统 (`LibraryManagementSystem.java`)
- [ ] 银行账户系统 (`BankAccountSystem.java`)
- [ ] 计算器应用 (`CalculatorApp.java`)

#### 13.2 Web应用
- [ ] 博客系统 (`BlogSystem/`)
- [ ] 在线商城 (`OnlineShop/`)
- [ ] 任务管理系统 (`TaskManagementSystem/`)
- [ ] 聊天室应用 (`ChatRoomApp/`)

#### 13.3 工具类项目
- [ ] 文件处理工具 (`FileUtilityTool.java`)
- [ ] 数据转换工具 (`DataConversionTool.java`)
- [ ] 网络爬虫 (`WebCrawler.java`)
- [ ] 日志分析工具 (`LogAnalyzer.java`)

## 🚀 快速开始

### 环境要求
- Java 17 或更高版本
- Maven 3.6 或更高版本
- IDE（推荐 IntelliJ IDEA 或 Eclipse）

### 运行基础语法示例

#### 方式一：使用BasicExamplesRunner（推荐）
```bash
# 进入项目目录
cd Java_demos

# 使用Maven编译并运行所有基础示例
mvn compile exec:java -Dexec.mainClass="com.example.javademos.basic.BasicExamplesRunner"

# 运行特定示例（1-7对应不同示例，8运行所有）
mvn compile exec:java -Dexec.mainClass="com.example.javademos.basic.BasicExamplesRunner" -Dexec.args="1"
```

### 运行面向对象编程示例

#### 方式一：使用OOPExamplesRunner（推荐）
```bash
# 使用Maven编译并运行所有OOP示例
mvn compile exec:java -Dexec.mainClass="com.example.javademos.oop.OOPExamplesRunner"

# 运行特定示例（1-3对应不同示例，4运行所有）
mvn compile exec:java -Dexec.mainClass="com.example.javademos.oop.OOPExamplesRunner" -Dexec.args="1"
```

#### 方式二：直接编译运行
```bash
# 编译所有Java文件
javac -d target/classes src/main/java/com/example/javademos/*/*.java

# 运行BasicExamplesRunner
java -cp target/classes com.example.javademos.basic.BasicExamplesRunner

# 运行OOPExamplesRunner
java -cp target/classes com.example.javademos.oop.OOPExamplesRunner

# 或运行单个示例
java -cp target/classes com.example.javademos.basic.BasicDataTypes
java -cp target/classes com.example.javademos.oop.ClassAndObjectDemo
```

#### 方式三：使用IDE
1. 在IDE中打开项目
2. 运行 `basic/BasicExamplesRunner.java` 查看所有基础语法示例
3. 运行 `oop/OOPExamplesRunner.java` 查看所有面向对象编程示例
4. 或直接运行单个示例文件

#### 基础语法示例选项说明
- **选项1**: 基本数据类型示例 (`BasicDataTypes.java`)
- **选项2**: 变量声明示例 (`VariableDeclaration.java`)
- **选项3**: 数组操作示例 (`ArrayOperations.java`)
- **选项4**: 运算符示例 (`OperatorExamples.java`)
- **选项5**: 控制流示例 (`ControlFlowExamples.java`)
- **选项6**: 方法示例 (`MethodExamples.java`)
- **选项7**: 字符串操作示例 (`StringOperations.java`)
- **选项8**: 运行所有示例（默认选项）

#### 面向对象编程示例选项说明
- **选项1**: 类和对象示例 (`ClassAndObjectDemo.java`)
- **选项2**: 封装示例 (`EncapsulationDemo.java`)
- **选项3**: 继承示例 (`InheritanceDemo.java`)
- **选项4**: 运行所有示例（默认选项）

### Spring Boot应用（后续开发）

1. 克隆项目：
   ```bash
   git clone <repository-url>
   cd Java_demos
   ```

2. 启动Spring Boot应用：
   ```bash
   mvn spring-boot:run
   ```

3. 访问应用：
   - 主页：http://localhost:8080
   - API文档：http://localhost:8080/api/info
   - H2数据库控制台：http://localhost:8080/h2-console

## 📁 项目结构

```
Java_demos/
├── src/main/java/com/example/javademos/
│   ├── JavaDemosApplication.java          # Spring Boot主启动类
│   ├── basic/                             # 基础语法示例
│   │   ├── BasicExamplesRunner.java       # 基础示例运行器
│   │   ├── BasicDataTypes.java            # 基本数据类型示例
│   │   ├── VariableDeclaration.java       # 变量声明示例
│   │   ├── ArrayOperations.java           # 数组操作示例
│   │   ├── OperatorExamples.java          # 运算符示例
│   │   ├── ControlFlowExamples.java       # 控制流示例
│   │   ├── MethodExamples.java            # 方法示例
│   │   └── StringOperations.java          # 字符串操作示例
│   ├── oop/                               # 面向对象编程示例
│   │   ├── OOPExamplesRunner.java         # OOP示例运行器
│   │   ├── ClassAndObjectDemo.java        # 类和对象示例
│   │   ├── EncapsulationDemo.java         # 封装示例
│   │   └── InheritanceDemo.java           # 继承示例
│   └── controller/                        # Spring Boot控制器
│       └── HelloController.java           # 示例控制器
├── src/main/resources/
│   └── application.properties             # Spring Boot配置
├── pom.xml                                # Maven配置文件
└── README.md                              # 项目说明文档
```

## 📝 学习建议

### 基础语法学习路径
1. **数据类型与变量** (`BasicDataTypes.java`, `VariableDeclaration.java`)
   - 理解8种基本数据类型的特点和使用场景
   - 掌握变量作用域和生命周期
   - 练习类型转换和常量使用

2. **运算符** (`OperatorExamples.java`)
   - 熟练掌握各种运算符的使用
   - 理解运算符优先级和结合性
   - 注意位运算符的实际应用

3. **控制流程** (`ControlFlowExamples.java`)
   - 掌握条件判断和循环控制
   - 理解break、continue的使用场景
   - 练习嵌套结构的编写

4. **数组操作** (`ArrayOperations.java`)
   - 理解数组的引用特性
   - 掌握多维数组的使用
   - 熟练使用Arrays工具类

5. **方法设计** (`MethodExamples.java`)
   - 理解方法重载的规则
   - 掌握递归思想和应用
   - 学会设计可复用的工具方法

6. **字符串处理** (`StringOperations.java`)
   - 理解String的不可变性
   - 掌握StringBuilder的性能优势
   - 学会使用正则表达式

### 学习技巧
1. **循序渐进**：使用`BasicExamplesRunner`按顺序学习各个示例
2. **动手实践**：修改示例代码，观察运行结果的变化
3. **理解原理**：阅读代码注释，理解每个知识点的设计原理
4. **举一反三**：基于示例代码编写自己的练习程序
5. **查阅文档**：养成查阅Java官方文档的习惯
6. **代码规范**：遵循示例中的编码规范和注释风格

## 🤝 贡献指南

欢迎提交Issue和Pull Request来完善这个项目！

### 贡献方式
1. Fork本项目
2. 创建特性分支 (`git checkout -b feature/AmazingFeature`)
3. 提交更改 (`git commit -m 'Add some AmazingFeature'`)
4. 推送到分支 (`git push origin feature/AmazingFeature`)
5. 开启Pull Request

### 代码贡献规范
- 保持代码风格一致
- 添加详细的中文注释
- 包含实际应用示例
- 遵循Java命名规范

## 📄 许可证

本项目采用MIT许可证 - 查看 [LICENSE](LICENSE) 文件了解详情

## 📞 联系方式

如有问题或建议，请通过以下方式联系：
- 提交Issue
- 发送邮件至：[your-email@example.com]

---

**Happy Coding! 🎉**

> 💡 **提示**：建议先运行 `BasicExamplesRunner` 查看所有示例的运行效果，然后逐个深入学习每个示例文件。