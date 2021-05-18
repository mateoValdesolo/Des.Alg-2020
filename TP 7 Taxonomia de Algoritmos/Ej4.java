/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp7;

import static tp7.Ej3.burbujaAtrasDelante;
import static tp7.Ej3.mostrarArr;

/**
 *
 * @author mateo
 */
public class Ej4 {

    public static void main(String[] args) {
        int[] arreglo = {89, 45, 68, 90, 29, 34, 17};
        porInsercion(arreglo);
        mostrarArr(arreglo);

    }

    public static void porInsercion(int[] arr) {
        int i, j, longArr, temp;
        i = 0;
        longArr = arr.length;
        for (i = 1; i <= longArr - 1; i++) {
            temp = arr[i];
            j = i;
            while (j > 0 && temp < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j = j - 1;
            }
            arr[j] = temp;

        }
    }
    
        public static void InsercionAtrasDelante(int[] arr) {
        int i, j, longArr, temp;
        i = 0;
        longArr = arr.length;
        for (i = 1; i <= longArr - 1; i++) {
            temp = arr[i];
            j = i;
            while (j > 0 && temp < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j = j - 1;
            }
            arr[j] = temp;

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
