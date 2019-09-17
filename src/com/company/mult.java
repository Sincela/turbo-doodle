package com.company;

public class mult {
    public static void main(String[] args) {
        int[][] mult  = new int[10][10];
        for (int i = 0; i < mult.length; i++) {
            for (int j = 0; j < mult.length; j++) {
                mult[i][j] = (i+1)*(j+1);
                System.out.print(mult[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
