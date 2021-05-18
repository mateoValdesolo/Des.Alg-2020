/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3ej5;
import java.util.Scanner;
/**
 *
 * @author Administrador
 */
public class Tp3Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int [][] notas = new int [10][6];
        cargarNotas(notas,sc);
        opciones(notas,sc); 
    }
    
    public static void cargarNotas (int [][] matr, Scanner sc){
        int i, j, longCol, longFil;
        longFil = matr.length;
        longCol = matr[0].length;
        for (i = 0; i < longFil; i++){
            for (j = 0; j < longCol; j++){
                System.out.println("Ingrese la nota del examen "+(j+1)+" del alumno "+(i+1));
                matr[i][j] = sc.nextInt();
            }
        }
    }
    
    public static double promNotas (int [][] matr){
        int i, j, longCol, longFil;
        double prom, sum = 0, cont = 0;
        longFil = matr.length;
        longCol = matr[0].length;
        for (i = 0; i < longFil; i++){
            for (j = 0; j < longCol; j++){
                sum = sum + matr[i][j];
                cont++;
            }
        }
        prom = sum/cont;
        return prom;
    }
    
    public static void notasAlumno (int [][] matr,Scanner sc){
        int j, longCol, alumno;
        longCol = matr[0].length;
        System.out.println("De que alumno desea ver la nota?");
        alumno = (sc.nextInt()-1);
        for (j = 0; j < longCol; j++){
            System.out.println(matr[alumno][j]+"");
        }
    }
    
    public static void mayorNota (int[][] matr){
        int i, j, longCol, longFil, notaMay = 0, alumMay = 0;
        longFil = matr.length;
        longCol = matr[0].length;
        for (i = 0; i < longFil; i++){
            for (j = 0; j < longCol; j++){
                if (notaMay < matr[i][longCol-1]){
                    notaMay = matr[i][j];
                    alumMay = (i+1);
                }
            }
        }
        System.out.println("La mayor nota es: "+notaMay+" y es del alumno: "+alumMay);
    }
    
    public static void opciones (int [][]matr, Scanner sc){
        int opc;
        boolean seguir = true;
        do{
            System.out.println("Elija una de las siguientes opciones:");
            System.out.println("1 para Calcular el promedio de todos los alumnos");
            System.out.println("2 para ver las notas de un alumno");
            System.out.println("3 para ver la mayor nota del ultimo examen y el alumno que obtuvo esa nota");
            System.out.println("4 para salir");
            opc = sc.nextInt();
            switch(opc){
                case 1:{
                    System.out.println("El promedio de notas de los alumnos es: "+promNotas(matr));
                }
                break;
                case 2:{
                    notasAlumno(matr,sc);
                }
                break;
                case 3:{
                    mayorNota(matr);
                }
                break;
                case 4:{
                    seguir = false;
                }
            }
        } while (seguir == true);
    }
}
