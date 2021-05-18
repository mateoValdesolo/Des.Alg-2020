/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej3;

/**
 *
 * @author Administrador
 */
public class Asignatura {
    //Atributos
    private int codigo;
    private String nombre;
    private String[] temas;
    private Fecha inicio;
    
    //Constructores
    
    public Asignatura(int cod){
        this.codigo = cod;
        this.nombre = "";
        this.temas = new String [0];
        this.inicio = new Fecha ();
    }
    
    public Asignatura(int cod, String nom, String [] temas, Fecha inicio){
        this.codigo = cod;
        this.nombre = nom;
        this.temas = temas;
        this.inicio = inicio;
    }
    
    //Observadores
    
    public int getCodigo(){
        return this.codigo;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String[] getTemas(){
        return this.temas;
    }
    
    public Fecha getInicio(){
        return this.inicio;
    }
    
    @Override
    public String toString(){
        return "Codigo: "+this.codigo+" Nombre: "+this.nombre+" Temas: "+mostrarTemas(temas)+" Inicio: "+this.inicio;
    }
    
    public boolean equals(Asignatura asig){
        return this.codigo == asig.getCodigo();
    }
    
    //Modificadores
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setTemas (String [] temas){
        this.temas = temas;
    }
    
    public void setInicio (Fecha fecha){
        inicio = fecha;
    }
    
    //Propias del Tipo
    
    public String enesimoTema (int n){
        return temas[n];
    }
    
    public void listaTemas(){
        int i, longArr = temas.length;
        for(i = 0; i < longArr; i++){
            System.out.print(temas[i]+", ");
        }
    }
    
    //Modulos
    
    public String mostrarTemas(String [] arr){
        String ret = "";
        int i, longArr = arr.length;
        for(i = 0; i < longArr; i++){
            ret = ret + arr[i] + ", "; 
        }
        return ret;
    }
}
