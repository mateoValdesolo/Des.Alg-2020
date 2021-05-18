/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1ej5;
import java.util.Scanner;
/**
 *
 * @author Administrador
 */
public class TP1EJ5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numIng,contPar,numMay;
        contPar = 0;
        numMay = 0;
        System.out.println("Ingrese un número positivo, para terminar, ingrese un numero negativo");
        numIng = sc.nextInt();
        do{
            if ((numIng % 2) == 0){
                contPar++;   
            }
            if (numIng > numMay){
                numMay = numIng;
            }
            numIng = sc.nextInt();
        } while (numIng >= 1);
        System.out.println("Cantidad de numeros pares ingresados: "+contPar+" .Mayor número ingresado: "+numMay); 
    }  
}