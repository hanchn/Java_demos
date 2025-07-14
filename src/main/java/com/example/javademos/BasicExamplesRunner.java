package com.example.javademos;

import com.example.javademos.basic.*;

/**
 * 基础示例运行器
 * 用于运行所有基本数据类型和语法示例
 * 
 * @author Java学习示例
 * @version 1.0
 */
public class BasicExamplesRunner {
    
    public static void main(String[] args) {
        System.out.println("=== Java基础示例运行器 ===");
        System.out.println("选择要运行的示例:");
        System.out.println("1. 基本数据类型 (BasicDataTypes)");
        System.out.println("2. 变量声明 (VariableDeclaration)");
        System.out.println("3. 数组操作 (ArrayOperations)");
        System.out.println("4. 操作符示例 (OperatorExamples)");
        System.out.println("5. 控制流 (ControlFlowExamples)");
        System.out.println("6. 方法示例 (MethodExamples)");
        System.out.println("7. 字符串操作 (StringOperations)");
        System.out.println("8. 运行所有示例");
        System.out.println();
        
        // 如果没有命令行参数，默认运行所有示例
        if (args.length == 0) {
            System.out.println("没有指定参数，运行所有示例...");
            runAllExamples();
        } else {
            String choice = args[0];
            runSpecificExample(choice);
        }
    }
    
    /**
     * 运行所有示例
     */
    private static void runAllExamples() {
        System.out.println("\n🚀 开始运行所有基础示例...\n");
        
        try {
            System.out.println("\n" + "=".repeat(50));
            System.out.println("运行示例 1: 基本数据类型");
            System.out.println("=".repeat(50));
            BasicDataTypes.main(new String[]{});
            
            System.out.println("\n" + "=".repeat(50));
            System.out.println("运行示例 2: 变量声明");
            System.out.println("=".repeat(50));
            VariableDeclaration.main(new String[]{});
            
            System.out.println("\n" + "=".repeat(50));
            System.out.println("运行示例 3: 数组操作");
            System.out.println("=".repeat(50));
            ArrayOperations.main(new String[]{});
            
            System.out.println("\n" + "=".repeat(50));
            System.out.println("运行示例 4: 操作符示例");
            System.out.println("=".repeat(50));
            OperatorExamples.main(new String[]{});
            
            System.out.println("\n" + "=".repeat(50));
            System.out.println("运行示例 5: 控制流");
            System.out.println("=".repeat(50));
            ControlFlowExamples.main(new String[]{});
            
            System.out.println("\n" + "=".repeat(50));
            System.out.println("运行示例 6: 方法示例");
            System.out.println("=".repeat(50));
            MethodExamples.main(new String[]{});
            
            System.out.println("\n" + "=".repeat(50));
            System.out.println("运行示例 7: 字符串操作");
            System.out.println("=".repeat(50));
            StringOperations.main(new String[]{});
            
            System.out.println("\n" + "=".repeat(50));
            System.out.println("✅ 所有示例运行完成!");
            System.out.println("=".repeat(50));
            
        } catch (Exception e) {
            System.err.println("❌ 运行示例时出错: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    /**
     * 运行指定的示例
     */
    private static void runSpecificExample(String choice) {
        System.out.println("\n🎯 运行指定示例: " + choice + "\n");
        
        try {
            switch (choice) {
                case "1":
                    System.out.println("运行: 基本数据类型示例");
                    BasicDataTypes.main(new String[]{});
                    break;
                case "2":
                    System.out.println("运行: 变量声明示例");
                    VariableDeclaration.main(new String[]{});
                    break;
                case "3":
                    System.out.println("运行: 数组操作示例");
                    ArrayOperations.main(new String[]{});
                    break;
                case "4":
                    System.out.println("运行: 操作符示例");
                    OperatorExamples.main(new String[]{});
                    break;
                case "5":
                    System.out.println("运行: 控制流示例");
                    ControlFlowExamples.main(new String[]{});
                    break;
                case "6":
                    System.out.println("运行: 方法示例");
                    MethodExamples.main(new String[]{});
                    break;
                case "7":
                    System.out.println("运行: 字符串操作示例");
                    StringOperations.main(new String[]{});
                    break;
                case "8":
                    runAllExamples();
                    break;
                default:
                    System.out.println("❌ 无效的选择: " + choice);
                    System.out.println("请使用 1-8 之间的数字");
                    printUsage();
            }
        } catch (Exception e) {
            System.err.println("❌ 运行示例时出错: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    /**
     * 打印使用说明
     */
    private static void printUsage() {
        System.out.println("\n📖 使用说明:");
        System.out.println("java BasicExamplesRunner [选项]");
        System.out.println();
        System.out.println("选项:");
        System.out.println("  1    运行基本数据类型示例");
        System.out.println("  2    运行变量声明示例");
        System.out.println("  3    运行数组操作示例");
        System.out.println("  4    运行操作符示例");
        System.out.println("  5    运行控制流示例");
        System.out.println("  6    运行方法示例");
        System.out.println("  7    运行字符串操作示例");
        System.out.println("  8    运行所有示例");
        System.out.println();
        System.out.println("示例:");
        System.out.println("  java BasicExamplesRunner 1    # 只运行基本数据类型示例");
        System.out.println("  java BasicExamplesRunner 8    # 运行所有示例");
        System.out.println("  java BasicExamplesRunner       # 默认运行所有示例");
    }
}