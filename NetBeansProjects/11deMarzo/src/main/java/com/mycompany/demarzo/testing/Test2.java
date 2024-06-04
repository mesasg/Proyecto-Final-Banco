/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demarzo.testing;

import com.mycompany.demarzo.Person;
import com.mycompany.demarzo.Property2;
import com.mycompany.demarzo.Rent;

/**
 *
 * @author saram
 */
public class Test2 {
    public static void main(String[] args) {
        Person p1 = new Person(123112, "Luis", "555", "luis@yahoo.com");
        Property2  apto = new Property2(4546,"Edificio hola","Colombia", 
                "Bueno", 50000);
        Rent renta = new Rent(4546,"11 de Marzo", 5000, p1, apto);
       
        
    }
}
