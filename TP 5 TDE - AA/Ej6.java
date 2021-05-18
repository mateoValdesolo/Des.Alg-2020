/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Ej6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n;
        System.out.println("Ingrese un número");
        n = sc.next();
        pir1(n);
    }

    public static void pir1(String n) {
        int i, j, num;
        num = Integer.parseInt(n);
        for (i = 1; i <= num; i++) {
            for (j = 1; j <= num; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }

    public static void pir2(String n) {
        int fila, col, num;
        num = Integer.parseInt(n);
        for (fila = 1; fila <= num; fila++) {
            for (col = 1; col <= fila; col++) {
                System.out.print(col + " ");
            }
            System.out.println(" ");
        }
    }
}
