package blatt03;

import java.util.Scanner;
import java.lang.Math;

public class PQAllgemein {

    public static void main(String[] args) {

        //Initialisierung des Scanners und Eingabe

        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben Sie den Wert fuer a ein.");
        double a = sc.nextDouble();
        System.out.println("Bitte geben Sie den Wert fuer b ein.");
        double b = sc.nextDouble();
        System.out.println("Bitte geben Sie den Wert fuer c ein.");
        double c = sc.nextDouble();
        System.out.println("Bitte geben Sie den Wert fuer d ein.");
        double d = sc.nextDouble();

        //Verarbeitung der Variablen

        b /= a;
        c /= a;
        d /= a;
        c -=d;

        double q = c;
        double p = b;

        //In dem Abschnitt wird der Teil der Formel mit der Wurzel gerechnet. Ich habe es so besser verstehen und visualisieren können, als alles in einen Großen term zu schreiben.

        double wurzel = 0;

        wurzel = p * 0.5;

        wurzel = wurzel * wurzel;

        wurzel = wurzel - q;

        wurzel = Math.sqrt(wurzel);

        //Anfertigung Zweier ergebnisse

        double positivPQ = (p * -0.5) + wurzel;
        double negativPQ = (p * -0.5) - wurzel;

        //Ausgabe der Ergebnisse

        if (negativPQ == positivPQ) {
            System.out.println("Das Ergebnis ist x(1/2): " + positivPQ);
        } else {
            System.out.println("Die Ergebnisse sind x1: " + positivPQ + " und x2: " + negativPQ);
        }
    }
}
