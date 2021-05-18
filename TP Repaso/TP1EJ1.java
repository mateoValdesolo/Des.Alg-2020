/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1ej1;
import java.util.Scanner;
/**
 *
 * @author Administrador
 */
public class TP1EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Este algoritmo muestra por pantalla los primeros 10 multiplos de un numero ingresado
        Scanner sc = new Scanner(System.in);
        int numIng,i;
        System.out.println("Ingrese un número entero");
        numIng = sc.nextInt();
        for (i = 1; i <= 10; i++ ){
            System.out.println(numIng*i);  
        }
    }  
}