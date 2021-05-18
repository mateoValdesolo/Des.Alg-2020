/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2ej6;

/**
 *
 * @author Administrador
 */
public class Tp2Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arreglo [];
        arreglo = new int [10];
        int longArr;
        longArr = arreglo.length;
        valorArr(arreglo,longArr);
        System.out.println("El valor menor es: "+valorMen(arreglo,longArr));
        System.out.println("El valor mayor es: "+valorMay(arreglo,longArr));
    }
    
    public static void valorArr (int [] arreglo1, int longitud1){
        //En este módulo se le dan valores al array
        int i;
        for(i = 0; i < longitud1; i++){
            arreglo1[i] = i;
        }
    }
    
    public static int valorMay (int [] arreglo2, int longitud2){
        //Este modulo encuentra el valor mas grande y el mas pequeño en el array
        int i, valMay;
        valMay = 0;
        for (i = 0; i < longitud2; i++){
            if (arreglo2[i] > valMay){
                valMay = arreglo2[i];
            }
        }
        return valMay;
    }
    
    public static int valorMen (int [] arreglo3, int longitud3){
        //Este modulo encuentra el valor mas grande y el mas pequeño en el array
        int i, valMen;
        valMen = 1000;
        for (i = 0; i < longitud3; i++){
            if (arreglo3[i] < valMen){
                valMen = arreglo3[i];
            }
        }
        return valMen;
    }
}
