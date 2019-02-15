package start;

import java.util.Locale;
import java.util.Scanner;

public class Retrospection {
    public static void main(String[] args) {
//        nie zwraca zadnej wartości psvm, uruchamia program
//        int
//        string
//        byte
//        short
//        char - pojedynczy znak w ''
//        boolean - true false
//        double - część dziesietna od całkowitej
        byte age = 5;
        char sign = 'T';
        double salary = 500.99;
        boolean flag = true;

        System.out.println(sign + 1);
//        zmieni wartość, alfabet ASCII
        System.out.println((char) (sign + 1));
//        znak

        System.out.printf("%d | %c | %.2f | %s \n", age, sign, salary, flag);
        System.out.println("Hello World");

//        () ? () : () <-wzór
        Scanner scanner = new Scanner(System.in);
//        sprawdzenie wieku
        System.out.println("Podaj rok urodzenia");
        int year = scanner.nextInt();
        scanner.nextLine();
        if (year < 0 || year > 2019) {
            System.out.println("Błędne dane");
        } else {
            if ((2019 - year) >= 18) {
                System.out.println("Logowanie: podaj login i hasło");
                String login = scanner.nextLine();
                String password = scanner.nextLine();
                if (login.equals("admin") && password.equals("admin")) {
                    System.out.println("Witaj adminie");
                } else if (login.equals("user") && password.equals("user")) {
                    System.out.println("Witaj userze");
                } else {
                    System.out.println("Błąd logowania");
                }
            } else {
                System.out.println("Niepełnoletni");
            }
//        sprawdzenie stażu pracy
//        System.out.println("Podaj staż pracy");
//        scanner.useLocale(Locale.US);
//        double staz = scanner.nextDouble();
//        scanner.nextLine();
//        System.out.println("Podaj imię");
//        String name = scanner.nextLine();
//        System.out.println("Twój staż: " + staz);
//        System.out.println("Twoje imię: " + name);
        }
    }
}
