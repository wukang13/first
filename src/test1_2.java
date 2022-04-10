

public class test1_2 {
    public static void main(String[] args) {
        new test1_2().calcFee(5);
    }

    public void calcFee(int iSeconds) {
        int min = 60;
        int seconds = 6;
        int minMoney = 40;
        int secondsMoney = 7;
        int moneyOfMin = 0;
        int moneyOfSeconds = 0;
        int money = 0;
        int minTimes = Math.floorDiv(iSeconds, min);
        if (minTimes != 0) {
            moneyOfMin = minTimes * minMoney;
            int secondsTimes = Math.floorDiv(Math.floorMod(iSeconds, min), seconds);
            int secondsTimesMod = Math.floorMod(Math.floorMod(iSeconds, min), seconds);
            if (secondsTimes != 0) {
                moneyOfSeconds = secondsTimes * secondsMoney;
            }
            if (secondsTimesMod != 0) {
                moneyOfSeconds += secondsMoney;
            }
        } else {
            moneyOfMin = minMoney;
        }
        money = moneyOfMin + moneyOfSeconds;
        System.out.println(iSeconds + "秒，需支付" + money + "分");
    }
}