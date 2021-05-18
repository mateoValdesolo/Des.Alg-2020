/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2ej7;
/**
 *
 * @author Administrador
 */
public class Tp2Ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arreglo [] = new int [10];
        int longArr;
        longArr = arreglo.length;
        valorArr(arreglo,longArr);
        System.out.println("El promedio entre los elementos del arreglo es: "+promedioArr(arreglo,longArr));
    }
    
    public static void valorArr (int [] arreglo1, int longitud1){
        int i;
        for(i = 0; i < longitud1;i++){
            arreglo1[i] = i;
        }
    }
    
    public static double promedioArr (int [] arreglo2, int longitud2){
        int i;
        double sum,prom;
        sum = 0;
        for (i = 0; i < longitud2;i++){
            sum = sum + arreglo2[i];
        }
        prom = sum/longitud2;
        return prom;
    }
}
