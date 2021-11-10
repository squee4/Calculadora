/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package squee.calculadora;

import java.util.Scanner;

/**
 *
 * @author ismajj
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. Adaptar el programa para multiplicar y dividir
        
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        System.out.println("***** Calculadora ******");
        do {
            System.out.println("Por favor, seleccione una opción: \n"
                    + "1. Multiplicar \n"
                    + "2. Dividir \n"
                    + "3. Salir");
            opcion = sc.nextInt();
            
            if (opcion <1 || opcion >3) {
                System.out.println("Opción incorrecta. Por favor, seleccione una opción válida.");
            }
            
        } while (opcion !=3);

    }
        // 2. Crear los métodos para multiplicar y dividir
    private static int multiplicar(int a, int b){
            int mult = a*b;
            return mult;
    }
    private static int dividir(int a, int b){
            int div = a/b;
            return div;
    }
    
    // 3. Método para pedir por teclado un int con Scanner y devuelva el int (excepción)
}
