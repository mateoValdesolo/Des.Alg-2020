/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6comp;
import java.util.Scanner;
/**
 *
 * @author mateo
 */
public class Ej4 {

    public static void main(String[] args) {
        System.out.println(invertirCad(' '));
    }
    
    public static String invertirCad (char car){
        Scanner sc = new Scanner(System.in);
        String cad = "";
        
        if(car != '.'){
            car = sc.next().charAt(0);
            cad = invertirCad(car);
            cad = cad + car;
        }
        return cad;
    }

}
