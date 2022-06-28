package com.company;

import javax.sql.rowset.spi.SyncResolver;
import java.util.Scanner;

public class sample2 {
    static void function1(int i){
        System.out.println("int");
    }
    static void function2(Integer i){
        System.out.println("Integer");
    }

    public static void main(String[] args) {
        byte b=10;
        function1(b);
        Scanner s=new Scanner(System.in);
        int  x=s.nextInt();
        String str=Integer.toOctalString(x);
        String str1=Integer.toBinaryString(x);
        String str2=Integer.toHexString(x);
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);
    }
}
