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
public class Ej9 {

    public static void main(String[] args) {
        char [] arreglo = {'a','b','c'};
        if(verifCar(arreglo, 'a', 0, false)){
            System.out.println("Esta el caracter");
        } else {
            System.out.println("No esta el caracter");
        }
    }
    
    public static boolean verifCar (char [] arr, char car, int pos, boolean ret){
        
        if (arr[pos] == car){
            ret = true;
        } else {
            if (pos < arr.length-1){
                ret = verifCar(arr, car, pos+1, ret);
            }
        }
        return ret;  
    }

}
