/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1okej3;
import java.util.Scanner;
/**
 *
 * @author Administrador
 */
public class Tp1OkEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String palIng, fraseIng;
        System.out.println("Ingrese una frase");
        fraseIng = sc.nextLine();
        System.out.println("Ingrese una palabra");
        palIng = sc.nextLine();
        System.out.println("La palabra "+palIng+" aparece "+buscPal(fraseIng,palIng)+" veces");
        sc.close();
        
    }
    
   public static int buscPal(String frase, String pal){
        /* Este modulo cuenta cuantas veces aparece la palabra ingresada por parametro en la cadena ingresada por parametro.
        frase = cadena que se pide para operar al inicio del algoritmo.
        pal = palabra que se pide para contar las veces que aparece en la cadena.
        */
        char ch5;
        String palabra = "";
        int i,longText,cont = 0;
        longText = frase.length();
        for (i = 0; i < longText; i++){
            ch5 = frase.charAt(i);
            if (ch5 != ' '){
                palabra = palabra+ch5;
            }
            else{
                if (palabra.equalsIgnoreCase(pal)){
                    cont++;
                }
                palabra = "";
            }
        }
        if (palabra.equalsIgnoreCase(pal)){
            cont++;
        }
        
        return cont;
    }
}

