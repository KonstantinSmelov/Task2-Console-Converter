package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        boolean repeate = true;

        while (repeate) {

            System.out.println("\nПункт 1: 10 -> 16");
            System.out.println("Пункт 2: 10 -> 2");
            System.out.println("Пункт 3: 2 -> 10");
            System.out.println("Пункт 4: Выход");
            System.out.print("\nВыберите пункт меню: ");

            Scanner scanner = new Scanner(System.in);
            try {
                int check = scanner.nextInt();
                switch (check) {
                    case 1:
                        System.out.print("Введите число для конвертации 10 -> 16: ");
                        try {
                            int value1 = scanner.nextInt();
                            if (value1 >= 0 && value1 <= 10000) {
                                System.out.println("\nОтвет: " + Converters.decToHex(value1) + "\n");
                            } else {
                                System.out.println("\nОтвет: " + "введите число в диапазоне от 0 до 10000" + "\n");
                            }
                            Thread.sleep(1000);
                        } catch (InputMismatchException e) {
                            System.out.println("\nОтвет: " + "введите число в диапазоне от 0 до 10000" + "\n");
                        }
                        break;


                    case 2:
                        System.out.print("Введите число для конвертации 10 -> 2: ");
                        try {
                            int value2 = scanner.nextInt();
                            if (value2 >= 0 && value2 <= 10000) {
                                System.out.println("\nОтвет: " + Converters.decToBin(value2) + "\n");
                            } else {
                                System.out.println("\nОтвет:" + "введите число в диапазоне от 0 до 10000" + "\n");
                            }
                            Thread.sleep(1000);
                        } catch (InputMismatchException e) {
                            System.out.println("\nОтвет:" + "введите число в диапазоне от 0 до 10000" + "\n");
                        }
                        Thread.sleep(1000);
                        break;


                    case 3:
                        System.out.print("Введите число для конвертации 2 -> 10: ");
                        try {
                            Long value3 = scanner.nextLong();
                            System.out.println("\nОтвет: " + Converters.binToDec(value3) + "\n");
                        } catch (InputMismatchException e) {
                            System.out.println("\nОтвет: " + "слишком большое число или не двоичное число" + "\n");
                        }
                        Thread.sleep(1000);
                        break;


                    case 4:
                        repeate = false;
                        break;
                }
            } catch (InputMismatchException e) {
            }
        }
    }
}
