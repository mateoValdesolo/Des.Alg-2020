/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1ej2;
import java.util.Scanner;
/**
 *
 * @author Administrador
 */
public class TP1EJ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Este algoritmo invierte un numero entero de 3 cifras
        Scanner sc = new Scanner(System.in);
        int numIng, cifras;
        cifras = 0;
        System.out.println("Ingrese un número entero de 3 cifras");
        numIng = sc.nextInt();
        while(contCifras(numIng) != 3){
            System.out.println("El número no tiene 3 cifras, ingrese el número nuevamente");
            numIng = sc.nextInt();
        }
        System.out.println("El número invertido es: "+invertirNum(numIng));
        }

   
    
    public static int contCifras (int num){
        // Este módulo cuenta las cifras de un número entero ingresado
        int cifr;
        cifr = 0;
        while(num != 0){
            num = num / 10;
            cifr++;
        }
        return cifr;
    }
    
    public static int invertirNum (int num){
        int cif1, cif2, cif3, numInvert;
        cif1 = num / 100;
        cif2 = (num%100) / 10;
        cif3 = (num%10) ;
        numInvert = 100*cif3 + 10*cif2 + cif1;
        return numInvert;
    }
    
}
