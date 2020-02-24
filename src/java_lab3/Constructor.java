/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab3;

/**
 *
 * @author MCALAB01128
 */
import java.util.*;
public class Constructor 
{
    int no;
   String type,ac;
   double area;
   void setData()
   {
       Scanner s=new Scanner(System.in);
       System.out.println("room no");
       no=s.nextInt();
       System.out.println("room type");
       type=s.next();
       System.out.println("room ac");
       ac=s.next();
       System.out.println("room area");
       area=s.nextInt();
   }
   void display()
   {
       System.out.println("room no"+no);
       System.out.println("room type"+type);
       System.out.println("room ac"+ac);
       System.out.println("room area"+area);
   }
 
       public static void main(String args[])
       {
      Constructor m=new Constructor();
        m.setData();
        m.display();
 
       }
    
}
