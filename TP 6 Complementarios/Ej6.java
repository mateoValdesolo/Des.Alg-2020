/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6comp;

/**
 *
 * @author mateo
 */
public class Ej6 {

    public static void main(String[] args) {
        int [] arreglo = {1,2,3,4,5,6};
        sumas(arreglo,0,0,0);
    }

    public static void sumas(int[] arr, int pos, int sumaPar, int sumaImpar) {

        if (pos == arr.length) {
            System.out.println("Pares: "+sumaPar);
            System.out.println("Impares: "+sumaImpar);
        } else {
            if (pos % 2 == 0) {
                sumaPar += arr[pos];
                sumas(arr, pos + 1, sumaPar, sumaImpar);
            } else {
                sumaImpar += arr[pos];
                sumas(arr, pos + 1, sumaPar, sumaImpar);
            }
        }
    }
}
