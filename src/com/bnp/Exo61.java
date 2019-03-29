package com.bnp;

import java.util.Arrays;

public class Exo61 {

    private static int tableau[] = new int[7];
    private static int i;

    public static void exo61() {
        for (i = 0; i < 6 ; i++) {
            tableau[i] = 0;
        }
    }

    private static void method01() {
        for (i=0; i<tableau.length; i++) {
            tableau[i] = tableau[i] + 1;
        }
        System.out.println(Arrays.toString(tableau));
    }

}
