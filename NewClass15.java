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
public class NewClass15 
{
    public static void usingBIF(String str)
    {
        if(str.toLowerCase().matches(".*[aeiou].*"))
        {
            System.out.println("Yes, Vowel present");
        }
        else
        {
            System.out.println("No, Vowel not present");
        }
    }
    
    public  boolean usingCF(String str)
    {
        str = str.toLowerCase();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
            {
                return true;
            }
            
        }
        return false;
        
    }
    
    
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = scan.nextLine();
        
        if(str.equals(""))
        {
            System.out.println("Enter valid String");
        }
        else
        {
            System.out.println("");
        System.out.println("Output By Builtin Function ");
        usingBIF(str);
        System.out.println("");
        System.out.println("Output By Created method:");
        NewClass15 obj = new NewClass15();
        boolean ans = obj.usingCF(str);
        if(ans==true)
        {
            System.out.println("Yes, Vowel present");
        }
        else
        {
            System.out.println("No, Vowel not present");
        }
        }
    }
    
}