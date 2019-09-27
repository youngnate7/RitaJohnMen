package com.company;

public class MathEx {

    public static int swap(int x) {
        int y = x % 10;
        int a = x % 100 / 10;
        int b = x / 100;
        int c = b * 100 + y * 10 + a;
        return c;
    }

    public static void main(String[] args) {
        int z = swap(123);
        System.out.println(z);
        timeLeft(1, 34, 8, 20);
    }
    private static void timeLeft(int curHour, int curMin, int depHour, int depMin){
        int d = depHour - curHour;
        int e = depMin - curMin;
        System.out.print(d + " hours ");
        System.out.print(e + " minutes");

    }
}