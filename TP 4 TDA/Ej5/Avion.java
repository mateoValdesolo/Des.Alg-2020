/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej5;

/**
 *
 * @author Administrador
 */
public class Avion {
    //Atributos
    private int identificador;
    private String modelo;
    private int cantidadAsientos; 
    private double kmRecorridos;
    private double velocidadPromedio;
    
    //Constructores
    public Avion (int ident){
        identificador = ident;
        modelo = "";
        cantidadAsientos = 0;
        kmRecorridos = 0;
        velocidadPromedio = 0;
    }
    
    public Avion (int ident, String model, int cantAsient, double kmRecorr, double velProm){
        identificador = ident;
        modelo = model;
        cantidadAsientos = cantAsient;
        kmRecorridos = kmRecorr;
        velocidadPromedio = velProm;
    }
    
    //Observadores
    public int getIdentificador(){
        return identificador;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public int getCantidadAsientos(){
        return cantidadAsientos;
    }
    
    public double getKmRecorridos(){
        return kmRecorridos;
    }
    
    public double getVelocidadPromedio(){
        return velocidadPromedio;
    }
    
    @Override
    public String toString(){
        return "Identificador: "+identificador+"\nModelo: "+modelo+"\nCantidad de Asientos: "+cantidadAsientos+"\nKm Recorridos: "+kmRecorridos+"\nVelocidad Promedio: "+velocidadPromedio;
    }
    
    public boolean equals (Avion av){
        return this.identificador == av.getIdentificador();
    }
    
    //Modificadores    
    public void setCantidadAsientos(int asientos){
        this.cantidadAsientos = asientos;
    }
    
    public void setKmRecorridos(double km){
        this.kmRecorridos = km;
    }
    
    public void setVelocidadPromedio(double velProm){
        this.velocidadPromedio = velProm;
    }
    
    //Propias del tipo
    
}
