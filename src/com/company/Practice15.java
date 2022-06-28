package com.company;

import java.util.Scanner;

public class Practice15 {
    public static void main(String[] args) {
        boolean flag=false;
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                flag =true;
                break;
            }

        }
        if(!flag){
            System.out.println(" prime");
        }
        else
        {
            System.out.println(" not prime");
        }
    }
}
