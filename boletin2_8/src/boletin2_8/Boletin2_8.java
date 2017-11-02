
package boletin2_8;

import java.util.Scanner;


public class Boletin2_8 {

   
 public static void main(String[] args) {
    
        Scanner scan=new Scanner(System.in);
        int total;
        
        
        System.out.println("Introduce billetes de 100");
        total=scan.nextInt()*100;
        
        System.out.println("Introduce billetes de 20");
        total=total+scan.nextInt()*20;
        
        System.out.println("Introduce billetes de 5");
        total=total+scan.nextInt()*5;
        
        System.out.println("Introduce moedas");
        total=total+scan.nextInt();
        
        
System.out.println("Total= "+total+"€");
          
          
          
    }
    
}
