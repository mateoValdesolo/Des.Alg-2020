/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej6;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class TestIngrediente {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ingrediente[] array;
        int ingr, opt;
        String ingrVer;

        System.out.println("Cuantos ingredientes necesita la receta?");
        ingr = sc.nextInt();
        array = new Ingrediente[ingr];
        cargarArr(array, sc);

        System.out.println("Que desea realizar? 1 para ver los ingredientes con la cantidad requerida.\n2 para verificar si un ingrediente es necesario para la receta");
        opt = sc.nextInt();
        if (opt == 1) {
            listaIngr(array);
        } else {
            System.out.println("Ingrese el ingrediente que desea verificar si está en la receta");
            ingrVer = sc.next();
            if (verifIngr(array,ingrVer) == false){
                System.out.println("El ingrediente no es necesario para la receta");
            } else{
                System.out.println("El Ingrediente es necesario para la receta");
            }
        }

    }

    public static void cargarArr(Ingrediente[] arr, Scanner sc) {
        int longArr, i;
        String nom, uni;
        double cant;
        Ingrediente ingred;
        longArr = arr.length;
        for (i = 0; i < longArr; i++) {
            System.out.println("Ingrese el nombre del ingrediente "+(i+1));
            nom = sc.next();
            System.out.println("Ingrese la cantidad");
            cant = sc.nextDouble();
            System.out.println("Ingrese la unidad de medida");
            uni = sc.next();
            ingred = new Ingrediente (nom,cant,uni);
            arr[i] = ingred;
        }
    }

    public static void listaIngr(Ingrediente[] arr) {
        int longArr, i;
        longArr = arr.length;
        for (i = 0; i < longArr; i++) {
            System.out.println(arr[i].toString());
        }
    }

    public static boolean verifIngr(Ingrediente[] arr, String ingr) {
        int i = 0;
        boolean ret = false;
        do {
            if (arr[i].getNombre().equals(ingr)){
                ret = true;
            }
            else{
                i++;
            }
        } while (ret == false);
        return ret;
    }
}
