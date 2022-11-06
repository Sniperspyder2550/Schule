package blatt04;

import java.util.Scanner;

public class Zeitumrechner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Gebe eine positive Zahl an Sekunden ein:");

        int sec = sc.nextInt();
        int tag = sec / 86400;
        int std = (sec % 86400) / 3600;
        int min = ((sec % 86400) % 3600) / 60;
        sec = ((sec % 86400) % 3600) % 60;

        String ausgabe1;
        String ausgabe2;
        String ausgabe3;
        String ausgabe4;

        if (tag > 1 || tag == 0) {
            ausgabe1 = " Tage, ";
        } else {
            ausgabe1 = " Tag, ";
        }
        if (std > 1 || std == 0) {
            ausgabe2 = " Stunden, ";
        } else {
            ausgabe2 = " Stunde, ";
        }
        if (min > 1 || min == 0) {
            ausgabe3 = " Minuten, ";
        } else {
            ausgabe3 = " Minute, ";
        }
        if (sec > 1 || sec == 0) {
            ausgabe4 = " Sekunden ";
        } else {
            ausgabe4 = " Sekunde ";
        }


        System.out.println(tag + ausgabe1 + std + ausgabe2 + min + ausgabe3 + sec + ausgabe4);
    }
}
