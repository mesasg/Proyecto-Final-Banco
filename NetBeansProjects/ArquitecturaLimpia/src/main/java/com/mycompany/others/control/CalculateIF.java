/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.others.control;

/**
 *
 * @author saram
 */
public interface CalculateIF {
    public float Add(float one, float two);
    public float Substract(float one, float two);
    public float Multiply(float one, float two);
    public float Divide(float one, float two);

    @Override
    public String toString();

    @Override
    public boolean equals(Object obj);

    @Override
    public int hashCode();
    
}
