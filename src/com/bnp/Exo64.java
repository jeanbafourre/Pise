package com.bnp;

public class Exo64 {
    private static int nb[] = new int[6];
    private static int i;

    public static void exo64() {
        for (i = 0; i <= 5; i++) {
            nb[i] = i * i;
            System.out.println(nb[i]);
        }
    }
}
