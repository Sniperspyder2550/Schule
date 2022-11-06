package blatt04;

import java.util.Scanner;

public class Zinssatz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bitte geben Sie das Kapital ein:");
        double startKapital = sc.nextDouble();
        System.out.println("Bitte geben Sie den Zinssatz ein (in Kommazahl):");
        double zinssatz = sc.nextDouble();
        System.out.println("Für wie viele Jahre soll das Kapital angelegt werden?");
        int jahre = sc.nextInt();
        double zinsen = (startKapital * zinssatz) / 100;
        double neuKapital = startKapital + zinsen;

        for (int i = 0; jahre > i; i++) {

            System.out.println("Jahr: "+ (i + 1));
            System.out.print("Altes Kapital: "); System.out.printf("%.2f",startKapital); System.out.println(" €");
            System.out.println("Zinssatz: " + zinssatz + " %\n");
            System.out.print("Zinsen: "); System.out.printf("%.2f",zinsen); System.out.println(" €");
            System.out.print("Neues Kapital: "); System.out.printf("%.2f",neuKapital); System.out.println(" €\n\n");

            startKapital = neuKapital;
            zinsen = (startKapital * zinssatz) / 100;
            neuKapital = startKapital + zinsen;

        }
    }
}
