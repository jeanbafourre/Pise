package com.bnp;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Réécrire l’algorithme précédent, mais cette fois-ci on ne connaît pas d’avance combien l’utilisateur souhaite saisir
de nombres. La saisie des nombres s’arrête lorsque l’utilisateur entre un zéro.
 */

public class Exo59 {

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
}
