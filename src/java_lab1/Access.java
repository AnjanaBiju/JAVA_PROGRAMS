/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab1;

/**
 *
 * @author MCALAB01128
 */
public class Access 
{
                        private short s;
			private int i;
			private long l;
			private double d;
			private byte b;
			private char c;
			private boolean bln;
			private String str;
			public static void main(String arg[])
						{
						 Access A = new Access();
						 System.out.println("Short s=" + A.s);
						 System.out.println("Integer i=" + A.i);
						 System.out.println("Long l=" + A.l);
						 System.out.println("Double d=" + A.d);
						 System.out.println("Byte b=" + A.b);
						 System.out.println("Character c=" + A.c);
                                                 System.out.println("Boolean bln=" + A.bln);
						 System.out.println("string str =" + A.str);
						}
    
}
