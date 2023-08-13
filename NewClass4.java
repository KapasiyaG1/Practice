package Practice;

import java.util.Scanner;


class Solution
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int num = scan.nextInt();
        
        System.out.println("0");
        System.out.println("1");
        int num1=0,num2=1,num3;
        for(int i=2;i<num;i++)
        {
            num3 = num1+num2;
            System.out.println(num3);
            num1 = num2;
            num2 = num3;
        }
    }
}