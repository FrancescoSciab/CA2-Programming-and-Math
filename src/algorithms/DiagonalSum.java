/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algorithms;

import java.util.Scanner;

public class DiagonalSum {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input: Size of the matrix
        System.out.print("Enter size of matrix: ");
        int n = scanner.nextInt();

        // Creating a square matrix
        int[][] matrix = new int[n][n];
        
        // Input: Elements of the matrix
        System.out.println("Entering elements row by row:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }
    
}
