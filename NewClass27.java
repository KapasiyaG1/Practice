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
class NewClass27 
{
    public static void main(String[] args) 
    {
        LinkedList list = new LinkedList();
        list.add("first");
        list.add("second");
        list.addFirst("count");
        list.addLast("Last");
        list.set(3,"third");
        list.addLast("Last");
        
        //Collections.sort(list);
        
        System.out.println(list);
    }
}
