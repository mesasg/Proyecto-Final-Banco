/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

/**
 *
 * @author saram
 */
public class Calculadora {
    static Leer lec = new Leer();
    static Operaciones calcular = new Operaciones();

    public static void main(String[] args) {
        System.out.println("CALCULADORA");
        boolean opValida;
        do{
            int operacion = lec.leeryValidarInt("Ingrese la operación que desea realizar. 1- Suma 2-Resta 3-Multiplicación 4-División");
            switch(operacion){
                case 1 -> { 
                    calcular.sumar();
                    opValida = true;
                }
                case 2 -> { 
                    calcular.restar();
                    opValida = true;
                }
                case 3 -> {
                    calcular.multiplicar();
                    opValida = true;
                }
                case 4 -> {
                    calcular.dividir();
                    opValida = true;
                }
                default -> opValida = false;
            }
            
        }while (opValida == false); 
    }
    
}
