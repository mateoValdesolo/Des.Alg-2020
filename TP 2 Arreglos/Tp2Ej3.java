/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2ej3;
import java.util.Scanner;
/**
 *
 * @author Administrador
 */
public class Tp2Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        char [] arregloCad;
        arregloCad = new char [10];
        int longCad, longArr, opcion;
        String cadIng;
        longArr = arregloCad.length;
        System.out.println("Ingrese una cadena de caracteres de longitud 10");
        cadIng = sc.next();
        longCad = cadIng.length();
        if (longCad != 10){
            while (longCad != 10){
                System.out.println("La cadena no tiene 10 caracteres, ingrese una nueva");
                cadIng = sc.next();
                longCad = cadIng.length();
            }
        }
        cadArr(cadIng,arregloCad,longArr);
        System.out.println("Desea ver la cadena en el orden ingresado o invertida? 1 para el orden ingresado, 2 para invertida");
        opcion = sc.nextInt();
        switch(opcion){
            case 1: {
                normalArr(arregloCad,longArr);
            }
            break;
            case 2:{
                invertirArr(arregloCad,longArr);
            }
            break;
            default:{
                System.out.println("La opcion ingresada no es valida");
            }
        }
        System.out.println("");
        sc.close();
    }
    
    public static void cadArr (String cadIng1, char [] arreglo1, int longCadena1){
        int i;
        char ch;
        for (i = 0; i < longCadena1; i++){
            ch = cadIng1.charAt(i);
            arreglo1[i] = ch;
        }
    }
    
    public static void normalArr (char [] arreglo2, int longitud2){
        int i;
        for (i = 0; i < longitud2; i++){
            System.out.print(arreglo2[i]);
        }
    }
    
    public static void invertirArr (char [] arreglo3, int longitud3){
        int i;
        for (i = longitud3-1; i >= 0; i--){
            System.out.print(arreglo3[i]);
        }
    }
}