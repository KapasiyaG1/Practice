/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

import java.util.*;

/**
 *
 * @author soyam
 */
public class NewClass25 
{
    public static void main(String[] args) 
    {
        ArrayList list = new ArrayList();
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the size of array: ");
        int size = scan.nextInt();
        
        for(int i=0;i<size;i++)
        {
            String str = scan.next();
            if(!list.contains(str))
                list.add(str);
        }
        Collections.sort(list);
        
        System.out.println(list);
        
    }
}
