package New;

import static java.lang.Math.pow;
import static java.lang.StrictMath.sqrt;

public class Jp8 {
    public static void main(String[] args) {
        // pole trójkąta
        int a = 5;
int b =4;
        System.out.println(0.5*a*(a*sqrt(3)/2));
//        p2
        System.out.println(pow(5,3));
//        p3
        int grade1 = 5;
                int grade2 = 5;
                int grade3 = 4;
        System.out.println((double) (grade1 + grade2 + grade3)/3);
//        p4
        System.out.println(a * b);
//        p5
        double salary_net = 8000;
        int vat_tax = 23;
        System.out.println(salary_net * (1 + ((double) vat_tax)/100));
    }
}
