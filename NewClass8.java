/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

import java.util.Scanner;

/**
 *
 * @author soyam
 */
public class NewClass8 
{
    public static int[] plusOne(int[] digits) 
    {
       for (int i = digits.length - 1; i >= 0; i--) 
       {
	        if (digits[i] < 9) 
            {
	    	    digits[i]++;
	    	    return digits;
	        }
	        digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
    
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        
        for(int i=0;i<size;i++)
        {
            System.out.print("Enter element "+(i+1)+": ");
            arr[i]=scan.nextInt();
        }
        int[] ans;
        ans = plusOne(arr);
        
        for(int val:ans)
        {
            System.out.print(val+" ");
        }
    }
}
