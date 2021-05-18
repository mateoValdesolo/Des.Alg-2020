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
public class Ej6 {

    public static void main(String[] args) {
        int cont = 0, res = 0;
        System.out.println(contMultip(1, cont, res));
    }

    public static int contMultip(int num, int cont, int res) {
        Scanner sc = new Scanner(System.in);
        
        if (num != 0) {
            if (num % 3 == 0) {
                cont += 1;
            }
            num = sc.nextInt();
            res = contMultip(num, cont, res);
        } else {
            res = cont;
        }
        
        return res;
    }

}
