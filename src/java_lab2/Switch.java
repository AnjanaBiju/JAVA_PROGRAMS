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
public class Switch
{
    public static void main(String args[])
    {
        int ch=90;
        switch(ch)
                {
                    case 90:
                            System.out.println("VERY GOOD");
                            break;
                    case 80:
                            System.out.println("GOOD");
                            break;
                    case 70:
                            System.out.println("AVERAGE");
                            break;
                    case 60:
                            System.out.println("PASS");
                            break;
                    default:
                            System.out.println("INVALID");
                         
                }
    }
}
