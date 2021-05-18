/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej3;
import java.util.Scanner;
/**
 *
 * @author Administrador
 */
public class TestAsignatura {
    
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int codIng, cantTemas, numTema, diaIng, mesIng, anioIng;
        String nomIng;
        String [] tem;
        Fecha ini;
        
        //Declarar referencias de tipo TDA Asignatura y Fecha
        Asignatura asig;
        
        System.out.println("Ingrese el codigo de la asignatura");
        codIng = sc.nextInt();
        
        System.out.println("Ingrese el nombre de la asignatura");
        nomIng = sc.next();
        
        System.out.println("Ingrese la cantidad de temas");
        cantTemas = sc.nextInt();
        
        tem = new String [cantTemas];
        
        cargarArr(tem,sc);
        
        System.out.println("Ingrese la fecha");
        System.out.println("Ingrese el dia");
        diaIng = sc.nextInt();
        System.out.println("Ingrese el mes");
        mesIng = sc.nextInt();
        System.out.println("Ingrese el anio");
        anioIng = sc.nextInt();
        
        ini = new Fecha(diaIng,mesIng,anioIng);
        
        asig = new Asignatura (codIng,nomIng,tem,ini);
        
        
        System.out.println("Ingrese un numero para ver el tema que corresponde a ese numero");
        numTema = sc.nextInt();
        System.out.println("El tema numero "+numTema+" es: "+asig.enesimoTema(numTema));
        
        System.out.print("La lista de los temas es: ");
        asig.listaTemas();
        System.out.println(" ");
        
        System.out.println("Asignatura toString: "+asig.toString());
        
    }
    
    public static void cargarArr(String [] arr, Scanner sc){
        int i, longArr = arr.length;
        for(i = 0; i< longArr; i++){
            System.out.println("Ingrese el tema "+i);
            arr[i] = sc.next();
        }
    } 
}
