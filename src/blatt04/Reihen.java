package blatt04;

import java.util.Scanner;

public class Reihen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int anzahl = 0;

        //Überprüfung der Angabe, Abfangen Datentypischer Fehler.
        do {
            System.out.println("Wie viele Zahlen möchten Sie je Reihe ausgegeben bekommen?");
            while (!sc.hasNextInt()) {
                System.out.println("Bitte geben Sie eine ganze Zahl ein!");
                sc.next();
            }
            anzahl = sc.nextInt();
        } while (anzahl <= 0);


        //Output: 4 Reihen mit jeweiliger Rechnung

        //Reihe1: Zahl wird mit sich selbst addiert, um das Ergebnis zu erhalten
        System.out.println("Reihe 1:");
        int zahl = 0;
        int zahl2 = 0;
        for (int a = 0; anzahl > a; a++) {
            zahl++;
            System.out.print(zahl + " ");
        }
        //Reihe2: Zahl wird mit sich selbst plus 2 addiert.
        System.out.println("\n\nReihe 2:");
        zahl = 0;
        for (int a = 0; anzahl > a; a++) {
            zahl = zahl + 2;
            System.out.print(zahl + " ");
        }

        //Reihe3: Es werden die Quadratzahlen der jeweiligen Zahlen ausgegeben.
        System.out.println("\n\nReihe 3:");
        zahl = 0;
        for (int a = 0; anzahl > a; a++) {
            zahl++;
            zahl2++;
            zahl = zahl * zahl;
            System.out.print(zahl + " ");
            zahl = zahl - zahl + zahl2;
        }
        //Reihe4: Hier werden die Zahl und das jeweilige negative Gegenstück ausgegeben.
        System.out.println("\n\nReihe 4:");
        zahl = 1;
        int a = zahl;
        a = 0;
        for (int i = 1; i < anzahl + 1; i++) {
            if (i % 2 == 0) {
                a = a * (-1);
                System.out.print(a + " ");
                a = a * (-1);
            } else {
                a++;
                System.out.print(a + " ");
            }
        }
    }
}
