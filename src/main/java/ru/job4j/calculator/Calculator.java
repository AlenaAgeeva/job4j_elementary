package ru.job4j.calculator;

public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int six = 6;
        int four = 4;
        int five = 5;
        System.out.println(add(one, two));
        System.out.println(divide(six, two));
        System.out.println(subtract(five, two));
        System.out.println(multiply(four, two));
    }
}
