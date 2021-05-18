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
public class Ej7 {
    public static void main(String[] args) {
        String [] arreglo = {"hola","como","estas"};
        palabras(arreglo,0);
    }
    
    public static void palabras (String [] arr, int pos){
        
        if (pos < arr.length){
            System.out.println("Primer caracter: "+arr[pos].charAt(0));
            System.out.println("Longitud de la palabra: "+arr[pos].length());
            palabras(arr,pos+1);
        }   
    }
}
