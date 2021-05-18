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
public class Ej10 {

    public static void main(String[] args) {
        System.out.println(contLetra("hola como estas", 'a', 0, 0));

    }

    public static int contLetra(String cad, char car, int pos, int cont) {
        char car2 = cad.charAt(pos);
        int longCad = cad.length();
        
        if (car2 == car) {
            cont += 1;
            if (pos < longCad-1) {
                cont = contLetra(cad, car, pos + 1, cont);
            }
        } else {
            if (pos < longCad-1) {
                cont = contLetra(cad, car, pos + 1, cont);
            }

        }
        return cont;
    }

}
