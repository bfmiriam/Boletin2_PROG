
package boletin2_9;

import java.util.Scanner;


public class Boletin2_9 {

   
    public static void main(String[] args) {
        
       
    
        int diñeiro;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Introduce diñeiro");
        diñeiro = scan.nextInt();
        
        System.out.println(diñeiro / 100 + " Billetes de 100");
        diñeiro = diñeiro % 100;
        
        System.out.println(diñeiro / 20 + " Billetes de 20");
        diñeiro = diñeiro % 20;
        
        System.out.println(diñeiro / 5 + " Billetes de 5");
        diñeiro = diñeiro % 5;
        
        System.out.println(diñeiro + " Monedas de 1");
           
 
    }
    
}
