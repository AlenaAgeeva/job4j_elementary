package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("ages size: " + ages.length);
        System.out.println("surnames size: " + surnames.length);
        System.out.println("prices size: " + prices.length);
    }
}
