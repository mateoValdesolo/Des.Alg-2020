/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2ej8;
import java.util.Scanner;
/**
 *
 * @author Administrador
 */
public class Tp2Ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        char arreglo [] = new char [100];
        int opt = 1, contArr = 0, contLetra = 0, longArr = arreglo.length, opcion;
        char carIng, carBusc, carOcurr;     
        while(opt == 1 && contArr <= 100){
            System.out.println("Ingrese una letra para almacenar en el arreglo");
            carIng = sc.next().charAt(0);
            if (Character.isLetter(carIng)){
                valorArr(arreglo,carIng,contArr);
                contLetra++;
            }
            else{
                System.out.println("El caracter no es una letra, intente nuevamente");
            }
            System.out.println("Desea ingresar otro caracter? 1 para si, 2 para no");
            opt = sc.nextInt();
            contArr++;
        }
        System.out.println("Elija una de las siguientes opciones:");
        System.out.println("1 para ver el contenido del arreglo");
        System.out.println("2 para verificar si una letra se encuentra en el arreglo");
        System.out.println("3 para contar cuántas ocurrencias de una letra hay en el arreglo.");
        opcion = sc.nextInt();
        switch (opcion){
            case 1:{ 
                mostrarArr(arreglo,contArr);
            }
            break;
            case 2:{
                System.out.println("Ingrese el caracter que desea buscar");
                carBusc = sc.next().charAt(0);
                if (encontrLetra(arreglo,carBusc,longArr) == true){
                     System.out.println("El caracter "+'"'+carBusc+'"'+" aparece en el arreglo");
                }
                else{
                    System.out.println("El caracter no aparece en el arreglo");
                }
            }
            break;
            case 3:{
                System.out.println("Ingrese el caracter que desea saber cuantas ocurrencias tiene en el arreglo");
                carOcurr = sc.next().charAt(0);
                System.out.println("La letra "+'"'+carOcurr+'"'+" tiene "+ocurrArr(arreglo,carOcurr,longArr)+" ocurrencias");
            }
        }
        System.out.println("El arreglo tiene "+contLetra+" letras");
        sc.close();
    }
    
    public static void valorArr (char [] arreglo1,char car1, int pos){
        arreglo1 [pos] = car1;
    }
    
    public static void mostrarArr (char [] arreglo3,int longitud){
        int i;
        for(i = 0; i < longitud;i++){
            System.out.print(arreglo3[i]);
        }
        System.out.println(" ");
    }
    
    public static boolean encontrLetra(char [] arreglo2, char car2, int longitud3){
        int cont = 0;
        boolean verif = false;
        while(verif == false && longitud3 < 100){
            if (arreglo2[cont] == car2){
                verif = true;
            }
            cont++;
        }
        return verif;  
    }
    
    public static int ocurrArr (char [] arreglo4, char car3, int longitud2){
        int i,cont = 0;
        for(i = 0; i <= longitud2-1; i++){
            if(arreglo4[i] == car3){
               cont++; 
            }
        }
        return cont;
    }
}