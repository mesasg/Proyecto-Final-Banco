/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demarzo;

/**
 *
 * @author saram
 */
public class Person {
    private String nombre;
    private int edad;

    public Person() {
    }

    public Person(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        
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

    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
     
    
    //Encapsular es privatizar el cambio de algo dentro de un metodo
    
}
