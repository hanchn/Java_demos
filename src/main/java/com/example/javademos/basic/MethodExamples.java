package com.example.javademos.basic;

/**
 * Java方法示例
 * 演示方法的定义、调用、参数传递、重载、递归等特性
 * 
 * @author Java学习示例
 * @version 1.0
 */
public class MethodExamples {
    
    // 类变量，用于演示
    private static int classCounter = 0;
    private int instanceCounter = 0;
    
    public static void main(String[] args) {
        System.out.println("=== Java方法示例 ===");
        
        // 1. 基本方法调用
        demonstrateBasicMethods();
        
        // 2. 参数传递
        demonstrateParameterPassing();
        
        // 3. 方法重载
        demonstrateMethodOverloading();
        
        // 4. 可变参数
        demonstrateVarArgs();
        
        // 5. 递归方法
        demonstrateRecursion();
        
        // 6. 静态方法vs实例方法
        demonstrateStaticVsInstance();
        
        // 7. 方法的作用域和访问修饰符
        demonstrateMethodScope();
        
        // 8. 实用方法示例
        demonstrateUtilityMethods();
    }
    
    /**
     * 演示基本方法调用
     */
    private static void demonstrateBasicMethods() {
        System.out.println("\n--- 基本方法调用 ---");
        
        // 1. 无参数无返回值方法
        printWelcomeMessage();
        
        // 2. 有参数无返回值方法
        printPersonInfo("张三", 25);
        
        // 3. 无参数有返回值方法
        String currentTime = getCurrentTime();
        System.out.println("当前时间: " + currentTime);
        
        // 4. 有参数有返回值方法
        int sum = addTwoNumbers(15, 25);
        System.out.println("15 + 25 = " + sum);
        
        // 5. 返回布尔值的方法
        boolean isEven = isEvenNumber(42);
        System.out.println("42是偶数: " + isEven);
        
        // 6. 返回数组的方法
        int[] fibonacci = generateFibonacci(8);
        System.out.print("斐波那契数列: ");
        for (int num : fibonacci) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    /**
     * 演示参数传递
     */
    private static void demonstrateParameterPassing() {
        System.out.println("\n--- 参数传递 ---");
        
        // 1. 基本数据类型参数传递（值传递）
        System.out.println("1. 基本数据类型参数传递:");
        int originalValue = 10;
        System.out.println("调用前: " + originalValue);
        modifyPrimitive(originalValue);
        System.out.println("调用后: " + originalValue); // 值不变
        
        // 2. 引用类型参数传递
        System.out.println("\n2. 引用类型参数传递:");
        int[] originalArray = {1, 2, 3, 4, 5};
        System.out.print("调用前数组: ");
        printArray(originalArray);
        modifyArray(originalArray);
        System.out.print("调用后数组: ");
        printArray(originalArray); // 数组内容被修改
        
        // 3. 字符串参数传递
        System.out.println("\n3. 字符串参数传递:");
        String originalString = "Hello";
        System.out.println("调用前字符串: " + originalString);
        modifyString(originalString);
        System.out.println("调用后字符串: " + originalString); // 字符串不变
        
        // 4. 对象参数传递
        System.out.println("\n4. 对象参数传递:");
        Person person = new Person("李四", 30);
        System.out.println("调用前: " + person);
        modifyPerson(person);
        System.out.println("调用后: " + person); // 对象属性被修改
    }
    
    /**
     * 演示方法重载
     */
    private static void demonstrateMethodOverloading() {
        System.out.println("\n--- 方法重载 ---");
        
        // 1. 参数个数不同的重载
        System.out.println("1. 参数个数不同:");
        System.out.println("add(5, 3) = " + add(5, 3));
        System.out.println("add(5, 3, 2) = " + add(5, 3, 2));
        System.out.println("add(5, 3, 2, 1) = " + add(5, 3, 2, 1));
        
        // 2. 参数类型不同的重载
        System.out.println("\n2. 参数类型不同:");
        System.out.println("multiply(5, 3) = " + multiply(5, 3));
        System.out.println("multiply(5.5, 3.2) = " + multiply(5.5, 3.2));
        System.out.println("multiply(\"Hello\", 3) = " + multiply("Hello", 3));
        
        // 3. 参数顺序不同的重载
        System.out.println("\n3. 参数顺序不同:");
        displayInfo("张三", 25);
        displayInfo(25, "张三");
        
        // 4. 数组参数的重载
        System.out.println("\n4. 数组参数重载:");
        int[] intArray = {1, 2, 3, 4, 5};
        double[] doubleArray = {1.1, 2.2, 3.3};
        System.out.println("int数组平均值: " + calculateAverage(intArray));
        System.out.println("double数组平均值: " + calculateAverage(doubleArray));
    }
    
    /**
     * 演示可变参数
     */
    private static void demonstrateVarArgs() {
        System.out.println("\n--- 可变参数 ---");
        
        // 1. 基本可变参数使用
        System.out.println("1. 基本可变参数:");
        System.out.println("sum() = " + sum());
        System.out.println("sum(1) = " + sum(1));
        System.out.println("sum(1, 2, 3) = " + sum(1, 2, 3));
        System.out.println("sum(1, 2, 3, 4, 5) = " + sum(1, 2, 3, 4, 5));
        
        // 2. 可变参数与普通参数混合
        System.out.println("\n2. 混合参数:");
        printMessage("信息", "第一条", "第二条", "第三条");
        
        // 3. 传递数组给可变参数
        System.out.println("\n3. 传递数组:");
        int[] numbers = {10, 20, 30, 40};
        System.out.println("数组求和: " + sum(numbers));
        
        // 4. 字符串可变参数
        System.out.println("\n4. 字符串可变参数:");
        String result = concatenate("Java", "是", "一门", "优秀的", "编程语言");
        System.out.println("连接结果: " + result);
        
        // 5. 查找最大值
        System.out.println("\n5. 查找最大值:");
        System.out.println("max(3, 7, 2, 9, 1) = " + findMax(3, 7, 2, 9, 1));
    }
    
    /**
     * 演示递归方法
     */
    private static void demonstrateRecursion() {
        System.out.println("\n--- 递归方法 ---");
        
        // 1. 阶乘计算
        System.out.println("1. 阶乘计算:");
        for (int i = 0; i <= 6; i++) {
            System.out.println(i + "! = " + factorial(i));
        }
        
        // 2. 斐波那契数列
        System.out.println("\n2. 斐波那契数列:");
        System.out.print("前10项: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
        System.out.println();
        
        // 3. 数字求和
        System.out.println("\n3. 数字各位求和:");
        int number = 12345;
        System.out.println(number + " 各位数字之和: " + sumOfDigits(number));
        
        // 4. 字符串反转
        System.out.println("\n4. 字符串反转:");
        String original = "Hello World";
        String reversed = reverseString(original);
        System.out.println("原字符串: " + original);
        System.out.println("反转后: " + reversed);
        
        // 5. 二分查找
        System.out.println("\n5. 递归二分查找:");
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 7;
        System.out.print("数组: ");
        printArray(sortedArray);
        int index = binarySearchRecursive(sortedArray, target, 0, sortedArray.length - 1);
        if (index != -1) {
            System.out.println("找到 " + target + " 在索引: " + index);
        } else {
            System.out.println("未找到 " + target);
        }
        
        // 6. 汉诺塔问题
        System.out.println("\n6. 汉诺塔问题 (3层):");
        hanoi(3, 'A', 'B', 'C');
    }
    
    /**
     * 演示静态方法vs实例方法
     */
    private static void demonstrateStaticVsInstance() {
        System.out.println("\n--- 静态方法vs实例方法 ---");
        
        // 1. 静态方法调用
        System.out.println("1. 静态方法调用:");
        incrementClassCounter();
        incrementClassCounter();
        System.out.println("类计数器: " + getClassCounter());
        
        // 2. 实例方法调用
        System.out.println("\n2. 实例方法调用:");
        MethodExamples obj1 = new MethodExamples();
        MethodExamples obj2 = new MethodExamples();
        
        obj1.incrementInstanceCounter();
        obj1.incrementInstanceCounter();
        obj2.incrementInstanceCounter();
        
        System.out.println("对象1实例计数器: " + obj1.getInstanceCounter());
        System.out.println("对象2实例计数器: " + obj2.getInstanceCounter());
        
        // 3. 静态方法中不能直接访问实例成员
        System.out.println("\n3. 静态方法特点:");
        System.out.println("- 属于类，不属于特定实例");
        System.out.println("- 可以通过类名直接调用");
        System.out.println("- 不能直接访问实例变量和实例方法");
        System.out.println("- 在类加载时就存在");
        
        // 4. 实例方法特点
        System.out.println("\n4. 实例方法特点:");
        System.out.println("- 属于对象实例");
        System.out.println("- 必须通过对象实例调用");
        System.out.println("- 可以访问实例变量和静态变量");
        System.out.println("- 可以调用实例方法和静态方法");
    }
    
    /**
     * 演示方法的作用域和访问修饰符
     */
    private static void demonstrateMethodScope() {
        System.out.println("\n--- 方法作用域和访问修饰符 ---");
        
        // 创建实例来演示不同访问级别的方法
        MethodExamples example = new MethodExamples();
        
        // 1. public方法 - 任何地方都可以访问
        example.publicMethod();
        
        // 2. private方法 - 只能在同一个类中访问
        example.callPrivateMethod();
        
        // 3. protected方法 - 同包或子类可以访问
        example.protectedMethod();
        
        // 4. 包级私有方法 - 同包中可以访问
        example.packagePrivateMethod();
        
        System.out.println("\n访问修饰符总结:");
        System.out.println("public: 任何地方都可以访问");
        System.out.println("protected: 同包或子类可以访问");
        System.out.println("默认(包级私有): 同包中可以访问");
        System.out.println("private: 只能在同一个类中访问");
    }
    
    /**
     * 演示实用方法示例
     */
    private static void demonstrateUtilityMethods() {
        System.out.println("\n--- 实用方法示例 ---");
        
        // 1. 数学工具方法
        System.out.println("1. 数学工具方法:");
        System.out.println("isPrime(17): " + isPrime(17));
        System.out.println("gcd(48, 18): " + gcd(48, 18));
        System.out.println("power(2, 10): " + power(2, 10));
        
        // 2. 字符串工具方法
        System.out.println("\n2. 字符串工具方法:");
        String text = "Hello World";
        System.out.println("原字符串: " + text);
        System.out.println("字符数量: " + countCharacters(text, 'l'));
        System.out.println("是否回文: " + isPalindrome("level"));
        System.out.println("首字母大写: " + capitalizeWords("hello world java"));
        
        // 3. 数组工具方法
        System.out.println("\n3. 数组工具方法:");
        int[] testArray = {5, 2, 8, 1, 9, 3};
        System.out.print("原数组: ");
        printArray(testArray);
        System.out.println("最大值: " + findMaxInArray(testArray));
        System.out.println("最小值: " + findMinInArray(testArray));
        System.out.println("平均值: " + calculateAverage(testArray));
        
        // 4. 验证工具方法
        System.out.println("\n4. 验证工具方法:");
        System.out.println("isValidEmail(\"user@example.com\"): " + isValidEmail("user@example.com"));
        System.out.println("isValidEmail(\"invalid-email\"): " + isValidEmail("invalid-email"));
        System.out.println("isInRange(5, 1, 10): " + isInRange(5, 1, 10));
        System.out.println("isInRange(15, 1, 10): " + isInRange(15, 1, 10));
    }
    
    // ========== 基本方法定义 ==========
    
    /**
     * 无参数无返回值方法
     */
    private static void printWelcomeMessage() {
        System.out.println("欢迎学习Java方法!");
    }
    
    /**
     * 有参数无返回值方法
     */
    private static void printPersonInfo(String name, int age) {
        System.out.println("姓名: " + name + ", 年龄: " + age);
    }
    
    /**
     * 无参数有返回值方法
     */
    private static String getCurrentTime() {
        return java.time.LocalTime.now().toString();
    }
    
    /**
     * 有参数有返回值方法
     */
    private static int addTwoNumbers(int a, int b) {
        return a + b;
    }
    
    /**
     * 返回布尔值的方法
     */
    private static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
    
    /**
     * 返回数组的方法
     */
    private static int[] generateFibonacci(int count) {
        if (count <= 0) return new int[0];
        if (count == 1) return new int[]{0};
        
        int[] fibonacci = new int[count];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        
        for (int i = 2; i < count; i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }
        
        return fibonacci;
    }
    
    // ========== 参数传递相关方法 ==========
    
    /**
     * 修改基本数据类型参数（值传递）
     */
    private static void modifyPrimitive(int value) {
        value = 999;
        System.out.println("方法内修改后: " + value);
    }
    
    /**
     * 修改数组参数（引用传递）
     */
    private static void modifyArray(int[] array) {
        if (array.length > 0) {
            array[0] = 999;
        }
        System.out.println("方法内修改数组第一个元素为: 999");
    }
    
    /**
     * 修改字符串参数
     */
    private static void modifyString(String str) {
        str = "Modified";
        System.out.println("方法内修改后: " + str);
    }
    
    /**
     * 修改对象参数
     */
    private static void modifyPerson(Person person) {
        person.setName("王五");
        person.setAge(35);
        System.out.println("方法内修改对象属性");
    }
    
    /**
     * 打印数组
     */
    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    
    // ========== 方法重载 ==========
    
    /**
     * 两个参数的加法
     */
    private static int add(int a, int b) {
        return a + b;
    }
    
    /**
     * 三个参数的加法
     */
    private static int add(int a, int b, int c) {
        return a + b + c;
    }
    
    /**
     * 四个参数的加法
     */
    private static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }
    
    /**
     * 整数乘法
     */
    private static int multiply(int a, int b) {
        return a * b;
    }
    
    /**
     * 浮点数乘法
     */
    private static double multiply(double a, double b) {
        return a * b;
    }
    
    /**
     * 字符串重复
     */
    private static String multiply(String str, int times) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < times; i++) {
            result.append(str);
        }
        return result.toString();
    }
    
    /**
     * 显示信息（字符串在前）
     */
    private static void displayInfo(String name, int age) {
        System.out.println("姓名: " + name + ", 年龄: " + age);
    }
    
    /**
     * 显示信息（整数在前）
     */
    private static void displayInfo(int age, String name) {
        System.out.println("年龄: " + age + ", 姓名: " + name);
    }
    
    /**
     * 计算整数数组平均值
     */
    private static double calculateAverage(int[] numbers) {
        if (numbers.length == 0) return 0;
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }
    
    /**
     * 计算浮点数组平均值
     */
    private static double calculateAverage(double[] numbers) {
        if (numbers.length == 0) return 0;
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }
    
    // ========== 可变参数方法 ==========
    
    /**
     * 可变参数求和
     */
    private static int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }
    
    /**
     * 混合参数方法
     */
    private static void printMessage(String title, String... messages) {
        System.out.println("=== " + title + " ===");
        for (String message : messages) {
            System.out.println("- " + message);
        }
    }
    
    /**
     * 字符串连接
     */
    private static String concatenate(String... strings) {
        StringBuilder result = new StringBuilder();
        for (String str : strings) {
            result.append(str);
        }
        return result.toString();
    }
    
    /**
     * 查找最大值
     */
    private static int findMax(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("至少需要一个参数");
        }
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
    
    // ========== 递归方法 ==========
    
    /**
     * 递归计算阶乘
     */
    private static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("阶乘不能为负数");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    
    /**
     * 递归计算斐波那契数
     */
    private static int fibonacciRecursive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("斐波那契数不能为负数");
        }
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
    
    /**
     * 递归计算数字各位之和
     */
    private static int sumOfDigits(int number) {
        if (number < 10) {
            return number;
        }
        return number % 10 + sumOfDigits(number / 10);
    }
    
    /**
     * 递归反转字符串
     */
    private static String reverseString(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }
    
    /**
     * 递归二分查找
     */
    private static int binarySearchRecursive(int[] array, int target, int left, int right) {
        if (left > right) {
            return -1; // 未找到
        }
        
        int mid = left + (right - left) / 2;
        
        if (array[mid] == target) {
            return mid;
        } else if (array[mid] > target) {
            return binarySearchRecursive(array, target, left, mid - 1);
        } else {
            return binarySearchRecursive(array, target, mid + 1, right);
        }
    }
    
    /**
     * 汉诺塔递归解法
     */
    private static void hanoi(int n, char from, char auxiliary, char to) {
        if (n == 1) {
            System.out.println("移动盘子从 " + from + " 到 " + to);
        } else {
            hanoi(n - 1, from, to, auxiliary);
            System.out.println("移动盘子从 " + from + " 到 " + to);
            hanoi(n - 1, auxiliary, from, to);
        }
    }
    
    // ========== 静态方法和实例方法 ==========
    
    /**
     * 静态方法：增加类计数器
     */
    private static void incrementClassCounter() {
        classCounter++;
    }
    
    /**
     * 静态方法：获取类计数器
     */
    private static int getClassCounter() {
        return classCounter;
    }
    
    /**
     * 实例方法：增加实例计数器
     */
    private void incrementInstanceCounter() {
        instanceCounter++;
    }
    
    /**
     * 实例方法：获取实例计数器
     */
    private int getInstanceCounter() {
        return instanceCounter;
    }
    
    // ========== 访问修饰符方法 ==========
    
    /**
     * public方法
     */
    public void publicMethod() {
        System.out.println("这是public方法，任何地方都可以访问");
    }
    
    /**
     * private方法
     */
    private void privateMethod() {
        System.out.println("这是private方法，只能在同一个类中访问");
    }
    
    /**
     * 调用private方法的public方法
     */
    public void callPrivateMethod() {
        privateMethod();
    }
    
    /**
     * protected方法
     */
    protected void protectedMethod() {
        System.out.println("这是protected方法，同包或子类可以访问");
    }
    
    /**
     * 包级私有方法（默认访问级别）
     */
    void packagePrivateMethod() {
        System.out.println("这是包级私有方法，同包中可以访问");
    }
    
    // ========== 实用工具方法 ==========
    
    /**
     * 判断是否为质数
     */
    private static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
    
    /**
     * 计算最大公约数
     */
    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    
    /**
     * 计算幂
     */
    private static long power(int base, int exponent) {
        if (exponent == 0) return 1;
        if (exponent == 1) return base;
        
        long half = power(base, exponent / 2);
        if (exponent % 2 == 0) {
            return half * half;
        } else {
            return half * half * base;
        }
    }
    
    /**
     * 统计字符出现次数
     */
    private static int countCharacters(String text, char target) {
        int count = 0;
        for (char c : text.toCharArray()) {
            if (c == target) count++;
        }
        return count;
    }
    
    /**
     * 判断是否为回文
     */
    private static boolean isPalindrome(String str) {
        str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    /**
     * 首字母大写
     */
    private static String capitalizeWords(String text) {
        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (word.length() > 0) {
                result.append(Character.toUpperCase(word.charAt(0)));
                if (word.length() > 1) {
                    result.append(word.substring(1).toLowerCase());
                }
                result.append(" ");
            }
        }
        return result.toString().trim();
    }
    
    /**
     * 查找数组最大值
     */
    private static int findMaxInArray(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("数组不能为空");
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    
    /**
     * 查找数组最小值
     */
    private static int findMinInArray(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("数组不能为空");
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    
    /**
     * 简单邮箱验证
     */
    private static boolean isValidEmail(String email) {
        return email != null && email.contains("@") && email.contains(".") && 
               email.indexOf("@") < email.lastIndexOf(".");
    }
    
    /**
     * 判断数值是否在范围内
     */
    private static boolean isInRange(int value, int min, int max) {
        return value >= min && value <= max;
    }
    
    // ========== 内部类 ==========
    
    /**
     * 简单的Person类，用于演示对象参数传递
     */
    static class Person {
        private String name;
        private int age;
        
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public int getAge() { return age; }
        public void setAge(int age) { this.age = age; }
        
        @Override
        public String toString() {
            return "Person{name='" + name + "', age=" + age + "}";
        }
    }
}