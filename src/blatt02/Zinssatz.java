package blatt02;
import java.util.Scanner;
public class Zinssatz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bitte geben Sie das Kapital ein:");
        double startKapital = sc.nextDouble();
        System.out.println("Bitte geben Sie den Zinssatz ein (in Kommazahl):");
        double zinssatz = sc.nextDouble();
        double neuKapital = 0.00;

        double zinsen = (startKapital * zinssatz) / 100;
        neuKapital = startKapital + zinsen;

        System.out.println("Altes Kapital: " + startKapital + " €");
        System.out.println("Zinssatz: " + zinssatz + " %\n");
        System.out.println("Zinsen: " + zinsen + " €");
        System.out.println("Neues Kapital: " + neuKapital + " €");
    }
}
