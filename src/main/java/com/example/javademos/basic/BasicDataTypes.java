package com.example.javademos.basic;

/**
 * Java基本数据类型示例
 * 演示8种基本数据类型的声明、初始化和基本操作
 * 
 * @author Java学习示例
 * @version 1.0
 */
public class BasicDataTypes {

    public static void main(String[] args) {
        System.out.println("=== Java基本数据类型示例 ===");

        // 1. 整数类型
        demonstrateIntegerTypes();

        // 2. 浮点类型
        demonstrateFloatingTypes();

        // 3. 字符类型
        demonstrateCharType();

        // 4. 布尔类型
        demonstrateBooleanType();

        // 5. 类型转换
        demonstrateTypeConversion();

        // 6. 常量定义
        demonstrateConstants();
    }

    /**
     * 演示整数类型：byte, short, int, long
     */
    private static void demonstrateIntegerTypes() {
        System.out.println("\n--- 整数类型 ---");

        // byte: 8位，范围 -128 到 127
        byte byteValue = 100;
        System.out.println("byte类型: " + byteValue + " (范围: -128 到 127)");

        // short: 16位，范围 -32,768 到 32,767
        short shortValue = 30000;
        System.out.println("short类型: " + shortValue + " (范围: -32,768 到 32,767)");

        // int: 32位，范围 -2,147,483,648 到 2,147,483,647
        int intValue = 2000000000;
        System.out.println("int类型: " + intValue + " (范围: -2^31 到 2^31-1)");

        // long: 64位，范围 -9,223,372,036,854,775,808 到 9,223,372,036,854,775,807
        long longValue = 9000000000000000000L; // 注意L后缀
        System.out.println("long类型: " + longValue + " (范围: -2^63 到 2^63-1)");

        // 不同进制表示
        int decimal = 100; // 十进制
        int binary = 0b1100100; // 二进制（Java 7+）
        int octal = 0144; // 八进制
        int hex = 0x64; // 十六进制

        System.out.println("不同进制表示100: 十进制=" + decimal + ", 二进制=" + binary +
                ", 八进制=" + octal + ", 十六进制=" + hex);
    }

    /**
     * 演示浮点类型：float, double
     */
    private static void demonstrateFloatingTypes() {
        System.out.println("\n--- 浮点类型 ---");

        // float: 32位单精度浮点数
        float floatValue = 3.14159f; // 注意f后缀
        System.out.println("float类型: " + floatValue + " (32位单精度)");

        // double: 64位双精度浮点数（默认）
        double doubleValue = 3.141592653589793;
        System.out.println("double类型: " + doubleValue + " (64位双精度)");

        // 科学计数法
        double scientific1 = 1.23e4; // 1.23 × 10^4 = 12300
        double scientific2 = 1.23e-4; // 1.23 × 10^-4 = 0.000123
        System.out.println("科学计数法: 1.23e4 = " + scientific1 + ", 1.23e-4 = " + scientific2);

        // 特殊值
        double positiveInfinity = Double.POSITIVE_INFINITY;
        double negativeInfinity = Double.NEGATIVE_INFINITY;
        double notANumber = Double.NaN;

        System.out.println("特殊值: +∞=" + positiveInfinity + ", -∞=" + negativeInfinity + ", NaN=" + notANumber);
    }

    /**
     * 演示字符类型：char
     */
    private static void demonstrateCharType() {
        System.out.println("\n--- 字符类型 ---");

        // char: 16位Unicode字符
        char charValue1 = 'A';
        char charValue2 = '中';
        char charValue3 = '\u0041'; // Unicode表示的'A'
        char charValue4 = 65; // ASCII码表示的'A'

        System.out.println("字符类型: " + charValue1 + ", " + charValue2);
        System.out.println("Unicode表示: \\u0041 = " + charValue3);
        System.out.println("ASCII码表示: 65 = " + charValue4);

        // 转义字符
        char newline = '\n';
        char tab = '\t';
        char backslash = '\\';
        char singleQuote = '\'';

        System.out.println("转义字符示例:");
        System.out.println("换行符后" + newline + "这是新行");
        System.out.println("制表符:" + tab + "缩进内容");
        System.out.println("反斜杠: " + backslash + ", 单引号: " + singleQuote);
    }

    /**
     * 演示布尔类型：boolean
     */
    private static void demonstrateBooleanType() {
        System.out.println("\n--- 布尔类型 ---");

        // boolean: 只有true和false两个值
        boolean isTrue = true;
        boolean isFalse = false;

        System.out.println("布尔值: " + isTrue + ", " + isFalse);

        // 布尔运算
        boolean and = isTrue && isFalse; // 逻辑与
        boolean or = isTrue || isFalse; // 逻辑或
        boolean not = !isTrue; // 逻辑非

        System.out.println("逻辑运算: true && false = " + and);
        System.out.println("逻辑运算: true || false = " + or);
        System.out.println("逻辑运算: !true = " + not);

        // 比较运算返回布尔值
        int a = 10, b = 20;
        boolean greater = a > b;
        boolean equal = a == b;
        boolean notEqual = a != b;

        System.out.println("比较运算: 10 > 20 = " + greater);
        System.out.println("比较运算: 10 == 20 = " + equal);
        System.out.println("比较运算: 10 != 20 = " + notEqual);
    }

    /**
     * 演示类型转换
     */
    private static void demonstrateTypeConversion() {
        System.out.println("\n--- 类型转换 ---");

        // 自动类型转换（隐式转换）- 小范围到大范围
        byte byteVal = 100;
        int intVal = byteVal; // byte -> int
        long longVal = intVal; // int -> long
        float floatVal = longVal; // long -> float
        double doubleVal = floatVal; // float -> double

        System.out.println("自动类型转换: byte(" + byteVal + ") -> int(" + intVal + ") -> long(" + longVal + ") -> float("
                + floatVal + ") -> double(" + doubleVal + ")");

        // 强制类型转换（显式转换）- 大范围到小范围
        double d = 3.14159;
        float f = (float) d; // double -> float
        long l = (long) f; // float -> long
        int i = (int) l; // long -> int
        short s = (short) i; // int -> short
        byte b = (byte) s; // short -> byte

        System.out.println("强制类型转换: double(" + d + ") -> float(" + f + ") -> long(" + l + ") -> int(" + i
                + ") -> short(" + s + ") -> byte(" + b + ")");

        // 注意精度丢失
        double preciseValue = 123.456789;
        int truncatedValue = (int) preciseValue;
        System.out.println("精度丢失示例: double(" + preciseValue + ") -> int(" + truncatedValue + ")");

        // 字符与数字的转换
        char ch = 'A';
        int ascii = ch; // char -> int (获取ASCII码)
        char fromAscii = (char) (ascii + 1); // int -> char

        System.out.println(
                "字符转换: '" + ch + "' 的ASCII码是 " + ascii + ", ASCII码 " + (ascii + 1) + " 对应字符 '" + fromAscii + "'");
    }

    /**
     * 演示常量定义
     */
    private static void demonstrateConstants() {
        System.out.println("\n--- 常量定义 ---");

        // 使用final关键字定义常量
        final int MAX_SIZE = 100;
        final double PI = 3.14159265359;
        final String COMPANY_NAME = "Java学习公司";
        final boolean DEBUG_MODE = true;

        System.out.println("常量示例:");
        System.out.println("MAX_SIZE = " + MAX_SIZE);
        System.out.println("PI = " + PI);
        System.out.println("COMPANY_NAME = " + COMPANY_NAME);
        System.out.println("DEBUG_MODE = " + DEBUG_MODE);

        // 常量命名规范：全大写，单词间用下划线分隔
        final int DEFAULT_TIMEOUT_SECONDS = 30;
        final double EARTH_GRAVITY = 9.8;

        System.out.println("\n常量命名规范示例:");
        System.out.println("DEFAULT_TIMEOUT_SECONDS = " + DEFAULT_TIMEOUT_SECONDS);
        System.out.println("EARTH_GRAVITY = " + EARTH_GRAVITY);

        // 展示各类型的最大值和最小值
        System.out.println("\n--- 各类型的取值范围 ---");
        System.out.println("byte: " + Byte.MIN_VALUE + " 到 " + Byte.MAX_VALUE);
        System.out.println("short: " + Short.MIN_VALUE + " 到 " + Short.MAX_VALUE);
        System.out.println("int: " + Integer.MIN_VALUE + " 到 " + Integer.MAX_VALUE);
        System.out.println("long: " + Long.MIN_VALUE + " 到 " + Long.MAX_VALUE);
        System.out.println("float: " + Float.MIN_VALUE + " 到 " + Float.MAX_VALUE);
        System.out.println("double: " + Double.MIN_VALUE + " 到 " + Double.MAX_VALUE);
        System.out.println("char: " + (int) Character.MIN_VALUE + " 到 " + (int) Character.MAX_VALUE);
    }
}