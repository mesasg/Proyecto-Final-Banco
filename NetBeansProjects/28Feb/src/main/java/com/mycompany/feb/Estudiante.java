/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.feb;

/**
 *
 * @author saram
 */
public class Estudiante extends Persona{
    private double tip;

    public double getTip() {
        return tip;
    }

    public void setTip(double tip) {
        this.tip = tip;
    }

    public Estudiante(double tip) {
        this.tip = tip;
    }

    public Estudiante(double tip, String nombre, int edad, int iq) {
        super(nombre, edad, iq);
        this.tip = tip;
    }
    
}
