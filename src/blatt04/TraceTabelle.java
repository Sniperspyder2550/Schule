package blatt04;

public class TraceTabelle {

    public static void main(String[] args) {

        int a = 4;
        int b = 3;
        int c = 0;

        while (b > 0) {
            c = c + a;
            b--;
            System.out.println(a);System.out.println(b);System.out.println(c + "\n");

            if(b > 0){
                System.out.println("True");

            }else{
                System.out.println("False");
            }
        }
    }
}
    //Das Programm führt eine Schleife aus, in der es c umd den Wert von a erhöht, solange b größer als 0 ist. B wird mit jedem mal, dass die Schleife läuft, mit 1 subtrahiert.