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
class NewClass13 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String ans ="";
        
        if(str.equals(""))
        {
            System.out.println("Please Enter valid String");
        }
        else
        {
            char ch;
            for(int i=0;i<str.length();i++)
            {
                ch = str.charAt(i);
                ans = ch+ans;
            }
            System.out.println("Reverse String is: "+ans);
        }
    }
}
