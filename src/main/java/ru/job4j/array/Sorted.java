package ru.job4j.array;
/**Задан числовой массив. Необходимо написать программу, которая проверит, что массив отсортирован по возрастанию.
 Сортировать массив не нужно!*/

public class Sorted {
    public static boolean isSorted(int[] array) {
        boolean b = true;
        for (int i = 0; i < array.length - 2; i++) {
            if (array[i + 1] > array[i] && array[i + 1] < array[i + 2]) {
                continue;
            } else {
                b = false;
            }
        }
        return b;
    }
}
