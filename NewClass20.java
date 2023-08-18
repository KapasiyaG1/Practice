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
class NewClass20 
{
    public static void convertToWave(int n, int arr[])
    {
        for(int i=0;i<n-1;i+=2)
        {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }
    
    
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        
        int array[] = new int[size];
        for(int i=0;i<size;i++)
        {
            array[i] = scan.nextInt();
        }
        convertToWave(size,array);
        
        for(int i=0;i<size;i++)
        {
            System.out.print(array[i]+" ");
        }
        
        
    }
}
