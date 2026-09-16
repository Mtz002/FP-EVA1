package eva1_10_temper;

import java.util.Scanner;



public class EVA1_10_TEMPER {
    public static void main(String[] args) {
        double temp,far,kelvin;
         Scanner captu = new Scanner (System.in);
          System.out.println("Introduce la temperatura en centigrados: ");
          temp= captu.nextDouble();
          far = (temp * 1.8) + 32;
          kelvin = temp + 273.15;
           System.out.println(temp + "°C="+far+"°F");
           System.out.println(temp + "°C="+kelvin+"°F");
     
        
    }
    
}
