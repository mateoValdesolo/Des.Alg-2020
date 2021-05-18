/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp7;

/**
 *
 * @author mateo
 */
public class Ej2 {

    public static void main(String[] args) {
        int [] arreglo = {7,6,11,17,3,15,5,19,30,14};
        ordPorSeleccion(arreglo);
        mostrarArr(arreglo);
        
    }
    
    public static void ordPorSeleccion (int [] arr){
        int i, j, min, longArr, temp;
        longArr = arr.length;
        for (i = 0; i <= longArr - 2; i++) {
            min = i;
            for (j = i + 1; j <= longArr - 1; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        } 
    }
    
    public static void ordSelecMayAMen (int [] arr){
        int i, j, min, longArr, temp;
        longArr = arr.length;
        for (i = 0; i <= longArr - 2; i++) {
            min = i;
            for (j = i + 1; j <= longArr - 1; j++) {
                if (arr[j] > arr[min]) {
                    min = j;
                }
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        } 
    }
    
    public static void mostrarArr(int[] arr) {
        int i, longArr;
        longArr = arr.length;
        for (i = 0; i < longArr; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
