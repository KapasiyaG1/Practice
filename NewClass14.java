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
public class NewClass14 
{
    
    public static void swap(int num1,int num2)
    {
        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;
        
        System.out.println("num1 = "+num1);
        System.out.println("num2 = "+num2);
    }
    
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = scan.nextInt();
        System.out.print("Enter num2: ");
        int num2 = scan.nextInt();
        
        swap(num1,num2);
        
    }
}
