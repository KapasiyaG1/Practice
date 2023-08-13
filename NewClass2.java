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
public class NewClass2 
{
    public static double circumOFCircle(double radius)
    {
        double circum = 2*(22/7)*radius;
        float c = 22/7;
        System.out.println(c);
        return circum;
    }
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter radius: ");
        double radius = scan.nextDouble();
        
        radius = circumOFCircle(radius);      
        
        System.out.println("Circumference of the circle is: "+radius);
        
    }
    
    
}
