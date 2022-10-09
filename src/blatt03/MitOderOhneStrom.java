package blatt03;

import java.util.Scanner;

public class MitOderOhneStrom {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bitte wählen Sie ein Gatter: \n1.NOT\t2.OR\t3.AND\t4.XOR");

        boolean ergebnis = false;
        boolean bob1 = false;       //Variable für Schleife
        String gateS = "bob";

        int gate = sc.nextInt();
        while (bob1 == false) {
            if (gate > 4) {
                System.out.println("Geben Sie eine Zahl zwischen 1 bis 4 ein.");
                gate = sc.nextInt();
            } else {
                bob1 = true;
            }
        }
        if (gate == 1) {
            System.out.println("Das NOT-Gatter:\nDas Gatter verfügt über 2 Eingänge und einen Ausgang.");
        } else if (gate == 2) {
            System.out.println("Das OR-Gatter:\nDas Gatter verfügt über 2 Eingänge und einen Ausgang.");
        } else if (gate == 3) {
            System.out.println("Das AND-Gatter:\nDas Gatter verfügt über 2 Eingänge und einen Ausgang.");
        } else if (gate == 4) {
            System.out.println("Das XOR-Gatter:\nDas Gatter verfügt über 2 Eingänge und einen Ausgang.");
        }
        System.out.println("Befindet sich auf dem ersten Eingang Strom? (true/false)");
        boolean antwort1 = sc.nextBoolean();
        System.out.println("Befindet sich auf dem zweiten Eingang Strom? (true/false)");
        boolean antwort2 = sc.nextBoolean();

        if (gate == 1) {
            gateS = " NOT ";
            if (antwort1 != antwort2) {
                ergebnis = true;
            } else {
                ergebnis = false;
            }
        } else if (gate == 2) {
            gateS = " OR ";
            if (antwort1 == true || antwort2 == true) {
                ergebnis = true;
            } else {
                ergebnis = false;
            }
        } else if (gate == 3) {
            gateS = " AND ";
            if (antwort1 == true && antwort2 == true) {
                ergebnis = true;
            } else {
                ergebnis = false;
            }
        } else if (gate == 4) {
            gateS = " XOR ";
            if (antwort1 == true ^ antwort2 == true) {
                ergebnis = true;
            } else {
                ergebnis = false;
            }
        }

        System.out.println(antwort1 + gateS + antwort2 + " = " + ergebnis);
    }
}
