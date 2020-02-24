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
public class Two_d
{
    public static void main(String args[])
    {
        int i,j,n,m;
        int a[][]=new int[20][20];
        System.out.println("enter the row size");
        Scanner Sc= new Scanner(System.in);
        n=Sc.nextInt();
        System.out.println("enter the col size");
        m=Sc.nextInt();
        System.out.println("enter the elements");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                a[i][j]=Sc.nextInt();
                //System.out.println();
            }
        }
        System.out.println("the two dimensional array is");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print(a[i][j]);
            }
        }
        
        
    }
    
}
