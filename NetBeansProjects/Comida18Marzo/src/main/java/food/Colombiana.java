/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package food;

/**
 *
 * @author saram
 */
public class Colombiana implements Food {

    @Override
    public void serveFood() {
        System.out.println("Bandeja Paisa");
    }

    @Override
    public void cashInFood() {
        System.out.println("Dar la cuenta");
    }
    
}
