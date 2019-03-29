package com.bnp;

import java.util.Scanner;

public class Exo44 {
    private static Scanner sc = new Scanner(System.in);
    private static int nombrePhotocopies;
    private static double montantTotal;

    public static void exo44() {
        System.out.println("Combien avez-vous effectué de photocopies? ");
        nombrePhotocopies = sc.nextInt();

        if (nombrePhotocopies <= 10) {
            montantTotal = 0.1*nombrePhotocopies;
        }
        if (nombrePhotocopies > 10) {
            montantTotal = 0.09*nombrePhotocopies;
        }
        if (nombrePhotocopies > 30) {
            montantTotal = 0.08*nombrePhotocopies;
        }
        if (montantTotal > 1) {
            System.out.println("Montant de votre facture : " + montantTotal + " euros.");
        } else {
            System.out.println("Montant de votre facture : " + montantTotal + " euro.");
        }
    }
}
