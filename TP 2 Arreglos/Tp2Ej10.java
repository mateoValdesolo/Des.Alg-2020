/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2ej10;
import java.util.Scanner;
/**
 *
 * @author Administrador
 */
public class Tp2Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String [] arreglo;
        int longArr;
        System.out.println("Ingrese la longitud del arreglo de palabras");
        longArr = sc.nextInt();
        arreglo = new String [longArr];
        cargarArr(arreglo,longArr,sc);
        palLarga(arreglo,longArr);
        sc.close();
    }
    
    public static void cargarArr (String [] arreglo1, int longitud1, Scanner sc){
        int i;
        String palIng;
        for(i = 0; i < longitud1; i++){
            System.out.println("Ingrese una palabra para almacenar en el arreglo");
            palIng = sc.next();
            arreglo1[i] = palIng;
            
        }
        sc.close();
    }
    
    public static void palLarga (String [] arreglo2, int longitud2){
        int i,longPal, palMay = 0;
        String pal,palLar = "";
        for (i = 0; i < longitud2;i++){
            pal = arreglo2[i];
            longPal = pal.length();
            if (longPal > palMay){
                palMay = longPal;
                palLar = pal;
            }
        }
        System.out.println("La palabra más larga es: "+palLar);
    }
}
