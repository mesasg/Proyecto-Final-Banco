/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.others.model;

import com.mycompany.others.control.CalculateIF;

/**
 *
 * @author saram
 */
public class Calculate implements CalculateIF{
    private float firstValue;
    private float secondValue;
    private float resultF;

    public Calculate() {
    }

    public Calculate(float firstValue, float secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    @Override
    public float Add(float one, float two) {
        resultF = Float.parseFloat(""+(one+two));
        return resultF;
    }

    @Override
    public float Substract(float one, float two) {
        resultF = Float.parseFloat(""+(one-two));
        return resultF;
    }

    @Override
    public float Multiply(float one, float two) {
        resultF = Float.parseFloat(""+(one*two));
        return resultF;
    }

    @Override
    public float Divide(float one, float two) {
        resultF = Float.parseFloat(""+(one/two));
        return resultF;
    }

    public float getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(float firstValue) {
        this.firstValue = firstValue;
    }

    public float getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(float secondValue) {
        this.secondValue = secondValue;
    }

    public float getResultF() {
        return resultF;
    }

    public void setResultF(float resultF) {
        this.resultF = resultF;
    }
    
    public int hashCode(){
        int hash = 7;
        hash = 19 * hash +Float.floatToIntBits(this.firstValue);
        hash = 19 * hash +Float.floatToIntBits(this.secondValue);
        hash = 19 * hash +Float.floatToIntBits(this.resultF);
        return hash;
    }
}
