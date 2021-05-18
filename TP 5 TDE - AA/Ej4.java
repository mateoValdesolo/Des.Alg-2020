/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5;
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        int [] arreglo = new int [50];
        int numIng;
        System.out.println("Ingrese un numero para ver si está en el arreglo");
        numIng = sc.nextInt();
        cargarArr(arreglo);
        if (verifNum(arreglo,sc,numIng)){
            System.out.println("El numero se encuentra en el arreglo");
        }else{
            System.out.println("El numero no se encuentra en el arreglo");
        }
        
        
    }
    
    public static void cargarArr (int [] arr){
        int i, longArr;
        longArr = arr.length;
        for (i = 0; i < longArr; i++){
            arr[i] = i;
        }
    }
    
    public static boolean verifNum (int [] arr, Scanner sc, int num){
        boolean ret = false;
        int cont = 0, longArr = arr.length;
        while(cont <= num && !ret){
            if (num < longArr && arr[cont] == num){
                ret = true;
            }else{
               ret = false;
            }
            cont++;
        }
        return ret;
    }
    
}
