/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2ej2;
/**
 *
 * @author Administrador
 */
public class Tp2Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] arregloNum;
        int i = 0;
        arregloNum = new int [5];
        for (i = 0; i < 5; i++){
            arregloNum[i] = i;
        }
        System.out.println("Arreglo de numeros "+arregloLinea(arregloNum));
    }
    
    public static String arregloLinea (int [] arreglo){
        String ret = "";
        int cont = 0;
        while (cont < 5){
            if (cont >= 4){
              ret = ret+arreglo[cont];  
            }
            else{
              ret = ret+arreglo[cont]+'-';  
            }
            cont++;
        }
        return ret;
    }
}
