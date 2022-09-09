package blatt01;

public class Zinssatz {
    public static void main(String[] args) {
        double startKapital = 1220.00;
        double zinssatz = 2.25;
        double zinsen = 0.00;
        double neuKapital = 0.00;

        zinsen = (startKapital * zinssatz) / 100;
        neuKapital = startKapital + zinsen;

        System.out.println("Altes Kapital: " + startKapital + "€");
        System.out.println("Zinssatz: " + zinssatz + "%\n");
        System.out.println("Zinsen: " + zinsen + "€");
        System.out.println("Neues Kapital: " + neuKapital + "€");
    }
}
