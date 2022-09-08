package blatt01;

public class Zuweisungen {
    public static void main (String [] args) {
        int a = 7;
        int b = a;
        a = a + 3;
        a = a * 4;
        a = a - 8;
        a = a / 2;
        a = a - (b * 2);
        System.out.println(a);
    }
}
