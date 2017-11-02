
package boletin2_7;

import java.util.Scanner;


public class Boletin2_7 {

   
    public static void main(String[] args) {
      
  
  float gC, K, F; 
  
   Scanner cs = new Scanner (System.in);
    System.out.println("teclea graos centigrados");
    gC= cs.nextFloat();
    K= gC+273;
    F=32+1.8f*gC;
    System.out.println( K+" Kelvin "+(32+1.8f*gC)+" Fahrenheit");
   

  
    }
    
}
