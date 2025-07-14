package com.example.javademos.basic;

/**
 * Java变量声明和初始化示例
 * 演示变量的声明、初始化、作用域和命名规范
 * 
 * @author Java学习示例
 * @version 1.0
 */
public class VariableDeclaration {
    
    // 类变量（静态变量）- 属于类，所有实例共享
    public static int classVariable = 100;
    private static final String CLASS_CONSTANT = "类常量";
    
    // 实例变量（成员变量）- 属于对象实例
    public int instanceVariable;
    private String instanceName;
    protected double instanceValue = 3.14;
    
    // 构造方法
    public VariableDeclaration() {
        this.instanceVariable = 50;
        this.instanceName = "默认名称";
    }
    
    public VariableDeclaration(int value, String name) {
        this.instanceVariable = value;
        this.instanceName = name;
    }
    
    public static void main(String[] args) {
        System.out.println("=== Java变量声明和初始化示例 ===");
        
        // 1. 基本变量声明和初始化
        demonstrateBasicDeclaration();
        
        // 2. 变量作用域
        demonstrateVariableScope();
        
        // 3. 变量命名规范
        demonstrateNamingConventions();
        
        // 4. 默认值
        demonstrateDefaultValues();
        
        // 5. 变量修饰符
        demonstrateVariableModifiers();
    }
    
    /**
     * 演示基本变量声明和初始化
     */
    private static void demonstrateBasicDeclaration() {
        System.out.println("\n--- 基本变量声明和初始化 ---");
        
        // 1. 声明后初始化
        int number;
        number = 42;
        System.out.println("声明后初始化: number = " + number);
        
        // 2. 声明时初始化
        String message = "Hello, Java!";
        double price = 99.99;
        boolean isActive = true;
        
        System.out.println("声明时初始化: message = " + message);
        System.out.println("声明时初始化: price = " + price);
        System.out.println("声明时初始化: isActive = " + isActive);
        
        // 3. 多个变量同时声明
        int a, b, c;
        a = 1;
        b = 2;
        c = 3;
        System.out.println("多变量声明: a=" + a + ", b=" + b + ", c=" + c);
        
        // 4. 多个变量同时声明并初始化
        int x = 10, y = 20, z = 30;
        System.out.println("多变量声明并初始化: x=" + x + ", y=" + y + ", z=" + z);
        
        // 5. 混合声明（部分初始化）
        int p = 100, q, r = 300;
        q = 200; // 后续初始化
        System.out.println("混合声明: p=" + p + ", q=" + q + ", r=" + r);
        
        // 6. 常量声明
        final int MAX_COUNT = 1000;
        final String APP_NAME = "Java学习应用";
        System.out.println("常量: MAX_COUNT=" + MAX_COUNT + ", APP_NAME=" + APP_NAME);
    }
    
    /**
     * 演示变量作用域
     */
    private static void demonstrateVariableScope() {
        System.out.println("\n--- 变量作用域 ---");
        
        // 方法级变量（局部变量）
        int methodVariable = 100;
        System.out.println("方法变量: " + methodVariable);
        
        // 访问类变量
        System.out.println("类变量: " + classVariable);
        System.out.println("类常量: " + CLASS_CONSTANT);
        
        // 创建实例访问实例变量
        VariableDeclaration obj = new VariableDeclaration(200, "测试对象");
        System.out.println("实例变量: " + obj.instanceVariable);
        System.out.println("实例名称: " + obj.instanceName);
        System.out.println("实例值: " + obj.instanceValue);
        
        // 块级作用域
        {
            int blockVariable = 300;
            System.out.println("块级变量: " + blockVariable);
            // blockVariable只在这个块内有效
        }
        // System.out.println(blockVariable); // 编译错误：变量不在作用域内
        
        // 循环中的变量作用域
        for (int i = 0; i < 3; i++) {
            int loopVariable = i * 10;
            System.out.println("循环变量 i=" + i + ", loopVariable=" + loopVariable);
        }
        // System.out.println(i); // 编译错误：i不在作用域内
        
        // 条件语句中的变量作用域
        if (methodVariable > 50) {
            int conditionVariable = 400;
            System.out.println("条件变量: " + conditionVariable);
        }
        // System.out.println(conditionVariable); // 编译错误：变量不在作用域内
    }
    
    /**
     * 演示变量命名规范
     */
    private static void demonstrateNamingConventions() {
        System.out.println("\n--- 变量命名规范 ---");
        
        // 1. 驼峰命名法（推荐）
        String firstName = "张";
        String lastName = "三";
        int studentAge = 20;
        boolean isStudentActive = true;
        double accountBalance = 1000.50;
        
        System.out.println("驼峰命名法示例:");
        System.out.println("firstName: " + firstName);
        System.out.println("lastName: " + lastName);
        System.out.println("studentAge: " + studentAge);
        System.out.println("isStudentActive: " + isStudentActive);
        System.out.println("accountBalance: " + accountBalance);
        
        // 2. 常量命名（全大写+下划线）
        final int MAX_RETRY_COUNT = 3;
        final String DEFAULT_ENCODING = "UTF-8";
        final double PI_VALUE = 3.14159;
        
        System.out.println("\n常量命名示例:");
        System.out.println("MAX_RETRY_COUNT: " + MAX_RETRY_COUNT);
        System.out.println("DEFAULT_ENCODING: " + DEFAULT_ENCODING);
        System.out.println("PI_VALUE: " + PI_VALUE);
        
        // 3. 布尔变量命名规范
        boolean isValid = true;
        boolean hasPermission = false;
        boolean canEdit = true;
        boolean shouldUpdate = false;
        
        System.out.println("\n布尔变量命名示例:");
        System.out.println("isValid: " + isValid);
        System.out.println("hasPermission: " + hasPermission);
        System.out.println("canEdit: " + canEdit);
        System.out.println("shouldUpdate: " + shouldUpdate);
        
        // 4. 集合变量命名
        String[] studentNames = {"Alice", "Bob", "Charlie"};
        int[] scores = {85, 92, 78};
        
        System.out.println("\n集合变量命名示例:");
        System.out.println("studentNames: " + java.util.Arrays.toString(studentNames));
        System.out.println("scores: " + java.util.Arrays.toString(scores));
        
        // 5. 避免的命名方式示例（仅作说明，实际开发中应避免）
        System.out.println("\n应避免的命名方式（仅作说明）:");
        int a = 1;           // 太简短，无意义
        String s = "test";   // 太简短，无意义
        int data1 = 10;      // 使用数字后缀不清晰
        // int class = 5;    // 编译错误：不能使用关键字
        // int 2name = "x";  // 编译错误：不能以数字开头
        
        System.out.println("避免使用: a=" + a + ", s=" + s + ", data1=" + data1);
    }
    
    /**
     * 演示默认值
     */
    private static void demonstrateDefaultValues() {
        System.out.println("\n--- 变量默认值 ---");
        
        // 创建对象来展示实例变量的默认值
        DefaultValueDemo demo = new DefaultValueDemo();
        demo.showDefaultValues();
        
        System.out.println("\n注意：局部变量没有默认值，必须初始化后才能使用");
        
        // 局部变量必须初始化
        int localInt;
        // System.out.println(localInt); // 编译错误：变量可能尚未初始化
        
        localInt = 0; // 必须先初始化
        System.out.println("初始化后的局部变量: " + localInt);
    }
    
    /**
     * 演示变量修饰符
     */
    private static void demonstrateVariableModifiers() {
        System.out.println("\n--- 变量修饰符 ---");
        
        ModifierDemo demo = new ModifierDemo();
        demo.showModifiers();
        
        // 访问静态变量
        System.out.println("静态变量: " + ModifierDemo.staticVariable);
        
        // 修改静态变量
        ModifierDemo.staticVariable = 999;
        System.out.println("修改后的静态变量: " + ModifierDemo.staticVariable);
        
        // 常量不能修改
        System.out.println("常量值: " + ModifierDemo.CONSTANT_VALUE);
        // ModifierDemo.CONSTANT_VALUE = 200; // 编译错误：无法为final变量赋值
    }
    
    /**
     * 内部类：用于演示默认值
     */
    static class DefaultValueDemo {
        // 实例变量的默认值
        byte defaultByte;           // 0
        short defaultShort;         // 0
        int defaultInt;             // 0
        long defaultLong;           // 0L
        float defaultFloat;         // 0.0f
        double defaultDouble;       // 0.0
        char defaultChar;           // '\u0000' (空字符)
        boolean defaultBoolean;     // false
        String defaultString;       // null
        
        void showDefaultValues() {
            System.out.println("实例变量的默认值:");
            System.out.println("byte: " + defaultByte);
            System.out.println("short: " + defaultShort);
            System.out.println("int: " + defaultInt);
            System.out.println("long: " + defaultLong);
            System.out.println("float: " + defaultFloat);
            System.out.println("double: " + defaultDouble);
            System.out.println("char: '" + defaultChar + "' (ASCII: " + (int)defaultChar + ")");
            System.out.println("boolean: " + defaultBoolean);
            System.out.println("String: " + defaultString);
        }
    }
    
    /**
     * 内部类：用于演示修饰符
     */
    static class ModifierDemo {
        // 不同访问修饰符的变量
        public int publicVariable = 100;        // 公共变量
        private int privateVariable = 200;      // 私有变量
        protected int protectedVariable = 300;  // 受保护变量
        int packageVariable = 400;              // 包级私有变量
        
        // 静态变量
        public static int staticVariable = 500;
        
        // 常量
        public static final int CONSTANT_VALUE = 600;
        
        // final实例变量
        public final int finalVariable = 700;
        
        void showModifiers() {
            System.out.println("访问修饰符示例:");
            System.out.println("public变量: " + publicVariable);
            System.out.println("private变量: " + privateVariable);
            System.out.println("protected变量: " + protectedVariable);
            System.out.println("package变量: " + packageVariable);
            System.out.println("final变量: " + finalVariable);
        }
    }
}