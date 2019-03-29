package com.bnp;

import java.util.Scanner;

public class Exo23 {

    private static String prenom;
    private static Scanner sc = new Scanner(System.in);

    public static void tonNom () {
        tonNom02();
    }

    private static void tonNom02() {
        System.out.println("Quel est votre prénom?");
        switch (prenom=sc.nextLine()) {
            case "Diara":
                System.out.println("Bonjour je t'ai recconnu");
                break;
            default:
                System.out.println("Bonjour, " + prenom + " !");
        }

    }

    private static void tonNom01() {
        System.out.println("Quel est votre prénom?");
        prenom = sc.nextLine();
        System.out.println("Bonjour, " + prenom + " !");
    }
}
