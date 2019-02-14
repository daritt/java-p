package New;

public class Jp2 {
    public static void main(String[] args) {
//        deklaracje
        String name, lastname, possition;
        final String PESEL;
        char gender;
        double salary_net;
        boolean isRetired;
//        przypisanie
        name = "Adam";
        lastname = "Kowalski";
        possition = "Developer";
        PESEL = "12345656560";
        gender = 'M';
        salary_net = 10000;
        isRetired = false;
//        prezentacja
        System.out.printf("%10s | %10s | %10s | %12s | %2s | %8.2fzł | %b", name, lastname, possition, PESEL, gender,salary_net,isRetired);
    }
}
