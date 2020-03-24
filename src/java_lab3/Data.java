/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab3;

/**
 *
 * @author MCALAB01128
 */import java.util.*;
public class Data 
{
   
int x,y;
void interchange(int x,int y)
{
int t;
t=x;
x=y;
y=t;
System.out.println("after interchanging:" );
System.out.println("value of"+x);
System.out.println("value of y"+y);
}
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the numbers to be swapped");
 int x=sc.nextInt();
 int y=sc.nextInt();
 Data D=new Data();
 D.interchange(x,y);
}
}
    

