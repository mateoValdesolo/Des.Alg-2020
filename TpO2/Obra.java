/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpo2;

/**
 *
 * @author Administrador
 */
/*Alumno: Valdesolo Mateo Luis
Legajo: FAI-2570
 */
public class Obra {

    //Atributos
    private int codigo;
    private String titulo;
    private String autor;
    private double largo;
    private double ancho;
    private int votos;
    private double precio;
    private boolean descalificada;

    //Constructores
    public Obra(int cod) {
        codigo = cod;
        titulo = "";
        autor = "";
        largo = 0.0;
        ancho = 0.0;
        votos = 0;
        precio = 100.0;
        descalificada = false;
    }

    public Obra(int cod, String tit, String aut, double larg, double anch) {
        codigo = cod;
        titulo = tit;
        autor = aut;
        largo = larg;
        ancho = anch;
        votos = 0;
        precio = 100.0;
        descalificada = false;
    }

    //Observadores
    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getLargo() {
        return largo;
    }

    public double getAncho() {
        return ancho;
    }

    public int getVotos() {
        return votos;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean getDescalificada() {
        return descalificada;
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo + "\nTitulo: " + titulo + "\nAutor: " + autor + "\nLargo: " + largo + "\nAncho: " + ancho + "\nVotos: " + votos + "\nPrecio: $" + precio + "\nDescalificada: " + descalificada;
    }

    public boolean equals(Obra obr) {
        return codigo == obr.getCodigo();
    }

    //Modificadores
    public void setTitulo(String tit) {
        titulo = tit;
    }

    public void setAutor(String aut) {
        autor = aut;
    }

    public void setLargo(double larg) {
        largo = larg;
    }

    public void setAncho(double anch) {
        ancho = anch;
    }

    public void setVotos(int vot) {
        votos = vot;
    }

    public void setPrecio(double prec) {
        precio = prec;
    }

    public void setDescalificada(boolean desc) {
        descalificada = desc;
    }

    //Propias del Tipo
    public void votar() {
        if (this.votos % 10 == 0 && this.votos >= 10) {
            actualizaPrecio();
            this.votos += 1;
        } else {
            this.votos += 1;
        }
    }

    public void Descalificar() {
        descalificada = true;
    }

    private void actualizaPrecio() {
        precio = precio + ((precio * 10) / 100);
    }
}
