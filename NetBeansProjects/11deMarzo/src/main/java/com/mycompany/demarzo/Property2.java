/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demarzo;

/**
 *
 * @author saram
 */
public class Property2 {
     private int id;
    private String address;
    private String country;
    private String state;
    private double cost;
    

    public Property2(int id, String address, String country, String state, 
            double cost) {
        this.id = id;
        this.address = address;
        this.country = country;
        this.state = state;
        this.cost = cost;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Property{");
        sb.append("id=").append(getId());
        sb.append(", address=").append(getAddress());
        sb.append(", country=").append(getCountry());
        sb.append(", state=").append(getState());
        sb.append(", cost=").append(getCost());
        sb.append('}');
        return sb.toString();
    }
}
