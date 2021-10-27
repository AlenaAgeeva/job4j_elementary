package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(300);
        System.out.println("140 rubles are " + euro + " euro(s).");
        System.out.println("300 rubles are " + dollar + " dollar(s).");

        float in = 300;
        float expected = 5;
        float out = Converter.rubleToDollar(in);
        boolean passed = expected == out;
        System.out.println("300 rubles are 5. Test result : " + passed);
    }
}
