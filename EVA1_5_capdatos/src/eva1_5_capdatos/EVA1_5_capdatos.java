
package eva1_5_capdatos;

import java.util.Scanner;


public class EVA1_5_capdatos {

  
    public static void main(String[] args) {
        String nombre;
        int edad;
        double salario;
        
        Scanner capt = new Scanner(System.in);
        System.out.println("Captura el nombre:");
        nombre = capt.next();
        System.out.println("Captura la edad:");
        edad = capt.nextInt();
        System.out.println("Captura salario:");
        salario = capt.nextDouble();
        System.out.println(">>>>>Datos Capturados<<<<<");
        System.out.println("nombre;");
        System.out.println(nombre);

    }
    
}
