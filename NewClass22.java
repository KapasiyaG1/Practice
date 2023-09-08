/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author soyam
 */
public class NewClass22 {

    // Function to rotate the array to the right by 'k' positions
    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle cases where k is larger than array length

        // Reverse the entire array
        reverseArray(arr, 0, n - 1);

        // Reverse the first 'k' elements
        reverseArray(arr, 0, k - 1);

        // Reverse the remaining 'n - k' elements
        reverseArray(arr, k, n - 1);
    }

    // Helper function to reverse the array in a given range
    private static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int rotations = 2;

        System.out.println("Original Array: " + Arrays.toString(arr));
        rotateArray(arr, rotations);
        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }
}
