package com.example.javademos.oop;

/**
 * OOP示例运行器
 * 用于运行所有面向对象编程相关的示例
 * 
 * 运行方式：
 * 1. 使用Maven: mvn exec:java -Dexec.mainClass="com.example.javademos.oop.OOPExamplesRunner" -Dexec.args="1"
 * 2. 直接编译运行: javac *.java && java OOPExamplesRunner 1
 * 3. 在IDE中运行: 右键点击此文件选择Run
 * 
 * 参数说明：
 * 1 - 类和对象示例
 * 2 - 封装示例
 * 3 - 继承示例
 * 4 - 多态示例
 * 5 - 运行所有示例（默认）
 */
public class OOPExamplesRunner {
    
    public static void main(String[] args) {
        System.out.println("=== Java面向对象编程示例 ===");
        System.out.println();
        
        int choice = 5; // 默认运行所有示例
        
        if (args.length > 0) {
            try {
                choice = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("无效的参数，将运行所有示例");
                choice = 5;
            }
        }
        
        switch (choice) {
            case 1:
                runClassAndObjectDemo();
                break;
            case 2:
                runEncapsulationDemo();
                break;
            case 3:
                runInheritanceDemo();
                break;
            case 4:
                runPolymorphismDemo();
                break;
            case 5:
            default:
                runAllExamples();
                break;
        }
        
        System.out.println();
        System.out.println("=== 示例运行完成 ===");
    }
    
    private static void runClassAndObjectDemo() {
        System.out.println("\n>>> 运行类和对象示例 <<<");
        System.out.println("=".repeat(50));
        ClassAndObjectDemo.main(new String[]{});
    }
    
    private static void runEncapsulationDemo() {
        System.out.println("\n>>> 运行封装示例 <<<");
        System.out.println("=".repeat(50));
        EncapsulationDemo.main(new String[]{});
    }
    
    private static void runInheritanceDemo() {
        System.out.println("\n>>> 运行继承示例 <<<");
        System.out.println("=".repeat(50));
        InheritanceDemo.main(new String[]{});
    }
    
    private static void runPolymorphismDemo() {
        System.out.println("\n>>> 运行多态示例 <<<");
        System.out.println("=".repeat(50));
        PolymorphismDemo.main(new String[]{});
    }
    
    private static void runAllExamples() {
        System.out.println("运行所有面向对象编程示例...");
        
        runClassAndObjectDemo();
        runEncapsulationDemo();
        runInheritanceDemo();
        runPolymorphismDemo();
        
        System.out.println();
        System.out.println("提示：");
        System.out.println("- 可以使用参数 1-4 来运行特定示例");
        System.out.println("- 例如：java OOPExamplesRunner 1 (运行类和对象示例)");
        System.out.println("- 建议按顺序学习：类和对象 -> 封装 -> 继承 -> 多态");
    }
}