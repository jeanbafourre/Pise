package com.bnp;

import java.util.Scanner;

public class Exo34 {
    private static Scanner sc = new Scanner(System.in);
    private static int nb;

    public static void exo34() {
        System.out.print("Rentrez un nombre entier, positif ou négatif : ");
        nb = sc.nextInt();

        if (nb>0) {
            System.out.println("Ce nombre est positif.");
        } else if (nb==0) {
            System.out.println("Ce nombre est 0.");
        } else {
            System.out.println("Ce nombre est négatif.");
        }
    }
}
