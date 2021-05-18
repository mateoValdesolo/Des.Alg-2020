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
public class Ej5 {

    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5, 6};
        if (chequearOrden(arreglo, arreglo.length-1)) {
            System.out.println("Esta ordenado");
        } else {
            System.out.println("No esta ordenado");
        }
    }

    public static boolean chequearOrden(int[] arreglo, int pos) {
        boolean ordenado;

        if (pos == 0) {
            ordenado = true;
        } else {
            ordenado = chequearOrden(arreglo, pos - 1) && arreglo[pos] > arreglo[pos - 1];
        }
        return ordenado;
    }

}
