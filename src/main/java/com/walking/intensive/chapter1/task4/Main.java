package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {

        double a = 4;
        double b = -75;
        double c = 2;

        System.out.println(solveQuadraticEquation(a, b, c));

    }

    static String solveQuadraticEquation(double a, double b, double c) {
        double valueD = b * b - 4 * a * c;
        double x1 = (- b + Math.sqrt(valueD)) / (2 * a);
        double x2 = (- b - Math.sqrt(valueD)) / (2 * a);
        if (valueD < 0) {
            return "Количество решений: 0.";
        } else if (valueD == 0) {
            return "Количество решений: 1. Корень: " + x1;
        }
        return "Количество решений: 2. Корни: " + Math.min(x1, x2) + "; " + Math.max(x1,x2);
    }
}