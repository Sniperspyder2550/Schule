package blatt03;

import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {

        //Scanner wird initialisiert und Eingaben werden erfragt.

        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte nennen Sie die erste Zahl.");
        int num1 = sc.nextInt();
        System.out.println("Bitte nennen Sie die zweite Zahl.");
        int num2 = sc.nextInt();
        System.out.println("Bitte nennen Sie die dritte Zahl.");
        int num3 = sc.nextInt();

        //Wenn num1 größer ist als num2, wird ermittelt, ob num1 nun groeßer ist als num3 oder nicht.

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println(num1 + " ist die groeßte Zahl.");
            } else if (num1 < num3) {
                if (num2 > num3) {
                    System.out.println(num2 + " ist die groeßte Zahl.");
                } else {
                    System.out.println(num3 + " ist die groeßte Zahl.");
                }
            }
        } else {        //Wenn num1 kleiner ist als num2, wird ermittelt, ob num2 nun groeßer ist als num3 oder nicht.
            if (num2 > num3) {
                System.out.println(num2 + " ist die groeßte Zahl.");
            } else if (num1 < num3) {
                if (num1 > num3) {
                    System.out.println(num1 + " ist die groeßte Zahl.");
                } else {
                    System.out.println(num3 + " ist die groeßte Zahl.");
                }
            }
        }
    }
}
