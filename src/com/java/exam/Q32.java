package com.java.exam;

import java.util.Scanner;

public class Q32 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns of Matrix A: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        System.out.print("Enter rows and columns of Matrix B: ");
        int n2 = sc.nextInt();
        int p = sc.nextInt();

        // Validate dimensions
        if (n != n2) {
            System.out.println("Matrix multiplication not possible");
            return;
        }

        int[][] A = new int[m][n];
        int[][] B = new int[n2][p];
        int[][] C = new int[m][p];

        System.out.println("Enter elements of Matrix A:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of Matrix B:");

        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < p; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < p; j++) {

                for (int k = 0; k < n; k++) {

                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Result Matrix:");

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < p; j++) {

                System.out.print(C[i][j] + " ");
            }

            System.out.println();
        }
    }
}
