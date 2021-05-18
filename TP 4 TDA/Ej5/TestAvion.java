/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej5;
import java.util.Scanner;
/**
 *
 * @author Administrador
 */
public class TestAvion {
    
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int ident,asientos,kmRec,velProm;
        String model;
        
        System.out.println("Ingrese el identificador del avion");
        ident = sc.nextInt();
        System.out.println("Ingrese el modelo del avion");
        model = sc.next();
        System.out.println("Ingrese la cantidad de asientos");
        asientos = sc.nextInt();
        System.out.println("Ingrese los km recorridos");
        kmRec = sc.nextInt();
        System.out.println("Ingrese la velocidad promedio");
        velProm = sc.nextInt();
        
        Avion avion1 = new Avion(ident,model,asientos,kmRec,velProm);
        
        System.out.println(avion1.toString());
        
        
        
    }
    
}
