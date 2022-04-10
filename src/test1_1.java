package com.company.test1;


public class test1_1 {
    public static void main(String[] args) {
        new test1_1().getInfo(2006);
    }

    public void getInfo(int year) {
        String[] tianGanString = {"甲", "乙", "丙", "丁", "戊", "己", "庚", "辛", "壬", "癸"};
        String[] diZhiString = {"子", "丑", "寅", "卯", "辰", "巳", "午", "未", "申", "酉", "戌", "亥"};
        String[] shenXiaString = {"鼠", "牛", "虎", "兔", "龙", "蛇", "马", "羊", "猴", "鸡", "狗", "猪"};
        int tianGan = (year - 3) % 10 - 1;
        int diZhi = (year - 3) % 12 - 1;
        System.out.println(year + "是" + tianGanString[tianGan] + diZhiString[diZhi] + "年," +
                "生肖是" + shenXiaString[diZhi]);
    }
}