/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arquitecturalimpia;

import java.util.Date;

/**
 *
 * @author saram
 */
public class ArquitecturaLimpia {
     static Reading in = new Reading();
     static Dates1 dates = new Dates1();
    public static void main(String[] args) {
        menu();
        
    }
    public static void menu(){
        int option;
        String chain;
        long valueL;
        int valueI;
        int option2;
        boolean exit = true;
        Date date;
        long years;
        do{
            System.out.println("¿Que operacion deseas de hacer?");
            System.out.println("1- Ingresar un String");
            System.out.println("2- Ingresar un long");
            System.out.println("3- Ingresar un entero");
            System.out.println("4- Mostrar fecha");
            System.out.println("5- Sumar años");
            option = in.readInt();
            switch(option){
                case 1 -> { 
                    System.out.println("Ingresa un String");
                    chain = in.readString();
                }
                case 2 -> {
                    System.out.println("Ingresa un long");
                    valueL = in.readLong();
                }
                case 3 -> { 
                    System.out.println("Ingresa un entero");
                    valueI = in.readInt();
                }
                case 4 -> {
                    System.out.println("Te voy a mostrar una fecha");
                    date = dates.dateFormatting();
                }
                case 5 -> {
                    System.out.println("Ingrese los años que desea sumar");
                    years = in.readLong();
                    dates.addYears(years);
                }
                default ->{
                    System.out.println("Opcion invalida");
                }
            }
            do{
                System.out.println("Ingresa 1 para volver al menú");
                System.out.println("2 para salir");
                option2 = in.readInt();
                
                if(option2 == 1){
                    exit = false;
                    break;
                }
                if (option2 == 2){
                    exit = true;
                    break;
                }
                else{
                    System.out.println("Opcion invalida");
                }
                
            }while(option2 != 1);
    
        }while(exit == false);
    }
}
