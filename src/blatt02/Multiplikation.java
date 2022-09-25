package blatt02;

import java.util.Scanner;

public class Multiplikation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nenne die erste (ganze) Zahl");
        int ersteZahl = sc.nextInt();
        System.out.println("Nenne die zweite (ganze) Zahl");
        int zweiteZahl = sc.nextInt();
        //TODO Eingaben, welche nicht dem jeweiligen Typen entsprechen, können zu Fehlern führen. 
        int ergebnis = ersteZahl * zweiteZahl;
        System.out.println(ersteZahl + " * " + zweiteZahl + " = " + ergebnis);
    }
}
