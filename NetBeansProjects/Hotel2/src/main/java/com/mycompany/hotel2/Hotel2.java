/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hotel2;

/**
 *
 * @author saram
 */
public class Hotel2 {
    static Habitaciones habitaciones;
    static Clientes clientes;
    static Reading lec = new Reading();
    static int transaccion;
    static int continuar = 1;
    
    public static void main(String[] args) {
        System.out.println("Bienvenido, elija la opción de la transacción que desea realizar");
        
        do {
            transaccion = lec.leerIntRestricciones("1-Mostrar habitaciones \n2-Ingresar clientes",0,2,
                    "Revise las opciones porfavor");
            
            switch(transaccion){
                case 1:
                    habitaciones.enumerarHabitaciones();
                    break;
                default:
                    clientes.ingresarClientes();
                            
                    break;     
            }
            
            System.out.println("¿Desea realizar otra transaccion?");
            continuar = lec.leerIntRestricciones("1-Si \n2-No", 0, 2, "Revise las opciones porfavor");
                    
        }while(continuar == 1);
    }   
}
