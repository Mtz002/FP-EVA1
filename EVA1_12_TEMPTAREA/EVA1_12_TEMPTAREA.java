/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_temptarea;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_12_TEMPTAREA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           double kelvin,far,celsius;
         Scanner captu = new Scanner (System.in);
          System.out.println("Captura los grados en kelvin: ");
          kelvin= captu.nextDouble();
          celsius = kelvin - 273.15; 
          far =  (kelvin - 273.15) * 1.8 + 32;
          System.out.println(kelvin + "°K="+celsius+"°C");
           System.out.println(kelvin + "°K="+far+"°F");
    }
    
}
