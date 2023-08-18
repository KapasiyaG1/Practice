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
public class NewClass16
{
    public static boolean isPrime(int num)
    {
        if(num==0||num==1)
        {
            System.out.println("false");
            return false;
        }
        if(num==2)
        {
            return true;
        }
        for(int i=2;i<num/2;i++)
        {
            if(num%i==0)
            {
                System.out.println("false");
                return false;
                
            }
        }
        System.out.println("true---");
        return true;
    }
    
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = scan.nextInt();
        
        if(isPrime(num))
        {
            System.out.println("Given number is prime"); 
        }
        else
        {
            System.out.println("Not a prime number");
        }
        
    }
    
}
