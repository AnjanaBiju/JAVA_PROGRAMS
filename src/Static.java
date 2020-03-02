/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab4;

/**
 *
 * @author MCALAB01128
 */
public class Static {
    int y;
    static int x;
   static
   {
       System.out.println("Static");
       x=5;
       System.out.println(x);
   }
   static void staticMethod()
   {
       System.out.println("Inside Static Method");
       x=10;
       System.out.println(x);
   }
   void display()
   {
       System.out.println("inside display method");
       x=15;
       y=20;
       System.out.println(x);
       System.out.println(y);
   }
   public static void main(String a[])
   {
       System.out.println(x);
           staticMethod();
       
           Static s=new Static();
           s.display();
           System.out.println(s.x);
           System.out.println(s.y);
       
   }
    
}
