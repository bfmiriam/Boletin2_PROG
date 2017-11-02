

package boletin2_4;

import java.util.Scanner;



public class Boletin2_4{

   
    public static void main(String[] args) {
Scanner cs= new Scanner(System.in);
        
        float num1, num2;
        
        System.out.println("teclea num1");
        num1= cs.nextFloat();
        
        System.out.println("teclea num2");
        num2= cs.nextFloat();
        
        System.out.println("num1 + num2 = "+(num1+num2));
        System.out.println("num1 - num2 = "+(num1-num2));
        System.out.println("num1 x num2 = "+(num1*num2));
        System.out.println("num1 / num2 = "+(num1/num2));
    }
}