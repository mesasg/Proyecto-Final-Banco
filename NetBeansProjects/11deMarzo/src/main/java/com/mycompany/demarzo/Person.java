/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demarzo;

/**
 *
 * @author saram
 */
//TIPOS DE RELACIONES
public class Person {
    
    private int id;
    private String name;
    private String cel;
    private String email;

    public Person(int id, String name, String cell, String email) {
        this.id = id;
        this.name = name;
        this.cel = cell;
        this.email = email;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the cell
     */
    public String getCell() {
        return cel;
    }

    /**
     * @param cell the cell to set
     */
    public void setCell(String cell) {
        this.cel = cell;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", cell=" + cel + ", email=" + email + '}';
    }
    
 
}
