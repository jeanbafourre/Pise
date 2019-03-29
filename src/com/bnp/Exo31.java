package com.bnp;

import java.util.Scanner;

public class Exo31 {
    private static int nombre;
    private static Scanner sc = new Scanner(System.in);

    public static void exo31() {
        nombre = sc.nextInt();
        if (nombre<0) {
            System.out.println("Ce nombre est négatif.");
        } else if (nombre>0) {
            System.out.println("Ce nombre est positif.");
        } else {
            System.out.println("Vous avez tapé 0.");
        }
    }
}
