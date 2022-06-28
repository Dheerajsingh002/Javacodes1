package com.company;

import java.util.Scanner;

public class Practice31 {
    public static void main(String[] args) {
        int[] a=new int[6];
        Scanner s=new Scanner(System.in);
        int total=0;
        for(int i=0;i<a.length;i++){
            a[i]=s.nextInt();
            total=total+a[i];
        }
        System.out.println(total);
    }
}
