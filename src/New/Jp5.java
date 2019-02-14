package New;

public class Jp5 {
    public static void main(String[] args) {
        //  negacja !(p&&q) == ((!p) || (!q));
        boolean p, q;
//        t1
        p = true;
        q = true;
        System.out.println(!(p&&q) == ((!p) || (!q)));
//        t2
        p = true;
        q = false;
        System.out.println(!(p&&q) == ((!p) || (!q)));
//        t3
        p = false;
        q = true;
        System.out.println(!(p&&q) == ((!p) || (!q)));
//        t4
        p = false;
        q = false;
        System.out.println(!(p&&q) == ((!p) || (!q)));
    }
}
