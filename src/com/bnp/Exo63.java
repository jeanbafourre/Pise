package com.bnp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exo63 {
    private static String tab[] = new String[9];
    private static List tab2 = new ArrayList();
    private static Scanner sc = new Scanner(System.in);
    private static String note;

    public static void exo63() {
        for (int i = 0; i < tab.length; i++) {
            note = sc.nextLine();
            tab[i] = note;
        }
        // System.out.println(tab); ------------> Cette ligne de code affiche l'adresse mémoire du tableau!!!
        System.out.println(Arrays.toString(tab)); // ------------> Cette ligne de code affiche les valeurs du tableau.
    }
}
