package com.company.chapter3;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        int value, max = 0, min = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个整数（输入0结束）：");
            value = scanner.nextInt();
            if (value == 0) {
                break;
            }
            if (value > max) {
                max = value;
            } else {
                min = value;
            }
        }
        System.out.println("最大值是：" + max + "\t最小值是：" + min);
    }
}