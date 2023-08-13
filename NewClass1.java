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
public class NewClass1 
{
    public static void greater(int num1,int num2)
    {
        System.out.println(num1==num2?"yes":"no");
    }
    
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number 1:");
        int num1 = scan.nextInt();
        System.out.print("Enter number 2:");
        int num2 = scan.nextInt();
        
        greater(num1,num2);
    }
    
}
