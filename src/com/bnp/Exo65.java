package com.bnp;

import java.util.Arrays;

public class Exo65 {
    private static int[] tab = new int[7];

    public static void exo65() {
        for (int k = 0; k < tab.length; k++) {
            tab[k] = tab[k] + 2;
        }
        System.out.println(Arrays.toString(tab));
    }

    private static void method01() {
        for (int k = 1; k <= 6; k++) {
            tab[0] = 1;
            tab[k] = tab[k - 1] + 2;
        }
    }

}

