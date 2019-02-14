package New;

public class Jp7 {
    public static void main(String[] args) {
        String name = "Barnaba";
        System.out.println("Kim jesteś?");
        System.out.println(name.toUpperCase().charAt(name.length()-1) == 'A' &&
                !name.toUpperCase().equals("KUBA") &&
                !name.toUpperCase().equals("BARNABA")
                ? "kobieta" : "mężczyzna");
    }
}
