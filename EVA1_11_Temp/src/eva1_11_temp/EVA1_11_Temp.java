
package eva1_11_temp;

import java.util.Scanner;

public class EVA1_11_Temp {

    public static void main(String[] args) {
     double far,celsius,kelvin;
         Scanner captu = new Scanner (System.in);
          System.out.println("Captura los grados en fahrenheit: ");
          far= captu.nextDouble();
          celsius = (far - 32) / 1.8; 
          kelvin =  (far - 32)+(5/9)+273.15;
          System.out.println(far + "°F="+celsius+"°C");
           System.out.println(far + "°F="+kelvin+"°K");
          
         
    }
    
}
