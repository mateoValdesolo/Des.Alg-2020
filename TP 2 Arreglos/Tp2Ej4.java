/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2ej4;
import java.util.Scanner;
/**
 *
 * @author Administrador
 */
public class Tp2Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        int [] arreglo = new int [10];
        int numIng, longArr;
        longArr = arreglo.length;
        System.out.println("Ingrese un número entero");
        numIng = sc.nextInt();
        arrayMultiplo(arreglo,numIng,longArr);
        sc.close();
    }
    
    public static void arrayMultiplo (int [] arreglo, int num, int longitud){
        int i;
        for (i = 0; i < longitud; i++){
            arreglo[i] = num*(i+1);
            System.out.println(arreglo[i]+" ");
        }
    }
}
