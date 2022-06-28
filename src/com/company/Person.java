package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Person {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the element of the array");
        try {
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(arr[s.nextInt()]);
        System.out.println("The array element successfully accessed");

        }
        catch (ArrayIndexOutOfBoundsException obj) {
            System.out.println(obj);
        }catch (InputMismatchException e) {
            System.out.println(e);
        }


    }
}
