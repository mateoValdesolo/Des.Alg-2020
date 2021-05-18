/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6;

/**
 *
 * @author mateo
 */
public class Ej4 {

    public static void main(String[] args) {
        if (iguales(2111)) {
            System.out.println("si");
        } else {
            System.out.println("no");
        }

    }

    public static boolean iguales(int n) {
       boolean aux;
       if (n < 10){
           aux = true;
       } else{
           if(n % 10 == (n/10) % 10){
               aux = iguales(n/10);
           } else {
               aux = false;
           }
       }
        return aux;
    }
}
