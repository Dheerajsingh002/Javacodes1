package com.company;

import java.util.Scanner;

public class Practice23 {
    public static void main(String[] args) {
        int[] arr=new int[5];
        int total=0;
        Scanner s=new Scanner(System.in);
        int n;
        for(int i=0;i<arr.length;i++){
            System.out.println("enter the element of array");
            arr[i]=s.nextInt();
            total=total+arr[i];
        }
        System.out.println(total);
    }
}
