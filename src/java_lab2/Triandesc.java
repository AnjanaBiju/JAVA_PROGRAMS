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
public class Triandesc
{
    public static void main(String a[])
    {
        int i,j,n;
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the limit");
        n=Sc.nextInt();
        System.out.println("TRIANGLE IS");
        for(i=n;i>=0;i--)
        {
            System.out.println();
            for(j=0;j>=i;j++)
            {
                System.out.print(j);
            }
            
        }
    }
}
