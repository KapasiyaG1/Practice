package Practice;

import java.util.Scanner;

public class NewClass 
{
    public static int sumTon(int num)
    {
        int sum=0;
        for(int i=0;i<=num;i++)
        {
            sum +=i; 
        }
        return sum;
    }
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = scan.nextInt();
        int sum = sumTon(num);
        System.out.println("sum = "+sum);
    }
    
}
