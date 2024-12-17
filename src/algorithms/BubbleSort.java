/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//package algorithms;
//import java.util.Scanner;
//
//public class BubbleSort {
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
//        // Display the array before sorting
//        System.out.println("Array before sorting:");
//        printArray(arr);
//
//        // Sort the array using Bubble Sort and count swaps
//        int totalSwaps = bubbleSort(arr);
//
//        // Display the array after sorting
//        System.out.println("Array after sorting:");
//        printArray(arr);
//
//        // Output the total number of swaps
//        System.out.println("Total number of swaps performed: " + totalSwaps);
//
//        scanner.close();
//    }
//
//    // Bubble Sort function
//    public static int bubbleSort(int[] arr) {
//        int n = arr.length;
//        int swapCount = 0;
//
//        for (int i = 0; i < n - 1; i++) {
//            boolean swapped = false;
//
//            // Compare adjacent elements
//            for (int j = 0; j < n - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    // Swap elements
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//
//                    swapCount++;
//                    swapped = true;
//                }
//            }
//
//            // If no swaps were made in this pass, array is already sorted
//            if (!swapped) {
//                break;
//            }
//        }
//        return swapCount;
//    }
//
//    // Function to print an array
//    public static void printArray(int[] arr) {
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
//        System.out.println();
//    }    
//}
