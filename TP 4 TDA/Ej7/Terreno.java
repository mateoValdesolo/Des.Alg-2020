/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej7;

/**
 *
 * @author Administrador
 */
public class Terreno {

    //Atributos
    private int codigo;
    private double base;
    private double altura;
    private int manzana;

    //Constructores
    public Terreno(int cod) {
        this.codigo = cod;
        this.base = 0;
        this.altura = 0;
        this.manzana = 0;
    }

    public Terreno(int cod, double ba, double al, int man) {
        this.codigo = cod;
        this.base = ba;
        this.altura = al;
        this.manzana = man;
    }

    //Observadores
    public int getCodigo() {
        return this.codigo;
    }

    public double getBase() {
        return this.base;
    }

    public double getAltura() {
        return this.altura;
    }

    public int getManzana() {
        return this.manzana;
    }

    @Override
    public String toString() {
        return ("Codigo: " + codigo + " Base: " + base + " Altura " + altura + " Manzana " + manzana);
    }

    public boolean equals(Terreno ter) {
        //Si el codigo fuera String se usa equals en vez de ==
        boolean res = false;
        if (this.codigo == (ter.getCodigo())) {
            res = true;
        }
        return res;
    }

    //Modificadores
    public void setBase(int ba) {
        this.base = ba;
    }

    public void setAltura(int al) {
        this.altura = al;
    }

    public void setManzana(int man) {
        this.manzana = man;
    }

    //Propias del tipo
    public double perimetro() {
        //Este codigo va a devolver el perimetro del terreno
        double perimetro;
        perimetro = (this.base * 2) + (this.altura * 2);
        return perimetro;
    }

    public double superficie() {
        //Este codigo va a devolver la superficie del terreno
        double superficie;
        superficie = this.base * this.altura;
        return superficie;

    }

    public double valor(double precio) {
        double valor;
        valor = superficie() * precio;
        return valor;
    }
}
