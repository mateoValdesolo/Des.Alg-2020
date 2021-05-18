/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1okej4;
import java.util.Scanner;
/**
 *
 * @author Administrador
 */
public class Tp1OkEj4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String fraseIng;
        System.out.println("Ingrese una frase");
        fraseIng = sc.nextLine();
        System.out.println("La palabra mas larga es: "+palLarga(fraseIng));
        System.out.println("Palabras con mas de dos vocales: "+contVocales(fraseIng));
        if(verifCapicua(fraseIng)){
        System.out.println("Existen palabras capicuas");
        }
        else{
            System.out.println("No existen palabras capicuas");
        }
        sc.close();
    }
    
    public static boolean verifCapicua (String frase1){
        char ch;
        String pal = "", pal2 = "";
        boolean verif = false;
        int longFrase, i;
        longFrase = frase1.length();
        for (i = 0; i < longFrase; i++){
            ch = frase1.charAt(i);
            if(ch != ' '){
                pal = pal+ch;
                pal2 = ch+pal2;
            }
            else{
                if (pal2.equals(pal)){
                    verif =   true;
                }
                pal = "";
                pal2 = "";
            }
        }
        if (pal2.equals(pal)){
            verif = true;
        }
        return verif;
    }
    
    public static int contVocales (String frase2){
        char ch;
        int longFrase, i, contVocal = 0, cont = 0;
        longFrase = frase2.length();
        for (i= 0; i < longFrase; i++){
            ch = frase2.charAt(i);
            if (ch != ' '){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    cont++;
                }
            }
            else{
                if(cont > 2){
                    contVocal++;
                }
                cont = 0;
            }
        }
        if(cont > 2){
            contVocal++;
        }
        return contVocal;
    }
    
    public static String palLarga (String frase3){
        char ch;
        int longFrase, i,longPal = 0,  longPalMay = 0;
        String pal, palMay;
        pal = "";
        palMay = "";
        longFrase = frase3.length();
        for (i = 0; i < longFrase ; i++){
            ch = frase3.charAt(i);
            if(ch != ' '){
                pal = pal+ch;
            }
            else{
                longPal = pal.length();
                if(longPalMay < longPal){
                   longPalMay = longPal; 
                   palMay = pal; 
                }
                pal = "";
            }
        }
        longPal = pal.length();
        if(longPalMay < longPal){
            longPalMay = longPal; 
            palMay = pal; 
        }
        return palMay;
    }
}
