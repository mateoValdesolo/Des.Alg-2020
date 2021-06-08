/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpo2;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class TpO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Este algoritmo da diferentes opciones para trabajar con un arreglo 
        de elementos de tipo Obra.
         */
        Scanner sc = new Scanner(System.in);
        int opt, vot, codIng, desc, elem = 0, opc;
        Obra[] arreglo;

        System.out.println("1 para trabajar con un arreglo de elementos precargado, 2 para realizar la carga manualmente");
        opt = sc.nextInt();

        if (opt == 1) {

            Obra ob1, ob2, ob3, ob4, ob5, ob6;
            arreglo = new Obra[6];
            arreglo[1] = new Obra(1, "La Gioconda", "Da Vinci", 77, 53);
            arreglo[5] = new Obra(2, "La Ultima Cena", "Da Vinci", 460, 880);
            arreglo[2] = new Obra(3, "La Noche Estrellada", "Van Gogh", 74, 92);
            arreglo[4] = new Obra(4, "El Grito", "Munch", 91, 74);
            arreglo[3] = new Obra(5, "Guernica", "Picasso", 349, 770);
            arreglo[0] = new Obra(6, "El Beso", "Klimt", 180, 180);

        } else {

            arreglo = new Obra[100];
            cargarObras(arreglo, sc);
            elem = contElem(arreglo);

        }

        System.out.println("** Que metodo de ordenamiento desea usar? 1 para Burbuja Mejorado, 2 para Seleccion, 3 para Insercion **");
        opc = sc.nextInt();
        ordenam(arreglo, opc, elem, opt);

        System.out.println("** Desea votar obras? 1 para si, 2 para no *");
        vot = sc.nextInt();
        while (vot == 1) {
            System.out.println("** Ingrese el codigo de la obra que desea votar **");
            codIng = sc.nextInt();
            votarObra(arreglo, codIng);
            System.out.println("** Desea votar otra obra? 1 para si, 2 para no **");
            vot = sc.nextInt();
        }

        if (opt == 1) {
            opt(arreglo, arreglo.length, sc);
        } else {
            opt(arreglo, elem, sc);
        }

    }

    public static void opt(Obra[] arr, int longArr, Scanner sc) {
        /*Este modulo realiza y muestra las diferentes opciones a realizar con el arreglo
         */
        int cod;
        System.out.println("** Obras con menos de 10 votos: " + contVotos(arr, 0, 0, longArr) + " **");

        System.out.println("** Obra con mayor precio:\n" + arr[mayPrecio(arr, 0, 0, 0, longArr)] + " **");

        System.out.println("** Ingrese el codigo de una obra para saber si se encuentra en el arreglo **");
        cod = sc.nextInt();
        if (busquedaBinaria(arr, cod, longArr) != -1) {
            System.out.println("** La obra se encuentra en el arreglo **");
        } else {
            System.out.println("** La obra no se encuentra en el arreglo **");
        }
        System.out.println("Arreglo ordenado por Titulo de la Obra: ");
        quicksort(arr, 0, longArr - 1);
        mostrarObr(arr, longArr);

    }

    public static void ordenam(Obra[] arreglo, int opc, int elem, int opt) {
        //Este modulo da a elegir los diferentes metodos de ordenamiento para ordenar un arreglo
        switch (opc) {
            case 1: {
                if (opt == 1) {
                    burbujaMejorado(arreglo, arreglo.length);
                    mostrarObr(arreglo, arreglo.length);
                } else {
                    burbujaMejorado(arreglo, elem);
                    mostrarObr(arreglo, elem);
                }

            }
            break;
            case 2: {
                if (opt == 1) {
                    seleccion(arreglo, arreglo.length);
                    mostrarObr(arreglo, arreglo.length);
                } else {
                    burbujaMejorado(arreglo, elem);
                    mostrarObr(arreglo, elem);
                }

            }
            break;
            case 3: {
                if (opt == 1) {
                    insercion(arreglo, arreglo.length);
                    mostrarObr(arreglo, arreglo.length);
                } else {
                    insercion(arreglo, elem);
                    mostrarObr(arreglo, elem);
                }

            }
            break;
        }
    }

    public static void cargarObras(Obra[] arr, Scanner sc) {
        //Este modulo pide los atributos para crear las obras y las almacena en un arreglo.
        int cod, i = 0, longArr, seg = 1;
        String tit, aut;
        double larg, anch, prec;
        Obra obr;
        longArr = arr.length;
        while (i < longArr && seg == 1) {
            System.out.println("Ingrese el codigo de la obra");
            cod = sc.nextInt();
            while (i >= 1 && !verifCod(arr, cod, i)) {
                System.out.println("** Ya existe una obra con ese codigo, ingreselo nuevamente **");
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
            System.out.println("** Desea seguir cargando? 1 para si, 2 para no **");
            seg = sc.nextInt();
            i++;
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

    public static void mostrarObr(Obra[] arr, int longitud) {
        //Este modulo muestra todas las obras almacenadas en el Arreglo.
        int i;
        for (i = 0; i < longitud; i++) {
            System.out.println("Codigo: " + arr[i].getCodigo() + " Titulo: " + arr[i].getTitulo() + " Autor: " + arr[i].getAutor());
        }
    }

    public static void burbujaMejorado(Obra[] arr, int longArr) {
        /*Este modulo ordena el arreglo por el atributo codigo, de menor a mayor
        Usando el metodo de ordenacion Burbuja Mejorado
         */
        boolean ordenado;
        int i;
        Obra aux;
        ordenado = false;
        i = 0;
        while (i < longArr && !ordenado) {
            ordenado = true;
            for (int j = 0; j <= longArr - i - 2; j++) {
                if (arr[j].getCodigo() > arr[j + 1].getCodigo()) {
                    ordenado = false;
                    aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                }
            }
            i++;
        }
    }

    public static void seleccion(Obra[] arr, int longitud) {
        /*Este modulo ordena el arreglo por el atributo codigo, de menor a mayor
        Usando el metodo de ordenacion por Seleccion
         */
        int i, j, min;
        Obra temp;
        for (i = 0; i <= longitud - 2; i++) {
            min = i;
            for (j = i + 1; j <= longitud - 1; j++) {
                if (arr[j].getCodigo() < arr[min].getCodigo()) {
                    min = j;
                }
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insercion(Obra[] arr, int longitud) {
        /*Este modulo ordena el arreglo por el atributo codigo, de menor a mayor
        Usando el metodo de ordenacion por Insercion
         */
        int i, j;
        Obra temp;
        i = 0;
        for (i = 1; i <= longitud - 1; i++) {
            temp = arr[i];
            j = i;
            while (j > 0 && temp.getCodigo() < arr[j - 1].getCodigo()) {
                arr[j] = arr[j - 1];
                j = j - 1;
            }
            arr[j] = temp;

        }
    }

    public static void votarObra(Obra[] arr, int cod) {
        //Este modulo vota a una obra segun su codigo.
        int i = 0, longArr;
        longArr = arr.length;
        boolean seg = true;
        while (seg = true && i < longArr && arr[i] != null) {
            if (cod == arr[i].getCodigo()) {
                arr[i].votar();
                seg = false;
            }
            i++;
        }
    }

    public static int contVotos(Obra[] arr, int pos, int cont, int longitud) {
        //Este modulo recursivo cuenta las obras con menos de 10 votos en el arreglo
        if (pos == longitud - 1) {
            if (arr[pos].getVotos() < 10) {
                cont += 1;
            }
        } else {
            if (arr[pos].getVotos() < 10) {
                cont += 1;
            }
            cont = contVotos(arr, pos + 1, cont, longitud);
        }
        return cont;
    }

    public static int mayPrecio(Obra[] arr, int pos, int may, double precio, int longitud) {
        //Este modulo recursivo retorna la obra con mayor precio en el arreglo
        if (pos == longitud - 1) {
            if (precio > arr[pos].getPrecio()) {
                may = arr[pos].getCodigo();
                precio = arr[pos].getPrecio();
            }
        } else {
            if (precio > arr[pos].getPrecio()) {
                may = arr[pos].getCodigo();
                precio = arr[pos].getPrecio();
            }
            may = mayPrecio(arr, pos + 1, may, precio, longitud);
        }
        return may;
    }

    public static int busquedaBinaria(Obra[] arr, int k, int longitud) {
        /*Este modulo busca si existe una obra con el codigo ingresado por el usuario
        lo hace usando el metodo de Busqueda Binaria
        */
        int ini, fin, res, medio;
        ini = 0;
        fin = longitud - 1;
        res = -1;
        while (ini <= fin) {
            medio = (int) Math.floor((ini + fin) / 2);
            if (k == arr[medio].getCodigo()) {
                res = medio;
                ini = fin + 1;
            } else {
                if (k < arr[medio].getCodigo()) {
                    fin = medio - 1;
                } else {
                    ini = medio + 1;
                }
            }
        }
        return res;
    }

    public static int contElem(Obra[] arr) {
        /*Este modulo cuenta la cantidad de elementos se ingresaron en el
        arreglo sobredimensionado (Usado en la carga manual)
        */
        int pos = 0;
        while (arr[pos] != null) {
            pos++;
        }
        return pos;
    }

    public static void quicksort(Obra[] arr, int izq, int der) {
        /*Este algortimo ordena a el arreglo por el atributo Titulo
        por orden lexicografico, usando el metodo QuickSort
        */
        int medio, i, j;
        Obra temp;
        medio = izq + (der - izq) / 2;
        i = izq;
        j = der;
        String pivot;

        pivot = arr[medio].getTitulo();

        while (i <= j) {

            while (arr[i].getTitulo().compareToIgnoreCase(pivot) < 0) {
                i++;
            }

            while (arr[j].getTitulo().compareToIgnoreCase(pivot) > 0) {
                j--;
            }

            if (i <= j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (izq < j) {
            quicksort(arr, izq, j);
        }
        if (der > i) {
            quicksort(arr, i, der);
        }
    }

}
