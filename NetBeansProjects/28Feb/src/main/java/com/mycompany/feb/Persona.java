/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demarzo;

/**
 *
 * @author saram
 */
public class Persona {
    private String nombre;
    private int edad;
    private int iq;

    public Persona() {
    }

    public Persona(String nombre, int edad, int iq) {
        this.nombre = nombre;
        this.edad = edad;
        this.iq = iq;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", iq=" + iq + '}';
    }
     
    
    //Encapsular es privatizar el cambio de algo dentro de un metodo
    
}
