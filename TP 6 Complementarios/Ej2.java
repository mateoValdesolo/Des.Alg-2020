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
public class Ej2 {
    
    public static void main(String[] args) {
        System.out.println(sumDigit(123));
    }
    
    public static int sumDigit (int num){
        int suma;
        if(num < 10){
            suma = num;
        } else {
            suma = sumDigit(num/10) + num % 10 ;
        }
        return suma;
    }
    
}
