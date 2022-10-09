package blatt03;

import java.util.Scanner;

public class Haendler {
    public static void main(String[] args) {

        //Initialisierung des Scanners, Abfrage und Überprüfung des Inputs.

        Scanner sc = new Scanner(System.in);
        System.out.println("Willkommen beim Haendler!\nWie viele SD-Karten dürfen es sein?");
        int mengeSD = sc.nextInt();
        if (mengeSD < 0) {
            System.out.println("Bitte geben Sie eine Anzahl über -1");
            System.exit(0);
        }
        if (mengeSD > 50) {
            System.out.println("Die maximale Bestellmenge sind 50 SD-Karten. Ihre Bestellmenge wird automatisch auf 50 gesetzt");
            mengeSD = 50;
        }
        System.out.println("Wie viele MiniSD-Karten dürfen es sein?");
        int mengeMini = sc.nextInt();
        if (mengeMini < 0) {
            System.out.println("Bitte geben Sie eine Anzahl über -1");
            System.exit(0);
        }
        if (mengeMini > 50) {
            System.out.println("Die maximale Bestellmenge sind 50 MiniSD-Karten. Ihre Bestellmenge wird automatisch auf 50 gesetzt");
            mengeMini = 50;
        }
        System.out.println("Wie viele MicroSD-Karten dürfen es sein?");
        int mengeMicro = sc.nextInt();
        if (mengeMicro < 0) {
            System.out.println("Bitte geben Sie eine Anzahl über -1");
            System.exit(0);
        }
        if (mengeMicro > 50) {
            System.out.println("Die maximale Bestellmenge sind 50 MicroSD-Karten. Ihre Bestellmenge wird automatisch auf 50 gesetzt");
            mengeMicro = 50;
        }

        //TODO Alle Eingaben, welche nicht dem entsprechenden Datentypen entsprechen, gefaehrden das Programm
        double preisSD = 5.00;
        double preisMini = 8.00;
        double preisMicro = 12.00;

        boolean bool1 = false;

        //Preis wird berechnet
        double preis = (mengeSD * preisSD) + (mengeMini * preisMini) + (mengeMicro * preisMicro);

        //Rabatt wird berechnet
        double rabatt = 0;
        double anzahlKarten = mengeSD + mengeMini + mengeMicro;
        double endpreis = 0;

        if (anzahlKarten >= 15) {
            rabatt = (preis * 0.15);
            endpreis = preis - rabatt;
            bool1 = true;
        }
        //Ausgabe
        System.out.println("----------------------------");
        System.out.println("\t\tWarenkorb\n");
        System.out.println(mengeSD + " normale SD-Karten");
        System.out.println(mengeMini + " MiniSD-Karten");
        System.out.println(mengeMicro + " MicroSD-Karten");
        System.out.println("\nPreis: " + preis + " €");
        if (bool1 == true) {
            System.out.println("\nSie erhalten einen Mengenrabatt von 15%");
            System.out.println("Sie bezahlen " + rabatt + " € weniger.");
            System.out.println("Gesamtpreis: " + endpreis + " €");
        }
        System.out.println("----------------------------");
    }
}