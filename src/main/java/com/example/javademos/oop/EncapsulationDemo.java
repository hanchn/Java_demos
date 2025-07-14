package com.example.javademos.oop;

/**
 * 封装示例
 * 演示Java面向对象编程的封装特性：访问修饰符、getter/setter方法、数据隐藏
 * 
 * 主要内容：
 * 1. 访问修饰符的使用和区别
 * 2. getter和setter方法的设计
 * 3. 数据隐藏和验证
 * 4. 封装的好处和最佳实践
 * 5. 不可变类的设计
 * 6. 属性的只读和只写访问
 * 7. 封装在实际开发中的应用
 * 
 * @author Java学习示例
 */
public class EncapsulationDemo {

    public static void main(String[] args) {
        System.out.println("=== Java封装示例 ===");

        // 1. 演示访问修饰符
        demonstrateAccessModifiers();

        // 2. 演示getter和setter方法
        demonstrateGetterSetter();

        // 3. 演示数据隐藏和验证
        demonstrateDataHiding();

        // 4. 演示不可变类
        demonstrateImmutableClass();

        // 5. 演示属性访问控制
        demonstratePropertyAccess();

        // 6. 演示封装的实际应用
        demonstratePracticalEncapsulation();
    }

    /**
     * 演示访问修饰符的使用
     */
    private static void demonstrateAccessModifiers() {
        System.out.println("\n--- 1. 访问修饰符演示 ---");

        AccessModifierExample example = new AccessModifierExample();

        // 访问public成员
        example.publicField = "可以直接访问";
        System.out.println("public字段: " + example.publicField);
        example.publicMethod();

        // 访问包私有成员（同一包内可访问）
        example.packageField = "包内可访问";
        System.out.println("package字段: " + example.packageField);
        example.packageMethod();

        // protected成员在同一包内也可访问
        example.protectedField = "受保护的字段";
        System.out.println("protected字段: " + example.protectedField);
        example.protectedMethod();

        // private成员无法直接访问
        // example.privateField = "无法访问"; // 编译错误
        // example.privateMethod(); // 编译错误

        // 通过public方法间接访问private成员
        example.setPrivateField("通过setter设置私有字段");
        System.out.println("private字段(通过getter): " + example.getPrivateField());
    }

    /**
     * 演示getter和setter方法
     */
    private static void demonstrateGetterSetter() {
        System.out.println("\n--- 2. Getter和Setter方法演示 ---");

        // 创建Person对象
        Person person = new Person();

        // 使用setter设置属性
        person.setName("张三");
        person.setAge(25);
        person.setEmail("zhangsan@example.com");
        person.setSalary(8000.0);

        // 使用getter获取属性
        System.out.println("姓名: " + person.getName());
        System.out.println("年龄: " + person.getAge());
        System.out.println("邮箱: " + person.getEmail());
        System.out.println("薪资: " + person.getSalary());

        // 测试数据验证
        System.out.println("\n测试数据验证:");
        person.setAge(-5); // 无效年龄
        person.setAge(200); // 无效年龄
        person.setEmail("invalid-email"); // 无效邮箱
        person.setSalary(-1000); // 无效薪资

        System.out.println("验证后的信息: " + person.getPersonInfo());
    }

    /**
     * 演示数据隐藏和验证
     */
    private static void demonstrateDataHiding() {
        System.out.println("\n--- 3. 数据隐藏和验证演示 ---");

        // 创建银行账户
        BankAccount account = new BankAccount("123456789", "李四", 1000.0);
        System.out.println("初始账户信息: " + account.getAccountInfo());

        // 正常操作
        account.deposit(500.0);
        System.out.println("存款后: " + account.getAccountInfo());

        account.withdraw(200.0);
        System.out.println("取款后: " + account.getAccountInfo());

        // 异常操作测试
        System.out.println("\n异常操作测试:");
        account.withdraw(2000.0); // 余额不足
        account.deposit(-100.0); // 负数存款
        account.withdraw(-50.0); // 负数取款

        System.out.println("最终账户信息: " + account.getAccountInfo());

        // 尝试直接访问私有字段（编译错误）
        // System.out.println(account.balance); // 编译错误
        // account.balance = 999999; // 编译错误
    }

    /**
     * 演示不可变类
     */
    private static void demonstrateImmutableClass() {
        System.out.println("\n--- 4. 不可变类演示 ---");

        // 创建不可变的Point对象
        ImmutablePoint point1 = new ImmutablePoint(3, 4);
        System.out.println("点1: " + point1.toString());
        System.out.println("点1到原点距离: " + point1.distanceFromOrigin());

        // 不可变对象的属性无法修改
        // point1.x = 5; // 编译错误：final字段无法修改

        // 创建新的点对象
        ImmutablePoint point2 = new ImmutablePoint(0, 0);
        System.out.println("点2: " + point2.toString());
        System.out.println("两点间距离: " + point1.distanceTo(point2));

        // 演示不可变集合
        String[] colors = { "红色", "绿色", "蓝色" };
        ImmutablePalette palette = new ImmutablePalette("基础调色板", colors);
        System.out.println("\n调色板信息: " + palette.toString());

        // 修改原数组不会影响不可变对象
        colors[0] = "黄色";
        System.out.println("修改原数组后的调色板: " + palette.toString());
    }

    /**
     * 演示属性访问控制
     */
    private static void demonstratePropertyAccess() {
        System.out.println("\n--- 5. 属性访问控制演示 ---");

        // 创建配置对象
        Configuration config = new Configuration();

        // 只读属性
        System.out.println("应用名称(只读): " + config.getApplicationName());
        System.out.println("版本号(只读): " + config.getVersion());

        // 读写属性
        config.setDebugMode(true);
        System.out.println("调试模式: " + config.isDebugMode());

        config.setMaxConnections(100);
        System.out.println("最大连接数: " + config.getMaxConnections());

        // 只写属性（密码）
        config.setPassword("secret123");
        // System.out.println(config.getPassword()); // 没有getter方法

        // 计算属性
        System.out.println("配置摘要: " + config.getConfigSummary());

        // 延迟初始化属性
        System.out.println("数据库连接: " + config.getDatabaseConnection());
        System.out.println("再次获取数据库连接: " + config.getDatabaseConnection());
    }

    /**
     * 演示封装的实际应用
     */
    private static void demonstratePracticalEncapsulation() {
        System.out.println("\n--- 6. 封装的实际应用演示 ---");

        // 创建温度传感器
        TemperatureSensor sensor = new TemperatureSensor("客厅温度传感器");

        // 模拟温度读取
        sensor.updateTemperature(25.5);
        System.out.println("传感器状态: " + sensor.getStatus());

        sensor.updateTemperature(35.0);
        System.out.println("传感器状态: " + sensor.getStatus());

        sensor.updateTemperature(-10.0);
        System.out.println("传感器状态: " + sensor.getStatus());

        // 获取历史数据
        System.out.println("\n温度历史:");
        for (String record : sensor.getTemperatureHistory()) {
            System.out.println("  " + record);
        }

        // 重置传感器
        sensor.reset();
        System.out.println("\n重置后状态: " + sensor.getStatus());
    }
}

/**
 * 访问修饰符示例类
 */
class AccessModifierExample {
    // 不同访问级别的字段
    public String publicField; // 公共字段
    protected String protectedField; // 受保护字段
    String packageField; // 包私有字段
    private String privateField; // 私有字段

    // 公共方法
    public void publicMethod() {
        System.out.println("这是public方法");
    }

    // 受保护方法
    protected void protectedMethod() {
        System.out.println("这是protected方法");
    }

    // 包私有方法
    void packageMethod() {
        System.out.println("这是package方法");
    }

    // 私有方法
    private void privateMethod() {
        System.out.println("这是private方法");
    }

    // 通过public方法访问private成员
    public void setPrivateField(String value) {
        this.privateField = value;
        privateMethod(); // 内部可以调用私有方法
    }

    public String getPrivateField() {
        return privateField;
    }
}

/**
 * Person类 - 演示标准的getter/setter模式
 */
class Person {
    // 私有字段
    private String name;
    private int age;
    private String email;
    private double salary;

    // 构造方法
    public Person() {
        this.name = "";
        this.age = 0;
        this.email = "";
        this.salary = 0.0;
    }

    public Person(String name, int age, String email, double salary) {
        setName(name);
        setAge(age);
        setEmail(email);
        setSalary(salary);
    }

    // Getter方法
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public double getSalary() {
        return salary;
    }

    // Setter方法（包含数据验证）
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name.trim();
        } else {
            System.out.println("警告: 姓名不能为空");
        }
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 150) {
            this.age = age;
        } else {
            System.out.println("警告: 年龄必须在0-150之间，当前值: " + age);
        }
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@") && email.contains(".")) {
            this.email = email;
        } else {
            System.out.println("警告: 邮箱格式不正确: " + email);
        }
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("警告: 薪资不能为负数: " + salary);
        }
    }

    // 业务方法
    public String getPersonInfo() {
        return String.format("姓名: %s, 年龄: %d, 邮箱: %s, 薪资: %.2f",
                name, age, email, salary);
    }

    public boolean isAdult() {
        return age >= 18;
    }

    public double getAnnualSalary() {
        return salary * 12;
    }
}

/**
 * 银行账户类 - 演示数据隐藏和业务逻辑封装
 */
class BankAccount {
    // 私有字段，外部无法直接访问
    private final String accountNumber; // 账号（不可变）
    private final String accountHolder; // 账户持有人（不可变）
    private double balance; // 余额
    private int transactionCount; // 交易次数

    // 构造方法
    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = Math.max(0, initialBalance); // 确保初始余额非负
        this.transactionCount = 0;
    }

    // 只读属性的getter方法
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public int getTransactionCount() {
        return transactionCount;
    }

    // 业务方法（封装了业务逻辑和数据验证）
    public boolean deposit(double amount) {
        if (amount <= 0) {
            System.out.println("存款金额必须大于0");
            return false;
        }

        balance += amount;
        transactionCount++;
        System.out.println(String.format("成功存款 %.2f 元，当前余额: %.2f 元", amount, balance));
        return true;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("取款金额必须大于0");
            return false;
        }

        if (amount > balance) {
            System.out.println(String.format("余额不足，当前余额: %.2f 元，尝试取款: %.2f 元", balance, amount));
            return false;
        }

        balance -= amount;
        transactionCount++;
        System.out.println(String.format("成功取款 %.2f 元，当前余额: %.2f 元", amount, balance));
        return true;
    }

    public boolean transfer(BankAccount targetAccount, double amount) {
        if (this.withdraw(amount)) {
            if (targetAccount.deposit(amount)) {
                System.out.println(String.format("成功转账 %.2f 元到账户 %s",
                        amount, targetAccount.getAccountNumber()));
                return true;
            } else {
                // 如果目标账户存款失败，回滚本账户的取款
                this.deposit(amount);
                return false;
            }
        }
        return false;
    }

    // 计算属性
    public String getAccountInfo() {
        return String.format("账户: %s, 持有人: %s, 余额: %.2f 元, 交易次数: %d",
                accountNumber, accountHolder, balance, transactionCount);
    }

    // 私有辅助方法
    private void logTransaction(String type, double amount) {
        System.out.println(String.format("[%s] %s: %.2f 元",
                java.time.LocalDateTime.now(), type, amount));
    }
}

/**
 * 不可变点类 - 演示不可变对象的设计
 */
final class ImmutablePoint {
    // final字段，创建后不可修改
    private final double x;
    private final double y;

    // 构造方法
    public ImmutablePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // 只提供getter方法，不提供setter方法
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // 计算方法（不修改对象状态）
    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    public double distanceTo(ImmutablePoint other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // 返回新对象的方法（而不是修改当前对象）
    public ImmutablePoint translate(double dx, double dy) {
        return new ImmutablePoint(x + dx, y + dy);
    }

    public ImmutablePoint scale(double factor) {
        return new ImmutablePoint(x * factor, y * factor);
    }

    @Override
    public String toString() {
        return String.format("Point(%.2f, %.2f)", x, y);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        ImmutablePoint point = (ImmutablePoint) obj;
        return Double.compare(point.x, x) == 0 && Double.compare(point.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(x, y);
    }
}

/**
 * 不可变调色板类 - 演示包含数组的不可变类
 */
final class ImmutablePalette {
    private final String name;
    private final String[] colors;

    public ImmutablePalette(String name, String[] colors) {
        this.name = name;
        // 防御性复制：创建数组的副本
        this.colors = colors.clone();
    }

    public String getName() {
        return name;
    }

    // 返回数组的副本，防止外部修改
    public String[] getColors() {
        return colors.clone();
    }

    public int getColorCount() {
        return colors.length;
    }

    public String getColor(int index) {
        if (index >= 0 && index < colors.length) {
            return colors[index];
        }
        throw new IndexOutOfBoundsException("颜色索引超出范围: " + index);
    }

    @Override
    public String toString() {
        return String.format("%s: [%s]", name, String.join(", ", colors));
    }
}

/**
 * 配置类 - 演示不同类型的属性访问控制
 */
class Configuration {
    // 只读属性（只有getter）
    private static final String APPLICATION_NAME = "Java学习系统";
    private static final String VERSION = "1.0.0";

    // 读写属性
    private boolean debugMode = false;
    private int maxConnections = 50;

    // 只写属性（只有setter）
    private String password;

    // 延迟初始化属性
    private String databaseConnection;

    // 只读属性的getter
    public String getApplicationName() {
        return APPLICATION_NAME;
    }

    public String getVersion() {
        return VERSION;
    }

    // 读写属性的getter和setter
    public boolean isDebugMode() {
        return debugMode;
    }

    public void setDebugMode(boolean debugMode) {
        this.debugMode = debugMode;
        System.out.println("调试模式已" + (debugMode ? "开启" : "关闭"));
    }

    public int getMaxConnections() {
        return maxConnections;
    }

    public void setMaxConnections(int maxConnections) {
        if (maxConnections > 0 && maxConnections <= 1000) {
            this.maxConnections = maxConnections;
        } else {
            System.out.println("最大连接数必须在1-1000之间");
        }
    }

    // 只写属性（只有setter）
    public void setPassword(String password) {
        if (password != null && password.length() >= 6) {
            this.password = password;
            System.out.println("密码已设置");
        } else {
            System.out.println("密码长度至少6位");
        }
    }

    // 计算属性（基于其他属性计算得出）
    public String getConfigSummary() {
        return String.format("%s v%s - 调试:%s, 最大连接:%d",
                APPLICATION_NAME, VERSION,
                debugMode ? "开启" : "关闭", maxConnections);
    }

    // 延迟初始化属性
    public String getDatabaseConnection() {
        if (databaseConnection == null) {
            System.out.println("正在初始化数据库连接...");
            databaseConnection = "jdbc:mysql://localhost:3306/demo";
        }
        return databaseConnection;
    }
}

/**
 * 温度传感器类 - 演示封装在实际应用中的使用
 */
class TemperatureSensor {
    private final String sensorId;
    private double currentTemperature;
    private double minTemperature = Double.MAX_VALUE;
    private double maxTemperature = Double.MIN_VALUE;
    private java.util.List<String> temperatureHistory;
    private boolean isActive;

    // 温度阈值常量
    private static final double HIGH_TEMP_THRESHOLD = 30.0;
    private static final double LOW_TEMP_THRESHOLD = 0.0;

    public TemperatureSensor(String sensorId) {
        this.sensorId = sensorId;
        this.temperatureHistory = new java.util.ArrayList<>();
        this.isActive = true;
        System.out.println("温度传感器 " + sensorId + " 已初始化");
    }

    // 只读属性
    public String getSensorId() {
        return sensorId;
    }

    public double getCurrentTemperature() {
        return currentTemperature;
    }

    public double getMinTemperature() {
        return minTemperature == Double.MAX_VALUE ? 0 : minTemperature;
    }

    public double getMaxTemperature() {
        return maxTemperature == Double.MIN_VALUE ? 0 : maxTemperature;
    }

    public boolean isActive() {
        return isActive;
    }

    // 业务方法
    public void updateTemperature(double temperature) {
        if (!isActive) {
            System.out.println("传感器未激活，无法更新温度");
            return;
        }

        this.currentTemperature = temperature;
        updateMinMax(temperature);
        recordTemperature(temperature);
        checkTemperatureAlert(temperature);
    }

    public java.util.List<String> getTemperatureHistory() {
        // 返回历史记录的副本，防止外部修改
        return new java.util.ArrayList<>(temperatureHistory);
    }

    public void reset() {
        currentTemperature = 0;
        minTemperature = Double.MAX_VALUE;
        maxTemperature = Double.MIN_VALUE;
        temperatureHistory.clear();
        System.out.println("传感器 " + sensorId + " 已重置");
    }

    public String getStatus() {
        return String.format("传感器[%s] - 当前:%.1f°C, 最低:%.1f°C, 最高:%.1f°C, 状态:%s",
                sensorId, currentTemperature, getMinTemperature(),
                getMaxTemperature(), isActive ? "活跃" : "非活跃");
    }

    // 私有辅助方法
    private void updateMinMax(double temperature) {
        if (temperature < minTemperature) {
            minTemperature = temperature;
        }
        if (temperature > maxTemperature) {
            maxTemperature = temperature;
        }
    }

    private void recordTemperature(double temperature) {
        String timestamp = java.time.LocalDateTime.now().toString();
        temperatureHistory.add(String.format("%s: %.1f°C", timestamp, temperature));

        // 限制历史记录数量
        if (temperatureHistory.size() > 10) {
            temperatureHistory.remove(0);
        }
    }

    private void checkTemperatureAlert(double temperature) {
        if (temperature > HIGH_TEMP_THRESHOLD) {
            System.out.println("⚠️ 高温警告: " + temperature + "°C");
        } else if (temperature < LOW_TEMP_THRESHOLD) {
            System.out.println("❄️ 低温警告: " + temperature + "°C");
        }
    }
}