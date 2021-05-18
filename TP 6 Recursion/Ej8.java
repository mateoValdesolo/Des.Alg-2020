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
public class Ej8 {

    public static void main(String[] args) {
        int [] arreglo = {0,1,2,3,4,5,10}; 
        System.out.println(mayArr(arreglo, 0, 0));

    }
    
    public static int mayArr (int [] arr, int pos, int may){
        if (may < arr[pos]){
            may = arr[pos];
        }
        
        if (pos < arr.length-1){
            may = mayArr(arr, pos+1, may);
        }
        return may;
    }

}
