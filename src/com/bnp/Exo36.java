package com.bnp;

import java.util.Scanner;

public class Exo36 {
    private static Scanner sc = new Scanner(System.in);
    private static int age;

    public static void exo36() {
        if (age == 6 || age == 7) {
            System.out.println("Tu es un petit Poussin!");
        } else if (age == 8 || age == 9) {
            System.out.println("Tu es un Pupille!");
        } else if (age == 10 || age == 11) {
            System.out.println("Tu es un Minime!");
        } else if (age >= 12) {
            System.out.println("Tu es un cadet!");
        } else {
            System.out.println("Tu n'es pas encore assez grand, petit scarabé!!!");
        }

    }

}
