package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = 4, n = 4, sum = 0;
        int[][] array = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = -90 + (int) (Math.random() * 100);
                System.out.print(array[i][j] + "\t");


            }
        }

        int min = array[0][0];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (array[i][j] < min) {

                    min = array[i][j];
                }

            }
        }

        System.out.println("Minimum = " + min);


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (array[i][j] > 0 && array[i][j] > min) {
                    sum += array[i][j];
                }

            }
        }
    }}
Asellhgftjn



