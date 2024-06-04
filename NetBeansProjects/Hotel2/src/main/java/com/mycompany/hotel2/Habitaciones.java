/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotel2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author saram
 */
public class Habitaciones {
    static ArrayList<Integer> habitaciones = new ArrayList<Integer>();
    static Scanner in;
    
    public static void enumerarHabitaciones(){
        try{
            PrintWriter out = new PrintWriter(new File("habitaciones.txt")); //para escribir en el archivo
            in = new Scanner(new File("habitaciones.txt"));
            
            for (int i = 0; i<=100; i++){
            habitaciones.add(i);
                System.out.println(habitaciones.get(i));
                //Muestra el num de habitaciones
            }
            
        }
        catch (FileNotFoundException e){
            System.out.println("El archivo no existe");
        }
        
    }
    
    
}
