package com.Days;

import java.util.Scanner;

class Star {
    void printStar() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 5; j >= i; --j) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; ++k) {
                System.out.print("* ");
            }
            for (int k1 = 1; k1 <= i + 1; ++k1) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j <= i; ++j) {
                System.out.print("  ");
            }
            for (int k = 5; k >= i; --k) {
                System.out.print("* ");
            }
            for (int k1 = 5; k1 >= i + 1; --k1) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void HolowStar() {
        for (int i = 0; i <= 5; i++) {
//            1st star pattern
            for (int j = 5; j >= i; --j) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; ++k) {
                System.out.print("* ");
            }
//            for (int k1 = 1; k1 <= i + 1; ++k1) {
//                System.out.print("* ");
//            }
            System.out.println();
        }

//        for (int i = 1; i <= 5; i++) {
//            for (int j = 0; j <= i; ++j) {
//                System.out.print("  ");
//            }
//            for (int k = 5; k >= i; --k) {
//                System.out.print("* ");
//            }
//            for (int k1 = 5; k1 >= i + 1; --k1) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
    }
}


public class Day_04 {
    public static void main(String[] args) {
        Star s = new Star();   // create object of Star class
//        s.printStar();         // call the method
        s.HolowStar();
    }
}
