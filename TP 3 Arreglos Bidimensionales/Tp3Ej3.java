/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3ej3;
import java.util.Scanner;
/**
 *
 * @author Administrador
 */
public class Tp3Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        char [][] matriz;
        int dimIng;
        System.out.println("Ingrese la cantidad de filas y columnas de la matriz");
        dimIng = sc.nextInt();
        matriz = new char [dimIng][dimIng];
        ingrVal(matriz,sc);
        valMatr(matriz);
        sc.close();
    }
    
    public static void valMatr (char [][] matr){
        int col, fil, longMatr;
        longMatr = matr.length;
        for (fil = 0; fil < longMatr; fil++){
            for(col = 0; col < longMatr; col++){
                if(col == fil){
                    System.out.print(matr[fil][col]+" ");
                }
            }
        }
    }
    
    public static void ingrVal (char [][] matr, Scanner sc){
        int longMatr, i, j;
        longMatr = matr.length;
        for (i = 0; i < longMatr;i++){
            for (j = 0; j < longMatr;j++){
                System.out.println("Ingrese un caracter para almacenar en la fila "+i+" columna "+j+" de la matriz");
                matr[i][j] = sc.next().charAt(0);
            }
        }
        sc.close();
    }
}
