package com.bnp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 Écrire un algorithme qui permette de connaître ses chances de gagner au tiercé, quarté, quinté et autres impôts
 volontaires.
On demande à l’utilisateur le nombre de chevaux partants, et le nombre de chevaux joués. Les deux messages affichés
devront être :
Dans l’ordre : une chance sur X de gagner
Dans le désordre : une chance sur Y de gagner
X et Y nous sont donnés par la formule suivante, si n est le nombre de chevaux partants et p le nombre de chevaux joués
(on rappelle que le signe ! signifie "factorielle", comme dans l'exercice 5.6 ci-dessus) :
X = n ! / (n - p) !
Y = n ! / (p ! * (n – p) !)
NB : cet algorithme peut être écrit d’une manière simple, mais relativement peu performante.
Ses performances peuvent être singulièrement augmentées par une petite astuce. Vous commencerez par écrire la manière la plus simple, puis vous identifierez le problème, et écrirez une deuxième version permettant de le résoudre.
 */

public class Exo510bis {

    private static int rendu;
    private static int donne = 100;
    private static int cout = 61;
    private static int piecesOuBillets;
    private static int var0 = 0;

    public static void exo510bis() {

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
}
