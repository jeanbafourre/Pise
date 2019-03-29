package com.bnp;

import java.util.Scanner;

public class Exo48 {
    private static int year;
    private static int month;
    private static int day;
    private static Scanner sc = new Scanner(System.in);
    private static int dayMax;

    // Je définis une variable qui retourne un boolean indiquant si l'année est bissextile ou non.
    public static boolean isBissextile (int year) {
        return (year%4==0 && year%400!=0) || year%400==0;
    }

    // Je définis une variable qui retourne un boolean indiquant si le mois est valide ou non.
    public static boolean isOkMonth (int month){
        return month>=1 && month<=12;
    }

    // Je définis une variable qui retourne un boolean indiquant si le jour est valide ou non.
    public static boolean isDayOK (int day) {
        return day>=1 && day<=dayMax;
    }

    public static void exo48 () {
        System.out.print("Veuillez rentrer l'année : ");
        year = sc.nextInt();
        System.out.print("Veuillez rentrer le mois : ");
        month = sc.nextInt();
        System.out.print("Veuillez rentrer le jour : ");
        day = sc.nextInt();

        // Je définis une variable de nombre de jours maximum (dayMax).
        if (month==2 && isBissextile(year)) {
            dayMax=29;
        } else if (month==2) {
            dayMax=28;
        } else if (month==4 || month==6 || month==9 || month==11) {
            dayMax=30;
        } else {
            dayMax=31;
        }

        if (year>=0 && isOkMonth(month) && isDayOK(day)) {
            System.out.println("date valide");
        } else {
            System.out.println("date non valide!");
        }
    }
}