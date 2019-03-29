package com.bnp;

import java.util.Scanner;

public class Exo24 {
    private static float prixArticle;
    private static int nbArticles;
    private static float TVA;
    private static float TVATotale;
    private static float total;
    private static Scanner sc = new Scanner(System.in);

    public static void exo24 () {
        prixArticle = sc.nextFloat();
        System.out.println("Prix de l'article : " + prixArticle);
        nbArticles = sc.nextInt();
        System.out.println("Nombre d'articles : " + nbArticles);
        TVA = sc.nextFloat();
        System.out.println("TVA : " + TVA);
        total = nbArticles * prixArticle;
        TVATotale = TVA * total / 100;
        System.out.println(total + " dont " + TVATotale + " de TVA.");
    }
}
