/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_4_captura;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class Eva1_4_Captura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Regla en java: “Si vamos a usar variables, se tienen que “declarar” antes de usar
        //Declarar: crear la variable para su uso en el programa
        //Orden: tipo_dato nombre_identificador
        //Usar nombres significativo debe decir para que se usa
        String nombre; //Declaracion de la variable
        System.out.println("Capture el nombre: ");
        //Entrada de datos del teclado (java)
        Scanner captu = new Scanner(System.in);
        nombre = captu.nextLine();
        System.out.println(nombre);
    }
    
}
