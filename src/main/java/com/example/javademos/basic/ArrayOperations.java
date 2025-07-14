package com.example.javademos.basic;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Java数组操作示例
 * 演示一维数组、多维数组的声明、初始化、访问和常用操作
 * 
 * @author Java学习示例
 * @version 1.0
 */
public class ArrayOperations {

    public static void main(String[] args) {
        System.out.println("=== Java数组操作示例 ===");

        // 1. 一维数组基础操作
        demonstrateBasicArrayOperations();

        // 2. 数组初始化方式
        demonstrateArrayInitialization();

        // 3. 数组遍历方法
        demonstrateArrayTraversal();

        // 4. 数组常用操作
        demonstrateArrayUtilities();

        // 5. 多维数组
        demonstrateMultiDimensionalArrays();

        // 6. 数组作为方法参数和返回值
        demonstrateArrayAsParameters();

        // 7. 数组的注意事项
        demonstrateArrayCaveats();
    }

    /**
     * 演示一维数组基础操作
     */
    private static void demonstrateBasicArrayOperations() {
        System.out.println("\n--- 一维数组基础操作 ---");

        // 1. 数组声明和创建
        int[] numbers = new int[5]; // 创建长度为5的整数数组
        System.out.println("创建数组，长度: " + numbers.length);

        // 2. 数组元素赋值
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // 3. 数组元素访问
        System.out.println("数组元素访问:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        // 4. 修改数组元素
        numbers[2] = 35;
        System.out.println("修改后 numbers[2] = " + numbers[2]);

        // 5. 数组长度
        System.out.println("数组长度: " + numbers.length);

        // 6. 数组边界
        System.out.println("第一个元素: " + numbers[0]);
        System.out.println("最后一个元素: " + numbers[numbers.length - 1]);

        // 注意：数组越界会抛出异常
        try {
            System.out.println(numbers[10]); // 越界访问
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("捕获数组越界异常: " + e.getMessage());
        }
    }

    /**
     * 演示数组初始化方式
     */
    private static void demonstrateArrayInitialization() {
        System.out.println("\n--- 数组初始化方式 ---");

        // 1. 声明后创建
        int[] array1;
        array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        System.out.println("方式1 - 声明后创建: " + Arrays.toString(array1));

        // 2. 声明时创建
        int[] array2 = new int[3];
        System.out.println("方式2 - 声明时创建(默认值): " + Arrays.toString(array2));

        // 3. 声明时初始化（完整形式）
        int[] array3 = new int[] { 10, 20, 30, 40 };
        System.out.println("方式3 - 声明时初始化(完整): " + Arrays.toString(array3));

        // 4. 声明时初始化（简化形式）
        int[] array4 = { 100, 200, 300, 400, 500 };
        System.out.println("方式4 - 声明时初始化(简化): " + Arrays.toString(array4));

        // 5. 不同数据类型的数组初始化
        String[] names = { "Alice", "Bob", "Charlie", "Diana" };
        double[] prices = { 9.99, 19.99, 29.99, 39.99 };
        boolean[] flags = { true, false, true, false };
        char[] letters = { 'A', 'B', 'C', 'D' };

        System.out.println("字符串数组: " + Arrays.toString(names));
        System.out.println("双精度数组: " + Arrays.toString(prices));
        System.out.println("布尔数组: " + Arrays.toString(flags));
        System.out.println("字符数组: " + Arrays.toString(letters));

        // 6. 匿名数组
        printArray(new int[] { 1, 2, 3, 4, 5 }); // 直接传递匿名数组
    }

    /**
     * 演示数组遍历方法
     */
    private static void demonstrateArrayTraversal() {
        System.out.println("\n--- 数组遍历方法 ---");

        int[] numbers = { 10, 20, 30, 40, 50 };

        // 1. 传统for循环
        System.out.println("1. 传统for循环:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // 2. 增强for循环（for-each）
        System.out.println("2. 增强for循环:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // 3. while循环
        System.out.println("3. while循环:");
        int i = 0;
        while (i < numbers.length) {
            System.out.print(numbers[i] + " ");
            i++;
        }
        System.out.println();

        // 4. 反向遍历
        System.out.println("4. 反向遍历:");
        for (int j = numbers.length - 1; j >= 0; j--) {
            System.out.print(numbers[j] + " ");
        }
        System.out.println();

        // 5. 带索引的遍历
        System.out.println("5. 带索引的遍历:");
        for (int k = 0; k < numbers.length; k++) {
            System.out.println("索引 " + k + ": " + numbers[k]);
        }
    }

    /**
     * 演示数组常用操作
     */
    private static void demonstrateArrayUtilities() {
        System.out.println("\n--- 数组常用操作 ---");

        int[] original = { 5, 2, 8, 1, 9, 3 };
        System.out.println("原始数组: " + Arrays.toString(original));

        // 1. 数组复制
        int[] copied = Arrays.copyOf(original, original.length);
        System.out.println("复制数组: " + Arrays.toString(copied));

        // 2. 部分复制
        int[] partialCopy = Arrays.copyOfRange(original, 1, 4); // 复制索引1到3
        System.out.println("部分复制(索引1-3): " + Arrays.toString(partialCopy));

        // 3. 数组排序
        int[] toSort = Arrays.copyOf(original, original.length);
        Arrays.sort(toSort);
        System.out.println("排序后: " + Arrays.toString(toSort));

        // 4. 数组搜索（二分查找，需要先排序）
        int searchValue = 8;
        int index = Arrays.binarySearch(toSort, searchValue);
        System.out.println("查找值 " + searchValue + " 的索引: " + index);

        // 5. 数组填充
        int[] fillArray = new int[5];
        Arrays.fill(fillArray, 99);
        System.out.println("填充数组: " + Arrays.toString(fillArray));

        // 6. 数组比较
        int[] array1 = { 1, 2, 3 };
        int[] array2 = { 1, 2, 3 };
        int[] array3 = { 1, 2, 4 };

        System.out.println("array1 equals array2: " + Arrays.equals(array1, array2));
        System.out.println("array1 equals array3: " + Arrays.equals(array1, array3));

        // 7. 查找最大值和最小值
        int[] values = { 15, 3, 9, 1, 12, 7 };
        int max = findMax(values);
        int min = findMin(values);
        System.out.println("数组 " + Arrays.toString(values) + " 的最大值: " + max + ", 最小值: " + min);

        // 8. 计算数组和与平均值
        int sum = calculateSum(values);
        double average = calculateAverage(values);
        System.out.println("数组和: " + sum + ", 平均值: " + average);
    }

    /**
     * 演示多维数组
     */
    private static void demonstrateMultiDimensionalArrays() {
        System.out.println("\n--- 多维数组 ---");

        // 1. 二维数组声明和初始化
        int[][] matrix1 = new int[3][4]; // 3行4列
        System.out.println("二维数组维度: " + matrix1.length + "x" + matrix1[0].length);

        // 2. 二维数组初始化
        int[][] matrix2 = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };

        System.out.println("二维数组内容:");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.printf("%3d ", matrix2[i][j]);
            }
            System.out.println();
        }

        // 3. 使用增强for循环遍历二维数组
        System.out.println("使用增强for循环:");
        for (int[] row : matrix2) {
            for (int value : row) {
                System.out.printf("%3d ", value);
            }
            System.out.println();
        }

        // 4. 不规则数组（锯齿数组）
        int[][] jaggedArray = {
                { 1, 2 },
                { 3, 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println("不规则数组:");
        for (int i = 0; i < jaggedArray.length; i++) {
            System.out.println("第" + i + "行: " + Arrays.toString(jaggedArray[i]));
        }

        // 5. 三维数组
        int[][][] cube = new int[2][3][4]; // 2x3x4的三维数组
        System.out.println("三维数组维度: " + cube.length + "x" + cube[0].length + "x" + cube[0][0].length);

        // 初始化三维数组
        int value = 1;
        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube[i].length; j++) {
                for (int k = 0; k < cube[i][j].length; k++) {
                    cube[i][j][k] = value++;
                }
            }
        }

        System.out.println("三维数组内容:");
        for (int i = 0; i < cube.length; i++) {
            System.out.println("层 " + i + ":");
            for (int j = 0; j < cube[i].length; j++) {
                System.out.println("  " + Arrays.toString(cube[i][j]));
            }
        }
    }

    /**
     * 演示数组作为方法参数和返回值
     */
    private static void demonstrateArrayAsParameters() {
        System.out.println("\n--- 数组作为方法参数和返回值 ---");

        int[] numbers = { 1, 2, 3, 4, 5 };
        System.out.println("原始数组: " + Arrays.toString(numbers));

        // 1. 数组作为参数传递
        printArray(numbers);

        // 2. 修改数组内容
        modifyArray(numbers);
        System.out.println("修改后数组: " + Arrays.toString(numbers));

        // 3. 方法返回数组
        int[] evenNumbers = generateEvenNumbers(10);
        System.out.println("生成的偶数数组: " + Arrays.toString(evenNumbers));

        // 4. 可变参数（varargs）
        int sum1 = calculateSum(1, 2, 3, 4, 5);
        int sum2 = calculateSum(10, 20, 30);
        System.out.println("可变参数求和: " + sum1 + ", " + sum2);

        // 5. 数组作为可变参数
        int[] values = { 100, 200, 300, 400 };
        int sum3 = calculateSum(values);
        System.out.println("数组作为可变参数求和: " + sum3);
    }

    /**
     * 演示数组的注意事项
     */
    private static void demonstrateArrayCaveats() {
        System.out.println("\n--- 数组注意事项 ---");

        // 1. 数组是引用类型
        int[] array1 = { 1, 2, 3 };
        int[] array2 = array1; // 引用赋值，不是复制

        System.out.println("原始 array1: " + Arrays.toString(array1));
        System.out.println("赋值 array2: " + Arrays.toString(array2));

        array2[0] = 999; // 修改array2会影响array1
        System.out.println("修改array2后:");
        System.out.println("array1: " + Arrays.toString(array1));
        System.out.println("array2: " + Arrays.toString(array2));

        // 2. 正确的数组复制
        int[] array3 = Arrays.copyOf(array1, array1.length);
        array3[1] = 888;
        System.out.println("\n正确复制后:");
        System.out.println("array1: " + Arrays.toString(array1));
        System.out.println("array3: " + Arrays.toString(array3));

        // 3. 数组长度不可变
        int[] fixedArray = new int[5];
        System.out.println("\n固定数组长度: " + fixedArray.length);
        // fixedArray.length = 10; // 编译错误：无法修改length

        // 4. 数组初始化后长度确定
        System.out.println("数组创建后长度不可改变，如需动态大小请使用ArrayList");

        // 5. null数组
        int[] nullArray = null;
        try {
            System.out.println(nullArray.length); // 空指针异常
        } catch (NullPointerException e) {
            System.out.println("捕获空指针异常: 数组为null");
        }

        // 6. 数组元素的默认值
        int[] intArray = new int[3];
        String[] stringArray = new String[3];
        boolean[] boolArray = new boolean[3];

        System.out.println("\n数组元素默认值:");
        System.out.println("int数组: " + Arrays.toString(intArray));
        System.out.println("String数组: " + Arrays.toString(stringArray));
        System.out.println("boolean数组: " + Arrays.toString(boolArray));
    }

    // 辅助方法

    /**
     * 打印数组
     */
    private static void printArray(int[] array) {
        System.out.println("打印数组: " + Arrays.toString(array));
    }

    /**
     * 修改数组内容
     */
    private static void modifyArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2; // 每个元素乘以2
        }
    }

    /**
     * 生成偶数数组
     */
    private static int[] generateEvenNumbers(int count) {
        int[] evenNumbers = new int[count];
        for (int i = 0; i < count; i++) {
            evenNumbers[i] = (i + 1) * 2;
        }
        return evenNumbers;
    }

    /**
     * 可变参数求和
     */
    private static int calculateSum(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    /**
     * 查找数组最大值
     */
    private static int findMax(int[] array) {
        if (array.length == 0)
            return 0;
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
    private static int findMin(int[] array) {
        if (array.length == 0)
            return 0;
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    /**
     * 计算数组和（重载方法，接受数组参数）
     */
    private static int calculateSumArray(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    /**
     * 计算数组平均值
     */
    private static double calculateAverage(int[] array) {
        if (array.length == 0)
            return 0;
        return (double) calculateSumArray(array) / array.length;
    }
}