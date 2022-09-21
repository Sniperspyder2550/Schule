package blatt02;

import java.util.Scanner;

public class Talking {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moin! Wie heißt du?");
        String name = sc.nextLine();
        System.out.println("Willkommen an Bord, " + name + "!");
    }
}
