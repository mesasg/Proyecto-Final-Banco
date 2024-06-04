/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arquitecturalimpia;

import java.util.Scanner;
/**
 *
 * @author saram
 */
public class Reading {
    Scanner input = new Scanner(System.in);
    //validaiones
    public String readString(){
        String chain = input.next();
        return chain;
    }
    public int readInt(){
        int value = input.nextInt();
        return value;
    }
    public long readLong(){
        long value = input.nextLong();
        return value;
    }
    
    public double readDouble(){
        return input.nextDouble();
    }
    
}
