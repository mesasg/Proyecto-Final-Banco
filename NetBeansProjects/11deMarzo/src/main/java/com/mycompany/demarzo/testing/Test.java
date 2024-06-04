/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demarzo.testing;
import com.mycompany.demarzo.Person;
import com.mycompany.demarzo.Property;

/**
 *
 * @author saram
 */
public class Test {
    public static void main(String[] args) {
        Person p1 = new Person(10123, "Juanita", "300100", 
                "juanita@gmail.com");
        Property property = new Property(100,"Edificio Vermonti","Colombia",
                "Bueno",2500000, p1);
    }    
       
}
