/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1okej5;
import java.util.Scanner;
/**
 *
 * @author Administrador
 */
public class Tp1OkEj5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String fraseIng;
        System.out.println("Ingrese una frase");
        fraseIng = sc.nextLine();
        System.out.println(mensajeEncriptado(fraseIng));
        sc.close();
        
    }
    
    public static String mensajeEncriptado (String frase){
        int i,longitud;
        char ch;
        String pal;
        i= 0;
        pal = "";
        longitud = frase.length();
        for (i = 0; i < longitud; i++){
            ch = frase.charAt(i);
            switch(ch){
                case 'a':{
                    ch = '*';
                }
                break;
                case 'e':{
                    ch = '/';
                }
                break;
                case 'i':{
                    ch = '+';
                }
                break;
                case 'o':{
                    ch = '-';
                }
                break;
                case 'u':{
                    ch = '#';
                }
                break;
            }
            pal = pal+ch;
        }
       return pal; 
    } 
}
