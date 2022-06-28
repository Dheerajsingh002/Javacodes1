package com.company;

import java.util.Locale;

public class Parent {
    public static void main(String[] args) {
        String s1="dheeraj singh";
        String s2="";
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.length());
        System.out.println(s2.length());
        System.out.println(s2.isEmpty());
        System.out.println(s2.isBlank());
        char c=s1.charAt(2);
        System.out.println(c);
        System.out.println(s1.indexOf('f'));
    }
}
