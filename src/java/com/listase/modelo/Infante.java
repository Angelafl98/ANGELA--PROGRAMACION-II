
package com.listase.modelo;

import java.io.Serializable;
import java.util.ArrayList;


public class Infante implements  Serializable{
    private String nombre; 
    private short codigo; 
    private int edad;
    private String genero;
    public Infante() {
        this.edad=1;
    }

    
    public Infante(String nombre, short codigo, byte edad, String genero) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.edad = edad;
        this.genero = genero;
    }

    public Infante(String juanita, short s, byte b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public short getCodigo() {
        return codigo;
    }

    public void setCodigo(short codigo) {
        this.codigo = codigo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
       return this.nombre; 
       
    }

    public void invertLista(ArrayList<String> listaInfantes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getEdad(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
     
    
    
    
}
