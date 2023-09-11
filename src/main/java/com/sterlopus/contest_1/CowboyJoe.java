package com.sterlopus.contest_1;


import java.util.Scanner;
import java.util.Arrays;

public class CowboyJoe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Количество револьверов
        int s = scanner.nextInt(); // Количество долларов у Джо

        int[] revolverPrices = new int[n]; // Массив цен на револьверы

        // Считываем цены на револьверы
        for (int i = 0; i < n; i++) {
            revolverPrices[i] = scanner.nextInt();
        }

        // Сортируем цены по убыванию
        Arrays.sort(revolverPrices);

        int maxPrice = 0;

        // Ищем самый дорогой револьвер, который Джо может себе позволить
        for (int i = n - 1; i >= 0; i--) {
            if (revolverPrices[i] <= s) {
                maxPrice = revolverPrices[i];
                break;
            }
        }

        System.out.println(maxPrice);

        scanner.close();
    }
}
