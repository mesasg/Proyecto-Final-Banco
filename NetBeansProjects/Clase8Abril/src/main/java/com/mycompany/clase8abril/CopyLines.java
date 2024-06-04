/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase8abril;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException; //excepciones de entrada y salida
/**
 *
 * @author saram
 */

//Copia de un archivo a otro
public class CopyLines {
    
    public static void main(String[] args) throws IOException {
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;
        try {
            inputStream = new BufferedReader(new FileReader("archivooriginal.txt "));
            outputStream = new PrintWriter(new FileWriter("archivocopia.txt")); //Comillas
            String l;
            int i = 1;
            while ((l = inputStream.readLine()) != null) {
                System.out.println("Linea ["+i+"] ==>"+1); //Seguimiento de las lineas
                outputStream.println();
                i++;
            }
        } finally {
            if (inputStream != null) {
            inputStream.close();
            }
            if (outputStream != null) {
            outputStream.close();
            }
      }
    }
}