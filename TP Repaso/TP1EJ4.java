/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1ej4;
import java.util.Scanner;
/**
 *
 * @author Administrador
 */
public class TP1EJ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String numIng;
        System.out.println("Ingrese un número");
        numIng = sc.nextLine();
        System.out.println(contPar(numIng));
        sc.close();
    }
    
    public static String contPar(String num){
        //Este modulo cuenta la cantidad de digitos pares en un numero ingresado
        char ch;
        int i,contPar,contImpar;
        String resp;
        contPar = 0;
        contImpar = 0;
        for (i = 0; i < num.length(); i++) {
            ch = num.charAt(i);
            if(Character.getNumericValue(ch) % 2 == 0 ){
                contPar++;
            }
            else{
                contImpar++;
            }
        }
        resp = "Digitos pares: "+contPar+" Digitos Impares: "+contImpar;
        return resp;
    }
}
