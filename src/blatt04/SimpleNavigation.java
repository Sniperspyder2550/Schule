package blatt04;

import java.util.Scanner;

public class SimpleNavigation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Punkt 1: x & y Koordinaten
        System.out.println("Bitte geben Sie die X Koordinate für den ersten Punkt an");
        int p1x = sc.nextInt();
        System.out.println("Bitte geben Sie die Y Koordinate für den ersten Punkt an");
        int p1y = sc.nextInt();

        //Punkt 2: x & y Koordinaten
        System.out.println("Bitte geben Sie die X Koordinate für den zweiten Punkt an");
        int p2x = sc.nextInt();
        System.out.println("Bitte geben Sie die Y Koordinate für den zweiten Punkt an");
        int p2y = sc.nextInt();


        //Solange Punkt1 nicht auf Punkt 2 liegt, werden die
        if (p1x != p2x && p1y != p2y) {
            while (p1x != p2x) {
                if (p1x > p2x) {
                    System.out.println(" Links(" + p1x + "|" + p1y + ")");
                    p1x--;
                } else {
                    System.out.println(" Rechts(" + p1x + "|" + p1y + ")");
                    p1x++;

                    while (p1y != p2y) {
                        if (p1y > p2y) {
                            System.out.println(" Runter(" + p1x + "|" + p1y + ")");
                            p1y--;
                        } else {
                            System.out.println(" Hoch(" + p1x + "|" + p1y + ")");
                            p1y++;
                        }

                    }
                }
            }
        } else {
            System.out.println("Der Punkt hat das Ziel (" + p1x + "|" + p1y + ") erreicht.");
        }
        System.out.println("Der Punkt hat das Ziel (" + p1x + "|" + p1y + ") erreicht.");

    }
}
