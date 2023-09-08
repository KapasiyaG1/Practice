/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author soyam
 */
class NewClass21 
{
     public static String isSubset( int a1[], int a2[], int n, int m) 
    {
       
      ArrayList<Integer> list = new ArrayList<>();
      for(int i:a1)
      {
          list.add(i);
      }
      for(int i:a2)
      {
          if(!list.contains(i))
          {
              return "No";
          }
          else
          {
              list.remove(i);
          }
      }
      return "Yes";
        
    }
     
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of first Array");
        int size1 = scan.nextInt();
        System.out.println("Enter elements:");
        int[] array1 = new int[size1];
        for(int i=0;i<size1;i++)
        {
            array1[i] = scan.nextInt();
        }
        
        System.out.println("Enter the size of second Array");
        int size2 = scan.nextInt();
        System.out.println("Enter elements:");
        int[] array2 = new int[size2];
        for(int i=0;i<size2;i++)
        {
            array2[i] = scan.nextInt();
        }
        
        System.out.println(isSubset(array1,array2,size1,size2));
        
    }
}
