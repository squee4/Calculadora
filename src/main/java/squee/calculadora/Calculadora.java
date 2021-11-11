/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package squee.calculadora;

import java.util.InputMismatchException;
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
        int opcion, op1, op2;
        
        
        System.out.println("***** Calculadora ******");
        do {
            System.out.println("Por favor, seleccione una opción: \n"
                    + "1. Multiplicar \n"
                    + "2. Dividir \n"
                    + "3. Salir");
            opcion = peticionNum();
            
            if (opcion <1 || opcion >3) {
                System.out.println("Opción incorrecta. Por favor, seleccione una opción válida.");
            }
            
            
        switch (opcion){
            case 1:
                
                System.out.println("Introduzca el operando 1: ");
                op1 = peticionNum();
                System.out.println("Introduzca el operando 2: ");
                op2 = peticionNum();
                
                int resultMult = multiplicar (op1, op2);
            
                System.out.println("El resultado es "+resultMult);
                
            break;

            
            case 2:
                
                System.out.println("Introduzca el operando 1: ");
                op1 = peticionNum();
                System.out.println("Introduzca el operando 2: ");
                op2 = peticionNum();
                
                int resultDiv = dividir (op1, op2);
            
                System.out.println("El resultado es "+resultDiv);
                
            break;
            
            case 3:
                
                System.out.println("Finalizando prograna...");
                
            break;
            
            default:
                
            break;
            
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
    private static int peticionNum(){
        boolean pedir = true;
        int numero = 0;
            do{
                try{
                    
                    Scanner sc = new Scanner(System.in);
                    numero = sc.nextInt();
                    pedir = false;
                    
                } catch (InputMismatchException ime) {
                    
                    System.out.println("Algo ha salido mal. Por favor introduzca de nuevo un número.");
                    
                }
                
            } while (pedir);
            
            return numero;
    } 
}
