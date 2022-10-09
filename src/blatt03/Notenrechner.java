package blatt03;

import java.util.Scanner;

public class Notenrechner {

    public static void main(String[] args) {

        int note = 0;
        boolean vollePunkte = false;

        //Eingabe und initialisirung des Scanners
        Scanner sc = new Scanner(System.in);

        System.out.println("Bitte geben Sie die zu maximal erreichenden Punkte an.");
        int maxPunkte = sc.nextInt();

        System.out.println("Bitte geben Sie die erreichten Punkte an.");
        int earnedPunkte = sc.nextInt();


        while (maxPunkte < earnedPunkte) {
            System.out.println("Die erreichten Punkte können nicht über den möglichen Punkten liegen.\nBitte geben Sie eine Zahl zwischen 1 und " + maxPunkte + " ein.");
            earnedPunkte = sc.nextInt();


        }
        if (earnedPunkte > 0) {                 //Kondition um einer Division durch null zu vermeiden
            double prozent = (maxPunkte / earnedPunkte) * 10;       //Berechnung der Prozentzahl

            if (earnedPunkte == maxPunkte) {

                vollePunkte = true;
            } else if (prozent > 85) {
                note = 1;
            } else if (prozent > 70) {
                note = 2;
            } else if (prozent > 55) {
                note = 3;
            } else if (prozent > 39) {
                note = 4;
            } else if (prozent > 17) {
                note = 5;
            } else {
                note = 6;       //Abgleichung der Prozentzahl
            }
            if (vollePunkte) {
                System.out.println("Herzlichen Glückwunsch, Sie haben die volle Punktzahl erzielt und erhalten somit die Note 1.");
            } else {
                System.out.println("Sie erhalten die Note " + note + ".");      //Ausgabe
            }
        }else{
            System.out.println("Keine Punkte erzielt. Note 6"); //Ausgabe der Umgehung einer Multiplitkation um null
        }
    }
}

