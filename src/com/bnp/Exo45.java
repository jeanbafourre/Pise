package com.bnp;

import java.util.Scanner;

public class Exo45 {
    private static Scanner sc = new Scanner(System.in);
    private static int age;
    private static String sexe;
    private static boolean homme;

    public static void exo45 () {
        System.out.println("Veuillez préciser votre âge : ");
        age = sc.nextInt();
        System.out.println("Etes vous : HOMME ou FEMME ? ");
        sc.nextLine();
        sexe = sc.nextLine();
        if (sexe.equals("homme")) {
            homme = true;
        }
        if (sexe.equals("femme")){
            homme = false;
        }

        if ((homme && age > 20) || (!homme && age >= 18 && age <= 35)) {
            System.out.println("Vous êtes imposable.");
        } else {
            System.out.println("Vous n'êtes pas imposable.");
        }

    }
}
