package blatt01;

public class haendler {

    public static void main(String[] args) {
        int mengeSD = 7;
        int mengeMini = 4;
        int mengeMicro = 12;
        double preisSD = 5.00;
        double preisMini = 8.00;
        double preisMicro = 12.00;

        double preis = (mengeSD * preisSD) + (mengeMini * preisMini) + (mengeMicro * preisMicro);

        System.out.println("----------------------------");
        System.out.println("\t\tWarenkorb\n");
        System.out.println(mengeSD + " normale SD-Karten");
        System.out.println(mengeMini + " MiniSD-Karten");
        System.out.println(mengeMicro + " MicroSD-Karten");
        System.out.println("\nGesamtpreis: "+ preis + "€");
        System.out.println("----------------------------");
    }
}
