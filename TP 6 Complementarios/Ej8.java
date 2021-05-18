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
public class Ej8 {

    public static void main(String[] args) {
        String cad = "Hola como estas";
        vocalesCad(cad, 0);
        System.out.println("");
        vocalesCadAlReves(cad, cad.length()-1);
    }

    public static void vocalesCad(String cad, int pos) {
        boolean esVocal;
        esVocal = cad.charAt(pos) == 'a' || cad.charAt(pos) == 'e' || cad.charAt(pos) == 'i' || cad.charAt(pos) == 'o' || cad.charAt(pos) == 'u';

        if (esVocal && pos < cad.length() - 1) {

            System.out.print(cad.charAt(pos));
            vocalesCad(cad, pos + 1);

        } else {

            if (pos < cad.length() - 1) {

                vocalesCad(cad, pos + 1);

            }
        }
    }
    
        public static void vocalesCadAlReves(String cad, int pos) {
        boolean esVocal;
        esVocal = cad.charAt(pos) == 'a' || cad.charAt(pos) == 'e' || cad.charAt(pos) == 'i' || cad.charAt(pos) == 'o' || cad.charAt(pos) == 'u';

        if (esVocal && pos > 0) {

            System.out.print(cad.charAt(pos));
            vocalesCadAlReves(cad, pos - 1);

        } else {

            if (pos > 0) {

                vocalesCadAlReves(cad, pos - 1);

            }
        }
    }
}
