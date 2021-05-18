/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej4;

/**
 *
 * @author Administrador
 */
public class Ingrediente {
    //Atributos
    
    private String nombre;
    private double cantidad;
    private String unidad;
    
    //Constructores
    
    public Ingrediente(){
        nombre = "";
        cantidad = 0.0;
        unidad = "";        
    }
    
    public Ingrediente(String nom, double cant, String uni){
        nombre = nom;
        cantidad = cant;
        unidad = uni;
    }
    
    //Observadores
    
    public String getNombre(){
        return this.nombre;
    }
    
    public double getCantidad(){
        return this.cantidad;
    }
    
    public String getUnidad (){
        return this.unidad;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+nombre+" Cantidad: "+cantidad+" Unidad: "+unidad;
    }
    
    public boolean equals(Ingrediente ingr){
        return this.nombre.equalsIgnoreCase(ingr.getNombre()) && this.cantidad == ingr.getCantidad() && this.unidad.equalsIgnoreCase(ingr.getUnidad());
    }
    
    //Modificadores
    
    public void setNombre(String elNombre){
        nombre = elNombre;
    }
    
    public void setCantidad (int cant){
        cantidad = cant;
    }
    
    public void setUnidad (String uni){
        unidad = uni;
    }
    
    //Propias del tipo
    
    
}
