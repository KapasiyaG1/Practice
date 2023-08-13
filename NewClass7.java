/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author soyam
 */
public class NewClass7 
{

    public static void main(String[] args) 
    {
        String input = "[13, 3,4,5,6,7,8,5,3]";
        input = input.replaceAll("\\s+", "");
        String str = input.substring(1, input.length() - 1);
        // Remove square brackets and split the string by commas
        String[] numbersStr = str.split(",");
        
        // Convert string numbers to integers and store in an array
        int[] numbers = new int[numbersStr.length];
        for (int i = 0; i < numbersStr.length; i++) {
            numbers[i] = Integer.parseInt(numbersStr[i]);
        }
        
        // Calculate the sum of the first two numbers
        int sum = numbers[0] + numbers[1];
        
        // Print the result
        System.out.println("Input Array: "+ input);
        System.out.println("Sum of the first two numbers: " + sum);
    }
}