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
public class NewClass18 
{
    public static boolean consicutiveOnes(int num)
    {
        String str = Integer.toBinaryString(num);
        
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='1'&&str.charAt(i+1)=='1')
            {
                return true;
            }
        }
        
        return false;
    }
    
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        
        System.out.println(consicutiveOnes(num));
    }
    
}
