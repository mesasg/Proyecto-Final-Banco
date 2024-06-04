/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

/**
 *
 * @author saram
 */
public class Operaciones {
    static Leer lec = new Leer();
    
    public void sumar(){
        int cantNum;
        float suma = 0;
        cantNum = lec.leeryValidarInt("Ingrese la cantidad de números que desea sumar");
        System.out.println("Ingrese los números que desea adicionar");
        int sumados = 1;
        do{
            float x = lec.leerFloat();
            suma += x;
            sumados +=1;
            System.out.println("=" + suma);
        }while (sumados <= cantNum);
        System.out.println("El resultado es: " + suma);
    }
    
    public void restar(){
        int cantNum;
        float resta =  0;
        cantNum = lec.leeryValidarInt("Ingrese la cantidad de números que desea restar");
        System.out.println("Ingrese los números que desea restar");
        int restados = 1;
        do{
            float x = lec.leerFloat();
            if (restados == 1){
                resta = x;
                restados +=1;
            }
            else{
                resta -= x;
                restados +=1;
            }
            System.out.println("=" + resta);
        }while (restados <= cantNum);
        System.out.println("El resultado es: " + resta);
    }
    
     public void multiplicar(){
        int cantNum;
        float producto = 1;
        cantNum = lec.leeryValidarInt("Ingrese la cantidad de números que desea multiplicar");
        System.out.println("Ingrese los números que desea multiplicar");
        int multiplicados = 1;
        do{
            float x = lec.leerFloat();
            producto = producto * x;
            multiplicados += 1;
            System.out.println(" = " + producto);
        }while (multiplicados <= cantNum);
        System.out.println("El resultado es: " + producto);
    }
     
     public void dividir(){
        boolean diviCero;
        System.out.println("Ingrese el dividendo: ");
        float divid = lec.leerFloat();
        System.out.println("Ingrese el divisor");
        float divis = lec.leerFloat();
        if (divis == 0){
            diviCero = true;
            do{
                System.out.println("No es posible dividir por cero, ingrese un número operable");
                divis = lec.leerFloat();
                if (divis != 0){
                    diviCero = false;
                }
            }while (diviCero == true);
        }
        float resultado = divid / divis;
        System.out.println("El resultado es: " + resultado);
    }
     
}
