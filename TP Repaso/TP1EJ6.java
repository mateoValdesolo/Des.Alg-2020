/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1ej6;
import java.util.Scanner;
/**
 *
 * @author Administrador
 */
public class TP1EJ6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String fraseIng;
        System.out.println("Ingrese una frase");
        fraseIng = sc.nextLine();
        System.out.println("La palabra más larga es: "+palabraLarga(fraseIng));
        sc.close();
    }
    
      public static String palabraLarga(String cadena){
        /* Este modulo busca la palabra mas larga en la cadena ingresada por parametro.
        cadena3 = cadena que se pide para operar al inicio del algoritmo.
        */
        char ch3;
        String palMay = "",palabra = "";
        int longPal=0,longPalMay = 0,posMay,longCad,i;
        longCad = cadena.length();
        for (i = 0; i < longCad ; i++){
            ch3 = cadena.charAt(i);
            if (ch3 != ' '){
                palabra = palabra +ch3;    
            }
            else {
                longPal = palabra.length();
               if (longPal > longPalMay){
                    longPalMay = longPal;
                    palMay = palabra;
                    
                }
               palabra = "";
            }
        }
        
        longPal = palabra.length();
                if (longPal > longPalMay){
                    longPalMay = longPal;
                    palMay = palabra;
        } 

        return palMay;
    }
    
}
