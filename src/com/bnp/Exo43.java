package com.bnp;

import java.util.Scanner;

public class Exo43 {
    private static int heure;
    private static int minute;
    private static int seconde;
    private static Scanner sc = new Scanner(System.in);

    public static void exo43() {

        heure = sc.nextInt();
        minute = sc.nextInt();
        seconde = sc.nextInt();
        seconde = seconde + 1;

        Method02();

        System.out.println("Dans une seconde, il sera " + heure + ":" + minute + ":" + seconde);
    }

    private static void Method02() {
        if (seconde == 60) {
            seconde = 0;
            minute = minute + 1;
        }
        if (minute == 60) {
            minute = 0;
            heure = heure + 1;
        }
        if (heure == 24) {
            heure = 0;
        }
    }

    private static void Method01() {
        if (heure == 23) {
            if (minute == 59) {
                if (seconde == 59) {
                    heure = 0;
                    minute = 0;
                    seconde = 0;
                } else if (seconde < 59) {
                    seconde = seconde + 1;
                }
            } else if (minute < 59) {
                if (seconde < 59) {
                    seconde = seconde + 1;
                } else if (seconde == 59) {
                    minute = minute + 1;
                    seconde = 0;
                }
            }
        } else if (heure < 23) {
            if (minute == 59) {
                if (seconde == 59) {
                    heure = heure + 1;
                    minute = 0;
                    seconde = 0;
                } else if (seconde < 59) {
                    seconde = seconde + 1;
                }
            } else if (minute < 59) {
                if (seconde == 59) {
                    minute = minute + 1;
                    seconde = 0;
                } else if (seconde < 59) {
                    seconde = seconde + 1;
                }
            }
        }
    }
}
