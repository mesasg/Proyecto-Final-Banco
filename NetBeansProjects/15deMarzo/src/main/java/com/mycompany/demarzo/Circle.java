/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demarzo;

/**
 *
 * @author saram
 */
public class Circle extends Point implements Shape{
    private int radio;
    
    public Circle(int radio, int x, int y) {
        super(x, y);
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Circulo{");
        sb.append("radio=").append(radio);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double calcularArea() {
        double area = Math.PI *Math.pow(getRadio(),2);
        System.out.println("El área del circulo es: " + area);
        return (area);
    }

    @Override
    public double calcularPerimetro() {
        Double perimetro =(Double)(2*Math.PI*getRadio());
        System.out.println("El perimetro del radio es: " + perimetro);
        return perimetro;
    }

   
    
}
