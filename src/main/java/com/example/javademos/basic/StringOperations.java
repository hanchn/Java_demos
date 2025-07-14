package com.example.javademos.basic;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Java字符串操作示例
 * 演示字符串的创建、操作、比较、格式化、正则表达式等
 * 
 * @author Java学习示例
 * @version 1.0
 */
public class StringOperations {
    
    public static void main(String[] args) {
        System.out.println("=== Java字符串操作示例 ===");
        
        // 1. 字符串创建和基本操作
        demonstrateStringCreation();
        
        // 2. 字符串比较
        demonstrateStringComparison();
        
        // 3. 字符串查找和索引
        demonstrateStringSearching();
        
        // 4. 字符串截取和分割
        demonstrateStringSubstring();
        
        // 5. 字符串替换和修改
        demonstrateStringReplacement();
        
        // 6. 字符串格式化
        demonstrateStringFormatting();
        
        // 7. StringBuilder和StringBuffer
        demonstrateStringBuilder();
        
        // 8. 字符串转换
        demonstrateStringConversion();
        
        // 9. 正则表达式
        demonstrateRegularExpressions();
        
        // 10. 字符串实用方法
        demonstrateStringUtilities();
        
        // 11. 字符串性能考虑
        demonstrateStringPerformance();
        
        // 12. 字符串常见问题和最佳实践
        demonstrateBestPractices();
    }
    
    /**
     * 演示字符串创建和基本操作
     */
    private static void demonstrateStringCreation() {
        System.out.println("\n--- 字符串创建和基本操作 ---");
        
        // 1. 字符串字面量
        System.out.println("1. 字符串字面量:");
        String str1 = "Hello World";
        String str2 = "Hello World";
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str1 == str2: " + (str1 == str2)); // true，字符串池
        
        // 2. 使用new关键字
        System.out.println("\n2. 使用new关键字:");
        String str3 = new String("Hello World");
        String str4 = new String("Hello World");
        System.out.println("str3: " + str3);
        System.out.println("str4: " + str4);
        System.out.println("str3 == str4: " + (str3 == str4)); // false，不同对象
        System.out.println("str1 == str3: " + (str1 == str3)); // false
        
        // 3. 从字符数组创建
        System.out.println("\n3. 从字符数组创建:");
        char[] charArray = {'J', 'a', 'v', 'a'};
        String str5 = new String(charArray);
        System.out.println("从字符数组: " + str5);
        
        // 4. 从字节数组创建
        System.out.println("\n4. 从字节数组创建:");
        byte[] byteArray = {72, 101, 108, 108, 111}; // "Hello"
        String str6 = new String(byteArray);
        System.out.println("从字节数组: " + str6);
        
        // 5. 字符串基本属性
        System.out.println("\n5. 字符串基本属性:");
        String text = "Java Programming";
        System.out.println("字符串: " + text);
        System.out.println("长度: " + text.length());
        System.out.println("是否为空: " + text.isEmpty());
        System.out.println("是否为空白: " + text.isBlank());
        
        // 6. 空字符串和null
        System.out.println("\n6. 空字符串和null:");
        String emptyStr = "";
        String nullStr = null;
        String blankStr = "   ";
        System.out.println("空字符串长度: " + emptyStr.length());
        System.out.println("空字符串isEmpty: " + emptyStr.isEmpty());
        System.out.println("空白字符串isBlank: " + blankStr.isBlank());
        // System.out.println(nullStr.length()); // 会抛出NullPointerException
        
        // 7. 字符串不可变性
        System.out.println("\n7. 字符串不可变性:");
        String original = "Hello";
        String modified = original.concat(" World");
        System.out.println("原字符串: " + original); // 仍然是"Hello"
        System.out.println("修改后: " + modified); // "Hello World"
        System.out.println("原字符串未改变，说明字符串是不可变的");
    }
    
    /**
     * 演示字符串比较
     */
    private static void demonstrateStringComparison() {
        System.out.println("\n--- 字符串比较 ---");
        
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "hello";
        String str4 = new String("Hello");
        String str5 = "World";
        
        // 1. == 比较（引用比较）
        System.out.println("1. == 比较（引用比较）:");
        System.out.println("str1 == str2: " + (str1 == str2)); // true
        System.out.println("str1 == str4: " + (str1 == str4)); // false
        
        // 2. equals() 比较（内容比较）
        System.out.println("\n2. equals() 比较（内容比较）:");
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true
        System.out.println("str1.equals(str4): " + str1.equals(str4)); // true
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // false
        
        // 3. equalsIgnoreCase() 比较（忽略大小写）
        System.out.println("\n3. equalsIgnoreCase() 比较:");
        System.out.println("str1.equalsIgnoreCase(str3): " + str1.equalsIgnoreCase(str3)); // true
        
        // 4. compareTo() 比较（字典序）
        System.out.println("\n4. compareTo() 比较:");
        System.out.println("str1.compareTo(str2): " + str1.compareTo(str2)); // 0
        System.out.println("str1.compareTo(str5): " + str1.compareTo(str5)); // 负数
        System.out.println("str5.compareTo(str1): " + str5.compareTo(str1)); // 正数
        
        // 5. compareToIgnoreCase() 比较
        System.out.println("\n5. compareToIgnoreCase() 比较:");
        System.out.println("str1.compareToIgnoreCase(str3): " + str1.compareToIgnoreCase(str3)); // 0
        
        // 6. 安全的字符串比较（避免NullPointerException）
        System.out.println("\n6. 安全的字符串比较:");
        String nullStr = null;
        System.out.println("使用Objects.equals():");
        System.out.println("Objects.equals(str1, nullStr): " + java.util.Objects.equals(str1, nullStr));
        System.out.println("Objects.equals(nullStr, nullStr): " + java.util.Objects.equals(nullStr, nullStr));
        
        // 7. 字符串比较最佳实践
        System.out.println("\n7. 字符串比较最佳实践:");
        String userInput = "hello";
        // 好的做法：常量在前
        System.out.println("\"Hello\".equalsIgnoreCase(userInput): " + "Hello".equalsIgnoreCase(userInput));
        // 避免：userInput.equalsIgnoreCase("Hello") 如果userInput为null会抛异常
    }
    
    /**
     * 演示字符串查找和索引
     */
    private static void demonstrateStringSearching() {
        System.out.println("\n--- 字符串查找和索引 ---");
        
        String text = "Java is a programming language. Java is powerful.";
        System.out.println("原字符串: " + text);
        
        // 1. 查找字符
        System.out.println("\n1. 查找字符:");
        System.out.println("第一个'a'的位置: " + text.indexOf('a'));
        System.out.println("最后一个'a'的位置: " + text.lastIndexOf('a'));
        System.out.println("从位置5开始查找'a': " + text.indexOf('a', 5));
        
        // 2. 查找子字符串
        System.out.println("\n2. 查找子字符串:");
        System.out.println("第一个'Java'的位置: " + text.indexOf("Java"));
        System.out.println("最后一个'Java'的位置: " + text.lastIndexOf("Java"));
        System.out.println("从位置10开始查找'Java': " + text.indexOf("Java", 10));
        
        // 3. 检查字符串包含
        System.out.println("\n3. 检查字符串包含:");
        System.out.println("包含'programming': " + text.contains("programming"));
        System.out.println("包含'Python': " + text.contains("Python"));
        
        // 4. 检查字符串开始和结束
        System.out.println("\n4. 检查字符串开始和结束:");
        System.out.println("以'Java'开始: " + text.startsWith("Java"));
        System.out.println("以'powerful.'结束: " + text.endsWith("powerful."));
        System.out.println("从位置25开始以'Java'开始: " + text.startsWith("Java", 25));
        
        // 5. 获取字符
        System.out.println("\n5. 获取字符:");
        System.out.println("位置0的字符: " + text.charAt(0));
        System.out.println("位置5的字符: " + text.charAt(5));
        
        // 6. 获取字符的Unicode值
        System.out.println("\n6. 获取字符的Unicode值:");
        System.out.println("位置0字符的Unicode值: " + text.codePointAt(0));
        
        // 7. 查找示例
        System.out.println("\n7. 查找示例:");
        String email = "user@example.com";
        int atIndex = email.indexOf('@');
        int dotIndex = email.lastIndexOf('.');
        if (atIndex > 0 && dotIndex > atIndex) {
            String username = email.substring(0, atIndex);
            String domain = email.substring(atIndex + 1, dotIndex);
            String extension = email.substring(dotIndex + 1);
            System.out.println("邮箱: " + email);
            System.out.println("用户名: " + username);
            System.out.println("域名: " + domain);
            System.out.println("扩展名: " + extension);
        }
    }
    
    /**
     * 演示字符串截取和分割
     */
    private static void demonstrateStringSubstring() {
        System.out.println("\n--- 字符串截取和分割 ---");
        
        String text = "Java Programming Language";
        System.out.println("原字符串: " + text);
        
        // 1. substring() 方法
        System.out.println("\n1. substring() 方法:");
        System.out.println("从位置5开始: " + text.substring(5));
        System.out.println("从位置5到12: " + text.substring(5, 12));
        System.out.println("前4个字符: " + text.substring(0, 4));
        System.out.println("后8个字符: " + text.substring(text.length() - 8));
        
        // 2. split() 方法
        System.out.println("\n2. split() 方法:");
        String sentence = "apple,banana,orange,grape";
        String[] fruits = sentence.split(",");
        System.out.println("原字符串: " + sentence);
        System.out.println("分割结果: " + Arrays.toString(fruits));
        
        // 3. 使用正则表达式分割
        System.out.println("\n3. 使用正则表达式分割:");
        String data = "apple123banana456orange789grape";
        String[] parts = data.split("\\d+"); // 按数字分割
        System.out.println("原字符串: " + data);
        System.out.println("按数字分割: " + Arrays.toString(parts));
        
        // 4. 限制分割次数
        System.out.println("\n4. 限制分割次数:");
        String path = "home/user/documents/file.txt";
        String[] pathParts = path.split("/", 3); // 最多分割成3部分
        System.out.println("原路径: " + path);
        System.out.println("分割结果: " + Arrays.toString(pathParts));
        
        // 5. 按空白字符分割
        System.out.println("\n5. 按空白字符分割:");
        String multiSpace = "Java   Programming    Language";
        String[] words = multiSpace.split("\\s+"); // 一个或多个空白字符
        System.out.println("原字符串: " + multiSpace);
        System.out.println("分割结果: " + Arrays.toString(words));
        
        // 6. 字符串行处理
        System.out.println("\n6. 字符串行处理:");
        String multiLine = "第一行\n第二行\r\n第三行\n第四行";
        String[] lines = multiLine.split("\\r?\\n"); // 处理不同的换行符
        System.out.println("多行文本分割:");
        for (int i = 0; i < lines.length; i++) {
            System.out.println("行" + (i + 1) + ": " + lines[i]);
        }
        
        // 7. 实用的字符串截取方法
        System.out.println("\n7. 实用的字符串截取方法:");
        String fileName = "document.pdf";
        String name = getFileNameWithoutExtension(fileName);
        String extension = getFileExtension(fileName);
        System.out.println("文件名: " + fileName);
        System.out.println("名称: " + name);
        System.out.println("扩展名: " + extension);
    }
    
    /**
     * 演示字符串替换和修改
     */
    private static void demonstrateStringReplacement() {
        System.out.println("\n--- 字符串替换和修改 ---");
        
        String text = "Java is great. Java is powerful. Java is popular.";
        System.out.println("原字符串: " + text);
        
        // 1. replace() 方法（替换所有匹配）
        System.out.println("\n1. replace() 方法:");
        String replaced1 = text.replace("Java", "Python");
        System.out.println("替换Java为Python: " + replaced1);
        
        String replaced2 = text.replace('a', 'A');
        System.out.println("替换字符a为A: " + replaced2);
        
        // 2. replaceFirst() 方法（只替换第一个匹配）
        System.out.println("\n2. replaceFirst() 方法:");
        String replaced3 = text.replaceFirst("Java", "Python");
        System.out.println("只替换第一个Java: " + replaced3);
        
        // 3. replaceAll() 方法（使用正则表达式）
        System.out.println("\n3. replaceAll() 方法:");
        String phoneNumber = "123-456-7890";
        String digitsOnly = phoneNumber.replaceAll("[^\\d]", "");
        System.out.println("原电话号码: " + phoneNumber);
        System.out.println("只保留数字: " + digitsOnly);
        
        // 4. 大小写转换
        System.out.println("\n4. 大小写转换:");
        String mixedCase = "Hello World Java Programming";
        System.out.println("原字符串: " + mixedCase);
        System.out.println("转大写: " + mixedCase.toUpperCase());
        System.out.println("转小写: " + mixedCase.toLowerCase());
        
        // 5. 去除空白字符
        System.out.println("\n5. 去除空白字符:");
        String withSpaces = "   Hello World   ";
        System.out.println("原字符串: '" + withSpaces + "'");
        System.out.println("trim(): '" + withSpaces.trim() + "'");
        System.out.println("strip(): '" + withSpaces.strip() + "'"); // Java 11+
        System.out.println("stripLeading(): '" + withSpaces.stripLeading() + "'"); // Java 11+
        System.out.println("stripTrailing(): '" + withSpaces.stripTrailing() + "'"); // Java 11+
        
        // 6. 字符串填充（Java 11+）
        System.out.println("\n6. 字符串重复:");
        String pattern = "*-";
        String repeated = pattern.repeat(5); // Java 11+
        System.out.println("重复模式: " + repeated);
        
        // 7. 实用的字符串清理方法
        System.out.println("\n7. 实用的字符串清理:");
        String messyText = "  Hello,,,   World!!!   ";
        String cleaned = cleanText(messyText);
        System.out.println("原文本: '" + messyText + "'");
        System.out.println("清理后: '" + cleaned + "'");
        
        // 8. 字符串标准化
        System.out.println("\n8. 字符串标准化:");
        String userInput = "  JAVA programming  ";
        String normalized = normalizeString(userInput);
        System.out.println("用户输入: '" + userInput + "'");
        System.out.println("标准化后: '" + normalized + "'");
    }
    
    /**
     * 演示字符串格式化
     */
    private static void demonstrateStringFormatting() {
        System.out.println("\n--- 字符串格式化 ---");
        
        // 1. String.format() 方法
        System.out.println("1. String.format() 方法:");
        String name = "张三";
        int age = 25;
        double salary = 5000.50;
        
        String formatted1 = String.format("姓名: %s, 年龄: %d, 薪水: %.2f", name, age, salary);
        System.out.println(formatted1);
        
        // 2. printf() 方法
        System.out.println("\n2. printf() 方法:");
        System.out.printf("姓名: %s, 年龄: %d, 薪水: %.2f%n", name, age, salary);
        
        // 3. 数字格式化
        System.out.println("\n3. 数字格式化:");
        int number = 12345;
        System.out.printf("整数: %d%n", number);
        System.out.printf("八进制: %o%n", number);
        System.out.printf("十六进制: %x%n", number);
        System.out.printf("科学计数法: %e%n", (double)number);
        System.out.printf("带千分位分隔符: %,d%n", number);
        
        // 4. 浮点数格式化
        System.out.println("\n4. 浮点数格式化:");
        double pi = Math.PI;
        System.out.printf("默认: %f%n", pi);
        System.out.printf("2位小数: %.2f%n", pi);
        System.out.printf("科学计数法: %e%n", pi);
        System.out.printf("自动选择: %g%n", pi);
        
        // 5. 字符串对齐和填充
        System.out.println("\n5. 字符串对齐和填充:");
        String text = "Java";
        System.out.printf("左对齐: '%-10s'%n", text);
        System.out.printf("右对齐: '%10s'%n", text);
        System.out.printf("用0填充数字: '%08d'%n", 123);
        
        // 6. 日期时间格式化
        System.out.println("\n6. 日期时间格式化:");
        java.util.Date now = new java.util.Date();
        System.out.printf("完整日期时间: %tc%n", now);
        System.out.printf("日期: %tF%n", now);
        System.out.printf("时间: %tT%n", now);
        System.out.printf("年份: %tY%n", now);
        System.out.printf("月份: %tm%n", now);
        System.out.printf("日期: %td%n", now);
        
        // 7. 参数索引
        System.out.println("\n7. 参数索引:");
        System.out.printf("第一个参数: %1$s, 第二个参数: %2$d, 再次使用第一个: %1$s%n", "Hello", 42);
        
        // 8. 实用的格式化方法
        System.out.println("\n8. 实用的格式化方法:");
        String tableRow = formatTableRow("产品A", 100, 29.99);
        System.out.println("表格行: " + tableRow);
        
        String percentage = formatPercentage(0.1234);
        System.out.println("百分比: " + percentage);
        
        String fileSize = formatFileSize(1024 * 1024 * 5);
        System.out.println("文件大小: " + fileSize);
    }
    
    /**
     * 演示StringBuilder和StringBuffer
     */
    private static void demonstrateStringBuilder() {
        System.out.println("\n--- StringBuilder和StringBuffer ---");
        
        // 1. StringBuilder基本使用
        System.out.println("1. StringBuilder基本使用:");
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        System.out.println("StringBuilder结果: " + sb.toString());
        
        // 2. StringBuilder链式调用
        System.out.println("\n2. StringBuilder链式调用:");
        StringBuilder sb2 = new StringBuilder()
            .append("Java")
            .append(" is")
            .append(" awesome!");
        System.out.println("链式调用结果: " + sb2.toString());
        
        // 3. StringBuilder的各种方法
        System.out.println("\n3. StringBuilder的各种方法:");
        StringBuilder sb3 = new StringBuilder("Hello World");
        System.out.println("原字符串: " + sb3);
        
        sb3.insert(5, ",");
        System.out.println("插入逗号: " + sb3);
        
        sb3.delete(5, 6);
        System.out.println("删除逗号: " + sb3);
        
        sb3.replace(0, 5, "Hi");
        System.out.println("替换Hello为Hi: " + sb3);
        
        sb3.reverse();
        System.out.println("反转: " + sb3);
        
        // 4. StringBuilder容量管理
        System.out.println("\n4. StringBuilder容量管理:");
        StringBuilder sb4 = new StringBuilder(10);
        System.out.println("初始容量: " + sb4.capacity());
        System.out.println("初始长度: " + sb4.length());
        
        sb4.append("This is a long string that exceeds initial capacity");
        System.out.println("添加长字符串后容量: " + sb4.capacity());
        System.out.println("添加长字符串后长度: " + sb4.length());
        
        // 5. StringBuffer vs StringBuilder
        System.out.println("\n5. StringBuffer vs StringBuilder:");
        System.out.println("StringBuffer: 线程安全，性能较低");
        System.out.println("StringBuilder: 非线程安全，性能较高");
        
        StringBuffer stringBuffer = new StringBuffer("StringBuffer example");
        StringBuilder stringBuilder = new StringBuilder("StringBuilder example");
        System.out.println("StringBuffer: " + stringBuffer);
        System.out.println("StringBuilder: " + stringBuilder);
        
        // 6. 性能比较示例
        System.out.println("\n6. 性能比较示例:");
        demonstrateStringConcatenationPerformance();
        
        // 7. 实用的StringBuilder应用
        System.out.println("\n7. 实用的StringBuilder应用:");
        String[] words = {"Java", "Python", "JavaScript", "C++", "Go"};
        String joined = joinStrings(words, ", ");
        System.out.println("连接字符串: " + joined);
        
        String html = buildHtmlTable(new String[][]{{
            {"姓名", "年龄", "城市"},
            {"张三", "25", "北京"},
            {"李四", "30", "上海"}
        });
        System.out.println("HTML表格:\n" + html);
    }
    
    /**
     * 演示字符串转换
     */
    private static void demonstrateStringConversion() {
        System.out.println("\n--- 字符串转换 ---");
        
        // 1. 基本数据类型转字符串
        System.out.println("1. 基本数据类型转字符串:");
        int intValue = 123;
        double doubleValue = 45.67;
        boolean boolValue = true;
        
        String intStr = String.valueOf(intValue);
        String doubleStr = String.valueOf(doubleValue);
        String boolStr = String.valueOf(boolValue);
        
        System.out.println("int转字符串: " + intStr);
        System.out.println("double转字符串: " + doubleStr);
        System.out.println("boolean转字符串: " + boolStr);
        
        // 2. 字符串转基本数据类型
        System.out.println("\n2. 字符串转基本数据类型:");
        String numStr = "456";
        String floatStr = "78.9";
        String booleanStr = "true";
        
        int parsedInt = Integer.parseInt(numStr);
        double parsedDouble = Double.parseDouble(floatStr);
        boolean parsedBoolean = Boolean.parseBoolean(booleanStr);
        
        System.out.println("字符串转int: " + parsedInt);
        System.out.println("字符串转double: " + parsedDouble);
        System.out.println("字符串转boolean: " + parsedBoolean);
        
        // 3. 进制转换
        System.out.println("\n3. 进制转换:");
        int decimal = 255;
        String binary = Integer.toBinaryString(decimal);
        String octal = Integer.toOctalString(decimal);
        String hex = Integer.toHexString(decimal);
        
        System.out.println("十进制 " + decimal + " 转换:");
        System.out.println("二进制: " + binary);
        System.out.println("八进制: " + octal);
        System.out.println("十六进制: " + hex);
        
        // 反向转换
        int fromBinary = Integer.parseInt("11111111", 2);
        int fromOctal = Integer.parseInt("377", 8);
        int fromHex = Integer.parseInt("ff", 16);
        
        System.out.println("\n从其他进制转回十进制:");
        System.out.println("二进制11111111: " + fromBinary);
        System.out.println("八进制377: " + fromOctal);
        System.out.println("十六进制ff: " + fromHex);
        
        // 4. 字符数组和字符串转换
        System.out.println("\n4. 字符数组和字符串转换:");
        String str = "Hello";
        char[] charArray = str.toCharArray();
        System.out.println("字符串转字符数组: " + Arrays.toString(charArray));
        
        String backToString = new String(charArray);
        System.out.println("字符数组转字符串: " + backToString);
        
        // 5. 字节数组和字符串转换
        System.out.println("\n5. 字节数组和字符串转换:");
        String text = "Hello 世界";
        byte[] bytes = text.getBytes();
        System.out.println("字符串转字节数组: " + Arrays.toString(bytes));
        
        String backFromBytes = new String(bytes);
        System.out.println("字节数组转字符串: " + backFromBytes);
        
        // 6. 异常处理
        System.out.println("\n6. 字符串转换异常处理:");
        String invalidNumber = "abc123";
        try {
            int result = Integer.parseInt(invalidNumber);
            System.out.println("转换成功: " + result);
        } catch (NumberFormatException e) {
            System.out.println("转换失败: " + e.getMessage());
        }
        
        // 安全转换方法
        Integer safeResult = safeParseInt(invalidNumber);
        System.out.println("安全转换结果: " + safeResult);
    }
    
    /**
     * 演示正则表达式
     */
    private static void demonstrateRegularExpressions() {
        System.out.println("\n--- 正则表达式 ---");
        
        // 1. 基本匹配
        System.out.println("1. 基本匹配:");
        String text = "Java is great!";
        boolean matches = text.matches(".*Java.*");
        System.out.println("'" + text + "' 包含Java: " + matches);
        
        // 2. 邮箱验证
        System.out.println("\n2. 邮箱验证:");
        String emailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        String[] emails = {"user@example.com", "invalid.email", "test@domain.co.uk"};
        
        for (String email : emails) {
            boolean isValid = email.matches(emailPattern);
            System.out.println(email + " 是否有效: " + isValid);
        }
        
        // 3. 电话号码验证
        System.out.println("\n3. 电话号码验证:");
        String phonePattern = "^\\d{3}-\\d{3}-\\d{4}$";
        String[] phones = {"123-456-7890", "1234567890", "123-45-6789"};
        
        for (String phone : phones) {
            boolean isValid = phone.matches(phonePattern);
            System.out.println(phone + " 是否有效: " + isValid);
        }
        
        // 4. Pattern和Matcher使用
        System.out.println("\n4. Pattern和Matcher使用:");
        String content = "联系电话: 138-1234-5678, 办公电话: 010-8765-4321";
        Pattern pattern = Pattern.compile("\\d{3}-\\d{4}-\\d{4}");
        Matcher matcher = pattern.matcher(content);
        
        System.out.println("原文本: " + content);
        System.out.println("找到的电话号码:");
        while (matcher.find()) {
            System.out.println("- " + matcher.group());
        }
        
        // 5. 分组捕获
        System.out.println("\n5. 分组捕获:");
        String dateText = "今天是2023-12-25，明天是2023-12-26";
        Pattern datePattern = Pattern.compile("(\\d{4})-(\\d{2})-(\\d{2})");
        Matcher dateMatcher = datePattern.matcher(dateText);
        
        System.out.println("原文本: " + dateText);
        System.out.println("解析日期:");
        while (dateMatcher.find()) {
            String fullDate = dateMatcher.group(0);
            String year = dateMatcher.group(1);
            String month = dateMatcher.group(2);
            String day = dateMatcher.group(3);
            System.out.println("完整日期: " + fullDate + ", 年: " + year + ", 月: " + month + ", 日: " + day);
        }
        
        // 6. 替换操作
        System.out.println("\n6. 替换操作:");
        String sensitiveText = "我的手机号是138-1234-5678，请联系我";
        String maskedText = sensitiveText.replaceAll("\\d{3}-\\d{4}-\\d{4}", "***-****-****");
        System.out.println("原文本: " + sensitiveText);
        System.out.println("脱敏后: " + maskedText);
        
        // 7. 常用正则表达式
        System.out.println("\n7. 常用正则表达式验证:");
        testRegexPatterns();
    }
    
    /**
     * 演示字符串实用方法
     */
    private static void demonstrateStringUtilities() {
        System.out.println("\n--- 字符串实用方法 ---");
        
        // 1. 字符串连接
        System.out.println("1. 字符串连接:");
        String[] parts = {"Java", "Python", "JavaScript"};
        
        // 使用String.join()
        String joined1 = String.join(", ", parts);
        System.out.println("String.join(): " + joined1);
        
        // 使用StringJoiner
        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        for (String part : parts) {
            joiner.add(part);
        }
        System.out.println("StringJoiner: " + joiner.toString());
        
        // 2. 字符串验证
        System.out.println("\n2. 字符串验证:");
        String[] testStrings = {"", "   ", "Hello", null};
        
        for (String str : testStrings) {
            System.out.println("字符串: '" + str + "'");
            System.out.println("  isEmpty: " + isEmpty(str));
            System.out.println("  isBlank: " + isBlank(str));
            System.out.println("  isNotEmpty: " + isNotEmpty(str));
            System.out.println("  isNotBlank: " + isNotBlank(str));
        }
        
        // 3. 字符串截断
        System.out.println("\n3. 字符串截断:");
        String longText = "这是一个很长的字符串，需要被截断以适应显示";
        System.out.println("原文本: " + longText);
        System.out.println("截断到10字符: " + truncate(longText, 10));
        System.out.println("截断到15字符(带省略号): " + truncateWithEllipsis(longText, 15));
        
        // 4. 字符串填充
        System.out.println("\n4. 字符串填充:");
        String shortText = "Java";
        System.out.println("原文本: '" + shortText + "'");
        System.out.println("左填充到10位: '" + padLeft(shortText, 10, ' ') + "'");
        System.out.println("右填充到10位: '" + padRight(shortText, 10, '*') + "'");
        System.out.println("居中到12位: '" + center(shortText, 12, '-') + "'");
        
        // 5. 字符串反转
        System.out.println("\n5. 字符串反转:");
        String original = "Hello World";
        System.out.println("原字符串: " + original);
        System.out.println("反转: " + reverse(original));
        System.out.println("单词反转: " + reverseWords(original));
        
        // 6. 字符串统计
        System.out.println("\n6. 字符串统计:");
        String sampleText = "Hello World! This is a test.";
        System.out.println("文本: " + sampleText);
        System.out.println("字符数: " + sampleText.length());
        System.out.println("单词数: " + countWords(sampleText));
        System.out.println("字母数: " + countLetters(sampleText));
        System.out.println("数字数: " + countDigits(sampleText));
        System.out.println("空格数: " + countSpaces(sampleText));
    }
    
    /**
     * 演示字符串性能考虑
     */
    private static void demonstrateStringPerformance() {
        System.out.println("\n--- 字符串性能考虑 ---");
        
        System.out.println("1. 字符串连接性能比较:");
        int iterations = 1000;
        
        // String连接（性能最差）
        long startTime = System.currentTimeMillis();
        String result1 = "";
        for (int i = 0; i < iterations; i++) {
            result1 += "a";
        }
        long stringTime = System.currentTimeMillis() - startTime;
        
        // StringBuilder连接（推荐）
        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append("a");
        }
        String result2 = sb.toString();
        long sbTime = System.currentTimeMillis() - startTime;
        
        System.out.println("String连接时间: " + stringTime + "ms");
        System.out.println("StringBuilder连接时间: " + sbTime + "ms");
        System.out.println("StringBuilder比String快: " + (stringTime / (double)sbTime) + "倍");
        
        // 2. 字符串比较性能
        System.out.println("\n2. 字符串比较最佳实践:");
        System.out.println("- 使用equals()而不是==比较内容");
        System.out.println("- 常量字符串放在equals()前面避免NullPointerException");
        System.out.println("- 使用equalsIgnoreCase()进行忽略大小写比较");
        System.out.println("- 使用Objects.equals()处理可能为null的字符串");
        
        // 3. 字符串池
        System.out.println("\n3. 字符串池:");
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = s3.intern();
        
        System.out.println("s1 == s2: " + (s1 == s2)); // true，都在字符串池中
        System.out.println("s1 == s3: " + (s1 == s3)); // false，s3在堆中
        System.out.println("s1 == s4: " + (s1 == s4)); // true，intern()返回池中的引用
    }
    
    /**
     * 演示字符串最佳实践
     */
    private static void demonstrateBestPractices() {
        System.out.println("\n--- 字符串最佳实践 ---");
        
        System.out.println("1. 空值检查:");
        System.out.println("- 总是检查字符串是否为null");
        System.out.println("- 使用isEmpty()检查空字符串");
        System.out.println("- 使用isBlank()检查空白字符串（Java 11+）");
        
        System.out.println("\n2. 字符串比较:");
        System.out.println("- 使用equals()比较内容，不要使用==");
        System.out.println("- 常量放在equals()前面：\"constant\".equals(variable)");
        System.out.println("- 使用Objects.equals()处理null值");
        
        System.out.println("\n3. 字符串构建:");
        System.out.println("- 大量字符串连接使用StringBuilder");
        System.out.println("- 少量连接可以直接使用+操作符");
        System.out.println("- 使用String.join()连接数组或集合");
        
        System.out.println("\n4. 性能优化:");
        System.out.println("- 避免在循环中使用+连接字符串");
        System.out.println("- 预估StringBuilder的容量");
        System.out.println("- 使用intern()谨慎，可能导致内存泄漏");
        
        System.out.println("\n5. 安全性:");
        System.out.println("- 验证用户输入");
        System.out.println("- 使用正则表达式验证格式");
        System.out.println("- 对敏感信息进行脱敏处理");
        
        // 示例：安全的字符串处理
        System.out.println("\n6. 安全字符串处理示例:");
        String userInput = null;
        String safeResult = safeStringOperation(userInput);
        System.out.println("安全处理结果: " + safeResult);
    }
    
    // ========== 工具方法 ==========
    
    /**
     * 获取文件名（不含扩展名）
     */
    private static String getFileNameWithoutExtension(String fileName) {
        if (fileName == null || fileName.isEmpty()) {
            return fileName;
        }
        int lastDotIndex = fileName.lastIndexOf('.');
        return lastDotIndex > 0 ? fileName.substring(0, lastDotIndex) : fileName;
    }
    
    /**
     * 获取文件扩展名
     */
    private static String getFileExtension(String fileName) {
        if (fileName == null || fileName.isEmpty()) {
            return "";
        }
        int lastDotIndex = fileName.lastIndexOf('.');
        return lastDotIndex > 0 ? fileName.substring(lastDotIndex + 1) : "";
    }
    
    /**
     * 清理文本
     */
    private static String cleanText(String text) {
        if (text == null) {
            return null;
        }
        return text.trim().replaceAll("[,!]+", "").replaceAll("\\s+", " ");
    }
    
    /**
     * 标准化字符串
     */
    private static String normalizeString(String input) {
        if (input == null) {
            return null;
        }
        return input.trim().toLowerCase();
    }
    
    /**
     * 格式化表格行
     */
    private static String formatTableRow(String name, int quantity, double price) {
        return String.format("%-15s %5d %8.2f", name, quantity, price);
    }
    
    /**
     * 格式化百分比
     */
    private static String formatPercentage(double value) {
        return String.format("%.2f%%", value * 100);
    }
    
    /**
     * 格式化文件大小
     */
    private static String formatFileSize(long bytes) {
        if (bytes < 1024) return bytes + " B";
        if (bytes < 1024 * 1024) return String.format("%.1f KB", bytes / 1024.0);
        if (bytes < 1024 * 1024 * 1024) return String.format("%.1f MB", bytes / (1024.0 * 1024));
        return String.format("%.1f GB", bytes / (1024.0 * 1024 * 1024));
    }
    
    /**
     * 字符串连接性能演示
     */
    private static void demonstrateStringConcatenationPerformance() {
        int count = 100;
        
        // 使用+操作符（编译器优化为StringBuilder）
        long start = System.nanoTime();
        String result1 = "";
        for (int i = 0; i < count; i++) {
            result1 = result1 + "a"; // 每次都创建新的StringBuilder
        }
        long time1 = System.nanoTime() - start;
        
        // 使用StringBuilder
        start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append("a");
        }
        String result2 = sb.toString();
        long time2 = System.nanoTime() - start;
        
        System.out.println("字符串+操作: " + time1 + " 纳秒");
        System.out.println("StringBuilder: " + time2 + " 纳秒");
        System.out.println("StringBuilder更快: " + (time1 / (double)time2) + " 倍");
    }
    
    /**
     * 连接字符串数组
     */
    private static String joinStrings(String[] strings, String delimiter) {
        if (strings == null || strings.length == 0) {
            return "";
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            if (i > 0) {
                sb.append(delimiter);
            }
            sb.append(strings[i]);
        }
        return sb.toString();
    }
    
    /**
     * 构建HTML表格
     */
    private static String buildHtmlTable(String[][] data) {
        if (data == null || data.length == 0) {
            return "";
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append("<table>\n");
        
        for (int i = 0; i < data.length; i++) {
            sb.append("  <tr>\n");
            String tag = (i == 0) ? "th" : "td";
            
            for (String cell : data[i]) {
                sb.append("    <").append(tag).append(">")
                  .append(cell)
                  .append("</").append(tag).append(">\n");
            }
            sb.append("  </tr>\n");
        }
        
        sb.append("</table>");
        return sb.toString();
    }
    
    /**
     * 安全的整数解析
     */
    private static Integer safeParseInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return null;
        }
    }
    
    /**
     * 测试常用正则表达式
     */
    private static void testRegexPatterns() {
        String[][] testCases = {
            {"邮箱", "user@example.com", "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$"},
            {"手机号", "138-1234-5678", "^1[3-9]\\d-\\d{4}-\\d{4}$"},
            {"身份证", "123456789012345678", "^\\d{17}[\\dXx]$"},
            {"IP地址", "192.168.1.1", "^((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)$"},
            {"URL", "https://www.example.com", "^https?://[\\w.-]+\\.[a-zA-Z]{2,}(/.*)?$"}
        };
        
        for (String[] testCase : testCases) {
            String type = testCase[0];
            String value = testCase[1];
            String pattern = testCase[2];
            boolean matches = value.matches(pattern);
            System.out.println(type + " '" + value + "' 验证: " + matches);
        }
    }
    
    // 字符串验证工具方法
    private static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }
    
    private static boolean isBlank(String str) {
        return str == null || str.trim().length() == 0;
    }
    
    private static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }
    
    private static boolean isNotBlank(String str) {
        return !isBlank(str);
    }
    
    // 字符串操作工具方法
    private static String truncate(String str, int maxLength) {
        if (str == null || str.length() <= maxLength) {
            return str;
        }
        return str.substring(0, maxLength);
    }
    
    private static String truncateWithEllipsis(String str, int maxLength) {
        if (str == null || str.length() <= maxLength) {
            return str;
        }
        return str.substring(0, maxLength - 3) + "...";
    }
    
    private static String padLeft(String str, int length, char padChar) {
        if (str == null) str = "";
        if (str.length() >= length) return str;
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length - str.length(); i++) {
            sb.append(padChar);
        }
        sb.append(str);
        return sb.toString();
    }
    
    private static String padRight(String str, int length, char padChar) {
        if (str == null) str = "";
        if (str.length() >= length) return str;
        
        StringBuilder sb = new StringBuilder(str);
        for (int i = str.length(); i < length; i++) {
            sb.append(padChar);
        }
        return sb.toString();
    }
    
    private static String center(String str, int length, char padChar) {
        if (str == null) str = "";
        if (str.length() >= length) return str;
        
        int padding = length - str.length();
        int leftPadding = padding / 2;
        int rightPadding = padding - leftPadding;
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < leftPadding; i++) {
            sb.append(padChar);
        }
        sb.append(str);
        for (int i = 0; i < rightPadding; i++) {
            sb.append(padChar);
        }
        return sb.toString();
    }
    
    private static String reverse(String str) {
        if (str == null) return null;
        return new StringBuilder(str).reverse().toString();
    }
    
    private static String reverseWords(String str) {
        if (str == null) return null;
        String[] words = str.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            if (i < words.length - 1) sb.append(" ");
            sb.append(words[i]);
        }
        return sb.toString();
    }
    
    // 字符串统计方法
    private static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) return 0;
        return str.trim().split("\\s+").length;
    }
    
    private static int countLetters(String str) {
        if (str == null) return 0;
        int count = 0;
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) count++;
        }
        return count;
    }
    
    private static int countDigits(String str) {
        if (str == null) return 0;
        int count = 0;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) count++;
        }
        return count;
    }
    
    private static int countSpaces(String str) {
        if (str == null) return 0;
        int count = 0;
        for (char c : str.toCharArray()) {
            if (Character.isWhitespace(c)) count++;
        }
        return count;
    }
    
    /**
     * 安全的字符串操作
     */
    private static String safeStringOperation(String input) {
        if (input == null) {
            return "输入为null";
        }
        if (input.isEmpty()) {
            return "输入为空字符串";
        }
        if (input.isBlank()) {
            return "输入为空白字符串";
        }
        return "输入有效: " + input.trim();
    }
}