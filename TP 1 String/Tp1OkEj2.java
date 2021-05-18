/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1okej2;
import java.util.Scanner;
/**
 *
 * @author Administrador
 */
public class Tp1OkEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String fraseIng;
        char carIng;
        System.out.println("Ingrese una frase");
        fraseIng = sc.nextLine();
        System.out.println("Ingrese una letra");
        carIng = sc.next().charAt(0);
        System.out.println("La letra "+carIng+" aparece en "+contLetra(fraseIng,carIng)+" palabras");
        sc.close();
        
    }
    
    public static int contLetra (String frase,char car){
        int longitud, i, cont, contLetra;
        char ch;
        contLetra = 0;
        cont = 0;
        longitud = frase.length();
        i = 0;
        for (i = 0; i < longitud ; i++){
            ch = frase.charAt(i);
            if (car == ch){
                cont++;
                if (cont == 1){
                    contLetra++;
                }  
            }
            if (ch == ' '){
                cont = 0;
            }
        }
       return contLetra; 
    }   
}
