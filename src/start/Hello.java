package start;

//komentarz
//psvm - public static void main(String[] args)
//sout - System.out.println()
//ctrl + shift + f10 - run
//ctrl + /
//ctrl + d duplikowanue
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World!");
//sprawdzenie JRE
        System.out.println("JRE version: " + System.getProperty("java.runtime.version"));

        int lunchTimer = 123456;
        int endTimer = -12345655;
        System.out.println(lunchTimer);
        System.out.println(endTimer);
        double salary = 2100.99;
        System.out.println(salary);
        char signA = 'A';
        char sign9 = '9';
        char signSpace = ' ';
        System.out.println(signA);
        System.out.println(sign9);
        System.out.println(signSpace);

        boolean flag = true;
        boolean isLunch = false;
        System.out.println(true);
        System.out.println("isLunch = " + isLunch);

    }
}
