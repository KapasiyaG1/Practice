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
public class NewClass10 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter rows");
        int rows = scan.nextInt();
        System.out.println("Enter colums");
        int colums = scan.nextInt();
        
        int[][] arr = new int[rows][colums];
        
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<colums;j++)
            {
                System.out.print("Enter element ["+i+"]["+j+"] :");
                arr[i][j] = scan.nextInt();
            }
        }
        
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<colums;j++)
            {
                System.out.print(" Element ["+i+"]["+j+"] : ");
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
    }
}
