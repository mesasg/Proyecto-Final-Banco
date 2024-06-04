/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import food.Food;
import food.Colombiana;
import food.Italian;

/**
 *
 * @author saram
 */
public class TestFood {
    
    public static void main(String[] args) {
        
        Food colombiana = new Colombiana();
        Food italian = new Italian();
    }
    
    public void executeServeFood(Food food){
        food.serveFood();
    }
}
