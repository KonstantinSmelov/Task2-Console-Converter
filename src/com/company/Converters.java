package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Converters {

    public static StringBuilder decToHex(int input) {
        StringBuilder result = new StringBuilder();

        decToHexRecursion(input, result);
        result.reverse();

        return result;
    }

    //рекурсивное деление на 16 и аккумуляция результата (в обратном порядке)
    private static void decToHexRecursion(Integer input, StringBuilder result) {
        if (input < 16) {
            result.append(convert(input));
            return;
        }

        Integer inputTmp = input;

        input = input / 16;
        Integer resultTmp = inputTmp - (input * 16);

        result.append(convert(resultTmp));

        decToHexRecursion(input, result);
    }

    // конвертация 10 -> A, 11 -> B .... 15 -> F
    private static String convert(Integer resultTmp) {
        String str = "";

        if (resultTmp < 10) {
            str = resultTmp.toString();
        } else {

            switch (resultTmp) {
                case 10:
                    str = "A";
                    break;
                case 11:
                    str = "B";
                    break;
                case 12:
                    str = "C";
                    break;
                case 13:
                    str = "D";
                    break;
                case 14:
                    str = "E";
                    break;
                case 15:
                    str = "F";
                    break;
            }
        }
        return str;
    }


    public static StringBuilder decToBin(int input) {
        StringBuilder result = new StringBuilder();

        decToBinRecursion(input, result);
        result.reverse();

        return result;
    }

    //рекурсивное деление на 2 и аккумуляция результата (в обратном порядке)
    private static void decToBinRecursion(Integer input, StringBuilder result) {
        if (input < 2) {
            result.append(input);
            return;
        }
        Integer inputTmp = input;

        input = input / 2;
        Integer resultTmp = inputTmp - (input * 2);
        result.append(resultTmp);
        decToBinRecursion(input, result);
    }


    public static String binToDec(Long input) {
        StringBuilder sb = new StringBuilder(input.toString());
        sb.reverse();
        Integer result = 0;

        for (int x = 0; x < sb.length(); x++) {
            if (sb.charAt(x) == '1') {
                result += pow(2, x);
            } else if(sb.charAt(x) != '0') {
                return "введено не двоичное число";
            }
        }

    return result.toString();
    }

    public static int pow(int value, int degree) {
        int result = 1;
        for (int i = 1; i <= degree; i++) {
            result = result * value;
        }
        return result;
    }

}
