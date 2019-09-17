package com.company;

public class Main {

    public static void main(String[] args) {

        int[][] matrixA;
        matrixA = new int[10][10];


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matrixA[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

