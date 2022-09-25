package blatt02;

import java.util.Scanner;           //Importiere Scanner

public class Talking {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);             //Neuen Scanner erstellen
        System.out.println("Moin! Wie heißt du?");           //Frage
        String name = sc.nextLine();                //Scanner wird an Variabel gebunden, Scanner fragt ab  
        System.out.println("Willkommen an Bord, " + name + "!");        //Ergebnis wird duch Variabel ausgegeben
    }
}
