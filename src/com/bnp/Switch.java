package com.bnp;

import java.util.Scanner;

public class Switch {

    private static Scanner sc = new Scanner(System.in);
    private static char tableauCaractere[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};

    public static void Switch() {
        for (int i=0; i<tableauCaractere.length; i++) {
            System.out.println(tableauCaractere[i]);
        }
        System.out.println(tableauCaractere);
    }


}
