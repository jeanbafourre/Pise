package com.bnp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exo33 {
    private static String nom1;
    private static String nom2;
    private static String nom3;
    private static Scanner sc = new Scanner(System.in);
    public static List<String> tab1 = new ArrayList<>();
    public static List<String> tab2 = new ArrayList<>();

    public static void exo33() {
        System.out.println("Entrez un premier nom : ");
        nom1 = sc.nextLine();
        tab1.add(nom1);
        tab2.add(nom1);
        System.out.println("Entrez un second nom : ");
        nom2 = sc.nextLine();
        tab1.add(nom2);
        tab2.add(nom2);
        System.out.println("Entrez un troisième nom : ");
        nom3 = sc.nextLine();
        tab1.add(nom3);
        tab2.add(nom3);

        tab1.sort(String::compareTo);

        int i = nom1.compareTo(nom2);
        int j = nom2.compareTo(nom3);
        int k = nom1.compareTo(nom3);

        System.out.println("i = " + i + " j = " + j + " k = " + k);

        if (tab1.get(0).equals(tab2.get(0)) && tab1.get(1).equals(tab2.get(1)) && tab1.get(2).equals(tab2.get(2))) {
            System.out.println("Ces noms sont classés alphabétiquement");
        } else {
            System.out.println("Ces noms ne sont pas classés");
        }

    }
}
