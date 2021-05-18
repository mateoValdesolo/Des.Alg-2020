/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1okej1;
import java.util.Scanner;
/**
 *
 * @author Administrador
 */
public class Tp1OkEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String fraseIng;
        System.out.println("Ingrese una frase");
        fraseIng = sc.nextLine();
        System.out.println("La cadena inversa es: "+cadInversa(fraseIng) );
        sc.close();
    }
    
    public static String cadInversa (String frase){
        char ch;
        String pal, cadNueva;
        int longitud, i;
        pal = "";
        cadNueva = "";
        longitud = frase.length();
        for (i = 0; i < longitud ; i++){
            ch = frase.charAt(i);
            if(Character.isLetter(ch) == true){
                pal = pal+ch;
            }
            else{
                cadNueva = " " +pal+cadNueva;
                pal = "";
            }  
        }
        cadNueva = pal+cadNueva;
        return cadNueva;
    }
}
