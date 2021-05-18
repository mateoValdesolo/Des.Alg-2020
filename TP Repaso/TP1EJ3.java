/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1ej3;
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class TP1EJ3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String numIng;
        System.out.println("Ingrese un numero binario");
        numIng = sc.nextLine();
        if(verifBin(numIng) == true){
            System.out.println("El número es binario");
        }
        else{
            System.out.println("El numero no es un numero binario");
        }
        
    }
    
    public static boolean verifBin(String num){
        //Este modulo verifica si el numero ingresado es un numero binario
        boolean ret;
        int i, longitud;
        i = 0;
        ret = true;
        longitud = num.length();
        while (ret && (i < longitud)){
            if((num.charAt(i)!= '0') && (num.charAt(i)!= '1')){
                ret = false;
            }
            i++;   
        }
        return ret;
        }
    }
    

