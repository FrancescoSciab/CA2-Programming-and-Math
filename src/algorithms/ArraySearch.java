/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//package algorithms;
//import java.util.HashSet;
//import java.util.Scanner;
//
//public class ArraySearch {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        
//        // Input: Size of the array
//        System.out.print("Enter the size of the array: ");
//        int size = scanner.nextInt();
//
//        // Input: Elements of the array
//        System.out.println("Enter the elements of the array:");
//        int[] arr = new int[size];
//        for (int i = 0; i < size; i++) {
//            arr[i] = scanner.nextInt();
//        }
//        
//        // Find the first repeated element
//        HashSet<Integer> seen = new HashSet<>();
//        int firstRepeated = -1;
//        for (int num : arr) {
//            if (seen.contains(num)) {
//                firstRepeated = num;
//                break;
//            }
//            seen.add(num);
//        }
//        // Output the result
//        if (firstRepeated != -1) {
//            System.out.println("First repeated element: " + firstRepeated);
//        } else {
//            System.out.println("No repeated elements found.");
//        }
//        scanner.close();
//
//    }
//
//    
//    
//}
