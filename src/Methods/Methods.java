package Methods;

public class Methods {
    // Метод для вычисления квадрата числа
    public static int square(int number) {
        return number * number;
    }

    // Метод для вывода полного имени
    public static void printFullName(String firstName, String lastName) {
        System.out.println("Full name: " + firstName + " " + lastName);
    }

    // Метод для поиска самой короткой и самой длинной строк в массиве
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
}



