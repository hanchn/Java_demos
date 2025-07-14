package com.example.javademos.basic;

import java.util.Scanner;
import java.util.Random;

/**
 * Java控制流程示例
 * 演示条件语句、循环语句、跳转语句等控制结构
 * 
 * @author Java学习示例
 * @version 1.0
 */
public class ControlFlowExamples {
    
    public static void main(String[] args) {
        System.out.println("=== Java控制流程示例 ===");
        
        // 1. 条件语句
        demonstrateConditionalStatements();
        
        // 2. 循环语句
        demonstrateLoopStatements();
        
        // 3. 跳转语句
        demonstrateJumpStatements();
        
        // 4. 嵌套控制结构
        demonstrateNestedStructures();
        
        // 5. 实际应用示例
        demonstratePracticalExamples();
    }
    
    /**
     * 演示条件语句
     */
    private static void demonstrateConditionalStatements() {
        System.out.println("\n--- 条件语句 ---");
        
        // 1. if语句
        System.out.println("1. if语句:");
        int score = 85;
        if (score >= 60) {
            System.out.println("分数 " + score + " - 及格");
        }
        
        // 2. if-else语句
        System.out.println("\n2. if-else语句:");
        int age = 17;
        if (age >= 18) {
            System.out.println("年龄 " + age + " - 成年人");
        } else {
            System.out.println("年龄 " + age + " - 未成年人");
        }
        
        // 3. if-else if-else语句
        System.out.println("\n3. if-else if-else语句:");
        int temperature = 25;
        if (temperature < 0) {
            System.out.println("温度 " + temperature + "°C - 冰冻");
        } else if (temperature < 10) {
            System.out.println("温度 " + temperature + "°C - 寒冷");
        } else if (temperature < 25) {
            System.out.println("温度 " + temperature + "°C - 凉爽");
        } else if (temperature < 35) {
            System.out.println("温度 " + temperature + "°C - 温暖");
        } else {
            System.out.println("温度 " + temperature + "°C - 炎热");
        }
        
        // 4. 嵌套if语句
        System.out.println("\n4. 嵌套if语句:");
        boolean isWeekend = true;
        boolean isRaining = false;
        
        if (isWeekend) {
            if (isRaining) {
                System.out.println("周末下雨 - 在家休息");
            } else {
                System.out.println("周末晴天 - 出去游玩");
            }
        } else {
            System.out.println("工作日 - 正常上班");
        }
        
        // 5. switch语句
        System.out.println("\n5. switch语句:");
        int dayOfWeek = 3;
        switch (dayOfWeek) {
            case 1:
                System.out.println("星期一 - 新的开始");
                break;
            case 2:
                System.out.println("星期二 - 继续努力");
                break;
            case 3:
                System.out.println("星期三 - 过半了");
                break;
            case 4:
                System.out.println("星期四 - 快到周末");
                break;
            case 5:
                System.out.println("星期五 - 感谢上帝");
                break;
            case 6:
            case 7:
                System.out.println("周末 - 休息时间");
                break;
            default:
                System.out.println("无效的星期");
        }
        
        // 6. switch表达式（Java 14+）
        System.out.println("\n6. switch表达式（现代Java）:");
        String season = "春天";
        String activity = switch (season) {
            case "春天" -> "踏青赏花";
            case "夏天" -> "游泳避暑";
            case "秋天" -> "登高望远";
            case "冬天" -> "滑雪取暖";
            default -> "未知季节";
        };
        System.out.println(season + " - " + activity);
        
        // 7. 字符串switch
        System.out.println("\n7. 字符串switch:");
        String command = "start";
        switch (command.toLowerCase()) {
            case "start":
                System.out.println("启动程序");
                break;
            case "stop":
                System.out.println("停止程序");
                break;
            case "pause":
                System.out.println("暂停程序");
                break;
            case "reset":
                System.out.println("重置程序");
                break;
            default:
                System.out.println("未知命令: " + command);
        }
        
        // 8. 枚举switch
        System.out.println("\n8. 枚举switch:");
        Priority priority = Priority.HIGH;
        switch (priority) {
            case LOW:
                System.out.println("低优先级任务");
                break;
            case MEDIUM:
                System.out.println("中优先级任务");
                break;
            case HIGH:
                System.out.println("高优先级任务");
                break;
            case URGENT:
                System.out.println("紧急任务");
                break;
        }
    }
    
    /**
     * 演示循环语句
     */
    private static void demonstrateLoopStatements() {
        System.out.println("\n--- 循环语句 ---");
        
        // 1. for循环
        System.out.println("1. for循环:");
        System.out.print("数字1-5: ");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // 2. 增强for循环（for-each）
        System.out.println("\n2. 增强for循环:");
        String[] fruits = {"苹果", "香蕉", "橙子", "葡萄"};
        System.out.print("水果列表: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();
        
        // 3. while循环
        System.out.println("\n3. while循环:");
        int count = 1;
        System.out.print("倒数: ");
        while (count <= 5) {
            System.out.print((6 - count) + " ");
            count++;
        }
        System.out.println("发射!");
        
        // 4. do-while循环
        System.out.println("\n4. do-while循环:");
        int number = 1;
        System.out.print("至少执行一次: ");
        do {
            System.out.print(number + " ");
            number++;
        } while (number <= 3);
        System.out.println();
        
        // 5. 无限循环（需要break跳出）
        System.out.println("\n5. 无限循环示例:");
        int attempts = 0;
        while (true) {
            attempts++;
            System.out.println("尝试第 " + attempts + " 次");
            if (attempts >= 3) {
                System.out.println("达到最大尝试次数，退出循环");
                break;
            }
        }
        
        // 6. 嵌套循环
        System.out.println("\n6. 嵌套循环 - 乘法表:");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.printf("%d×%d=%d\t", i, j, i * j);
            }
            System.out.println();
        }
        
        // 7. 循环中的变量作用域
        System.out.println("\n7. 循环变量作用域:");
        for (int i = 0; i < 3; i++) {
            int loopVariable = i * 10;
            System.out.println("循环内变量: " + loopVariable);
        }
        // System.out.println(i); // 编译错误：i不在作用域内
        
        // 8. 多变量for循环
        System.out.println("\n8. 多变量for循环:");
        for (int i = 0, j = 10; i < 5; i++, j--) {
            System.out.println("i=" + i + ", j=" + j);
        }
    }
    
    /**
     * 演示跳转语句
     */
    private static void demonstrateJumpStatements() {
        System.out.println("\n--- 跳转语句 ---");
        
        // 1. break语句
        System.out.println("1. break语句:");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                System.out.println("遇到6，跳出循环");
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        
        // 2. continue语句
        System.out.println("\n2. continue语句:");
        System.out.print("跳过偶数: ");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // 跳过偶数
            }
            System.out.print(i + " ");
        }
        System.out.println();
        
        // 3. 标签break（跳出多层循环）
        System.out.println("\n3. 标签break:");
        outer: for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    System.out.println("在(2,2)位置跳出外层循环");
                    break outer;
                }
                System.out.println("(" + i + "," + j + ")");
            }
        }
        
        // 4. 标签continue
        System.out.println("\n4. 标签continue:");
        outer: for (int i = 1; i <= 3; i++) {
            System.out.println("外层循环 i=" + i);
            for (int j = 1; j <= 3; j++) {
                if (j == 2) {
                    System.out.println("  跳过内层循环，继续外层");
                    continue outer;
                }
                System.out.println("  内层循环 j=" + j);
            }
        }
        
        // 5. return语句
        System.out.println("\n5. return语句:");
        int result = findFirstEven(new int[]{1, 3, 5, 8, 9, 12});
        System.out.println("第一个偶数: " + result);
        
        // 6. switch中的break
        System.out.println("\n6. switch中的break:");
        demonstrateSwitchBreak(2);
        
        // 7. 异常处理中的跳转
        System.out.println("\n7. 异常处理中的跳转:");
        demonstrateExceptionJump();
    }
    
    /**
     * 演示嵌套控制结构
     */
    private static void demonstrateNestedStructures() {
        System.out.println("\n--- 嵌套控制结构 ---");
        
        // 1. 嵌套if和循环
        System.out.println("1. 嵌套if和循环 - 查找质数:");
        System.out.print("1-20中的质数: ");
        for (int num = 2; num <= 20; num++) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
        
        // 2. 复杂的嵌套结构
        System.out.println("\n2. 复杂嵌套结构 - 成绩统计:");
        int[][] classScores = {
            {85, 92, 78, 96},  // 第1个学生的各科成绩
            {88, 76, 94, 82},  // 第2个学生的各科成绩
            {92, 88, 85, 90}   // 第3个学生的各科成绩
        };
        
        for (int student = 0; student < classScores.length; student++) {
            System.out.println("学生 " + (student + 1) + " 的成绩分析:");
            int total = 0;
            int passCount = 0;
            
            for (int subject = 0; subject < classScores[student].length; subject++) {
                int score = classScores[student][subject];
                total += score;
                
                if (score >= 60) {
                    passCount++;
                    if (score >= 90) {
                        System.out.println("  科目 " + (subject + 1) + ": " + score + " (优秀)");
                    } else if (score >= 80) {
                        System.out.println("  科目 " + (subject + 1) + ": " + score + " (良好)");
                    } else {
                        System.out.println("  科目 " + (subject + 1) + ": " + score + " (及格)");
                    }
                } else {
                    System.out.println("  科目 " + (subject + 1) + ": " + score + " (不及格)");
                }
            }
            
            double average = (double) total / classScores[student].length;
            System.out.printf("  平均分: %.2f, 及格科目: %d/%d\n", 
                            average, passCount, classScores[student].length);
            System.out.println();
        }
    }
    
    /**
     * 演示实际应用示例
     */
    private static void demonstratePracticalExamples() {
        System.out.println("\n--- 实际应用示例 ---");
        
        // 1. 菜单驱动程序
        System.out.println("1. 菜单驱动程序示例:");
        simulateMenuProgram();
        
        // 2. 数据验证
        System.out.println("\n2. 数据验证示例:");
        demonstrateDataValidation();
        
        // 3. 搜索算法
        System.out.println("\n3. 搜索算法示例:");
        demonstrateSearchAlgorithm();
        
        // 4. 排序算法
        System.out.println("\n4. 排序算法示例:");
        demonstrateSortingAlgorithm();
        
        // 5. 游戏逻辑
        System.out.println("\n5. 游戏逻辑示例:");
        demonstrateGameLogic();
    }
    
    // 辅助方法
    
    /**
     * 查找数组中第一个偶数
     */
    private static int findFirstEven(int[] numbers) {
        for (int number : numbers) {
            if (number % 2 == 0) {
                return number; // 找到偶数立即返回
            }
        }
        return -1; // 没找到偶数
    }
    
    /**
     * 演示switch中的break
     */
    private static void demonstrateSwitchBreak(int option) {
        System.out.println("选择选项: " + option);
        switch (option) {
            case 1:
                System.out.println("执行选项1");
                break;
            case 2:
                System.out.println("执行选项2");
                // 故意不写break，演示fall-through
            case 3:
                System.out.println("执行选项3（或从选项2落下）");
                break;
            default:
                System.out.println("默认选项");
        }
    }
    
    /**
     * 演示异常处理中的跳转
     */
    private static void demonstrateExceptionJump() {
        try {
            for (int i = 0; i < 5; i++) {
                if (i == 3) {
                    throw new RuntimeException("模拟异常");
                }
                System.out.println("正常执行: " + i);
            }
        } catch (RuntimeException e) {
            System.out.println("捕获异常，跳转到异常处理: " + e.getMessage());
        } finally {
            System.out.println("finally块总是执行");
        }
    }
    
    /**
     * 模拟菜单驱动程序
     */
    private static void simulateMenuProgram() {
        String[] options = {"查看信息", "添加数据", "删除数据", "退出程序"};
        int choice = 2; // 模拟用户选择
        
        boolean running = true;
        int attempts = 0;
        
        while (running && attempts < 3) { // 限制循环次数以避免无限循环
            System.out.println("\n=== 主菜单 ===");
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ". " + options[i]);
            }
            
            System.out.println("用户选择: " + choice);
            
            switch (choice) {
                case 1:
                    System.out.println("显示系统信息...");
                    break;
                case 2:
                    System.out.println("添加新数据...");
                    break;
                case 3:
                    System.out.println("删除数据...");
                    break;
                case 4:
                    System.out.println("程序退出，再见!");
                    running = false;
                    break;
                default:
                    System.out.println("无效选择，请重新输入");
            }
            
            attempts++;
            choice = 4; // 模拟下次选择退出
        }
    }
    
    /**
     * 演示数据验证
     */
    private static void demonstrateDataValidation() {
        // 模拟用户输入验证
        String[] testEmails = {"user@example.com", "invalid-email", "test@domain.org"};
        
        for (String email : testEmails) {
            System.out.println("验证邮箱: " + email);
            
            // 简单的邮箱验证
            if (email == null || email.trim().isEmpty()) {
                System.out.println("  错误: 邮箱不能为空");
                continue;
            }
            
            if (!email.contains("@")) {
                System.out.println("  错误: 邮箱格式无效（缺少@符号）");
                continue;
            }
            
            String[] parts = email.split("@");
            if (parts.length != 2 || parts[0].isEmpty() || parts[1].isEmpty()) {
                System.out.println("  错误: 邮箱格式无效");
                continue;
            }
            
            if (!parts[1].contains(".")) {
                System.out.println("  错误: 域名格式无效");
                continue;
            }
            
            System.out.println("  验证通过");
        }
    }
    
    /**
     * 演示搜索算法
     */
    private static void demonstrateSearchAlgorithm() {
        int[] numbers = {3, 7, 1, 9, 4, 6, 8, 2, 5};
        int target = 6;
        
        System.out.println("在数组中搜索: " + target);
        System.out.print("数组: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // 线性搜索
        boolean found = false;
        int position = -1;
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                found = true;
                position = i;
                break; // 找到后立即退出
            }
        }
        
        if (found) {
            System.out.println("找到目标值 " + target + " 在位置: " + position);
        } else {
            System.out.println("未找到目标值: " + target);
        }
    }
    
    /**
     * 演示排序算法（冒泡排序）
     */
    private static void demonstrateSortingAlgorithm() {
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.print("排序前: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // 冒泡排序
        int n = numbers.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // 交换元素
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    swapped = true;
                }
            }
            
            // 如果没有交换，说明已经排序完成
            if (!swapped) {
                break;
            }
        }
        
        System.out.print("排序后: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    /**
     * 演示游戏逻辑（简单的猜数字游戏）
     */
    private static void demonstrateGameLogic() {
        Random random = new Random();
        int secretNumber = random.nextInt(10) + 1; // 1-10之间的随机数
        int[] guesses = {3, 7, 5}; // 模拟用户猜测
        int maxAttempts = 3;
        
        System.out.println("猜数字游戏（1-10之间）");
        System.out.println("你有 " + maxAttempts + " 次机会");
        System.out.println("神秘数字是: " + secretNumber + " (仅用于演示)");
        
        boolean gameWon = false;
        
        for (int attempt = 0; attempt < maxAttempts; attempt++) {
            int guess = guesses[attempt];
            System.out.println("\n第 " + (attempt + 1) + " 次猜测: " + guess);
            
            if (guess == secretNumber) {
                System.out.println("恭喜！你猜对了！");
                gameWon = true;
                break;
            } else if (guess < secretNumber) {
                System.out.println("太小了，再试试更大的数字");
            } else {
                System.out.println("太大了，再试试更小的数字");
            }
            
            int remaining = maxAttempts - attempt - 1;
            if (remaining > 0) {
                System.out.println("还有 " + remaining + " 次机会");
            }
        }
        
        if (!gameWon) {
            System.out.println("\n游戏结束！正确答案是: " + secretNumber);
        }
    }
    
    /**
     * 优先级枚举
     */
    enum Priority {
        LOW, MEDIUM, HIGH, URGENT
    }
}