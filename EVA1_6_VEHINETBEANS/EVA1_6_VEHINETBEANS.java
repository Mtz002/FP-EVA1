/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_vehinetbeans;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_6_VEHINETBEANS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mARCA;
        String mODELO;
        int year;
        String cOLOR;
        double kILOMETRAJE;
        double pRECIO;
    
        Scanner input = new Scanner(System.in);
        System.out.println("Captura la Marca: ");
        mARCA = input.nextLine();
        System.out.println("Captura el Modelo: ");
        mODELO = input.nextLine();
        System.out.println("Captura el Year: ");
        year = input.nextInt();
        input.nextInt();
        System.out.println("Captura el Color: ");
        cOLOR = input.nextLine();
        
        System.out.println("Captura el Kilometraje: ");
        kILOMETRAJE = input.nextDouble();
        
        System.out.println("Captura el precio: ");
        pRECIO = input.nextDouble();
        
        System.out.println(">>>>>>>>>>>>>>Datos capturados<<<<<<<<<<<<<<");
        System.out.print("Marca: ");
        System.out.println(mARCA);
        System.out.print("Modelo: ");
        System.out.println(mODELO);
        System.out.print("Year: ");
        System.out.println(year);
        
        System.out.print("Color: ");
        System.out.println(cOLOR);
        System.out.print("Kilometraje: ");
        System.out.println(kILOMETRAJE);
        System.out.print("Precio:$ ");
        System.out.println(pRECIO);
    }
    
}
