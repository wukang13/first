package com.company.task2;

import java.util.Scanner;

/*
3、设计并测试一个名为Retangle的矩形类，
包括的属性有矩形的左下角与右上角两个点的坐标，
包括的方法有计算矩形的宽度和高度以及矩形的面积。
 */
public class Question3 {
    static class Retangle{
        private int[] x1;
        private int[] x2;

        public Retangle(int[] x1, int[] x2) {
            this.x1 = x1;
            this.x2 = x2;
        }

        public int getWide(){
            return Math.abs(x1[0] - x2[0]);
        }
        public int getHigh() {
            return Math.abs(x1[1] - x2[1]);
        }
        public int getArea() {
            return getWide()*getHigh();
        }
    }

    public static void main(String[] args) {
//        Retangle  retangle=new Retangle()
        int[] x1 = new int[2];
        int[] x2 = new int[2];
        System.out.println("请输入左下角和右上角的坐标：");
        Scanner scanner=new Scanner(System.in);
        x1[0]=scanner.nextInt();
        x1[1]=scanner.nextInt();
        x2[0]=scanner.nextInt();
        x2[1]=scanner.nextInt();
        Retangle  retangle=new Retangle(x1,x2);
        System.out.println("宽度为："+retangle.getWide());
        System.out.println("高度为："+retangle.getHigh());
        System.out.println("面积为："+retangle.getArea());
    }
}
