/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3ej7;
import java.util.Scanner;
/**
 *
 * @author Administrador
 */
public class Tp3Ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Este algoritmo, dado los datos de deuda de los socios, se realiza un arreglo bidimensional
        con los socios como filas y los meses del año como columnas. Permite al usuario elegir entre
        diferentes funciones respecto al arreglo.
        */
        Scanner sc = new Scanner(System.in);
        int [][] matriz = new int [10][12];
        int seguir, opc;
        cargarMatr(matriz,sc);
        do{
            System.out.println("Ingrese la opcion que desea");
            System.out.println("1 para Listar los socios que deben 3 o más meses");
            System.out.println("2 para Listar los socios que no deben ningún mes");
            System.out.println("3 para ver el socio que acumula mayor deuda, y su deuda");
            System.out.println("4 para ver el mes con mayor deuda por parte de los socios");
            opc = sc.nextInt();
            switch (opc){
                case 1:{
                    System.out.println(debeMes(matriz));
                }
                break;
                case 2:{
                    System.out.println(noDebe(matriz));
                }
                break;
                case 3:{
                    System.out.println("La mayor deuda la tiene "+mayorDeuda(matriz));
                }
                break;
                case 4:{
                    System.out.println("El mes con mayor deudas es "+mesMayDeuda(matriz));    
                }
                break;
            }
            System.out.println("Desea seguir? 1 para si, 2 para no");
            seguir = sc.nextInt();
            
        }while(seguir == 1);
        
    }
    
    public static void cargarMatr (int [][] matr,Scanner sc){
        /*Carga los meses de deuda de los socios
        matr = Arreglo bidimensional de enteros
        sc = Input
        */
        int f, c, longFil, longCol;
        longFil = matr.length;
        longCol = matr[0].length;
        for(f = 0; f < longFil; f++){
            for(c = 0; c < longCol; c++){
                System.out.println("Ingrese la deuda del mes "+(c+1)+" del socio "+(f+1));
                matr[f][c] = sc.nextInt();
            }
        }
    }
    
    public static String debeMes (int [][] matr){
        /*Retorna un String con los numeros de los socios que deben 3 meses o mas
        matr = Arreglo bidimensional de enteros
        */
        int f, c, longFil, longCol, cont;
        cont = 0;
        boolean deuda = false;
        String res = "";
        longFil = matr.length;
        longCol = matr[0].length;
        for(f = 0; f < longFil; f++){
            for(c = 0; c < longCol; c++){
                if(matr[f][c] > 0){
                    cont++;
                    if(cont >= 3 && deuda == false){
                        res = res+ " "+ (f+1);
                        cont = 0;
                        deuda = true;
                    }
                }
            }
            deuda = false;
            cont = 0; 
        }
        return res;
    }
    
    public static String noDebe (int [][] matr){
        /*Retorna un String con los numeros de los socios que no deben ningun mes
        matr = Arreglo bidimensional de enteros
        */
        int f, c, longFil, longCol, cont;
        cont = 0;
        String res = "";
        longFil = matr.length;
        longCol = matr[0].length;
        for(f = 0; f < longFil; f++){
            for (c = 0; c < longCol; c++){
                if (matr[f][c] > 0){
                    cont++;
                }
            }
            if (cont == 0){
                res = res + " " +(f+1);
            }
        }
        return res;
    }
    
    public static String mayorDeuda (int [][] matr){
        /*Retorna un String con el numero de socio con la mayor deuda, y el monto de la deuda
        matr = Arreglo bidimensional de enteros
        */
        int f, c, longFil, longCol, total, mayTotal, socMayTotal;
        String resp = "";
        mayTotal = 0;
        socMayTotal = 0;
        longFil = matr.length;
        longCol = matr[0].length;
        
        for(f = 0; f < longFil; f++){
            total = 0;
            for (c = 0; c < longCol;c++){
                total = total + matr[f][c];
            }
            if (total > mayTotal){
                mayTotal = total;
                socMayTotal = f;
            }  
        }
        resp = socMayTotal + " con un valor de "+ mayTotal;
        return resp;    
    }
    
    public static int mesMayDeuda (int [][] matr){
        /*Retorna un Entero el cual es el més con mayor deuda por parte de los socios
        matr = Arreglo bidimensional de enteros
        */
        int f, c, longFil, longCol, resp, deudaMes, suma, mesMay = 0;
        longFil = matr.length;
        longCol = matr[0].length;
        deudaMes = 0;
        
        for(c = 0; c < longCol;c++){
            suma = 0;
            for (f = 0; f < longFil; f++){
                suma = suma + matr[f][c];
            }
            if (suma > deudaMes){
                deudaMes = suma;
                mesMay = c;
            }
        }
        return (mesMay+1);     
    }
}