package com.bnp;

import java.util.Scanner;

public class Exo21 {

    private static Scanner sc = new Scanner(System.in);

    public static void exo21 (){
        calculDuCarre02();
    }

    private static void calculDuCarre02() {
        System.out.print("Entrez un nombre : ");
        int nombre = sc.nextInt();
        System.out.println("Le carré de " + nombre + " est : " + nombre*nombre + ".");
    }

    private static void calculDuCarre01() {
        System.out.print("Entrez un nombre : ");
        int nombre = sc.nextInt();
        int carre = nombre*nombre;
        System.out.println("Le carré de " + nombre + " est : " + carre + ".");
    }
}


