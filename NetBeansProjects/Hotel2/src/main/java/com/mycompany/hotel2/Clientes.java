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
public class Clientes {
    static Scanner in;
    static ArrayList<String> clientes;
    static int cantClientes;
    static Reading lec = new Reading();
    static int id;
    static String name;
    
    public static void ingresarClientes(){
        clientes = new ArrayList<String>();
        
        cantClientes = lec.leeryValidarInt("Ingrese el número de clientes que desea registrar");
         Clientes cliente;
         try{
             PrintWriter out = new PrintWriter(new File("clientes.txt")); //para escibir en el archivo
            in = new Scanner(new File("clientes.txt"));
            
            for (int i = 0; i<cantClientes; i++){
                name = lec.leerString("Nombre del cliente: ");
                id = lec.leeryValidarInt("Ingrese la idenficiacion del cliente");
                cliente = new Clientes(id,name);
                clientes.add(cliente.toString());
            }
            /*int ver;
            ver = lec.leerIntRestricciones("Acabas de registrar "+cantClientes+" Clientes, ¿Deseas ver los registros?\n1-Si\n2-No"
                    , 1, 2, "Revisa las opciones");
            
            if (ver == 1){
                for (String cli : clientes){
                System.out.println(cli);
                }
            }*/
            
        }
        catch (FileNotFoundException e){
            System.out.println("El archivo no existe");
        }
    }

    public Clientes(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
