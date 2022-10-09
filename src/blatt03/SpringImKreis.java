package blatt03;

import java.util.Scanner;
import java.lang.Math;

public class SpringImKreis {

    public static void main(String[] args) {


        //Eingaben der Werte und initialisirung des Scanners
        Scanner sc = new Scanner(System.in);

        System.out.println("Bitte geben Sie die erste Koordinate (x) an.");
        double xCoords = sc.nextDouble();

        System.out.println("Bitte geben Sie die zweite Koordinate (y) an.");
        double yCoords = sc.nextDouble();

        System.out.println("Bitte geben Sie den Radius Ihres Einheitskreises ein.");
        double radius = sc.nextDouble();



        if (Math.pow(xCoords,2) + Math.pow(yCoords, 2) == Math.sqrt(radius)) {
            System.out.println("Der Punkt liegt exakt auf dem Einheitskreis."); //Überprüft, ob Punkt exakt auf dem Einheitskreis ist.
        } else if (Math.pow(xCoords,2) + Math.pow(yCoords, 2) < Math.sqrt(radius)) {
            System.out.println("Der Punkt liegt im Einheitskreis");
        } else {                                                                //Überprüft, ob der Punkt im Einheitskreis liegt, wenn nicht dann wird Falsch ausgegeben
            System.out.println("Der Punkt liegt außerhalb des Einheitskreises");

            //TODO Da ich leider nur eine geringe Ahnung von Einheitskreisen habe, konnte ich diese Aufgabe nicht richtig bearbeiten.
        }
    }
}
