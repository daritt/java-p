package New;

import java.util.Scanner;

public class Cw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj staż pracy");
        int year = scanner.nextInt();
        if (year > 0 && year < 5) {
            System.out.println("Junior");
        } else {
            if (year > 6 && year < 10) {
                System.out.println("Regular");
            } else {
                if (year >= 11) {
                    System.out.println("Senior");
                }
            }
        }
    }
}
