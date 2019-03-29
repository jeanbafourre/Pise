package com.bnp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Entrainement {

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

    public static void exo510() {

        do {
            System.out.println(liste.get(p));
            p++;
        } while (p <= liste.size());


    }

    public static void exo511() {


        rendu = donne - cout;
        System.out.println("Total TTC : " + cout);
        System.out.println("Payé : " + donne);
        System.out.println("À rendre : " + rendu);

        // je calcule ce qu'il reste du rendu après avoir divisé par 10.
        piecesOuBillets = rendu % 10;
        // je calcule le nombre de billets de 10 euros
        var0 = rendu - piecesOuBillets;
        System.out.println("Billets de 10 euros : " + var0 / 10);


        if (piecesOuBillets == 5) {
            System.out.println("Billet de 5 euros : 1");
        } else if (piecesOuBillets > 5) {
            int var3 = piecesOuBillets % 5;
            int var4 = piecesOuBillets - var3;
            System.out.println("Billet de 5 euros : " + var4);
            System.out.println("Pièce(s) de 1 euro : " + var3);
        } else {
            System.out.println("Pièce(s) de 1 euro : " + piecesOuBillets);
        }



    }








/*
    public static void exo59() {

        do {
            System.out.print("Entrez le nombre numéro " + i + " : ");
            input = sc.nextInt();
            liste.add(input);
            i++;
        }
        while (input != 0);


        for (int i = 0; i < liste.size(); i++) {
            if (liste.get(i) > max) {
                max = liste.get(i);
                position = i;
            }
        }
        System.out.println("le plus grand de ces nombres est " + max);
        System.out.println("il est à la position  " + position);
    }
*/


/*

    public static void exo58() {
        for (int i = 0; i < 5; i++) {
            System.out.print("Entrez le nombre numéro " + i + " : ");
            input = sc.nextInt();
            tab[i] = input;
            System.out.println(tab[i]);
        }
        for (int i =0; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
                position = i;
            }
        }
        System.out.println("le plus grand de ces nombres est " + max);
        System.out.println("il est à la position  " + position);
    }
*/


    /*
        public static void exo57() {
        System.out.println("Entrez un nombre");
        input = sc.nextInt();
        for (int i = 1; i <= input; i++) {
            // liste.add(i);
            produit = produit * i;
        }
        System.out.println(produit);
    }*/

/*    public static void exo56() {
        System.out.println("Entrez un nombre");
        input = sc.nextInt();
        for (int i = 1; i <= input; i++) {
            liste.add(i);
            System.out.println(liste);
            somme = somme + i;
            System.out.println(somme);
        }

    }*/

/*    public static void resultat() {

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
    }*/
}
