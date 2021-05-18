/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5;

/**
 *
 * @author Administrador
 */
public class Ej5 {

    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

    }

    public static void cargarMatriz(int [][] matr) {
        int fila, col, longFil, longCol;
        longFil = matr.length;
        longCol = matr[0].length;
        for (fila = 0; fila < longFil; fila++) {
            for (col = 0; col < longCol; col++) {
                matr[fila][col] = (fila + col);
            }
        }
    }
}
