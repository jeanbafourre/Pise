package com.bnp;

import java.util.Scanner;

public class Exo32 {
    private static Scanner sc = new Scanner(System.in);
    private static int nb1;
    private static int nb2;

    public static void exo32() {
        System.out.println("Entrez un premier nombre : ");
        nb1 = sc.nextInt();
        System.out.println("Entrez un deuxième nombre : ");
        nb2 = sc.nextInt();
        if (nb1<0 & nb2<0) {
            System.out.println("le produit de ces deux nombres est positif.");
        } else if (nb1>0 & nb2<0) {
            System.out.println("le produit de ces deux nombres est négatif.");
        } else if (nb1<0 & nb2>0) {
            System.out.println("le produit de ces deux nombres est négatif.");
        } else if (nb1>0 & nb2>0) {
            System.out.println("le produit de ces deux nombres est positif.");
        }
    }
}
