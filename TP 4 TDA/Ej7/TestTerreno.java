/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej7;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class TestTerreno {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Terreno[] array;
        int cantTer, seguir = 1, opc, cod, manz;
        double valor;

        System.out.println("Cuantos terrenos va a almacenar?");
        cantTer = sc.nextInt();
        array = new Terreno[cantTer];
        cargarArr(array, sc);

        do {
            menuOpc();
            opc = sc.nextInt();
            switch (opc) {
                case 1: {
                    System.out.println("El codigo del terreno mas grande es: " + terGrande(array));
                }
                break;
                case 2: {
                    System.out.println("Ingrese el codigo del terreno");
                    cod = sc.nextInt();
                    dimTer(array, cod);
                }
                break;
                case 3: {
                    System.out.println("Ingrese la manzana");
                    manz = sc.nextInt();
                    terManzana(array, manz);
                }
                break;
                case 4: {
                    System.out.println("Ingrese el valor por metro cuadrado");
                    valor = sc.nextDouble();
                    precioTer(array, valor);
                }
                break;
            }

            System.out.println("Desea seguir? 1 para si, 2 para no");
            seguir = sc.nextInt();

        } while (seguir == 1);

    }

    public static void cargarArr(Terreno[] arr, Scanner sc) {
        int i, longArr, codigo, manzana;
        double base, altura;
        Terreno ter;
        longArr = arr.length;
        for (i = 0; i < longArr; i++) {
            System.out.println("Ingrese el codigo del terreno");
            codigo = sc.nextInt();
            System.out.println("Ingrese la base del terreno");
            base = sc.nextDouble();
            System.out.println("Ingrese la altura del terreno");
            altura = sc.nextDouble();
            System.out.println("Ingrese la manzana del terreno");
            manzana = sc.nextInt();
            ter = new Terreno(codigo, base, altura, manzana);
            arr[i] = ter;
        }
    }

    public static void menuOpc() {
        System.out.println("Elija una de las siguientes opciones:");
        System.out.println("1 para ver el terreno mas grande");
        System.out.println("2 para ver las dimensiones de un terreno segun su codigo");
        System.out.println("3 para ver los datos de los terrenos ubicados en una manzana");
        System.out.println("4 para ver el precio de cada uno de los terrenos");
    }

    public static int terGrande(Terreno[] arr) {
        int i, longArr, codTer = 0;
        double terGrande = 0;
        longArr = arr.length;
        for (i = 0; i < longArr; i++) {
            if (arr[i].superficie() > terGrande) {
                terGrande = arr[i].superficie();
                codTer = arr[i].getCodigo();
            }
        }
        return codTer;
    }

    public static void dimTer(Terreno[] arr, int cod) {
        int i = 0, longArr;
        longArr = arr.length;
        do {
            if (cod == arr[i].getCodigo()) {
                System.out.println("Base: " + arr[i].getBase());
                System.out.println("Altura: " + arr[i].getAltura());
            }
        } while (cod != arr[i].getCodigo());
    }

    public static void terManzana(Terreno[] arr, int manz) {
        int i, longArr;
        longArr = arr.length;
        for (i = 0; i < longArr; i++) {
            if (manz == arr[i].getManzana()) {
                System.out.println(arr[i].toString());
            }
        }
    }

    public static void precioTer(Terreno[] arr, double val) {
        int i, longArr;
        longArr = arr.length;
        for (i = 0; i < longArr; i++) {
            System.out.println("El valor del terreno con codigo " + arr[i].getCodigo() + " es de $" + arr[i].valor(val));
        }
    }
}
