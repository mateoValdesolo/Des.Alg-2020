/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6comp;

/**
 *
 * @author mateo
 */
public class Ej3 {

    public static void main(String[] args) {
        System.out.println(factorial(10));
    }
    
    public static int factorial (int num){
        int res;
        if (num == 1){
            res = 1;
        } else {
            res = factorial(num-1) * num;
        }
        return res;
    }

}
