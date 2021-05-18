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
public class Ej3 {

    public static void main(String[] args) {
        int[] arreglo = {89, 45, 68, 90, 29, 34, 17};
        burbujaAtrasDelante(arreglo);
        mostrarArr(arreglo);

    }

    public static void burbuja(int[] arr) {
        int i, j, temp, longArr;
        longArr = arr.length;
        for (i = 0; i <= longArr - 2; i++) {
            for (j = 0; j <= longArr - 2 - i; j++) {
                if (arr[j + 1] < arr[j]) {
                    temp = arr[(j + 1)];
                    arr[(j + 1)] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void burbujaAtrasDelante(int[] arr) {
        int i, j, temp, longArr;
        longArr = arr.length;
        for (i = 0; i <= longArr - 2; i++) {
            for (j = longArr-1; j > i; j--) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[(j - 1)];
                    arr[(j - 1)] = arr[j];
                    arr[j] = temp;
                }
            }
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
