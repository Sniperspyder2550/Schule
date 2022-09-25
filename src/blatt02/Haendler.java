package blatt02;

import java.util.Scanner;

public class Haendler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Willkommen beim Haendler!\nWie viele SD-Karten dürfen es sein?");
        int mengeSD = sc.nextInt();
        System.out.println("Wie viele MiniSD-Karten dürfen es sein?");
        int mengeMini = sc.nextInt();
        System.out.println("Wie viele MicroSD-Karten dürfen es sein?");
        //TODO Alle Eingaben, welche nicht dem entsprechenden Datentypen entsprechen, gefaehrden das Programm
        int mengeMicro = sc.nextInt();
        double preisSD = 5.00;
        double preisMini = 8.00;
        double preisMicro = 12.00;

        double preis = (mengeSD * preisSD) + (mengeMini * preisMini) + (mengeMicro * preisMicro);

        System.out.println("----------------------------");
        System.out.println("\t\tWarenkorb\n");
        System.out.println(mengeSD + " normale SD-Karten");
        System.out.println(mengeMini + " MiniSD-Karten");
        System.out.println(mengeMicro + " MicroSD-Karten");
        System.out.println("\nGesamtpreis: " + preis + " €");
        System.out.println("----------------------------");
    }
}
