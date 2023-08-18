/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice;

import java.util.Scanner;

/**
 *
 * @author soyam
 */
public class NewClass17 
{
	public static void main(String[] args) 
        {
		Scanner scan =new Scanner(System.in);
                int n = scan.nextInt();
                System.out.println(isPrime(n));
	}


    public static boolean isPrime(int n) 
        {
		if (n == 0 || n == 1) 
                {
			return false;
		}
		if (n == 2) 
                {
			return true;
		}
		for (int i = 2; i <= n / 2; i++) 
                {
			if (n % i == 0) 
                        {
				return false;
			}
		}

		return true;
	}
}
