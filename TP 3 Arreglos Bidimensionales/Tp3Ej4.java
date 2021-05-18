/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3ej4;
import java.util.Scanner;
/**
 *
 * @author Administrador
 */
public class Tp3Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String [][] matriz;
        String oracion;
        int filIng, colIng, i, cont = 0;
        System.out.println("Ingrese la cantidad de filas de la matriz");
        filIng = sc.nextInt();
        System.out.println("Ingrese la cantidad de columnas de la matriz");
        colIng = sc.nextInt();
        matriz = new String [filIng][colIng];
        for (i = 0; i < filIng; i++){
            System.out.println("Ingrese una oracion con "+colIng+" palabras");
            oracion = TecladoIn.readLine()+' ';
            palMatr(matriz,oracion,cont);
            cont++;
        }
        mostrPal(matriz,sc);
    }
    
    public static void palMatr (String[][] matr, String orac, int cont){
        int i, longOrac, c = 0;
        char ch;
        String palabra;
        palabra = "";
        longOrac = orac.length();
        for (i = 0; i < longOrac; i++){
            ch = orac.charAt(i);
            if (ch != ' '){
                palabra = palabra+ch; 
            }
            else{
                matr[cont][c] = palabra;
                    palabra = "";
                    c++;
            }
        }
    }
    
    public static void mostrPal (String [][] matr, Scanner sc){
        String pal;
        int fil,col, seguir = 1;
        while (seguir == 1){
            System.out.println("Ingrese la fila de la palabra que desea ver");
            fil = sc.nextInt();
            System.out.println("Ingrese la columna de la palabra que desea ver");
            col = sc.nextInt();
            pal = matr[fil][col];
            System.out.println("La palabra en la posicion "+fil+','+col+" es: "+pal);
            System.out.println("Desea seguir? 1 para si, 2 para no");
            seguir = sc.nextInt();
        }
    }
}
