/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej4;
import java.util.Scanner;
/**
 *
 * @author Administrador
 */
public class TestIngrediente {
    
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        String nom, uni;
        double cant;
        
        
        System.out.println("Ingrese el nombre del ingrediente");
        nom = sc.next();
        System.out.println("Ingrese la cantidad");
        cant = sc.nextDouble();
        System.out.println("Ingrese la unidad de medida");
        uni = sc.next();
        
        Ingrediente ingr1;
        ingr1 = new Ingrediente(nom,cant,uni);
        Ingrediente ingr2;
        ingr2 = new Ingrediente ("harina",100.0,"gramos");
        
        
        if (ingr1.equals(ingr2)){
            System.out.println("Los ingredientes son iguales");
        } else{
            System.out.println("Los ingredientes son distintos");
        }
        
        System.out.println(ingr1.toString());
        System.out.println(ingr2.toString());
           
    }
    
}
