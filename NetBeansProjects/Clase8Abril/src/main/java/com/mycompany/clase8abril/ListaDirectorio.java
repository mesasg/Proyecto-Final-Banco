/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase8abril;
import java.io.File;
import java.util.ArrayList;
/**
 *
 * @author saram
 */
public class ListaDirectorio {
     /** * @param args the command line arguments */
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO Conectarme y obtener flujos
        String rutaLeer = "C:/Windows/";
        // String rutaLeer = args[0];
        File posibleDirectorio = new File(rutaLeer);
        if (posibleDirectorio.canRead()) {
            System.out.println("Existe!!!!");
            if (posibleDirectorio.isDirectory()) {
                System.out.println("Es un Directorio...");
                System.out.println("El path absoluto es: " + posibleDirectorio.getAbsolutePath());
                String[] posibleContenidoEnviar = posibleDirectorio.list();
                ArrayList<File> posiblesFiles = new ArrayList<File>(); //De archivos
                System.out.println("Contenido del Directorio");
                // Filtrar solo los archivos
                for (String f : posibleContenidoEnviar) {
                    System.out.println("Vamos a filtrar " + f);
                    File tmp = new File(posibleDirectorio.getAbsolutePath() + File.separator + f);
                    if (!tmp.isDirectory()) {
                        posiblesFiles.add(tmp);
                    }
                }
                for (File f : posiblesFiles) {
                    System.out.println(f + " existe " + f.exists());
                }
            } else {
                System.out.println("No es un Directorio");
            }
        } else {
            System.out.println("No lo puedo leer");
        }
    }
}
