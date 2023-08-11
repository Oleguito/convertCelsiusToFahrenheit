/*  F = 1.8C + 32
    K = C - 273.15  */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите значение температуры в градусах Цельсия: ");
        double C;
        try {
            C = s.nextDouble();
        } catch (Exception e) {
            System.out.println("Критическая ошибка: " + e);
            return;
        }

        System.out.println("Значение температуры в градусах Фаренгейта: " + (1.8 * C + 32.0) );
        System.out.println("Значение температуры в градусах Кельвина: " + (C - 273.15));
    }
}