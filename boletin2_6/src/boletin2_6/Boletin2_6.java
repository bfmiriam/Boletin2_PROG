
package boletin2_6;

import java.util.Scanner;


public class Boletin2_6 {

    public static void main(String[] args) {
       
      Scanner cs = new Scanner (System.in);
      
      float ptarifa,ppagado, pdescontado;
     
        
        System.out.println("teclea prezo tarifa");
        ptarifa= cs.nextFloat();
        
        System.out.println("teclea prezo pagado");
        ppagado= cs.nextFloat();
        
         pdescontado= ptarifa-ppagado/ptarifa*100;
         
            System.out.println((pdescontado)+"de desconto");
        
    }
    
}
