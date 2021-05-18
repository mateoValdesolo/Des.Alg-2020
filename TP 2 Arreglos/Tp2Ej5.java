/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2ej5;
import java.util.Scanner;
/**
 *
 * @author Administrador
 */
public class Tp2Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here0
        Scanner sc = new Scanner(System.in);
        int arregloN [] = new int [10];
        int longArr, numIng;
        longArr = arregloN.length;
        System.out.println("Ingrese un numero entero");
        numIng = sc.nextInt();
        arrPar(arregloN,numIng,longArr);
        sc.close();
    }
    
    public static void valorArr (int [] arreglo1, int longitud1){
        int i;
        for (i = 0; i < longitud1;i++){
            arreglo1[i] = i;
        }
    }
    
    public static void arrPar (int [] arreglo2, int num,int longitud2){
        int i;
        for (i = 0; i < longitud2; i++){
            if(i%2 == 0 ){
                arreglo2[i] = num;
            }
            else{
                arreglo2[i] = i;
            }
            System.out.print(arreglo2[i]);
        }
        
    }
}
