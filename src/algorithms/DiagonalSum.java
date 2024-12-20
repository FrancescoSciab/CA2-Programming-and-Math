/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//package algorithms;
//
//import java.util.Scanner;
//
//public class DiagonalSum {
//
//    
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        
//        // Input: Size of the matrix
//        System.out.print("Enter size of matrix: ");
//        int n = scanner.nextInt();
//
//        // Creating a square matrix
//        int[][] matrix = new int[n][n];
//        
//        // Input: Elements of the matrix have to be pasted in console like this: 1 2 3
//                                                                               //4 5 6
//                                                                               //7 8 9
//        System.out.println("Entering elements row by row:");
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                matrix[i][j] = scanner.nextInt();
//            }
//        }
//        // Calculating the sum of the main diagonal and secondary diagonal
//        int mainDiagonalSum = 0;
//        int secondaryDiagonalSum = 0;
//
//        for (int i = 0; i < n; i++) {
//            mainDiagonalSum += matrix[i][i];           // Main diagonal: row = column
//            secondaryDiagonalSum += matrix[i][n - i - 1]; // Secondary diagonal: row + column = n - 1
//        }
//
//        // Output: Display the sums
//        System.out.println("Sum of main diagonal: " + mainDiagonalSum);
//        System.out.println("Sum of secondary diagonal: " + secondaryDiagonalSum);
//
//        scanner.close();
//    
//    }
//    
//}
