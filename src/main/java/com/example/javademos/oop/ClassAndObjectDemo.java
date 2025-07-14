package com.example.javademos.oop;

/**
 * 类与对象综合示例
 * 演示Java面向对象编程的基础概念：类的定义、对象创建、构造方法、this关键字、成员变量与方法
 * 
 * 主要内容：
 * 1. 类的定义和基本结构
 * 2. 对象的创建和使用
 * 3. 构造方法的定义和重载
 * 4. this关键字的使用
 * 5. 成员变量和成员方法
 * 6. 静态成员和实例成员的区别
 * 7. 方法重载
 * 8. 对象的生命周期
 * 
 * @author Java学习示例
 */
public class ClassAndObjectDemo {

    public static void main(String[] args) {
        System.out.println("=== Java类与对象示例 ===");

        // 1. 演示类的定义和对象创建
        demonstrateClassDefinition();

        // 2. 演示构造方法
        demonstrateConstructors();

        // 3. 演示this关键字
        demonstrateThisKeyword();

        // 4. 演示成员变量和方法
        demonstrateMembersAndMethods();

        // 5. 演示静态成员
        demonstrateStaticMembers();

        // 6. 演示方法重载
        demonstrateMethodOverloading();

        // 7. 演示对象的生命周期
        demonstrateObjectLifecycle();
    }

    /**
     * 演示类的定义和对象创建
     */
    private static void demonstrateClassDefinition() {
        System.out.println("\n--- 1. 类的定义和对象创建 ---");

        // 创建Person对象
        Person person1 = new Person();
        System.out.println("创建默认Person对象: " + person1.getInfo());

        // 使用有参构造器创建对象
        Person person2 = new Person("张三", 25);
        System.out.println("创建指定信息的Person对象: " + person2.getInfo());

        // 修改对象属性
        person1.setName("李四");
        person1.setAge(30);
        System.out.println("修改后的person1: " + person1.getInfo());
    }

    /**
     * 演示构造方法
     */
    private static void demonstrateConstructors() {
        System.out.println("\n--- 2. 构造方法演示 ---");

        // 使用不同的构造方法创建Student对象
        Student student1 = new Student();
        System.out.println("默认构造器: " + student1.getFullInfo());

        Student student2 = new Student("王五");
        System.out.println("姓名构造器: " + student2.getFullInfo());

        Student student3 = new Student("赵六", 20);
        System.out.println("姓名年龄构造器: " + student3.getFullInfo());

        Student student4 = new Student("钱七", 22, "S001");
        System.out.println("完整信息构造器: " + student4.getFullInfo());

        // 演示构造器链调用
        System.out.println("\n构造器调用顺序演示:");
        Student student5 = new Student("孙八", 21, "S002");
    }

    /**
     * 演示this关键字的使用
     */
    private static void demonstrateThisKeyword() {
        System.out.println("\n--- 3. this关键字演示 ---");

        // 创建Employee对象演示this的使用
        Employee emp = new Employee("张经理", 35, "E001");
        System.out.println("员工信息: " + emp.getEmployeeInfo());

        // 演示this在方法中的使用
        emp.updateInfo("李经理", 36);
        System.out.println("更新后信息: " + emp.getEmployeeInfo());

        // 演示方法链调用
        Employee emp2 = new Employee()
                .setName("王主管")
                .setAge(32)
                .setEmployeeId("E002");
        System.out.println("链式调用创建的员工: " + emp2.getEmployeeInfo());
    }

    /**
     * 演示成员变量和方法
     */
    private static void demonstrateMembersAndMethods() {
        System.out.println("\n--- 4. 成员变量和方法演示 ---");

        // 创建Car对象演示成员变量和方法
        Car car = new Car("丰田", "凯美瑞", 2023);
        System.out.println("汽车信息: " + car.getCarInfo());

        // 调用成员方法
        car.start();
        car.accelerate(60);
        car.brake();
        car.stop();

        // 演示私有方法的间接调用
        car.performMaintenance();

        // 演示成员变量的访问控制
        System.out.println("\n成员变量访问演示:");
        System.out.println("品牌(public): " + car.brand);
        // System.out.println(car.model); // 编译错误：protected成员在不同包中不可访问
        // System.out.println(car.year); // 编译错误：private成员不可访问
        System.out.println("年份(通过getter): " + car.getYear());
    }

    /**
     * 演示静态成员
     */
    private static void demonstrateStaticMembers() {
        System.out.println("\n--- 5. 静态成员演示 ---");

        // 演示静态变量
        System.out.println("创建前的计数器: " + Counter.getCount());

        Counter c1 = new Counter("计数器1");
        Counter c2 = new Counter("计数器2");
        Counter c3 = new Counter("计数器3");

        System.out.println("创建3个对象后的计数器: " + Counter.getCount());

        // 演示静态方法
        Counter.resetCount();
        System.out.println("重置后的计数器: " + Counter.getCount());

        // 演示静态代码块和静态方法
        System.out.println("\n静态代码块演示:");
        // 访问静态成员会触发静态代码块执行
        System.out.println("圆周率: " + MathUtils.PI);
        System.out.println("5的平方: " + MathUtils.square(5));
        System.out.println("3和4的最大值: " + MathUtils.max(3, 4));
        
        // 注意：MathUtils是工具类，构造方法是私有的，不能实例化
        System.out.println("MathUtils是工具类，只能通过类名直接调用静态方法");
    }

    /**
     * 演示方法重载
     */
    private static void demonstrateMethodOverloading() {
        System.out.println("\n--- 6. 方法重载演示 ---");

        Calculator calc = new Calculator();

        // 演示不同参数的add方法重载
        System.out.println("两个整数相加: " + calc.add(5, 3));
        System.out.println("三个整数相加: " + calc.add(5, 3, 2));
        System.out.println("两个浮点数相加: " + calc.add(5.5, 3.2));
        System.out.println("整数和浮点数相加: " + calc.add(5, 3.7));

        // 演示数组参数的重载
        int[] numbers = { 1, 2, 3, 4, 5 };
        System.out.println("数组求和: " + calc.add(numbers));

        // 演示可变参数的重载
        System.out.println("可变参数求和: " + calc.sum(1, 2, 3, 4, 5, 6));
    }

    /**
     * 演示对象的生命周期
     */
    private static void demonstrateObjectLifecycle() {
        System.out.println("\n--- 7. 对象生命周期演示 ---");

        // 创建对象
        System.out.println("创建LifecycleDemo对象:");
        LifecycleDemo demo = new LifecycleDemo("示例对象");

        // 使用对象
        demo.doSomething();

        // 对象引用置空，等待垃圾回收
        demo = null;

        // 建议垃圾回收（不保证立即执行）
        System.gc();

        // 等待一段时间让垃圾回收器工作
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("对象生命周期演示完成");
    }
}

/**
 * Person类 - 演示基本的类定义
 */
class Person {
    // 成员变量（实例变量）
    private String name;
    private int age;

    // 默认构造方法
    public Person() {
        this.name = "未知";
        this.age = 0;
        System.out.println("Person默认构造方法被调用");
    }

    // 有参构造方法
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person有参构造方法被调用: " + name + ", " + age);
    }

    // getter方法
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // setter方法
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 150) {
            this.age = age;
        } else {
            System.out.println("年龄设置无效: " + age);
        }
    }

    // 获取信息的方法
    public String getInfo() {
        return "姓名: " + name + ", 年龄: " + age;
    }
}

/**
 * Student类 - 演示构造方法重载和this关键字
 */
class Student {
    private String name;
    private int age;
    private String studentId;

    // 默认构造方法
    public Student() {
        this("未知学生"); // 调用单参数构造方法
        System.out.println("Student默认构造方法执行完成");
    }

    // 单参数构造方法
    public Student(String name) {
        this(name, 18); // 调用双参数构造方法
        System.out.println("Student单参数构造方法执行完成");
    }

    // 双参数构造方法
    public Student(String name, int age) {
        this(name, age, "未分配"); // 调用三参数构造方法
        System.out.println("Student双参数构造方法执行完成");
    }

    // 三参数构造方法（最终构造方法）
    public Student(String name, int age, String studentId) {
        System.out.println("Student三参数构造方法开始执行");
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        System.out.println("Student三参数构造方法执行完成");
    }

    public String getFullInfo() {
        return "学生信息 - 姓名: " + name + ", 年龄: " + age + ", 学号: " + studentId;
    }
}

/**
 * Employee类 - 演示this关键字的多种用法
 */
class Employee {
    private String name;
    private int age;
    private String employeeId;

    // 默认构造方法
    public Employee() {
        this("未知员工", 0, "未分配");
    }

    // 完整构造方法
    public Employee(String name, int age, String employeeId) {
        // 使用this区分参数和成员变量
        this.name = name;
        this.age = age;
        this.employeeId = employeeId;
    }

    // 演示this在方法中的使用
    public void updateInfo(String name, int age) {
        // 当参数名与成员变量名相同时，必须使用this
        this.name = name;
        this.age = age;

        // 调用本类的其他方法
        this.validateAge();
    }

    // 私有验证方法
    private void validateAge() {
        if (this.age < 0 || this.age > 100) {
            System.out.println("警告: 年龄值可能不正确 - " + this.age);
        }
    }

    // 链式调用方法（返回this）
    public Employee setName(String name) {
        this.name = name;
        return this; // 返回当前对象，支持链式调用
    }

    public Employee setAge(int age) {
        this.age = age;
        return this;
    }

    public Employee setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
        return this;
    }

    public String getEmployeeInfo() {
        return "员工信息 - 姓名: " + this.name + ", 年龄: " + this.age + ", 工号: " + this.employeeId;
    }
}

/**
 * Car类 - 演示成员变量和方法的访问控制
 */
class Car {
    // 不同访问修饰符的成员变量
    public String brand; // 公共成员
    protected String model; // 受保护成员
    private int year; // 私有成员
    String color = "白色"; // 包私有成员（默认访问权限）

    // 实例变量
    private boolean isRunning = false;
    private int speed = 0;

    // 构造方法
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // 公共方法
    public void start() {
        if (!isRunning) {
            isRunning = true;
            System.out.println(brand + " " + model + " 启动了");
        } else {
            System.out.println("汽车已经在运行中");
        }
    }

    public void stop() {
        if (isRunning) {
            isRunning = false;
            speed = 0;
            System.out.println(brand + " " + model + " 停止了");
        } else {
            System.out.println("汽车已经停止");
        }
    }

    public void accelerate(int targetSpeed) {
        if (isRunning) {
            speed = targetSpeed;
            System.out.println("加速到 " + speed + " km/h");
        } else {
            System.out.println("请先启动汽车");
        }
    }

    public void brake() {
        if (speed > 0) {
            speed = 0;
            System.out.println("刹车，速度降为0");
        }
    }

    // 受保护方法
    protected void performMaintenance() {
        System.out.println("正在进行汽车保养...");
        checkEngine();
        checkTires();
        System.out.println("保养完成");
    }

    // 私有方法
    private void checkEngine() {
        System.out.println("检查发动机...");
    }

    private void checkTires() {
        System.out.println("检查轮胎...");
    }

    // getter方法
    public String getCarInfo() {
        return brand + " " + model + " (" + year + "年)";
    }

    public int getYear() {
        return year;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public int getSpeed() {
        return speed;
    }
}

/**
 * Counter类 - 演示静态成员变量和方法
 */
class Counter {
    // 静态变量（类变量）- 所有实例共享
    private static int count = 0;

    // 实例变量
    private String name;

    // 静态代码块 - 类加载时执行一次
    static {
        System.out.println("Counter类的静态代码块执行");
        count = 0;
    }

    // 构造方法
    public Counter(String name) {
        this.name = name;
        count++; // 每创建一个对象，计数器加1
        System.out.println("创建Counter对象: " + name + ", 当前总数: " + count);
    }

    // 静态方法 - 可以直接通过类名调用
    public static int getCount() {
        return count;
    }

    public static void resetCount() {
        count = 0;
        System.out.println("计数器已重置");
    }

    // 实例方法
    public String getName() {
        return name;
    }
}

/**
 * MathUtils类 - 演示静态常量和静态方法
 */
class MathUtils {
    // 静态常量
    public static final double PI = 3.14159265359;
    public static final double E = 2.71828182846;

    // 静态代码块
    static {
        System.out.println("MathUtils类初始化，加载数学常量");
        System.out.println("PI = " + PI + ", E = " + E);
    }

    // 私有构造方法，防止实例化
    private MathUtils() {
        // 工具类不应该被实例化
    }

    // 静态方法
    public static double square(double x) {
        return x * x;
    }

    public static double cube(double x) {
        return x * x * x;
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}

/**
 * Calculator类 - 演示方法重载
 */
class Calculator {

    // 两个整数相加
    public int add(int a, int b) {
        System.out.println("调用add(int, int)");
        return a + b;
    }

    // 三个整数相加
    public int add(int a, int b, int c) {
        System.out.println("调用add(int, int, int)");
        return a + b + c;
    }

    // 两个浮点数相加
    public double add(double a, double b) {
        System.out.println("调用add(double, double)");
        return a + b;
    }

    // 整数和浮点数相加
    public double add(int a, double b) {
        System.out.println("调用add(int, double)");
        return a + b;
    }

    // 数组求和
    public int add(int[] numbers) {
        System.out.println("调用add(int[])");
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    // 可变参数求和
    public int sum(int... numbers) {
        System.out.println("调用sum(int...)");
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }
}

/**
 * LifecycleDemo类 - 演示对象的生命周期
 */
class LifecycleDemo {
    private String name;

    // 构造方法
    public LifecycleDemo(String name) {
        this.name = name;
        System.out.println("对象 " + name + " 被创建");
    }

    public void doSomething() {
        System.out.println("对象 " + name + " 正在工作");
    }

    // finalize方法（已废弃，仅用于演示）
    @Override
    protected void finalize() throws Throwable {
        System.out.println("对象 " + name + " 即将被垃圾回收");
        super.finalize();
    }
}