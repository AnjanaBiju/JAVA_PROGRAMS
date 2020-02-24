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
public class One_d
{
    public static void main(String args[])
    {
        int a[]=new int[20];
        int n,i;
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the length of the array");
        n=Sc.nextInt();
        System.out.println("enter the array elements");
        for(i=0;i<n;i++)
           a[i]=Sc.nextInt();
        System.out.println("One dimensional array is:");
        for(i=0;i<n;i++)
           System.out.println(a[i]);
        
    }
    
}
