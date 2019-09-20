package com.company;

public class mult {
    public static void main(String[] args) {
        int[][] mult  = new int[10][9];
        for (int i = 1; i < mult.length; i++) {
            for (int j = 1; j < mult[i].length; j++) {
                mult[i][j] = i*j;
                System.out.print(mult[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
