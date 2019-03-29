package com.bnp;

import java.util.Scanner;

public class Exo46 {
    private static Scanner sc = new Scanner(System.in);
    private static double candidat1;
    private static double candidat2;
    private static double candidat3;
    private static double candidat4;

    public static void exo46() {
        candidat1 = sc.nextDouble();
        candidat2 = sc.nextDouble();
        candidat3 = sc.nextDouble();
        candidat4 = sc.nextDouble();
        System.out.println("candidat n° 1 : " + candidat1 + " % des suffrages.");
        System.out.println("candidat n° 2 : " + candidat2 + " % des suffrages.");
        System.out.println("candidat n° 3 : " + candidat3 + " % des suffrages.");
        System.out.println("candidat n° 4 : " + candidat4 + " % des suffrages.");

        if (candidat1 >= 12.5 && candidat1 < 50 && candidat2 < 50 && candidat3 < 50 && candidat4 < 50) {
            if (candidat1 < candidat2 && candidat1 < candidat3 && candidat1 < candidat4) {
                System.out.println("Le candidat n° 1 est défavorable pour le second tour.");
            } else {
                System.out.println("Le candidat n° 1 part favorable pour le second tour.");
            }
        } else if (candidat1 >= 50) {
            System.out.println("Le candidat n° 1 est élu dès le premier tour.");
        } else if ((candidat1 >= 12.5) && (candidat2 >= 50 || candidat3 >= 50 || candidat4 >= 50)) {
            System.out.println("Il n'y a pas de second tour");
        } else {
            System.out.println("Le candidat n'est pas éligible au second tour.");
        }
    }
}
