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
    }
}



