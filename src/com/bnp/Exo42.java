package com.bnp;

import java.util.Scanner;

public class Exo42 {
    private static int h;
    private static int m;
    private static Scanner sc = new Scanner(System.in);

    public static void exo42() {
        h = sc.nextInt();
        m = sc.nextInt();
        if (h < 23 && m == 59) {
            h = h + 1;
            m = 0;
            int min = m + 1;
            System.out.println("Dans une minute, il sera " + h + ":" + min);
        } else if ((h == 23 || h == 24) && (m == 59)) {
            h = 00;
            m = 00;
            int min = m + 1;
            System.out.println("Dans une minute, il sera " + h + ":" + min);
        }
    }
}
