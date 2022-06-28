package com.company;

public class Pactice6 {
    public static void main(String[] args) {
        int i;
        System.out.println("incresing even number");
        for (i = 1; i<= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("decresing even number");
        for (i = 100; i >= 1; i--) {
            if (i % 2 == 0) {
//        System.out.println("decressing even number");
                System.out.print(i + " ");
            }
        }

    }
}
