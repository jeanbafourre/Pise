package com.bnp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 Ecrire un algorithme qui demande un nombre de départ, et qui calcule sa factorielle.
NB : la factorielle de 8, notée 8 !, vaut
1 x 2 x 3 x 4 x 5 x 6 x 7 x 8
 */
public class Exo57 {

    private static int n;
    private static Scanner sc = new Scanner(System.in);
    private static Integer input;
    private static List<Integer> liste = new ArrayList<>();
    private static int somme = 0;
    private static int produit = 1;
    private static int max = 0;
    private static int position;
    private static int[] tab = new int[5];
    private static int i = 1;
    private static int p = 0;
    private static int rendu;
    private static int donne = 100;
    private static int cout = 61;
    private static int piecesOuBillets;
    private static int cinqEuros;
    private static int var0 = 0;

    public static void exo57() {
        System.out.println("Entrez un nombre");
        input = sc.nextInt();
        for (int i = 1; i <= input; i++) {
            // liste.add(i);
            produit = produit * i;
        }
        System.out.println(produit);
    }
}
