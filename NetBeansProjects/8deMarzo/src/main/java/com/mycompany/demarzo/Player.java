/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demarzo;

/**
 *
 * @author saram
 */
public class Player extends Person{
    int numero;
    String poscion;

    public Player() {
    }

    public Player(int numero, String poscion, String nombre, int edad) {
        super(nombre, edad);
        this.numero = numero;
        this.poscion = poscion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPoscion() {
        return poscion;
    }

    public void setPoscion(String poscion) {
        this.poscion = poscion;
    }

    @Override
    public String toString() {
        return "Player{" + "numero=" + numero + ", poscion=" + poscion + '}';
    }
    
    
}
