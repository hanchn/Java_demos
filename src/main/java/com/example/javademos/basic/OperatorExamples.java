package com.example.javademos.basic;

/**
 * Java运算符示例
 * 演示算术运算符、关系运算符、逻辑运算符、位运算符、赋值运算符等
 * 
 * @author Java学习示例
 * @version 1.0
 */
public class OperatorExamples {
    
    public static void main(String[] args) {
        System.out.println("=== Java运算符示例 ===");
        
        // 1. 算术运算符
        demonstrateArithmeticOperators();
        
        // 2. 关系运算符
        demonstrateRelationalOperators();
        
        // 3. 逻辑运算符
        demonstrateLogicalOperators();
        
        // 4. 位运算符
        demonstrateBitwiseOperators();
        
        // 5. 赋值运算符
        demonstrateAssignmentOperators();
        
        // 6. 一元运算符
        demonstrateUnaryOperators();
        
        // 7. 三元运算符
        demonstrateTernaryOperator();
        
        // 8. 运算符优先级
        demonstrateOperatorPrecedence();
        
        // 9. 特殊运算符
        demonstrateSpecialOperators();
    }
    
    /**
     * 演示算术运算符
     */
    private static void demonstrateArithmeticOperators() {
        System.out.println("\n--- 算术运算符 ---");
        
        int a = 15, b = 4;
        System.out.println("a = " + a + ", b = " + b);
        
        // 基本算术运算
        System.out.println("加法: a + b = " + (a + b));        // 19
        System.out.println("减法: a - b = " + (a - b));        // 11
        System.out.println("乘法: a * b = " + (a * b));        // 60
        System.out.println("除法: a / b = " + (a / b));        // 3 (整数除法)
        System.out.println("取模: a % b = " + (a % b));        // 3 (余数)
        
        // 浮点数除法
        double x = 15.0, y = 4.0;
        System.out.println("\n浮点数除法:");
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("x / y = " + (x / y));              // 3.75
        
        // 混合运算
        System.out.println("\n混合运算:");
        System.out.println("a / (double)b = " + (a / (double)b)); // 强制转换为浮点除法
        System.out.println("(double)a / b = " + ((double)a / b)); // 强制转换为浮点除法
        
        // 特殊情况
        System.out.println("\n特殊情况:");
        System.out.println("10 / 3 = " + (10 / 3));            // 3 (整数除法截断)
        System.out.println("10.0 / 3 = " + (10.0 / 3));        // 3.333...
        System.out.println("-10 % 3 = " + (-10 % 3));          // -1 (负数取模)
        System.out.println("10 % -3 = " + (10 % -3));          // 1
        
        // 除零异常
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("捕获除零异常: " + e.getMessage());
        }
        
        // 浮点数除零
        System.out.println("浮点数除零: 10.0 / 0.0 = " + (10.0 / 0.0)); // Infinity
        System.out.println("浮点数除零: -10.0 / 0.0 = " + (-10.0 / 0.0)); // -Infinity
        System.out.println("浮点数NaN: 0.0 / 0.0 = " + (0.0 / 0.0));     // NaN
    }
    
    /**
     * 演示关系运算符
     */
    private static void demonstrateRelationalOperators() {
        System.out.println("\n--- 关系运算符 ---");
        
        int a = 10, b = 20, c = 10;
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        
        // 比较运算符
        System.out.println("a == b: " + (a == b));    // false (等于)
        System.out.println("a != b: " + (a != b));    // true  (不等于)
        System.out.println("a > b: " + (a > b));      // false (大于)
        System.out.println("a < b: " + (a < b));      // true  (小于)
        System.out.println("a >= c: " + (a >= c));    // true  (大于等于)
        System.out.println("a <= c: " + (a <= c));    // true  (小于等于)
        
        // 字符比较
        char ch1 = 'A', ch2 = 'B';
        System.out.println("\n字符比较:");
        System.out.println("'A' < 'B': " + (ch1 < ch2));        // true (ASCII码比较)
        System.out.println("'A' == 65: " + (ch1 == 65));        // true (字符与数字比较)
        
        // 浮点数比较注意事项
        double d1 = 0.1 + 0.2;
        double d2 = 0.3;
        System.out.println("\n浮点数比较注意事项:");
        System.out.println("0.1 + 0.2 = " + d1);
        System.out.println("0.3 = " + d2);
        System.out.println("(0.1 + 0.2) == 0.3: " + (d1 == d2)); // 可能为false！
        
        // 正确的浮点数比较
        double epsilon = 1e-10;
        boolean isEqual = Math.abs(d1 - d2) < epsilon;
        System.out.println("正确的浮点数比较: " + isEqual);
        
        // 字符串比较（引用比较 vs 内容比较）
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        
        System.out.println("\n字符串比较:");
        System.out.println("str1 == str2: " + (str1 == str2));           // true (字符串池)
        System.out.println("str1 == str3: " + (str1 == str3));           // false (不同对象)
        System.out.println("str1.equals(str3): " + str1.equals(str3));   // true (内容相同)
    }
    
    /**
     * 演示逻辑运算符
     */
    private static void demonstrateLogicalOperators() {
        System.out.println("\n--- 逻辑运算符 ---");
        
        boolean a = true, b = false, c = true;
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        
        // 基本逻辑运算
        System.out.println("逻辑与 (a && b): " + (a && b));      // false
        System.out.println("逻辑或 (a || b): " + (a || b));      // true
        System.out.println("逻辑非 (!a): " + (!a));             // false
        System.out.println("逻辑非 (!b): " + (!b));             // true
        
        // 复合逻辑运算
        System.out.println("\n复合逻辑运算:");
        System.out.println("(a && b) || c: " + ((a && b) || c));  // true
        System.out.println("a && (b || c): " + (a && (b || c)));  // true
        System.out.println("!(a && b): " + (!(a && b)));          // true
        System.out.println("!a || !b: " + (!a || !b));           // true (德摩根定律)
        
        // 短路求值
        System.out.println("\n短路求值演示:");
        int x = 5, y = 0;
        
        // && 短路：如果左边为false，右边不会执行
        if (y != 0 && x / y > 2) {
            System.out.println("不会执行到这里");
        } else {
            System.out.println("避免了除零错误（短路求值）");
        }
        
        // || 短路：如果左边为true，右边不会执行
        if (x > 0 || x / y > 2) {
            System.out.println("左边条件为true，右边不会执行");
        }
        
        // 非短路逻辑运算符（& 和 |）
        System.out.println("\n非短路逻辑运算符:");
        boolean result1 = (x > 0) & (++y > 0);  // 两边都会执行
        System.out.println("使用 & 后，y = " + y);  // y变为1
        
        y = 0; // 重置
        boolean result2 = (x > 0) && (++y > 0); // 短路，右边不执行
        System.out.println("使用 && 后，y = " + y); // y仍为0
        
        // 逻辑运算的真值表
        System.out.println("\n逻辑运算真值表:");
        printTruthTable();
    }
    
    /**
     * 演示位运算符
     */
    private static void demonstrateBitwiseOperators() {
        System.out.println("\n--- 位运算符 ---");
        
        int a = 12;  // 二进制: 1100
        int b = 10;  // 二进制: 1010
        
        System.out.println("a = " + a + " (二进制: " + Integer.toBinaryString(a) + ")");
        System.out.println("b = " + b + " (二进制: " + Integer.toBinaryString(b) + ")");
        
        // 位运算
        System.out.println("\n位运算结果:");
        int and = a & b;    // 按位与: 1000 = 8
        int or = a | b;     // 按位或: 1110 = 14
        int xor = a ^ b;    // 按位异或: 0110 = 6
        int notA = ~a;      // 按位取反
        
        System.out.println("a & b = " + and + " (二进制: " + Integer.toBinaryString(and) + ")");
        System.out.println("a | b = " + or + " (二进制: " + Integer.toBinaryString(or) + ")");
        System.out.println("a ^ b = " + xor + " (二进制: " + Integer.toBinaryString(xor) + ")");
        System.out.println("~a = " + notA + " (二进制: " + Integer.toBinaryString(notA) + ")");
        
        // 移位运算
        System.out.println("\n移位运算:");
        int leftShift = a << 2;   // 左移2位: 1100 -> 110000 = 48
        int rightShift = a >> 2;  // 右移2位: 1100 -> 11 = 3
        int unsignedRightShift = a >>> 2; // 无符号右移
        
        System.out.println("a << 2 = " + leftShift + " (左移2位)");
        System.out.println("a >> 2 = " + rightShift + " (右移2位)");
        System.out.println("a >>> 2 = " + unsignedRightShift + " (无符号右移2位)");
        
        // 负数的移位运算
        int negative = -12;
        System.out.println("\n负数移位运算:");
        System.out.println("负数 " + negative + " 的二进制: " + Integer.toBinaryString(negative));
        System.out.println(negative + " >> 2 = " + (negative >> 2));
        System.out.println(negative + " >>> 2 = " + (negative >>> 2));
        
        // 位运算的实际应用
        System.out.println("\n位运算的实际应用:");
        
        // 1. 判断奇偶性
        int num = 15;
        boolean isOdd = (num & 1) == 1;
        System.out.println(num + " 是奇数: " + isOdd);
        
        // 2. 快速乘除2的幂
        System.out.println(num + " * 4 = " + (num << 2));  // 乘以4
        System.out.println(num + " / 4 = " + (num >> 2));  // 除以4
        
        // 3. 交换两个数（不使用临时变量）
        int x = 5, y = 8;
        System.out.println("交换前: x=" + x + ", y=" + y);
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("交换后: x=" + x + ", y=" + y);
        
        // 4. 设置、清除、切换特定位
        int flags = 0;
        flags |= (1 << 2);  // 设置第2位
        System.out.println("设置第2位后: " + Integer.toBinaryString(flags));
        flags &= ~(1 << 2); // 清除第2位
        System.out.println("清除第2位后: " + Integer.toBinaryString(flags));
        flags ^= (1 << 1);  // 切换第1位
        System.out.println("切换第1位后: " + Integer.toBinaryString(flags));
    }
    
    /**
     * 演示赋值运算符
     */
    private static void demonstrateAssignmentOperators() {
        System.out.println("\n--- 赋值运算符 ---");
        
        int a = 10;
        System.out.println("初始值 a = " + a);
        
        // 复合赋值运算符
        a += 5;   // a = a + 5
        System.out.println("a += 5: " + a);   // 15
        
        a -= 3;   // a = a - 3
        System.out.println("a -= 3: " + a);   // 12
        
        a *= 2;   // a = a * 2
        System.out.println("a *= 2: " + a);   // 24
        
        a /= 4;   // a = a / 4
        System.out.println("a /= 4: " + a);   // 6
        
        a %= 4;   // a = a % 4
        System.out.println("a %= 4: " + a);   // 2
        
        // 位运算赋值
        int b = 12;  // 1100
        System.out.println("\n位运算赋值 (b = " + b + "):");
        
        b &= 10;  // b = b & 10
        System.out.println("b &= 10: " + b);  // 8
        
        b |= 5;   // b = b | 5
        System.out.println("b |= 5: " + b);   // 13
        
        b ^= 3;   // b = b ^ 3
        System.out.println("b ^= 3: " + b);   // 14
        
        b <<= 1;  // b = b << 1
        System.out.println("b <<= 1: " + b);  // 28
        
        b >>= 2;  // b = b >> 2
        System.out.println("b >>= 2: " + b);  // 7
        
        // 字符串赋值
        String str = "Hello";
        str += " World";  // 字符串连接
        System.out.println("\n字符串赋值: " + str);
        
        // 多重赋值
        int x, y, z;
        x = y = z = 100;  // 从右到左赋值
        System.out.println("\n多重赋值: x=" + x + ", y=" + y + ", z=" + z);
    }
    
    /**
     * 演示一元运算符
     */
    private static void demonstrateUnaryOperators() {
        System.out.println("\n--- 一元运算符 ---");
        
        int a = 5;
        System.out.println("初始值 a = " + a);
        
        // 前缀递增/递减
        System.out.println("\n前缀运算符:");
        System.out.println("++a = " + (++a));  // 先递增，再使用，a变为6
        System.out.println("a = " + a);        // 6
        System.out.println("--a = " + (--a));  // 先递减，再使用，a变为5
        System.out.println("a = " + a);        // 5
        
        // 后缀递增/递减
        System.out.println("\n后缀运算符:");
        System.out.println("a++ = " + (a++));  // 先使用，再递增，返回5，a变为6
        System.out.println("a = " + a);        // 6
        System.out.println("a-- = " + (a--));  // 先使用，再递减，返回6，a变为5
        System.out.println("a = " + a);        // 5
        
        // 正负号运算符
        System.out.println("\n正负号运算符:");
        int b = 10;
        System.out.println("+b = " + (+b));    // 10 (一元正号)
        System.out.println("-b = " + (-b));    // -10 (一元负号)
        System.out.println("b = " + b);        // 10 (原值不变)
        
        // 逻辑非运算符
        boolean flag = true;
        System.out.println("\n逻辑非运算符:");
        System.out.println("flag = " + flag);
        System.out.println("!flag = " + (!flag));
        
        // 位取反运算符
        int c = 5;  // 二进制: 101
        System.out.println("\n位取反运算符:");
        System.out.println("c = " + c + " (二进制: " + Integer.toBinaryString(c) + ")");
        System.out.println("~c = " + (~c) + " (二进制: " + Integer.toBinaryString(~c) + ")");
        
        // 复杂表达式中的递增递减
        System.out.println("\n复杂表达式中的递增递减:");
        int x = 5, y = 5;
        int result1 = x++ + ++x;  // 5 + 7 = 12, x最终为7
        int result2 = ++y + y++;  // 6 + 6 = 12, y最终为7
        
        System.out.println("x++ + ++x = " + result1 + ", x = " + x);
        System.out.println("++y + y++ = " + result2 + ", y = " + y);
    }
    
    /**
     * 演示三元运算符
     */
    private static void demonstrateTernaryOperator() {
        System.out.println("\n--- 三元运算符 ---");
        
        int a = 10, b = 20;
        
        // 基本三元运算符
        int max = (a > b) ? a : b;
        System.out.println("max(" + a + ", " + b + ") = " + max);
        
        // 三元运算符替代if-else
        String result = (a % 2 == 0) ? "偶数" : "奇数";
        System.out.println(a + " 是 " + result);
        
        // 嵌套三元运算符
        int score = 85;
        String grade = (score >= 90) ? "A" : 
                      (score >= 80) ? "B" : 
                      (score >= 70) ? "C" : 
                      (score >= 60) ? "D" : "F";
        System.out.println("分数 " + score + " 对应等级: " + grade);
        
        // 三元运算符的类型
        System.out.println("\n三元运算符的类型推断:");
        Object obj1 = true ? "字符串" : 42;        // 结果类型为Object
        String obj2 = true ? "字符串" : "数字";     // 结果类型为String
        Number obj3 = true ? 3.14 : 42;          // 结果类型为Number
        
        System.out.println("obj1: " + obj1 + " (类型: " + obj1.getClass().getSimpleName() + ")");
        System.out.println("obj2: " + obj2 + " (类型: " + obj2.getClass().getSimpleName() + ")");
        System.out.println("obj3: " + obj3 + " (类型: " + obj3.getClass().getSimpleName() + ")");
        
        // 三元运算符与方法调用
        int x = 5;
        String message = (x > 0) ? getPositiveMessage() : getNegativeMessage();
        System.out.println("\n条件方法调用: " + message);
        
        // 三元运算符的注意事项
        System.out.println("\n注意事项 - 避免过度复杂的嵌套:");
        // 不推荐：过度复杂的嵌套
        // String complex = (a > b) ? ((a > 0) ? "positive max" : "negative max") : ((b > 0) ? "positive min" : "negative min");
        
        // 推荐：使用if-else或提取方法
        String simple = getComparisonResult(a, b);
        System.out.println("简化后的结果: " + simple);
    }
    
    /**
     * 演示运算符优先级
     */
    private static void demonstrateOperatorPrecedence() {
        System.out.println("\n--- 运算符优先级 ---");
        
        // 算术运算符优先级
        int result1 = 2 + 3 * 4;        // 14, 不是20
        int result2 = (2 + 3) * 4;      // 20
        System.out.println("2 + 3 * 4 = " + result1);
        System.out.println("(2 + 3) * 4 = " + result2);
        
        // 关系和逻辑运算符优先级
        boolean result3 = 5 > 3 && 2 < 4;   // true
        boolean result4 = 5 > 3 || 2 > 4;   // true
        System.out.println("5 > 3 && 2 < 4 = " + result3);
        System.out.println("5 > 3 || 2 > 4 = " + result4);
        
        // 位运算符优先级
        int a = 5, b = 3;
        int result5 = a & b + 1;    // a & (b + 1) = 5 & 4 = 4
        int result6 = (a & b) + 1;  // (5 & 3) + 1 = 1 + 1 = 2
        System.out.println("a & b + 1 = " + result5);
        System.out.println("(a & b) + 1 = " + result6);
        
        // 赋值运算符优先级最低
        int x = 5;
        int y = x += 3;  // x = x + 3, 然后y = x
        System.out.println("x = " + x + ", y = " + y);
        
        // 复杂表达式
        System.out.println("\n复杂表达式示例:");
        int complex = 2 + 3 * 4 > 10 && 5 < 8 ? 100 : 200;
        System.out.println("2 + 3 * 4 > 10 && 5 < 8 ? 100 : 200 = " + complex);
        
        // 运算符优先级表（从高到低）
        System.out.println("\n运算符优先级（从高到低）:");
        System.out.println("1. 后缀: expr++, expr--");
        System.out.println("2. 一元: ++expr, --expr, +expr, -expr, ~, !");
        System.out.println("3. 乘除: *, /, %");
        System.out.println("4. 加减: +, -");
        System.out.println("5. 移位: <<, >>, >>>");
        System.out.println("6. 关系: <, >, <=, >=, instanceof");
        System.out.println("7. 相等: ==, !=");
        System.out.println("8. 位与: &");
        System.out.println("9. 位异或: ^");
        System.out.println("10. 位或: |");
        System.out.println("11. 逻辑与: &&");
        System.out.println("12. 逻辑或: ||");
        System.out.println("13. 三元: ?:");
        System.out.println("14. 赋值: =, +=, -=, *=, /=, %=, &=, ^=, |=, <<=, >>=, >>>=");
    }
    
    /**
     * 演示特殊运算符
     */
    private static void demonstrateSpecialOperators() {
        System.out.println("\n--- 特殊运算符 ---");
        
        // instanceof 运算符
        String str = "Hello";
        Object obj = str;
        
        System.out.println("instanceof 运算符:");
        System.out.println("str instanceof String: " + (str instanceof String));
        System.out.println("str instanceof Object: " + (str instanceof Object));
        System.out.println("obj instanceof String: " + (obj instanceof String));
        
        // 类型转换运算符
        System.out.println("\n类型转换运算符:");
        double d = 3.14159;
        int i = (int) d;  // 强制类型转换
        System.out.println("(int) " + d + " = " + i);
        
        // 数组访问运算符
        int[] array = {10, 20, 30};
        System.out.println("\n数组访问运算符:");
        System.out.println("array[1] = " + array[1]);
        
        // 方法调用运算符
        System.out.println("\n方法调用运算符:");
        String result = "hello".toUpperCase();  // . 运算符
        System.out.println("\"hello\".toUpperCase() = " + result);
        
        // new 运算符
        System.out.println("\nnew 运算符:");
        String newStr = new String("创建新对象");
        System.out.println("new String(\"创建新对象\") = " + newStr);
    }
    
    // 辅助方法
    
    /**
     * 打印逻辑运算真值表
     */
    private static void printTruthTable() {
        System.out.println("A\tB\tA&&B\tA||B\t!A");
        System.out.println("true\ttrue\t" + (true && true) + "\t" + (true || true) + "\t" + (!true));
        System.out.println("true\tfalse\t" + (true && false) + "\t" + (true || false) + "\t" + (!true));
        System.out.println("false\ttrue\t" + (false && true) + "\t" + (false || true) + "\t" + (!false));
        System.out.println("false\tfalse\t" + (false && false) + "\t" + (false || false) + "\t" + (!false));
    }
    
    /**
     * 获取正数消息
     */
    private static String getPositiveMessage() {
        return "数字是正数";
    }
    
    /**
     * 获取负数消息
     */
    private static String getNegativeMessage() {
        return "数字不是正数";
    }
    
    /**
     * 获取比较结果
     */
    private static String getComparisonResult(int a, int b) {
        if (a > b) {
            return a > 0 ? "正数较大" : "负数较大";
        } else {
            return b > 0 ? "正数较小" : "负数较小";
        }
    }
}