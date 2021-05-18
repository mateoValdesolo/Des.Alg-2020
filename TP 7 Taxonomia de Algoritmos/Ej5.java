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
public class Ej5 {

    public static void main(String[] args) {
        int[] arreglo = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int num = 20;
        if (busquedaBinaria(arreglo, num) < 0) {
            System.out.println("El numero no está en el arreglo");
            System.out.println(busquedaBinaria(arreglo, num));
        } else {
            System.out.println("El numero está en el arreglo");
            System.out.println(busquedaBinaria(arreglo, num));
        }
    }

    public static int busquedaBinaria(int[] arr, int k) {
        int ini, fin, res, medio;
        ini = 0;
        fin = arr.length - 1;
        res = -1;
        while (ini <= fin) {
            medio = (int) Math.floor((ini + fin) / 2);
            if (k == arr[medio]) {
                res = medio;
                ini = fin + 1;
            } else {
                if (k < arr[medio]) {
                    fin = medio - 1;
                } else {
                    ini = medio + 1;
                }
            }
        }
        return res;
    }

}
