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
public class Ej11 {

    public static void main(String[] args) {
        int [] arreglo = {1,2,3,4,5,6,7,8,15,20,26,33,51,88,100};
        System.out.println(busBinariaRecursiva(arreglo, 0 , arreglo.length-1, 88));
    
    }

    public static int busBinariaRecursiva(int[] arreglo, int inicio, int fin, int objetivo) {
        int medio, pos = -1;
        medio = (inicio + fin) / 2;

        if (inicio <= fin) {               
            if (arreglo[medio] == objetivo) {
                pos = medio;
            } else {
                if (arreglo[medio] > objetivo) {
                    pos = busBinariaRecursiva(arreglo, inicio, medio - 1, objetivo);
                } else {
                    pos = busBinariaRecursiva(arreglo, medio + 1, fin, objetivo);
                }   
            }
        }
            return pos;
        }
}
