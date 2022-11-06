package blatt04;

import java.util.Scanner;

public class Potenzierung {

    public static void main(String[] args) {

        //Scanner wird Initialisiert
        Scanner sc = new Scanner(System.in);

        //Eingabe der zu berechnenden Zahlen
        System.out.println("Bitte geben Sie eine Basis ein: ");
        int base = sc.nextInt();

        System.out.println("Bitte geben Sie den Exponent ein: ");
        int exponent = sc.nextInt();

        //Notwendige Variablen werden Deklariert
        int result = 1;
        int base2 = base;


        //Rechnung
        //Ausnahmefall 1: Wenn der Exponent 0 ist, wird die Rechnung nicht ausgeführt
        if (exponent != 0) {
            //Ausnahmefall 2: Wenn Exponent und Basis beide negativ sind, wird die Operation ungültig.
            if (exponent < 0 && base < 0) {
                //Ausgabe fü Ausnahmefall 2
                System.out.println(base + " hoch " + exponent + " ist eine ungültige Operation.");
            } else {
                //Rechnung für positive Exponenten
                if (exponent > 0) {
                    //Schleife ist aktiv, solange i kleiner als der Exponent ist
                    for (int i = 0; i < exponent; i++) {
                        result = base2;
                        base2 = base2 * base;
                    }
                    //Ausgabe für positive Exponenten
                    System.out.println(base + " hoch " + exponent + " ergibt " + result);
                } else {
                    //Rechnung für negative Exponenten
                    //Schleife ist aktiv, solange i größer als der Exponent ist
                    for (int i = 0; i > exponent; i--) {
                        //Für eine korrekte Ausgabe wird die Rechnung wie bei der ersten Schleife ausgeführt, jedoch wird i negativ. Zudem soll das Ergebnis in einem Bruch ausgegeben werden, da sonst nur 0 ausgegeben wird
                        result = base2;
                        base2 = base2 * base;
                    }
                    //Ausgabe für negative Exponenten. (Der Exponent wird mit -1 multipliziert, damit das Ergebnis korrekt in einem Bruch ausgegeben werden kann.)
                    exponent *= -1;
                    System.out.println(base + " hoch " + exponent + " ergibt " + "1/" + result);
                }
            }
        } else {
            //Ausgabe für Ausnahmefall 1
            System.out.println(base + " hoch 0 ergibt 1");
        }
    }
}
