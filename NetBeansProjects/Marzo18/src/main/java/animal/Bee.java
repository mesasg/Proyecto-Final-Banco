/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author saram
 */
public class Bee implements Animal {

    @Override
    public void playSound() {
        System.out.println("ZZZZZ");
    }
    
    @Override
    public void eat(){
        System.out.println("Pollen");
    }

    @Override
    public void walk() {
        System.out.println("6 legs");
    }
}
