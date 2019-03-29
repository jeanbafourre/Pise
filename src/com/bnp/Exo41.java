package com.bnp;

import java.util.Scanner;

public class Exo41 {
    private static int tutu = 5;
    private static int toto = 1;
    private static String tata;
    private static Scanner sc = new Scanner(System.in);

    public static void exo41() {
        System.out.println("likjrvfmlkjibnerfvg : ");
        tata = sc.nextLine();
        if (tata.equals("OK")) {
            tutu = tutu + 1;
            System.out.println(tutu);
        } else if (tutu < toto +4) {
            tutu = tutu - 1;
        }
    }
}
