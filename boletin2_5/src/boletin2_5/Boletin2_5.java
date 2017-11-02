
package boletin2_5;

import java.util.Scanner;


public class Boletin2_5 {

   
    public static void main(String[] args) {
      
      
      float m=1852f, millas, metros;
      
      Scanner cs = new Scanner (System.in);
      
      System.out.println("teclea millas");
      millas= cs.nextFloat();
      
      metros= millas*m;

      
      System.out.println(millas+" millas son "+metros+" metros");
      
      
      
      
      
    }
    
}
