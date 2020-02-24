/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab2;

/**
 *
 * @author MCALAB01128
 */
import java.util.*;
public class Dowhile
{
    public static void main(String args[])
    {
        int i=0,n;
        Scanner S=new Scanner(System.in);
        System.out.println("enter the limit");
        n=S.nextInt();
        do
        {
            System.out.println(i);
            i++;
        }while(i<n);    
    }
    
}
