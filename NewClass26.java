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
class NewClass26 
{
    public static void main(String[] args) 
    {
        ArrayList list = new ArrayList();
        Scanner scan = new Scanner(System.in);
        int temp;
        
        do{
            System.out.println("");
            System.out.println("");
            System.out.println("Enter choise: ");
            System.out.println("1. Add Element ");
            System.out.println("2. Remove Element ");
            System.out.println("3. Display Element ");
            System.out.println("4. Sort ");
            System.out.println("5. Exit");
            temp = scan.nextInt();
            switch (temp) {
                case 1:
                    {
                        System.out.print("Enter Element: ");
                        int element = scan.nextByte();
                        list.add(element);
                        System.out.println("Added");
                        break;
                    }
                case 2:
                    {
                        System.out.print("Enter Element for removing: ");
                        int element = scan.nextInt();
                        if(list.contains(element))
                        {
                            list.remove(new Integer(element));
                            System.out.println("Removed");
                        }
                        else
                        {
                            System.out.println("Not Found");
                        }       break;
                    }
                case 3:
                    System.out.print("Elements are: ");
                    System.out.println(list);
                    break;
                case 4:
                    System.out.print("Sorted list: ");
                    Collections.sort(list);
                    System.out.println(list);
                    break;
                default:
                    break;
            }
        }while(temp!=5);
        
        
    }
}
