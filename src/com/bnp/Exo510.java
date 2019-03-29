package com.bnp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Exo510 {

    /*
Lire la suite des prix (en euros entiers et terminée par zéro) des achats d’un client. Calculer la somme qu’il doit,
lire la somme qu’il paye, et simuler la remise de la monnaie en affichant les textes "10 Euros", "5 Euros" et "1 Euro"
autant de fois qu’il y a de coupures de chaque sorte à rendre.
 */

    private static int sommeDue;
    private static int sommeDonnee;
    private static int sommeRendue;
    private static int article = 1;
    private static int nb10;
    private static int nb5;
    private static int nb1;
    private static Scanner sc = new Scanner(System.in);
    private static List<Integer> list = new ArrayList();

    public static void exo510() {

        creationArray();

        sommeTotale();

        paiementClient();

        renduMonnaie();
    }

    private static void creationArray() {
        boolean hasEnded = false;
        // hasEnded == false, c'est la même chose que !hasEnded.
        while (!hasEnded) {
            System.out.print("Entrez le montant : ");
            article = sc.nextInt();
            list.add(article);

            if (article == 0) {
                hasEnded = true;
            }
        }
    }

    private static void sommeTotale() {
        for (int i = 0; i < list.size(); i++) {
            sommeDue = sommeDue + list.get(i);
        }
        System.out.println("Le client doit payer " + sommeDue + " euros.");
    }

    private static void renduMonnaie() {
        System.out.println("La monnaie rendue est de " + sommeRendue + ".");
        nb10 = 0;
        while (sommeRendue >= 10) {
            nb10 = nb10 + 1;
            sommeRendue = sommeRendue - 10;
        }
        nb5 = 0;
        while (sommeRendue >= 5) {
            nb5 = nb5 + 1;
            sommeRendue = sommeRendue - 5;
        }
        nb1 = 0;
        while (sommeRendue >= 1) {
            nb1 = nb1 + 1;
            sommeRendue = sommeRendue - 1;
        }
        System.out.println("Vous devez rendre " + nb10 + " billet(s) de 10 euros, " + nb5 + " billet(s) de 5 euros, " + nb1 + " pièce(s) de 1 euro.");
    }

    private static void paiementClient() {
        System.out.print("Montant versé : ");
        sommeDonnee = sc.nextInt();
        ;
        sommeRendue = sommeDonnee - sommeDue;
    }

    private static void recapitulatifClient() {
        System.out.println("Le client doit payer " + sommeDue + " euros.");
    }

    private static void demanderArticle() {
        System.out.print("Entrez le montant : ");
        article = sc.nextInt();
        sommeDue = sommeDue + article;
    }

}