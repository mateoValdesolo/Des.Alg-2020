/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej2;

/**
 *
 * @author Administrador
 */
public class Fecha {
    //Atributos
    
    private int dia;
    private int mes;
    private int anio;
    
    //Constructores
    
    public Fecha (){
        dia = 1;
        mes = 1;
        anio = 2000;
    }
    
    public Fecha(int elDia, int elMes, int elAnio){
        dia = elDia;
        mes = elMes;
        anio = elAnio;
    }
    
    //Observadores
    public int getDia(){
        return this.dia;
    }
    
    public int getMes(){
        return this.mes;
    }
    
    public int getAnio(){
        return this.anio;
    }
    
    @Override
    public String toString(){
       return dia + "/" + mes + "/" + anio; 
    }
    
    public boolean equals(Fecha otraFecha){
        return this.dia == otraFecha.getDia() && this.mes == otraFecha.getMes() && this.anio == otraFecha.getAnio();
    }
    
    //Modificadores
    
    public void setDia(int elDia, int elMes, int elAnio) {
        if (elDia > 31 || elDia < 1) {
            dia = 0;
        } else {
            if (elDia < 29) {
                dia = elDia;
            } else {
                switch (elDia) {
                    case 29:
                        if (elMes == 2) {
                            if (esBisiesto(elAnio)) {
                                dia = elDia;
                            } else {
                                dia = 0;
                            }
                        } else {
                            dia = elDia;
                        }
                        break;

                    case 30:
                        if (elMes == 2) {
                            dia = 0;
                        } else {
                            dia = elDia;
                        }
                        break;

                    case 31:
                  if (elMes == 2 || elMes == 11 || elMes == 4 || elMes == 6 || elMes == 9) {
                            dia = 0;
                        } else {
                            dia = elDia;
                        }
                        break;
                }
            }
        }
    }
    
    public void setMes(int elMes) {
        if (elMes > 0 && elMes < 13) {
            mes = elMes;
        } else {
            mes = 0;
        }
    }
    
    public void setAnio(int elAnio) {
        anio = elAnio;
    }
    
    //Propias del tipo
    
    public int diasTranscurridos(){
        int cantDias = 0, febrero = 28, i;

        if ((mes != 1 && mes != 2)) {
            if (esBisiesto()) {
                febrero = 29;
            }
        }
        
        cantDias = dia;
        
        if (mes != 1) {
            for (i = 1; i < mes; i++) {
                if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                    cantDias += 31;
                } else {
                    if (i == 2) {
                        cantDias += febrero;
                    } else {
                        cantDias += 30;
                    }
                }
            }
        }

        return cantDias; 
    }
    
    public boolean esFechaAnterior(int elDia, int elMes, int elAnio){
        boolean ret = false;
        if (this.anio < elAnio || this.mes < elMes && this.anio < elAnio || this.dia < elDia && this.mes < elMes && this.anio < elAnio){
            ret = true;
        }
        else{
            ret = false;
        }
        return ret; 
    }
    
    public String calculaFecha(int losDias){
        //dada una fecha y una cantidad de dias indique cual sera esa fecha
        int añoN = anio, mesN = mes, diaN = dia, i = 1, febrero = 28, cantDias2 = losDias;
        
        if (esBisiesto()) {
                febrero = 29;
        } 
        
        while (cantDias2 >= 365) {
            añoN = anio + 1;
            cantDias2 -= 365;
        }
        
        while (cantDias2 > 31) {
            if (mesN > 12) {
                mesN = 1;
                añoN = anio + 1;
            } 
            
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                cantDias2 -= 31;
                mesN = mes + 1;
                if (mesN > 12) {
                    mesN = 1;
                    añoN += 1;
                }
                
            } else {
                if (i == 2) {
                    cantDias2 -= febrero;
                    mesN = mes + 1;
                } else {
                    cantDias2 -= 30;
                    mesN = mes + 1;
                }
            }
        }
            
            if (mesN == 1 || mesN == 3 || mesN == 5 || mesN == 7 || mesN == 8 || mesN == 10 || mesN == 12) {
                if ((diaN + cantDias2) > 31) {
                    mesN += 1;
                    diaN = 31 - diaN;
                    if (mesN > 12) {
                        mesN = 1;
                        añoN += 1;
                    }
                } else {
                    diaN = diaN + cantDias2;
                }
                
            } else {
                if (mesN == 2) {
                    if (esBisiesto()) {
                        if ((diaN + cantDias2) > 29) {
                            mesN += 1;
                            diaN = 29 - diaN;
                            if (mesN > 12) {
                        mesN = 1;
                        añoN += 1;
                    }
                        } else {
                            diaN = diaN + cantDias2;
                        }
                    } else {
                        if ((diaN + cantDias2) > 28) {
                            mesN += 1;
                            diaN = 28 - diaN;
                            if (mesN > 12) {
                        mesN = 1;
                        añoN += 1;
                    }
                        } else {
                            diaN = diaN + cantDias2;
                        }
                    }    
                    
                } else {
                    if ((diaN + cantDias2) > 30) {
                    mesN += 1;
                    diaN = 30 - diaN;
                    if (mesN > 12) {
                        mesN = 1;
                        añoN += 1;
                    }
                } else {
                    diaN = diaN + cantDias2;
                }
                }
            }
            
            return diaN + "/" + mesN + "/" + añoN;
    }
    
     public boolean esBisiesto() {
        boolean bisiesto = false;

        if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
            bisiesto = true;
        }

        return bisiesto;

    }
    
    public boolean esBisiesto(int elAnio) {
        boolean bisiesto = false;

        if ((elAnio % 4 == 0) && ((elAnio % 100 != 0) || (elAnio % 400 == 0))) {
            bisiesto = true;
        }

        return bisiesto;

    }  
   
}
