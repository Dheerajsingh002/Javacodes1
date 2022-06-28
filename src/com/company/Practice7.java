package com.company;

import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int sum=0;
       while(true){
           System.out.println("enter the number");
           sum +=s.nextInt();

           if(sum==n)
               break;
       }
        System.out.println("Done "+ sum);


    }

}
