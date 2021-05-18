/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3ej2;
import java.util.Scanner;
/**
 *
 * @author Administrador
 */
public class Tp3Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int [][] matriz;
        int colIng, filIng;
        System.out.println("Ingrese la cantidad de filas de la matriz");
        filIng = sc.nextInt();
        System.out.println("Ingrese la cantidad de columnas de la matriz");
        colIng = sc.nextInt();
        matriz = new int[filIng][colIng];
        asignMatr(matriz);
        imprMatr(matriz);
    }
    
    public static void asignMatr (int [][] matr){
        int cantFil, cantCol, fila, col;
        cantFil = matr.length;
        cantCol = matr[0].length;
        for (fila = 0; fila < cantFil; fila++){
            for (col = 0; col < cantCol; col++){
                matr[fila][col] = fila+col; 
            }
        } 
    }
    
    public static void imprMatr (int [][] matr){
        int cantFil, cantCol, fila, col;
        cantFil = matr.length;
        cantCol = matr[0].length;
        for (fila = 0; fila < cantFil; fila++){
            for (col = 0; col < cantCol; col++){
                System.out.print(matr[fila][col]+" ");
            }
            System.out.println();
        }
    } 
}