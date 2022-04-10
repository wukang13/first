package com.company.chapter3;

import java.util.Scanner;

public class Question3_3 {
    public static final int base = 5000;
    public static final double hotHead = 0.9;
    public static final double hotTail = 0.6;
    public static final double coldHead = 0.5;
    public static final double coldTail = 0.4;

    public static void main(String[] args) {
        int month, choose;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您出行的月份：1~12");
        month = scanner.nextInt();
        System.out.println("请输入您选择头等舱还是经济舱？头等舱输入1，经济舱输入2：");
        choose = scanner.nextInt();
        switch (month) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                switch (choose) {
                    case 1:
                        System.out.println("您的机票价格为：" + base * hotHead);
                        break;
                    case 2:
                        System.out.println("您的机票价格为：" + base * hotTail);
                }
                break;
            default:
                switch (choose) {
                    case 1:
                        System.out.println("您的机票价格为：" + base * coldHead);
                        break;
                    case 2:
                        System.out.println("您的机票价格为：" + base * coldTail);
                }
        }
    }
}