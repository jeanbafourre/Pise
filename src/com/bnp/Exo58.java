package com.bnp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 Ecrire un algorithme qui demande successivement 20 nombres à l’utilisateur, et qui lui dise ensuite quel était le
plus grand parmi ces 20 nombres :
Entrez le nombre numéro 1 : 12
Entrez le nombre numéro 2 : 14
etc.
Entrez le nombre numéro 20 : 6
Le plus grand de ces nombres est  : 14
Modifiez ensuite l’algorithme pour que le programme affiche de surcroît en quelle position avait été saisie ce nombre :
C’était le nombre numéro 2
 */

public class Exo58 {

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
}
