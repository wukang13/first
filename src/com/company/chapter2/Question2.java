package com.company.chapter2;


public class Question2 {
    public static int rightHand = 8;
    public static int lftHand = 10;

    public static void main(String[] args) {
        System.out.println("输出互换前手中的纸牌：");
        System.out.println("左手中的纸牌：" + lftHand);
        System.out.println("右手中的纸牌：" + rightHand);
        System.out.println();
        rightHand = rightHand ^ lftHand;
        lftHand = lftHand ^ rightHand;
        rightHand = rightHand ^ lftHand;
        System.out.println("输出互换后手中的纸牌：");
        System.out.println("左手中的纸牌：" + lftHand);
        System.out.println("右手中的纸牌：" + rightHand);
    }
}