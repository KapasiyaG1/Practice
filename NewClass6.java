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
public class NewClass6 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number one: ");
        int num1 = scan.nextInt();
        System.out.print("Enter number two: ");
        int num2 = scan.nextInt();
        int gcd =1;
        
        for(int i=1;i<=num1&&i<=num2;i++)
        {
            if(num1%i==0&&num2%i==0)
            {
                gcd = i;
            }
        }
        
        System.out.print("GCD: "+gcd);
    }
}
