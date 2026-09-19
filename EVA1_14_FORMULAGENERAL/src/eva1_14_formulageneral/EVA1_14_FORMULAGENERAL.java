/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_formulageneral;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_14_FORMULAGENERAL {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
       double a,b,c,dentro_de_raiz,raiz,r1,r2; 
      System.out.println("Ecuación de la forma: ax(2) + bx + c = 0");
        
        System.out.print("Ingresa a: ");
        a = scanner.nextDouble();

        System.out.print("Ingresa b: ");
        b = scanner.nextDouble();

        System.out.print("Ingresa c: ");
        c = scanner.nextDouble();
        
        dentro_de_raiz =  (b * b) - (4 * a * c);
        raiz = Math.sqrt(dentro_de_raiz);

        r1 = (-1*b + raiz) / (2 * a);
        r2 = (-1*b - raiz) / (2 * a);

        System.out.println("--- RESULTADOS ---");
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        
    }
    
}
