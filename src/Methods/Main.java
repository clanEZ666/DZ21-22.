package Methods;

public class Main {
    public static void main(String[] args) {

        System.out.println("Square of 5: " + Methods.square(5));
        System.out.println("Square of -3: " + Methods.square(-3));
        System.out.println("Square of 10: " + Methods.square(10));

        // Вызов метода printFullName
        Methods.printFullName("Sasha", "Jon");
        Methods.printFullName("Maksim", "Petrov");
        Methods.printFullName("Michael", "Olegovich");

        // Вызов метода cornerValuesArray
        String[] names = {"Alexey", "Bob", "Alexander", "Pasha"};
        String[] cornerValues = Methods.cornerValuesArray(names);
        System.out.println("Shortest name: " + cornerValues[0]);
        System.out.println("Longest name: " + cornerValues[1]);

        // Вызов метода cornerValuesArray для чисел

        int[] cornerInts = Methods.cornerValuesArray(10, 23, -5, 76, 0);
        System.out.println("Min number: " + cornerInts[0]);
        System.out.println("Max number: " + cornerInts[1]);

        // Вызов метода для символов
        char[] cornerChars = Methods.cornerValuesArray('a', 'z', 'A', 'Z');
        System.out.println("Min char: " + cornerChars[0]);
        System.out.println("Max char: " + cornerChars[1]);

        // Проверка метода для пустого массива
        String[] emptyArray = {};
        String[] emptyCorners = Methods.cornerValuesArray(emptyArray);
        System.out.println("Shortest name (empty): " + emptyCorners[0]);
        System.out.println("Longest name (empty): " + emptyCorners[1]);

        // Проверка метода factorial
        System.out.println("Factorial of 10: " + Methods.factorial(10));
        System.out.println("Factorial of 0: " + Methods.factorial(0));
    }
}



