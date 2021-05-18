/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2ej9;
import java.util.Scanner;
/**
 *
 * @author Administrador
 */
public class Tp2Ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String [] arreglo;
        int longArr, i;
        System.out.println("Ingrese la longitud deseada para el arreglo de palabras");
        longArr = sc.nextInt();
        arreglo = new String [longArr];
        cargarArreglo(arreglo,longArr,sc);
        armarCadena(arreglo,longArr);
        cadenaInversa(arreglo,longArr);
        sc.close();
    }
    
    public static void cargarArreglo (String [] arreglo1, int longitud1,Scanner sc){
        int i;
        String palabra1;
        for (i = 0; i < longitud1; i++){
            System.out.println("Ingrese las palabras a almacenar en el arreglo");
            palabra1 = sc.next();
            arreglo1[i] = palabra1;
        }  
    }
    
    public static void armarCadena (String [] arreglo2, int longitud2){
        int i;
        String cadena = "";
        for (i = 0; i < longitud2; i++){
            cadena = cadena + arreglo2[i]+" ";
        }
        System.out.println("La cadena formada por las palabras es: "+cadena);
    }
    
    public static void cadenaInversa (String [] arreglo3,int longitud3){
        int i;
        String cadInversa = "";
        for (i = 0; i < longitud3; i++){
            cadInversa = arreglo3[i] +'-'+ cadInversa;
        }
        System.out.println("La cadena inversa es: "+cadInversa);
    }
}