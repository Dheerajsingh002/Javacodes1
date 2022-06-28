package com.company;

public class Practice21 {
    public static void main(String[] args) {
//        int[] arr={12,13,14,15,16,17,18};
//        int[][] arr={{12,13,14},{11,12,13}};
        int[][][] arr={{{12,13,14},{11,12,13},{11,12,13}}};
       for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr[i].length;j++){
               for(int k=0;k<arr[i][j].length;k++) {
                   System.out.print(" " + arr[i][j][k]);
               }
               System.out.println();
           }
//           System.out.println();

       }
    }
}
