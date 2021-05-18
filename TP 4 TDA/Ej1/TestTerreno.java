/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej1;
import java.util.Scanner;
/**
 *
 * @author Administrador
 */
public class TestTerreno {
    
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int codigo;
        double base;
        double altura;
        int manzana;
        int opt;
        double prec;
        
        System.out.println("Ingrese el codigo del terreno");
        codigo = sc.nextInt();
        System.out.println("Ingrese la base del terreno");
        base = sc.nextDouble();
        System.out.println("Ingrese la altura del terreno");
        altura = sc.nextDouble();
        System.out.println("Ingrese la manzana del terreno");
        manzana = sc.nextInt();
        
        //Declarar referencias de tipo TDA Terreno
        Terreno ter;
        
        //Creacion a partir de los datos ingresados
        ter = new Terreno(codigo,base,altura,manzana);
        System.out.println("El perimetro del terreno es: "+ter.perimetro()+" mts");
        System.out.println("Desea ver la cantidad necesaria de alambre para poner un cerco que dé tres vueltas al rededor del terreno?");
        System.out.println("1 para si, 2 para no");
        opt = sc.nextInt();
        if(opt == 1){
            System.out.println("Los metros de alambre necesarios son: "+ter.perimetro()*3);
        }
        System.out.println("La superficie del terreno es: "+ter.superficie()+" metros cuadrados");
        System.out.println("El costo de limpiar el terreno es de: $"+costLimpieza(ter.superficie()));
        System.out.println("Ingrese el costo por metro cuadrado del terreno para calcular el valor del mismo");
        prec = sc.nextDouble();
        System.out.println("El valor del terreno es de: $"+ter.valor(prec));
        }
    
    
    public static double costLimpieza (double sup){
        int costo;
        double tot;
        costo = 150;
        tot = sup*costo;
        return tot;
    }
    }

