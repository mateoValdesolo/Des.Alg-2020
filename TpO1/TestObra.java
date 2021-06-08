/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpo1;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
/*Alumno: Valdesolo Mateo Luis
  Legajo: FAI-2570
 */
public class TestObra {

    public static void main(String[] args) {
        /*Este algoritmo permite al usuario almacenar distintas obras
        en un arreglo, para luego poder realizar distintas operaciones
        con ellas.
         */
        Scanner sc = new Scanner(System.in);
        Obra[] arreglo;
        int obras, opc, codIng;
        String autorIng;
        System.out.println("Cuantas obras va a ingresar?");
        obras = sc.nextInt();
        if (obras > 30) {
            System.out.println("La cantidad de obras debe ser menor a 30, ingrese nuevamente");
            obras = sc.nextInt();
        }
        arreglo = new Obra[obras];
        cargarObras(arreglo, sc);
        do {
            menu();
            opc = sc.nextInt();
            switch (opc) {
                case 1: {
                    mostrarObr(arreglo);
                }
                break;
                case 2: {
                    System.out.println("Ingrese el codigo de la obra que desea votar");
                    codIng = sc.nextInt();
                    votarObra(arreglo, codIng);
                }
                break;
                case 3: {
                    System.out.println("Ingrese el codigo de la obra que desea descalificar");
                    codIng = sc.nextInt();
                    descalificarObra(arreglo, codIng);
                }
                break;
                case 4: {
                    System.out.println("Ingrese el autor de las obras que desea ver");
                    autorIng = sc.next();
                    obraAutor(arreglo, autorIng);
                }
                break;
                case 5: {
                    System.out.println("El mayor precio que ha conseguido una obra de arte es: $" + mayPrecio(arreglo));
                }
                break;
                case 6: {
                    ganadores(arreglo);
                }
                break;
                case 7: {
                    System.out.println("Ingrese el codigo de la obra");
                    codIng = sc.nextInt();
                    infoObra(arreglo, codIng);
                }
                break;
                case 8: {
                    System.out.println("Hasta pronto, tenga un buen dia!");
                }
                break;
            }
        } while (opc != 8);
    }

    public static void cargarObras(Obra[] arr, Scanner sc) {
        //Este modulo pide los atributos para crear las obras y las almacena en un arreglo.
        int cod, i, longArr;
        String tit, aut;
        double larg, anch, prec;
        Obra obr;
        longArr = arr.length;
        for (i = 0; i < longArr; i++) {
            System.out.println("Ingrese el codigo de la obra");
            cod = sc.nextInt();
            while (i >= 1 && !verifCod(arr, cod, i)) {
                System.out.println("Ya existe una obra con ese codigo, ingreselo nuevamente");
                cod = sc.nextInt();
            }
            System.out.println("Ingrese el titulo de la obra");
            tit = sc.next();
            System.out.println("Ingrese el autor de la obra");
            aut = sc.next();
            System.out.println("Ingrese el largo de la obra");
            larg = sc.nextDouble();
            System.out.println("Ingrese el ancho de la obra");
            anch = sc.nextDouble();
            obr = new Obra(cod, tit, aut, larg, anch);
            arr[i] = obr;
        }
    }

    public static boolean verifCod(Obra[] arr, int cod, int hast) {
        //Este modulo verifica si hay una obra con el mismo codigo.
        int i, longArr;
        boolean ret = true;
        longArr = arr.length;
        for (i = 0; i < hast; i++) {
            if (arr[i].getCodigo() == cod) {
                ret = false;
            }
        }
        return ret;
    }

    public static void menu() {
        //Este modulo despliega las diferentes opciones a realizar.
        System.out.println("Elija una de las siguientes opciones");
        System.out.println("1 para mostrar todas las obras de arte");
        System.out.println("2 para votar una obra de arte");
        System.out.println("3 para descalificar una obra de arte");
        System.out.println("4 para mostrar el titulo de las obras de un autor");
        System.out.println("5 para mostrar el mayor precio que ha conseguido una obra de arte");
        System.out.println("6 para listar los primeros 3 puestos");
        System.out.println("7 para ver la informacion de una obra de arte");
        System.out.println("8 para salir");
    }

    public static void mostrarObr(Obra[] arr) {
        //Este modulo muestra todas las obras almacenadas en el Arreglo.
        int i, longArr;
        longArr = arr.length;
        for (i = 0; i < longArr; i++) {
            System.out.println("Codigo: " + arr[i].getCodigo() + " Titulo: " + arr[i].getTitulo() + " Autor: " + arr[i].getAutor());
        }
    }

    public static void votarObra(Obra[] arr, int cod) {
        //Este modulo vota a una obra segun su codigo.
        int i = 0, longArr;
        longArr = arr.length;
        boolean seg = true;
        do {
            if (cod == arr[i].getCodigo()) {
                arr[i].votar();
                seg = false;
            }
            i++;
        } while (seg = true && i < longArr);
    }

    public static void descalificarObra(Obra[] arr, int cod) {
        //Este modulo descalifica a una obra segun su codigo.
        int i = 0, longArr;
        longArr = arr.length;
        boolean seg = true;
        do {
            if (cod == arr[i].getCodigo()) {
                arr[i].Descalificar();
                seg = false;
            }
            i++;
        } while (seg == true);
    }

    public static void obraAutor(Obra[] arr, String aut) {
        //Este modulo lista los nombres de las obras de un autor dado.
        int i, longArr;
        longArr = arr.length;
        for (i = 0; i < longArr; i++) {
            if (arr[i].getAutor().equals(aut)) {
                System.out.println(arr[i].getTitulo());
            }
        }
    }

    public static double mayPrecio(Obra[] arr) {
        //Este modulo muestra por pantalla el mayor precio que alcanzo una obra.
        int i, longArr;
        double valMay = 0;
        longArr = arr.length;
        for (i = 0; i < longArr; i++) {
            if (arr[i].getPrecio() > valMay) {
                valMay = arr[i].getPrecio();
            }
        }
        return valMay;
    }

    public static void ganadores(Obra[] arr) {
        //Este modulo muestra por pantalla las obras que quedaron en los primeros 3 puestos
        int i, longArr, vot = 0, vot2 = 0, vot3 = 0;
        longArr = arr.length;
        Obra gan1 = new Obra(1), gan2 = new Obra(1), gan3 = new Obra(1);
        for (i = 0; i < longArr; i++) {
            if (arr[i].getVotos() > vot && arr[i].getDescalificada() == false) {
                vot = arr[i].getVotos();
                gan1 = arr[i];
            }
            if (arr[i].getVotos() < vot && arr[i].getVotos() > vot2 && arr[i].getDescalificada() == false) {
                vot2 = arr[i].getVotos();
                gan2 = arr[i];
            }
            if (arr[i].getVotos() < vot2 && arr[i].getVotos() > vot3 && arr[i].getDescalificada() == false) {
                vot3 = arr[i].getVotos();
                gan3 = arr[i];
            }
        }
        System.out.println("1er Puesto:\nCodigo:" + gan1.getCodigo() + "\nTitulo: " + gan1.getTitulo() + "\nAutor: " + gan1.getAutor());
        System.out.println("2do Puesto:\nCodigo:" + gan2.getCodigo() + "\nTitulo: " + gan2.getTitulo() + "\nAutor: " + gan2.getAutor());
        System.out.println("3er Puesto:\nCodigo:" + gan3.getCodigo() + "\nTitulo: " + gan3.getTitulo() + "\nAutor: " + gan3.getAutor());
    }

    public static void infoObra(Obra[] arr, int cod) {
        //Este modulo muestra toda la informacion de una obra segun su codigo.
        int i = 0, longArr;
        longArr = arr.length;
        boolean seg = true;
        do {
            if (arr[i].getCodigo() == cod) {
                System.out.println(arr[i].toString());
                seg = false;
            }
            i++;
        } while (seg == true && i < longArr);
    }

}
