package com.bnp;

import java.util.Scanner;

/*
Ecrire un algorithme qui demande à l’utilisateur un nombre compris entre 1 et 3 jusqu’à ce que la réponse convienne.
 */

public class Exo51 {

    private static int n;
    private static Scanner sc = new Scanner(System.in);

  public static void resultat() {

        System.out.println("Entrez un nombre entre 1 et 3");

        while (n < 10 || n > 20) {
            n = sc.nextInt();
            if (n < 10) {
                System.out.println("plus grand !");
            } else if (n > 20) {
                System.out.println("plus petit !");
            }
        }
        System.out.println("gagné !!!");
    }
}
