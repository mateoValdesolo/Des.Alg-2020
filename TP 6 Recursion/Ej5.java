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
public class Ej5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numIng;
        System.out.println("Ingrese un numero para invertirlo");
        numIng = sc.nextInt();
        System.out.println("Numero invertido:");
        invertNum(numIng);

    }
    
    public static void invertNum (int n){
        if (n < 10){
            System.out.println(n);
        } else {
            System.out.print(n % 10);
            invertNum(n/10);
        }
    }

}
