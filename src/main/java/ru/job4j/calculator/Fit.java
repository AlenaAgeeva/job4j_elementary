package ru.job4j.calculator;

public class Fit {
    private static final int MAN_BASE_HEIGHT = 100;
    private static final int WOMAN_BASE_HEIGHT = 110;
    private static final double WEIGHT_COEFFICIENT = 1.15;

    public static double manWeight(short manHeight) {
        if (manHeight <= 0) {
            throw new IllegalArgumentException("Height must be a positive number.");
        }
        double result = (manHeight - MAN_BASE_HEIGHT) * WEIGHT_COEFFICIENT;
        return result;
    }

    public static double womanWeight(short womanHeight) {
        if (womanHeight <= 0) {
            throw new IllegalArgumentException("Height must be a positive number.");
        }
        double result = (womanHeight - WOMAN_BASE_HEIGHT) * WEIGHT_COEFFICIENT;
        return result;
    }

    public static void main(String[] args) {
        short manHeight = 187;
        short womanHeight = 170;
        double man = Fit.manWeight(manHeight);
        System.out.println("Ideal weight for a man of height 187 is " + man);
        double woman = Fit.womanWeight(womanHeight);
        System.out.println("Ideal weight for a woman of height 170 is " + woman);
    }

}
