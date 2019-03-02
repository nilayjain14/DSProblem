package com.jainn;

public class DoubleRound {

    public static void main(String[] args) {
        double a = 123.452233;
        double roundOff = (double) Math.round(a * 100) / 100;
        System.out.println(roundOff);

        double b = 123.45678;
        double roundOffb = (double) Math.round(b * 100) / 100;
        System.out.println(roundOffb);

        double c = 123.45555;
        double roundOffc = (double) Math.round(c * 100) / 100;
        System.out.println(roundOffc);

    }
}
