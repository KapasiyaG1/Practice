package Practice;

import java.util.Arrays;
import java.util.Scanner;


public class NewClass5 
{
    public static void avgOfNum(int arr[])
    {
        int avg=0;
        for(int val:arr)
        {
            avg +=val;
        }
        System.out.println("sum of all number: "+(avg/arr.length));
    }

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter size of array");
        int size = scan.nextInt();
        int arr[] = new int[size];
        
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter element "+(i+1));
            arr[i] = scan.nextInt();
        }
        
        avgOfNum(arr);
    }
}
