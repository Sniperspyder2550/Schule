package blatt04;

import java.util.Scanner;

public class Rechenuebung {

    public static void main(String[] args) {

        //Initiierung des Scanners
        Scanner sc = new Scanner(System.in);

        //Eingabe der zu berechnender Faktoren
        System.out.println("Bitte geben Sie den ersten Faktor für die Multiplikationsübung ein.");
        double faktor1 = sc.nextDouble();

        System.out.println("Bitte geben Sie den ersten Faktor für die Multiplikationsübung ein.");
        double faktor2 = sc.nextDouble();

        //Deklarierung der Variablen

        double result;

        //Schleife für die Rechenübung
        while (true) {
            System.out.println("Gebe die Lösung von " + faktor1 + " * " + faktor2 + " ein.");
            result = sc.nextDouble();
            if (result == (faktor1 * faktor2)){
                break;
            }
        }
        //Ausgabe
        System.out.println("Gut! Die Lösung ist " + result +"!");
    }
}
