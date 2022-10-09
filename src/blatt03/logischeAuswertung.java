package blatt03;

public class logischeAuswertung {
    public static void main(String[] args) {

        boolean[] ergebnis = new boolean[10];

        int i = 0;

        //Eingabe
        int a = 42;
        int b = 21;
        double c = 0.01;
        int d = -11;
        int e = 5;
        int f = -1;
        int g = 4;

        //Überprüfung
        if(a > c){
            ergebnis[0] = true;
        }else{
            ergebnis[0] = false;
        }
        if(b + c > b){
            ergebnis[1] = true;
        }else{
            ergebnis[1] = false;
        }
        if(a == b*2){
            ergebnis[2] = true;
        }else{
            ergebnis[2] = false;
        }
        if(e*f*f == e){
            ergebnis[3] = true;
        }else{
            ergebnis[3] = false;
        }
        if(e*c*c*c > c){
            ergebnis[4] = true;
        }else{
            ergebnis[4] = false;
        }
        if(g*e*b > a*d*f){
            ergebnis[5] = true;
        }else{
            ergebnis[5] = false;
        }
        if(b+1000*c-d > a){
            ergebnis[6] = true;
        }else{
            ergebnis[6] = false;
        }
        if(d/f > a/g){
            ergebnis[7] = true;
        }else{
            ergebnis[7] = false;
        }
        if(a%b > e%g){
            ergebnis[8] = true;
        }else{
            ergebnis[8] = false;
        }
        if(a-b-c-(d-(e-f)-g) >= 1){
            ergebnis[9] = true;
        }else{
            ergebnis[9] = false;
        }


        //Ausgabe
        for(i = 0; i < ergebnis.length; i++){
            System.out.println("Bedingung "+ (i+1) +" ist "+ergebnis[i]);

            //TODO ich hoffe, das ist so annehmbar. Ich war mir nicht sicher, ob ich dann einfach ein Bild der ausgefüllten Tabelle anhängen sollte oder ein Programm zu schreiben. Ich hab nur letzteres gemacht.
        }
    }
}
