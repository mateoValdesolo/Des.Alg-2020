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
public class Ej1 {

    public static void main(String[] args) {
        int[] arreglo = {89, 45, 63, 90, 29, 34, 17};
        System.out.println(busquedaSecuencial(arreglo, 5));
        System.out.println(secuencialDesdeAtras(arreglo, 5));

    }

    public static int busquedaSecuencial(int[] arr, int num) {
        boolean esta = false;
        int longArr, i, ret;
        ret = -1;
        i = 0;
        longArr = arr.length;
        while (!esta && i < longArr - 1) {
            if (arr[i] == num) {
                ret = i;
                esta = true;
            } else {
                i += 1;
            }

        }
        return ret;
    }

    public static int secuencialDesdeAtras(int[] arr, int num) {
        boolean esta = false;
        int longArr, i, ret;
        ret = -1;
        longArr = arr.length;
        i = longArr - 1;
        while (!esta && i >= 0) {
            if (arr[i] == num) {
                ret = i;
                esta = true;
            } else {
                i -= 1;
            }
        }
        return ret;
    }

}
