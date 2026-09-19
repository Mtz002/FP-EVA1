/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_formulas;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_13_FORMULAS {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el valor del radio (r): ");
        double r = scanner.nextDouble();

        double perimetro = 2 * 3.1416 * r;
        double area = Math.PI * Math.pow(r, 2);
        double volumen = (4.0 / 3.0) * 3.1416 * Math.pow(r, 3);

        System.out.println("--- RESULTADOS ---");
        System.out.println("Perímetro del círculo: " + perimetro);
        System.out.println("Área del círculo: " + area);
        System.out.println("Volumen de la esfera: " + volumen);
        
        
    }
    
}
