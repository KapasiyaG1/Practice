/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice;

/**
 *
 * @author soyam
 */
class NewClass19 
{
    public static int fSeries(int num)
    {
        if(num<=1)
            return num;
        
        return fSeries(num-1)+fSeries(num-2); 
    }
    
    
    public static void main(String[] args) 
    {
        for(int i=0;i<10;i++)
        {
            System.out.println(fSeries(i));
        }
        
    }
}
