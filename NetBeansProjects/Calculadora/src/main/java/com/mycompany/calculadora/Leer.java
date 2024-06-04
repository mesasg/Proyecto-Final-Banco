/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

import java.util.Scanner;

/**
 *
 * @author saram
 */
public class Leer {
       Scanner sc = new Scanner(System.in);
     
     
    public int leerInt(String mensaje){
        System.out.println(mensaje+": ");
        int dato = sc.nextInt();
        return dato;
    }
    public String leerString(){
        String dato = sc.next();
        return dato;
    }
    public Float leerFloat(){
        Float dato = sc.nextFloat();
        return dato;
    }
    public Double leerDouble(String mensaje){
        System.out.println(mensaje+": ");
        Double dato = sc.nextDouble();
        return dato;
    }

    public int leeryValidarInt(String mensaje) {
        int dato;
        do {
            System.out.println(mensaje);
            while (!sc.hasNextInt()) {
                System.out.println("Valor no válido");
                sc.next();
                System.out.print("Debe ser número entero positivo");
            }
            dato = sc.nextInt();
            if(dato <= 0){
                System.out.println("El número debe ser positivo");
            }
        } while (dato <= 0);
       // System.out.println("La edad ingresada como entero positivo es : " + dato);
        return dato;
    }
    
    
}
