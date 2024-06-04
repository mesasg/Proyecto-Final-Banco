/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.others.control;

/**
 *
 * @author saram
 */
public class MakeCasting {
    public static boolean isAnInteger(String number){
        int aux1 = Integer.parseInt(number);
        float aux2 = Float.parseFloat(number);
        return aux2 - aux1 ==0;
    }
    public static boolean isAnInteger(float number){
        int aux1 = (int)number;
        return number - aux1 ==0;
    }
    public static int castToInteger(float number){
        int aux1 = (int)number;
        return aux1;
    }
    
}
