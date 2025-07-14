package com.example.javademos.oop;

/**
 * 继承示例
 * 演示Java面向对象编程的继承特性：类继承基础、super关键字、方法重写、继承中的构造方法
 * 
 * 主要内容：
 * 1. 类继承的基本语法和概念
 * 2. super关键字的使用
 * 3. 方法重写(Override)和方法重载(Overload)的区别
 * 4. 继承中的构造方法调用链
 * 5. 访问修饰符在继承中的作用
 * 6. final关键字在继承中的使用
 * 7. 抽象类和具体类的继承关系
 * 8. 继承的最佳实践和注意事项
 * 
 * @author Java学习示例
 */
public class InheritanceDemo {

    public static void main(String[] args) {
        System.out.println("=== Java继承示例 ===");

        // 1. 演示基本继承
        demonstrateBasicInheritance();

        // 2. 演示super关键字
        demonstrateSuperKeyword();

        // 3. 演示方法重写
        demonstrateMethodOverriding();

        // 4. 演示继承中的构造方法
        demonstrateInheritanceConstructors();

        // 5. 演示访问修饰符在继承中的作用
        demonstrateAccessInInheritance();

        // 6. 演示final关键字
        demonstrateFinalInInheritance();

        // 7. 演示抽象类继承
        demonstrateAbstractInheritance();

        // 8. 演示继承的实际应用
        demonstratePracticalInheritance();
    }

    /**
     * 演示基本继承概念
     */
    private static void demonstrateBasicInheritance() {
        System.out.println("\n--- 1. 基本继承演示 ---");

        // 创建父类对象
        Animal animal = new Animal("动物", 5);
        System.out.println("父类对象: " + animal.getInfo());
        animal.eat();
        animal.sleep();

        System.out.println();

        // 创建子类对象
        Dog dog = new Dog("旺财", 3, "金毛");
        System.out.println("子类对象: " + dog.getInfo());
        dog.eat(); // 继承自父类
        dog.sleep(); // 继承自父类
        dog.bark(); // 子类特有方法
        dog.wagTail(); // 子类特有方法

        System.out.println();

        // 创建另一个子类对象
        Cat cat = new Cat("咪咪", 2, "波斯猫");
        System.out.println("另一个子类对象: " + cat.getInfo());
        cat.eat();
        cat.sleep();
        cat.meow();
        cat.climb();

        // 演示继承关系
        System.out.println("\n继承关系验证:");
        System.out.println("dog instanceof Animal: " + (dog instanceof Animal));
        System.out.println("cat instanceof Animal: " + (cat instanceof Animal));
        System.out.println("dog instanceof Dog: " + (dog instanceof Dog));
        System.out.println("animal instanceof Dog: " + (animal instanceof Dog));
    }

    /**
     * 演示super关键字的使用
     */
    private static void demonstrateSuperKeyword() {
        System.out.println("\n--- 2. super关键字演示 ---");

        // 创建学生对象，观察super的使用
        Student student = new Student("张三", 20, "S001", "计算机科学");
        System.out.println("学生信息: " + student.getFullInfo());

        // 调用重写的方法，观察super的作用
        student.introduce();

        System.out.println();

        // 创建教师对象
        Teacher teacher = new Teacher("李老师", 35, "T001", "Java编程");
        System.out.println("教师信息: " + teacher.getFullInfo());
        teacher.introduce();

        // 演示super在方法中的使用
        System.out.println("\n演示super调用父类方法:");
        student.study();
        teacher.teach();
    }

    /**
     * 演示方法重写
     */
    private static void demonstrateMethodOverriding() {
        System.out.println("\n--- 3. 方法重写演示 ---");

        // 创建不同的形状对象
        Shape[] shapes = {
                new Circle(5.0),
                new Rectangle(4.0, 6.0),
                new Triangle(3.0, 4.0)
        };

        // 演示多态性 - 相同的方法调用，不同的实现
        for (Shape shape : shapes) {
            System.out.println("形状类型: " + shape.getClass().getSimpleName());
            System.out.println("面积: " + shape.calculateArea());
            System.out.println("周长: " + shape.calculatePerimeter());
            shape.draw();
            System.out.println();
        }

        // 演示@Override注解的重要性
        System.out.println("方法重写验证:");
        Circle circle = new Circle(3.0);
        System.out.println("圆形描述: " + circle.getDescription());
        System.out.println("toString重写: " + circle.toString());
    }

    /**
     * 演示继承中的构造方法
     */
    private static void demonstrateInheritanceConstructors() {
        System.out.println("\n--- 4. 继承中的构造方法演示 ---");

        System.out.println("创建Vehicle对象:");
        Vehicle vehicle = new Vehicle("通用载具", 2020);

        System.out.println("\n创建Car对象:");
        Car car = new Car("丰田凯美瑞", 2023, 4);

        System.out.println("\n创建Motorcycle对象:");
        Motorcycle motorcycle = new Motorcycle("哈雷戴维森", 2022, true);

        // 展示对象信息
        System.out.println("\n对象信息:");
        System.out.println(vehicle.getVehicleInfo());
        System.out.println(car.getVehicleInfo());
        System.out.println(motorcycle.getVehicleInfo());
    }

    /**
     * 演示访问修饰符在继承中的作用
     */
    private static void demonstrateAccessInInheritance() {
        System.out.println("\n--- 5. 继承中的访问修饰符演示 ---");

        AccessChild child = new AccessChild();
        child.demonstrateAccess();
    }

    /**
     * 演示final关键字在继承中的使用
     */
    private static void demonstrateFinalInInheritance() {
        System.out.println("\n--- 6. final关键字在继承中的演示 ---");

        FinalDemo demo = new FinalDemo();
        demo.demonstrateFinal();

        // final类无法被继承
        // class CannotExtend extends String {} // 编译错误

        // final方法无法被重写
        ExtendedFinalDemo extended = new ExtendedFinalDemo();
        extended.demonstrateFinal();
        extended.normalMethod(); // 可以重写
        // extended.finalMethod(); // 无法重写final方法
    }

    /**
     * 演示抽象类继承
     */
    private static void demonstrateAbstractInheritance() {
        System.out.println("\n--- 7. 抽象类继承演示 ---");

        // 无法直接实例化抽象类
        // AbstractShape shape = new AbstractShape(); // 编译错误

        // 创建具体子类对象
        ConcreteCircle circle = new ConcreteCircle(4.0);
        ConcreteRectangle rectangle = new ConcreteRectangle(5.0, 3.0);

        AbstractShape[] shapes = { circle, rectangle };

        for (AbstractShape shape : shapes) {
            System.out.println("形状: " + shape.getName());
            System.out.println("面积: " + shape.calculateArea());
            shape.printInfo(); // 抽象类中的具体方法
            shape.draw(); // 子类实现的抽象方法
            System.out.println();
        }
    }

    /**
     * 演示继承的实际应用
     */
    private static void demonstratePracticalInheritance() {
        System.out.println("\n--- 8. 继承的实际应用演示 ---");

        // 创建员工管理系统
        Employee[] employees = {
                new Manager("张经理", "M001", 15000, "技术部"),
                new Developer("李程序员", "D001", 12000, "Java"),
                new Designer("王设计师", "G001", 10000, "UI/UX")
        };

        System.out.println("员工信息:");
        for (Employee emp : employees) {
            System.out.println(emp.getEmployeeInfo());
            emp.work(); // 多态调用
            System.out.println("月薪: " + emp.calculateSalary());
            System.out.println();
        }

        // 演示类型转换
        System.out.println("类型转换演示:");
        for (Employee emp : employees) {
            if (emp instanceof Manager) {
                Manager manager = (Manager) emp;
                manager.holdMeeting();
            } else if (emp instanceof Developer) {
                Developer developer = (Developer) emp;
                developer.writeCode();
            } else if (emp instanceof Designer) {
                Designer designer = (Designer) emp;
                designer.createDesign();
            }
        }
    }
}

// ============= 基本继承示例 =============

/**
 * 动物类 - 父类
 */
class Animal {
    protected String name; // protected允许子类访问
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Animal构造方法: 创建动物 " + name);
    }

    public void eat() {
        System.out.println(name + " 正在吃东西");
    }

    public void sleep() {
        System.out.println(name + " 正在睡觉");
    }

    public String getInfo() {
        return "动物名称: " + name + ", 年龄: " + age;
    }
}

/**
 * 狗类 - 继承自Animal
 */
class Dog extends Animal {
    private String breed; // 品种

    public Dog(String name, int age, String breed) {
        super(name, age); // 调用父类构造方法
        this.breed = breed;
        System.out.println("Dog构造方法: 创建狗 " + name + ", 品种: " + breed);
    }

    // 子类特有方法
    public void bark() {
        System.out.println(name + " 正在汪汪叫");
    }

    public void wagTail() {
        System.out.println(name + " 正在摇尾巴");
    }

    // 重写父类方法
    @Override
    public String getInfo() {
        return super.getInfo() + ", 品种: " + breed;
    }
}

/**
 * 猫类 - 继承自Animal
 */
class Cat extends Animal {
    private String breed;

    public Cat(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
        System.out.println("Cat构造方法: 创建猫 " + name + ", 品种: " + breed);
    }

    public void meow() {
        System.out.println(name + " 正在喵喵叫");
    }

    public void climb() {
        System.out.println(name + " 正在爬树");
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", 品种: " + breed;
    }
}

// ============= super关键字示例 =============

/**
 * 人类 - 基类
 */
class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person构造方法: " + name);
    }

    public void introduce() {
        System.out.println("我是 " + name + ", 今年 " + age + " 岁");
    }

    public String getBasicInfo() {
        return "姓名: " + name + ", 年龄: " + age;
    }
}

/**
 * 学生类 - 继承自Person
 */
class Student extends Person {
    private String studentId;
    private String major;

    public Student(String name, int age, String studentId, String major) {
        super(name, age); // 调用父类构造方法
        this.studentId = studentId;
        this.major = major;
        System.out.println("Student构造方法: 学号 " + studentId);
    }

    @Override
    public void introduce() {
        super.introduce(); // 调用父类方法
        System.out.println("我是一名学生，学号: " + studentId + ", 专业: " + major);
    }

    public void study() {
        System.out.println(name + " 正在学习 " + major);
        // 可以直接访问父类的protected成员
    }

    public String getFullInfo() {
        return super.getBasicInfo() + ", 学号: " + studentId + ", 专业: " + major;
    }
}

/**
 * 教师类 - 继承自Person
 */
class Teacher extends Person {
    private String teacherId;
    private String subject;

    public Teacher(String name, int age, String teacherId, String subject) {
        super(name, age);
        this.teacherId = teacherId;
        this.subject = subject;
        System.out.println("Teacher构造方法: 工号 " + teacherId);
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("我是一名教师，工号: " + teacherId + ", 教授: " + subject);
    }

    public void teach() {
        System.out.println(name + " 正在教授 " + subject);
    }

    public String getFullInfo() {
        return super.getBasicInfo() + ", 工号: " + teacherId + ", 科目: " + subject;
    }
}

// ============= 方法重写示例 =============

/**
 * 形状基类
 */
class Shape {
    protected String color = "无色";

    public double calculateArea() {
        return 0.0;
    }

    public double calculatePerimeter() {
        return 0.0;
    }

    public void draw() {
        System.out.println("绘制一个形状");
    }

    public String getDescription() {
        return "这是一个形状";
    }
}

/**
 * 圆形类
 */
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        this.color = "红色";
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void draw() {
        System.out.println("绘制一个半径为 " + radius + " 的圆形");
    }

    @Override
    public String getDescription() {
        return "这是一个半径为 " + radius + " 的圆形";
    }

    @Override
    public String toString() {
        return String.format("Circle[radius=%.2f, area=%.2f]", radius, calculateArea());
    }
}

/**
 * 矩形类
 */
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        this.color = "蓝色";
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public void draw() {
        System.out.println("绘制一个 " + width + "x" + height + " 的矩形");
    }

    @Override
    public String getDescription() {
        return "这是一个 " + width + "x" + height + " 的矩形";
    }
}

/**
 * 三角形类
 */
class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
        this.color = "绿色";
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public double calculatePerimeter() {
        // 假设是等腰三角形
        double side = Math.sqrt((base / 2) * (base / 2) + height * height);
        return base + 2 * side;
    }

    @Override
    public void draw() {
        System.out.println("绘制一个底边 " + base + ", 高 " + height + " 的三角形");
    }

    @Override
    public String getDescription() {
        return "这是一个底边 " + base + ", 高 " + height + " 的三角形";
    }
}

// ============= 构造方法继承示例 =============

/**
 * 载具基类
 */
class Vehicle {
    protected String name;
    protected int year;

    public Vehicle(String name, int year) {
        this.name = name;
        this.year = year;
        System.out.println("Vehicle构造方法: " + name + " (" + year + ")");
    }

    public String getVehicleInfo() {
        return "载具: " + name + ", 年份: " + year;
    }
}

/**
 * 汽车类
 */
class Car extends Vehicle {
    private int doors;

    public Car(String name, int year, int doors) {
        super(name, year); // 必须首先调用父类构造方法
        this.doors = doors;
        System.out.println("Car构造方法: " + doors + " 门汽车");
    }

    @Override
    public String getVehicleInfo() {
        return super.getVehicleInfo() + ", 门数: " + doors;
    }
}

/**
 * 摩托车类
 */
class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String name, int year, boolean hasSidecar) {
        super(name, year);
        this.hasSidecar = hasSidecar;
        System.out.println("Motorcycle构造方法: " + (hasSidecar ? "带边车" : "不带边车"));
    }

    @Override
    public String getVehicleInfo() {
        return super.getVehicleInfo() + ", 边车: " + (hasSidecar ? "有" : "无");
    }
}

// ============= 访问修饰符在继承中的示例 =============

/**
 * 访问修饰符父类
 */
class AccessParent {
    public String publicField = "public字段";
    protected String protectedField = "protected字段";
    String packageField = "package字段";
    private String privateField = "private字段";

    public void publicMethod() {
        System.out.println("public方法");
    }

    protected void protectedMethod() {
        System.out.println("protected方法");
    }

    void packageMethod() {
        System.out.println("package方法");
    }

    private void privateMethod() {
        System.out.println("private方法");
    }

    public String getPrivateField() {
        return privateField;
    }
}

/**
 * 访问修饰符子类
 */
class AccessChild extends AccessParent {
    public void demonstrateAccess() {
        System.out.println("子类中访问父类成员:");

        // 可以访问public成员
        System.out.println("访问public字段: " + publicField);
        publicMethod();

        // 可以访问protected成员
        System.out.println("访问protected字段: " + protectedField);
        protectedMethod();

        // 可以访问package成员（同一包内）
        System.out.println("访问package字段: " + packageField);
        packageMethod();

        // 无法直接访问private成员
        // System.out.println(privateField); // 编译错误
        // privateMethod(); // 编译错误

        // 通过public方法间接访问private成员
        System.out.println("通过getter访问private字段: " + getPrivateField());
    }
}

// ============= final关键字示例 =============

/**
 * final演示类
 */
class FinalDemo {
    // final字段必须初始化
    private final String CONSTANT = "常量值";
    private final java.util.List<String> finalList = new java.util.ArrayList<>();

    public void demonstrateFinal() {
        System.out.println("final常量: " + CONSTANT);

        // final引用不能改变，但对象内容可以改变
        finalList.add("元素1");
        finalList.add("元素2");
        System.out.println("final集合: " + finalList);

        // finalList = new ArrayList<>(); // 编译错误
    }

    // final方法不能被重写
    public final void finalMethod() {
        System.out.println("这是final方法，不能被重写");
    }

    // 普通方法可以被重写
    public void normalMethod() {
        System.out.println("这是普通方法，可以被重写");
    }
}

/**
 * 继承final演示类
 */
class ExtendedFinalDemo extends FinalDemo {
    // 无法重写final方法
    // public void finalMethod() {} // 编译错误

    // 可以重写普通方法
    @Override
    public void normalMethod() {
        System.out.println("重写的普通方法");
    }
}

// ============= 抽象类继承示例 =============

/**
 * 抽象形状类
 */
abstract class AbstractShape {
    protected String name;

    public AbstractShape(String name) {
        this.name = name;
    }

    // 抽象方法 - 子类必须实现
    public abstract double calculateArea();

    public abstract void draw();

    // 具体方法 - 子类可以直接使用
    public String getName() {
        return name;
    }

    public void printInfo() {
        System.out.println("形状名称: " + name);
    }
}

/**
 * 具体圆形类
 */
class ConcreteCircle extends AbstractShape {
    private double radius;

    public ConcreteCircle(double radius) {
        super("圆形");
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("绘制半径为 " + radius + " 的圆形");
    }
}

/**
 * 具体矩形类
 */
class ConcreteRectangle extends AbstractShape {
    private double width, height;

    public ConcreteRectangle(double width, double height) {
        super("矩形");
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("绘制 " + width + "x" + height + " 的矩形");
    }
}

// ============= 实际应用示例 =============

/**
 * 员工基类
 */
abstract class Employee {
    protected String name;
    protected String employeeId;
    protected double baseSalary;

    public Employee(String name, String employeeId, double baseSalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.baseSalary = baseSalary;
    }

    // 抽象方法 - 不同类型员工有不同的工作方式
    public abstract void work();

    // 抽象方法 - 不同类型员工有不同的薪资计算方式
    public abstract double calculateSalary();

    // 具体方法
    public String getEmployeeInfo() {
        return "员工: " + name + ", 工号: " + employeeId;
    }

    // getter方法
    public String getName() {
        return name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public double getBaseSalary() {
        return baseSalary;
    }
}

/**
 * 经理类
 */
class Manager extends Employee {
    private String department;

    public Manager(String name, String employeeId, double baseSalary, String department) {
        super(name, employeeId, baseSalary);
        this.department = department;
    }

    @Override
    public void work() {
        System.out.println(name + " 正在管理 " + department + " 部门");
    }

    @Override
    public double calculateSalary() {
        return baseSalary * 1.5; // 经理有50%奖金
    }

    public void holdMeeting() {
        System.out.println(name + " 正在主持 " + department + " 部门会议");
    }

    @Override
    public String getEmployeeInfo() {
        return super.getEmployeeInfo() + ", 部门: " + department + " (经理)";
    }
}

/**
 * 开发者类
 */
class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, String employeeId, double baseSalary, String programmingLanguage) {
        super(name, employeeId, baseSalary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work() {
        System.out.println(name + " 正在用 " + programmingLanguage + " 编程");
    }

    @Override
    public double calculateSalary() {
        return baseSalary * 1.2; // 开发者有20%技术津贴
    }

    public void writeCode() {
        System.out.println(name + " 正在编写 " + programmingLanguage + " 代码");
    }

    @Override
    public String getEmployeeInfo() {
        return super.getEmployeeInfo() + ", 技能: " + programmingLanguage + " (开发者)";
    }
}

/**
 * 设计师类
 */
class Designer extends Employee {
    private String designType;

    public Designer(String name, String employeeId, double baseSalary, String designType) {
        super(name, employeeId, baseSalary);
        this.designType = designType;
    }

    @Override
    public void work() {
        System.out.println(name + " 正在进行 " + designType + " 设计");
    }

    @Override
    public double calculateSalary() {
        return baseSalary * 1.1; // 设计师有10%创意津贴
    }

    public void createDesign() {
        System.out.println(name + " 正在创作 " + designType + " 设计作品");
    }

    @Override
    public String getEmployeeInfo() {
        return super.getEmployeeInfo() + ", 专长: " + designType + " (设计师)";
    }
}