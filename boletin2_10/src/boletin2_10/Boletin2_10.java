
package boletin2_10;

import java.util.Scanner;


public class Boletin2_10 {

    
    public static void main(String[] args) {
        
        Scanner cs= new Scanner(System.in);
        
        float sFixo, km, ventas, dietas, sBruto, sLiquido;
       
        
        System.out.println("introduce soldo fixo");
        sFixo= cs.nextFloat();
  
        System.out.println("introduce kilometros");
        km= cs.nextFloat();
        
        System.out.println("introduce total de ventas");
        ventas= cs.nextFloat();
        
        System.out.println("introduce dias de desprazamento");
        dietas= cs.nextFloat();
        
        sBruto=(float) (sFixo+km*2+ventas*0.05+dietas*30);
        sLiquido=(float) (sBruto-36 -(sBruto*0.18));
          
        System.out.println("soldo bruto= "+sBruto);
       System.out.println("soldo liquido= "+sLiquido);
    }
    
}
