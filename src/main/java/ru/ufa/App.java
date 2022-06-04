package ru.ufa;

import java.util.Scanner;

class Main {

    public static final double PI = 3.14;

    public static void main(String[] args) {
//        System.out.println("Программа расчета площади круга и длины окружности");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите радиус окружности в сантиметрах:");
//        int radius = scanner.nextInt();
        int radius = 7;
        int smallRadius = 4;
        int ringArea = calculateRingArea(smallRadius, radius);
        double area = calculateCircleArea(radius);
        double length = calculateCircleLength(radius);
        System.out.println("Целая часть площади кольца: " + ringArea + " см.кв.");
        System.out.println("Площадь круга: " + area + " см.кв.");
        System.out.println("Длина окружности: " + length + " см.");
    }

    public static double calculateCircleArea(int radius) {
        return PI * radius * radius;
    }

    public static double calculateCircleLength(int radius) {
        return 2 * PI * radius;
    }

    public static int calculateRingArea(int smallRadius, int bigRadius) {
        return (int) ((PI * bigRadius * bigRadius) - (PI * smallRadius * smallRadius));
    }

    public static String theCapitalOfGreatBritian() {
        return "London";
    }
}