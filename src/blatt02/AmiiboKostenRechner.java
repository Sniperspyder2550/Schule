package blatt02;

import java.util.Scanner;

public class AmiiboKostenRechner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guten Tag, Wie viele Amiibos möchten Sie erwerben?");
        int anzahl = sc.nextInt();
        //TODO hier könnte das Programm scheitern
        double amiiboPreis = 15.00;
        //TODO ebenso hier
        double preis = anzahl * amiiboPreis;
        if (anzahl == 1) {
            System.out.println(anzahl + " Amiibo kostet " + preis + " €");
        } else {
            System.out.println(anzahl + " Amiibos kosten " + preis + " €");
        }
    }
}
