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
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(division(4, 2, 0));
    }

    public static int division(int num1, int num2, int cociente) {
        //cociente es la cantidad de veces que se resta
        int ret;

        if (num1 - num2 < 0) {
            ret = cociente;
        } else {
            cociente += 1;
            ret = division((num1 - num2), num2, cociente);
        }
        return ret;
    }

}
