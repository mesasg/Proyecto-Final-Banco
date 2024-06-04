/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demarzo;

/**
 *
 * @author saram
 */
public class Rent {
    int id;
    String date;
    double valor;
    Person person;
    Property2 property;

    public Rent(int id, String date, double valor, Person person, Property2 property) {
        this.id = id;
        this.date = date;
        this.valor = valor;
        this.person = person;
        this.property = property;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Property2 getProperty() {
        return property;
    }

    public void setProperty(Property2 property) {
        this.property = property;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rent{");
        sb.append("id=").append(id);
        sb.append(", date=").append(date);
        sb.append(", valor=").append(valor);
        sb.append(", person=").append(person);
        sb.append(", property=").append(property);
        sb.append('}');
        return sb.toString();
    }
    
    
}
