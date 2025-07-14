package com.example.javademos.oop;

/**
 * 多态综合示例
 * 
 * 本示例演示Java中多态的核心概念和应用：
 * 1. 多态的基本概念和实现
 * 2. 方法重写和动态绑定
 * 3. 向上转型和向下转型
 * 4. instanceof操作符的使用
 * 5. 抽象类和接口中的多态
 * 6. 多态在实际开发中的应用
 * 7. 多态的优势和注意事项
 * 8. 运行时类型识别(RTTI)
 * 
 * 多态是面向对象编程的三大特性之一，它允许不同类的对象
 * 对同一消息做出不同的响应，提高了代码的灵活性和可扩展性。
 */
public class PolymorphismDemo {
    
    public static void main(String[] args) {
        System.out.println("=== Java多态综合示例 ===");
        System.out.println();
        
        // 1. 演示基本多态
        demonstrateBasicPolymorphism();
        
        // 2. 演示方法重写和动态绑定
        demonstrateMethodOverriding();
        
        // 3. 演示类型转换
        demonstrateTypeCasting();
        
        // 4. 演示instanceof操作符
        demonstrateInstanceof();
        
        // 5. 演示抽象类多态
        demonstrateAbstractPolymorphism();
        
        // 6. 演示接口多态
        demonstrateInterfacePolymorphism();
        
        // 7. 演示多态数组
        demonstratePolymorphicArray();
        
        // 8. 演示多态的实际应用
        demonstratePracticalApplication();
        
        System.out.println();
        System.out.println("=== 多态示例演示完成 ===");
    }
    
    /**
     * 演示基本多态概念
     */
    private static void demonstrateBasicPolymorphism() {
        System.out.println("--- 1. 基本多态演示 ---");
        
        // 父类引用指向子类对象
        PolyAnimal animal1 = new PolyDog("旺财");
        PolyAnimal animal2 = new PolyCat("咪咪");
        PolyAnimal animal3 = new PolyBird("小鸟");
        
        // 同样的方法调用，不同的行为
        System.out.println("多态调用makeSound()方法:");
        animal1.makeSound(); // 调用Dog的makeSound()
        animal2.makeSound(); // 调用Cat的makeSound()
        animal3.makeSound(); // 调用Bird的makeSound()
        
        System.out.println("\n多态调用move()方法:");
        animal1.move(); // 调用Dog的move()
        animal2.move(); // 调用Cat的move()
        animal3.move(); // 调用Bird的move()
        
        System.out.println("\n多态的核心：同一接口，不同实现");
    }
    
    /**
     * 演示方法重写和动态绑定
     */
    private static void demonstrateMethodOverriding() {
        System.out.println("\n--- 2. 方法重写和动态绑定演示 ---");
        
        PolyAnimal[] animals = {
            new PolyDog("大黄"),
            new PolyCat("小白"),
            new PolyBird("鹦鹉")
        };
        
        System.out.println("动态绑定演示（运行时确定调用哪个方法）:");
        for (PolyAnimal animal : animals) {
            System.out.println("动物类型: " + animal.getClass().getSimpleName());
            animal.eat(); // 动态绑定到具体子类的eat()方法
            animal.sleep(); // 动态绑定到具体子类的sleep()方法
            System.out.println();
        }
    }
    
    /**
     * 演示类型转换（向上转型和向下转型）
     */
    private static void demonstrateTypeCasting() {
        System.out.println("--- 3. 类型转换演示 ---");
        
        // 向上转型（自动进行）
        System.out.println("向上转型（Upcasting）:");
        PolyDog dog = new PolyDog("小狗");
        PolyAnimal animal = dog; // 向上转型，自动进行
        animal.makeSound();
        
        // 向下转型（需要显式转换）
        System.out.println("\n向下转型（Downcasting）:");
        if (animal instanceof PolyDog) {
            PolyDog downcastDog = (PolyDog) animal; // 向下转型，需要显式转换
            downcastDog.wagTail(); // 调用Dog特有的方法
        }
        
        // 错误的向下转型示例
        System.out.println("\n安全的向下转型检查:");
        PolyAnimal cat = new PolyCat("小猫");
        if (cat instanceof PolyDog) {
            PolyDog wrongCast = (PolyDog) cat; // 这行不会执行
            wrongCast.wagTail();
        } else {
            System.out.println("Cat对象不能转换为Dog类型");
        }
    }
    
    /**
     * 演示instanceof操作符
     */
    private static void demonstrateInstanceof() {
        System.out.println("\n--- 4. instanceof操作符演示 ---");
        
        PolyAnimal[] animals = {
            new PolyDog("牧羊犬"),
            new PolyCat("波斯猫"),
            new PolyBird("金丝雀"),
            new PolyAnimal("通用动物")
        };
        
        for (PolyAnimal animal : animals) {
            System.out.println("\n检查对象: " + animal.getName());
            
            // 检查具体类型
            if (animal instanceof PolyDog) {
                System.out.println("  是Dog类型");
                ((PolyDog) animal).wagTail();
            }
            
            if (animal instanceof PolyCat) {
                System.out.println("  是Cat类型");
                ((PolyCat) animal).purr();
            }
            
            if (animal instanceof PolyBird) {
                System.out.println("  是Bird类型");
                ((PolyBird) animal).fly();
            }
            
            // 检查父类型
            if (animal instanceof PolyAnimal) {
                System.out.println("  是Animal类型（所有动物都是）");
            }
        }
    }
    
    /**
     * 演示抽象类多态
     */
    private static void demonstrateAbstractPolymorphism() {
        System.out.println("\n--- 5. 抽象类多态演示 ---");
        
        PolyShape[] shapes = {
            new PolyCircle(5.0),
            new PolyRectangle(4.0, 6.0),
            new PolyTriangle(3.0, 4.0)
        };
        
        System.out.println("计算不同形状的面积和周长:");
        for (PolyShape shape : shapes) {
            System.out.println("\n形状: " + shape.getClass().getSimpleName());
            System.out.println("面积: " + String.format("%.2f", shape.calculateArea()));
            System.out.println("周长: " + String.format("%.2f", shape.calculatePerimeter()));
            shape.draw(); // 调用抽象方法的具体实现
        }
    }
    
    /**
     * 演示接口多态
     */
    private static void demonstrateInterfacePolymorphism() {
        System.out.println("\n--- 6. 接口多态演示 ---");
        
        // 不同类实现同一接口
        PolyDrawable[] drawables = {
            new PolyCircle(3.0),
            new PolyRectangle(2.0, 4.0),
            new PolyLine(0, 0, 5, 5)
        };
        
        System.out.println("绘制不同的图形对象:");
        for (PolyDrawable drawable : drawables) {
            drawable.draw();
        }
        
        // 多接口实现
        System.out.println("\n多接口实现演示:");
        PolyFlyable[] flyables = {
            new PolyBird("老鹰"),
            new PolyAirplane("波音747")
        };
        
        for (PolyFlyable flyable : flyables) {
            flyable.fly();
            if (flyable instanceof PolyAnimal) {
                System.out.println("  这是一个动物");
            } else {
                System.out.println("  这是一个机器");
            }
        }
    }
    
    /**
     * 演示多态数组
     */
    private static void demonstratePolymorphicArray() {
        System.out.println("\n--- 7. 多态数组演示 ---");
        
        // 创建多态数组
        PolyVehicle[] vehicles = {
            new PolyCar("奔驰", 4),
            new PolyMotorcycle("哈雷", 2),
            new PolyTruck("解放", 6, 10.0)
        };
        
        System.out.println("车辆信息和操作:");
        for (PolyVehicle vehicle : vehicles) {
            System.out.println("\n" + vehicle.getInfo());
            vehicle.start();
            vehicle.accelerate();
            vehicle.stop();
            
            // 根据具体类型执行特定操作
            if (vehicle instanceof PolyTruck) {
                PolyTruck truck = (PolyTruck) vehicle;
                truck.loadCargo();
            }
        }
    }
    
    /**
     * 演示多态的实际应用
     */
    private static void demonstratePracticalApplication() {
        System.out.println("\n--- 8. 多态实际应用演示 ---");
        
        // 创建动物管理器
        PolyAnimalManager manager = new PolyAnimalManager();
        
        // 添加不同类型的动物
        manager.addAnimal(new PolyDog("拉布拉多"));
        manager.addAnimal(new PolyCat("英短"));
        manager.addAnimal(new PolyBird("百灵鸟"));
        
        // 统一管理所有动物
        System.out.println("动物园管理系统演示:");
        manager.feedAllAnimals();
        manager.makeAllAnimalsRest();
        manager.showAllAnimalsInfo();
        
        System.out.println("\n多态的优势:");
        System.out.println("1. 代码复用：同一套代码可以处理不同类型的对象");
        System.out.println("2. 扩展性：添加新的子类不需要修改现有代码");
        System.out.println("3. 维护性：降低了代码的耦合度");
        System.out.println("4. 灵活性：运行时确定具体的方法调用");
    }
}

// ============= 基础动物类层次结构 =============

/**
 * 动物基类
 */
class PolyAnimal {
    protected String name;
    
    public PolyAnimal(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    // 虚方法，子类可以重写
    public void makeSound() {
        System.out.println(name + " 发出声音");
    }
    
    public void move() {
        System.out.println(name + " 在移动");
    }
    
    public void eat() {
        System.out.println(name + " 在吃东西");
    }
    
    public void sleep() {
        System.out.println(name + " 在睡觉");
    }
}

/**
 * 狗类
 */
class PolyDog extends PolyAnimal {
    
    public PolyDog(String name) {
        super(name);
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " 汪汪叫");
    }
    
    @Override
    public void move() {
        System.out.println(name + " 跑来跑去");
    }
    
    @Override
    public void eat() {
        System.out.println(name + " 吃狗粮");
    }
    
    @Override
    public void sleep() {
        System.out.println(name + " 在狗窝里睡觉");
    }
    
    // Dog特有的方法
    public void wagTail() {
        System.out.println(name + " 摇尾巴表示友好");
    }
}

/**
 * 猫类
 */
class PolyCat extends PolyAnimal {
    
    public PolyCat(String name) {
        super(name);
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " 喵喵叫");
    }
    
    @Override
    public void move() {
        System.out.println(name + " 优雅地走动");
    }
    
    @Override
    public void eat() {
        System.out.println(name + " 吃猫粮");
    }
    
    @Override
    public void sleep() {
        System.out.println(name + " 蜷缩着睡觉");
    }
    
    // Cat特有的方法
    public void purr() {
        System.out.println(name + " 发出呼噜声");
    }
}

/**
 * 鸟类
 */
class PolyBird extends PolyAnimal implements PolyFlyable {
    
    public PolyBird(String name) {
        super(name);
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " 叽叽喳喳");
    }
    
    @Override
    public void move() {
        System.out.println(name + " 在天空中飞翔");
    }
    
    @Override
    public void eat() {
        System.out.println(name + " 吃虫子和种子");
    }
    
    @Override
    public void sleep() {
        System.out.println(name + " 在树枝上睡觉");
    }
    
    @Override
    public void fly() {
        System.out.println(name + " 展翅高飞");
    }
}

// ============= 抽象类和接口 =============

/**
 * 抽象形状类
 */
abstract class PolyShape implements PolyDrawable {
    protected String color = "默认颜色";
    
    // 抽象方法，子类必须实现
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    
    // 具体方法
    public void setColor(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }
}

/**
 * 圆形类
 */
class PolyCircle extends PolyShape {
    private double radius;
    
    public PolyCircle(double radius) {
        this.radius = radius;
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
        System.out.println("绘制半径为 " + radius + " 的圆形");
    }
}

/**
 * 矩形类
 */
class PolyRectangle extends PolyShape {
    private double width;
    private double height;
    
    public PolyRectangle(double width, double height) {
        this.width = width;
        this.height = height;
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
        System.out.println("绘制 " + width + "x" + height + " 的矩形");
    }
}

/**
 * 三角形类
 */
class PolyTriangle extends PolyShape {
    private double base;
    private double height;
    
    public PolyTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
    
    @Override
    public double calculatePerimeter() {
        // 假设是等腰三角形
        double side = Math.sqrt((base/2) * (base/2) + height * height);
        return base + 2 * side;
    }
    
    @Override
    public void draw() {
        System.out.println("绘制底边 " + base + "，高 " + height + " 的三角形");
    }
}

// ============= 接口定义 =============

/**
 * 可绘制接口
 */
interface PolyDrawable {
    void draw();
}

/**
 * 可飞行接口
 */
interface PolyFlyable {
    void fly();
}

// ============= 其他类 =============

/**
 * 直线类（仅实现Drawable接口）
 */
class PolyLine implements PolyDrawable {
    private int x1, y1, x2, y2;
    
    public PolyLine(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
    @Override
    public void draw() {
        System.out.println("绘制从(" + x1 + "," + y1 + ")到(" + x2 + "," + y2 + ")的直线");
    }
}

/**
 * 飞机类（实现Flyable接口）
 */
class PolyAirplane implements PolyFlyable {
    private String model;
    
    public PolyAirplane(String model) {
        this.model = model;
    }
    
    @Override
    public void fly() {
        System.out.println(model + " 飞机在天空中飞行");
    }
}

// ============= 车辆类层次结构 =============

/**
 * 车辆基类
 */
abstract class PolyVehicle {
    protected String brand;
    protected int wheels;
    
    public PolyVehicle(String brand, int wheels) {
        this.brand = brand;
        this.wheels = wheels;
    }
    
    public abstract void start();
    public abstract void stop();
    public abstract void accelerate();
    
    public String getInfo() {
        return brand + " (" + wheels + "个轮子)";
    }
}

/**
 * 汽车类
 */
class PolyCar extends PolyVehicle {
    
    public PolyCar(String brand, int wheels) {
        super(brand, wheels);
    }
    
    @Override
    public void start() {
        System.out.println(brand + " 汽车启动引擎");
    }
    
    @Override
    public void stop() {
        System.out.println(brand + " 汽车停车");
    }
    
    @Override
    public void accelerate() {
        System.out.println(brand + " 汽车加速行驶");
    }
}

/**
 * 摩托车类
 */
class PolyMotorcycle extends PolyVehicle {
    
    public PolyMotorcycle(String brand, int wheels) {
        super(brand, wheels);
    }
    
    @Override
    public void start() {
        System.out.println(brand + " 摩托车点火启动");
    }
    
    @Override
    public void stop() {
        System.out.println(brand + " 摩托车停车");
    }
    
    @Override
    public void accelerate() {
        System.out.println(brand + " 摩托车快速加速");
    }
}

/**
 * 卡车类
 */
class PolyTruck extends PolyVehicle {
    private double cargoCapacity;
    
    public PolyTruck(String brand, int wheels, double cargoCapacity) {
        super(brand, wheels);
        this.cargoCapacity = cargoCapacity;
    }
    
    @Override
    public void start() {
        System.out.println(brand + " 卡车启动柴油引擎");
    }
    
    @Override
    public void stop() {
        System.out.println(brand + " 卡车停车");
    }
    
    @Override
    public void accelerate() {
        System.out.println(brand + " 卡车缓慢加速");
    }
    
    public void loadCargo() {
        System.out.println(brand + " 卡车装载货物（载重: " + cargoCapacity + "吨）");
    }
    
    @Override
    public String getInfo() {
        return super.getInfo() + " 载重: " + cargoCapacity + "吨";
    }
}

// ============= 实际应用示例 =============

/**
 * 动物管理器 - 演示多态的实际应用
 */
class PolyAnimalManager {
    private PolyAnimal[] animals;
    private int count;
    private static final int MAX_ANIMALS = 10;
    
    public PolyAnimalManager() {
        animals = new PolyAnimal[MAX_ANIMALS];
        count = 0;
    }
    
    public void addAnimal(PolyAnimal animal) {
        if (count < MAX_ANIMALS) {
            animals[count++] = animal;
            System.out.println("添加动物: " + animal.getName());
        }
    }
    
    // 多态应用：统一处理不同类型的动物
    public void feedAllAnimals() {
        System.out.println("\n喂食所有动物:");
        for (int i = 0; i < count; i++) {
            animals[i].eat(); // 多态调用
        }
    }
    
    public void makeAllAnimalsRest() {
        System.out.println("\n让所有动物休息:");
        for (int i = 0; i < count; i++) {
            animals[i].sleep(); // 多态调用
        }
    }
    
    public void showAllAnimalsInfo() {
        System.out.println("\n动物信息:");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + animals[i].getName() + 
                             " (" + animals[i].getClass().getSimpleName() + ")");
        }
    }
}