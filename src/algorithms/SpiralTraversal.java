/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algorithms;
import java.util.Scanner;

public class SpiralTraversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Matrix dimensions
        System.out.print("Enter rows and columns of matrix: ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        // Input: Matrix elements
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Perform spiral traversal
        System.out.println("Spiral Traversal:");
        
        scanner.close();
    }

    
}
