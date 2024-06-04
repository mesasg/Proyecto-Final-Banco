/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demarzo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
/**
 *
 * @author saram
 */
public class Team {
    static ArrayList<Player> equipo = new ArrayList<Person>():;
    static Reading lec = new Reading();
    static int cantJugadores;
    public static void main(String[] args) {
        System.out.println("Crear el equipo de Futbol");
        ingresarJugador();
        print();
    }
    
    public static void ingresarJugador() {
        cantJugadores = lec.leerInt("Ingrese la cantidad de jugadores de su equipo");
        int i = 0;
        while(i<=catJugadores){
            
            Player p = new Player(numero, posicion, nombre, edad);
        }
        
        System.out.println("Este equipo es de 5 jugadores"); //
        //int i = 0;
        //while(i<=5){
            Player p1 = new Player(1, "Delantero", "Pedrito", 19);//
            equipo.add(p1);
            Player p2 = new Player(1, "Delantero", "Juanito", 19);//
            equipo.add(p2);//
            p2.setEdad(20);//
            p2.setNombre("Fauto Africa");
            p2.setNumero(3);
            p2.setPoscion("Libero");
            equipo.add(p2);
        //i++;
        //}
    }
    
    public static void print(String mensaje){
        Iterator i = equipo.iterator;
        while(i.hasNext() ){
            equipo.toString();
        }
    }
}
