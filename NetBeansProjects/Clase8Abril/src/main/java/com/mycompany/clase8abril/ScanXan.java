/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase8abril;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author saram
 */
public class ScanXan {
    
    public static void main(String[] args) throws IOException {
        Scanner s = null; //Delimitado por espacios por defecto
        //s.useDelimiter(",\\s*");
        //s.useDelimiter("\\t");
        int i = 0;
        try {
            s = new Scanner(new BufferedReader(new FileReader("archivoentrada.txt")));
            while (s.hasNext()) {
            System.out.println(s.next());
            i++;
        }
        } finally {
            if (s != null) {
            s.close();
            }
        }
        System.out.println("Palabras "+i);
    }
    
}
