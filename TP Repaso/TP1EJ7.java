/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1ej7;
import java.util.Scanner;
/**
 *
 * @author Administrador
 */
public class TP1EJ7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        char carIng;
        String fraseIng;
        System.out.println("Ingrese una frase");
        fraseIng = sc.nextLine();
        System.out.println("Ingrese un caracter");
        carIng = sc.next().charAt(0);
        if(carEnFrase(fraseIng,carIng) == true){
          System.out.println("El caracter aparece en la frase");  
        }
        else{
            System.out.println("El caracter no aparece en la frase");
        }
        sc.close();
    }
    
    public static boolean carEnFrase(String cadena, char caracter ) {
        char ch;
        int i,ret = 0;
        boolean ret2 = true;
        for (i = 0; i < cadena.length(); i++) {
            ch = cadena.charAt(i);
            if (ch == caracter){
             ret++;   
            }
        }
        if(ret > 0){
            ret2 = true;
        }
        else{
            ret2 = false;
        }
        return ret2;
        }
}
