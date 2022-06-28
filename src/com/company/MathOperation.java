package com.company;

import java.util.Scanner;

public class MathOperation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        try {
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum = sum + arr[i];
            }
            System.out.println(sum);
            System.out.println("Average = " + sum / n);

        } catch (ArithmeticException obj) {
            System.out.println(obj);
        } catch (NumberFormatException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException f) {
            System.out.println(f);
        }catch (NegativeArraySizeException h){
            System.out.println(h);
        }
    }
}
