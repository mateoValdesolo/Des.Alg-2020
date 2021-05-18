/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Ej7 {

    public static void main(String[] args) {
        System.out.println(contVocal('a',0,0));

    }

    public static int contVocal(char car, int cont, int res) {
        Scanner sc = new Scanner(System.in);

        if (car == '.') {
            res = cont;
        } else {
            if (esVocal(car)) {
                cont += 1;
            }
            car = sc.next().charAt(0);
            res = contVocal(car, cont, res);
        }

        return res;
    }
    
    public static boolean esVocal (char car){
        boolean ret = false;
        
        if (car == 'a' || car == 'e' || car == 'i'|| car == 'o' || car == 'u'){
            ret = true;
        }
        
        return ret;
    }

}
