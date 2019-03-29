package com.bnp;

import java.util.Scanner;

 /*
 Ecrivez un algorithme qui a près avoir demandé un numéro de jour, de mois et d'année à l'utilisateur,
 renvoie s'il s'agit ou non d'une date valide.
 Cet exercice est certes d’un manque d’originalité affligeant, mais après tout, en algorithmique comme ailleurs,
 il faut connaître ses classiques ! Et quand on a fait cela une fois dans sa vie, on apprécie pleinement l’existence
 d’un type numérique « date » dans certains langages…).
Il n'est sans doute pas inutile de rappeler rapidement que le mois de février compte 28 jours,
sauf si l’année est bissextile, auquel cas il en compte 29. L’année est bissextile si elle est divisible par quatre.
Toutefois, les années divisibles par 100 ne sont pas bissextiles, mais les années divisibles par 400 le sont. Ouf !
Un dernier petit détail : vous ne savez pas, pour l’instant, exprimer correctement en pseudo-code l’idée qu’un
nombre A est divisible par un nombre B. Aussi, vous vous contenterez d’écrire en bons télégraphistes
que A divisible par B se dit « A dp B ».
*/

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