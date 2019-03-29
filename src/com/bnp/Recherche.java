package com.bnp;

import java.util.Scanner;

public class Recherche {

    private static Scanner sc = new Scanner(System.in);
    private static char tableau[] = {'a', 'r', 'e', 's', 'c', 'i'};
    private static String input;
    private static int i;

    public static void rechercheTableau () {
        System.out.print("Entrez une lettre : ");
        char input = sc.nextLine().charAt(0);
        while (i<tableau.length && input != tableau[i] ) i++;
        if(i<tableau.length) {
            System.out.println(input + " fait partie du tableau.");
        } else {
            System.out.println(input + " ne fait pas partie du tableau. Essayez de nouveau : ");
            input = sc.nextLine().charAt(0);
        }
    }
}



