/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author soyam
 */
public class NewClass24 
{
    public static void main(String[] args) 
    {
        ArrayList list = new ArrayList();
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the size of array: ");
        int size = scan.nextInt();
        
        for(int i=0;i<size;i++)
        {
           int temp = scan.nextInt();
           if(!list.contains(temp))
               list.add(temp);
        }
        Collections.sort(list);
        System.out.println(list);
    }
    
}
