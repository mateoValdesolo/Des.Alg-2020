/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3ej8;
import java.util.Scanner;
/**
 *
 * @author Administrador
 */
public class Tp3Ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, n, opt, seguir = 1;
        System.out.println("Ingrese el orden de la matriz");
        n = sc.nextInt();
        int[][] matriz = new int[n][n];
        cargarMatriz(matriz, n, sc);
        System.out.println("La matriz original es: ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
        while(seguir == 1){
            menu();
            opt = sc.nextInt();
            opciones(matriz, n, opt); 
            System.out.println("Desea seguir? 1 para si, 2 para no");
            seguir = sc.nextInt();
        }
        
    }

    public static void cargarMatriz(int[][] matriz, int n, Scanner sc) {
        /*Modulo que carga el arreglo*/
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.println("Ingrese los numeros de la fila: " + i + " columna: " + j);
                matriz[i][j] = sc.nextInt();
            }
        }
    }

    public static void menu() {
        System.out.println("Ingrese 1: Si desea que, se muestre la matriz por filas de atras hacia adelante");
        System.out.println("Ingrese 2: Si desea que, se muestre la matriz por columnas de arriba hacia abajo");
        System.out.println("ingrese 3: Si desea que, se muestre la matriz en espiral");
        System.out.println("Ingrese 4: Si desea que, se muestre la matriz en zig-zag");
    }

    public static void opciones(int[][] matriz, int n, int opt) {
            switch (opt) {
                case 1:{
                    haciaAtras(matriz, n);
                }    
                break;
                case 2:{
                    arribaAbajo(matriz, n); 
                }
                break;
                case 3:{
                    espiral(matriz, n);
                }
                break; 
                case 4:{
                    zigZag(matriz, n); 
                }
                break;   
            }
    }

    public static void haciaAtras(int[][] matriz, int n) {
        /*Modulo que muestras las filas hacia atras*/
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = n - 1; j >= 0; j--) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void arribaAbajo(int[][] matriz, int n) {
        /*Modulo que muestra las columnas de abajo hacia arriba*/        
        int i, j;
        for (i = n - 1; i >= 0; i--) {
            for (j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void espiral(int[][] matriz, int n) {
        /*Modulo que recorre la matriz como un espiral*/    
        int i, j, minFila = 0, maxFila = n - 1, minCol = 0, maxCol = n - 1;

        while ((minFila <= maxFila) || (minCol <= maxCol)) {
            for (j = minCol; j <= maxCol; j++) {
                System.out.print(matriz[minFila][j] + " ");
            }
            minFila++;
            for (i = minFila; i <= maxFila; i++) {
                System.out.print(matriz[i][maxCol] + " ");
            }
            maxCol--;
            for (j = maxCol; j >= minCol; j--) {
                System.out.print(matriz[maxFila][j] + " ");
            }
            maxFila--;
        }
        System.out.println("");
    }

    public static void zigZag(int[][] matriz, int n) {
        int j;
        /*Modulo que recorre la matriz en zigzag*/
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (j = 0; j < n; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
            } else {
                for (j = n - 1; j >= 0; j--) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println("");
        }
    }
}