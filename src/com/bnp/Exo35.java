package com.bnp;

import java.util.Scanner;

public class Exo35 {
    private static int nb1;
    private static int nb2;
    private static Scanner sc = new Scanner(System.in);

    public static void exo35() {
        System.out.println("Veuillez entrer un premier nombre : ");
        nb1 = sc.nextInt();
        System.out.println("Veuillez entrer un deuxième nombre : ");
        nb2 = sc.nextInt();
        if (nb1 == 0 || nb2 == 0) {
            System.out.println("Le produit de ces deux nombre est égal à 0.");
        } else if ((nb1<0 && nb2>0) || (nb1>0 && nb2<0)) {
            System.out.println("Le produit de ces deux nombre est négatif.");
        } else {
            System.out.println("Le produit de ces deux nombre est positif");
        }
    }
}
