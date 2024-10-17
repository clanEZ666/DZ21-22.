package Methods;

/**
 * Класс Methods содержит методы для различных операций, таких как
 * нахождение крайних значений (минимального и максимального) в массиве строк,
 * чисел или символов, а также для вычисления квадрата числа и вывода полного имени.
 */

public class Methods {

    /**
     * Метод для вычисления квадрата числа.
     *
     * @param number целое число, для которого нужно вычислить квадрат
     * @return квадрат числа
     */
    public static int square(int number) {
        return number * number;
    }

    /**
     * Метод для вывода полного имени.
     *
     * @param firstName имя
     * @param lastName  фамилия
     */
    public static void printFullName(String firstName, String lastName) {
        System.out.println("Full name: " + firstName + " " + lastName);
    }

    /**
     * Метод для поиска самой короткой и самой длинной строки.
     *
     * @param strings массив строк (или varargs), среди которых нужно найти самую короткую и длинную
     * @return массив из двух элементов: [самая короткая строка, самая длинная строка]
     */
    public static String[] cornerValuesArray(String[] strings) {
        if (strings == null || strings.length == 0) {
            return new String[]{"", ""};
        }

        String shortest = strings[0];
        String longest = strings[0];

        for (String str : strings) {
            if (str.length() < shortest.length()) {
                shortest = str;
            }
            if (str.length() > longest.length()) {
                longest = str;
            }
        }

        return new String[]{shortest, longest};
    }

    /**
     * Метод для нахождения минимального и максимального значения в массиве целых чисел.
     *
     * @param numbers массив целых чисел (или varargs), среди которых нужно найти минимальное и максимальное
     * @return массив из двух элементов: [минимальное число, максимальное число]
     */
    public static int[] cornerValuesArray(int... numbers) {
        if (numbers == null || numbers.length == 0) {
            return new int[]{0, 0};
        }

        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        return new int[]{min, max};
    }


    /**
     * Метод для нахождения самого маленького и большого символа
     *
     * @param ch массив символов (или varargs), среди которых нужно найти минимальный и максимальный символ
     * @return массив из двух элементов: с самым маленький и большим символом
     */
    public static char[] cornerValuesArray(char... ch) {
        if (ch == null || ch.length == 0) {
            return new char[]{' ', ' '};
        }

        char min = ch[0];
        char max = ch[0];

        for (char cha : ch) {
            if (cha < min) {
                min = cha;
            }
            if (cha > max) {
                max = cha;
            }
        }

        return new char[]{min, max};
    }


}



