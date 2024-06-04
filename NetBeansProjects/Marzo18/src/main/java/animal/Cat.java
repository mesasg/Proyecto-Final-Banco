/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author saram
 */
public class Cat implements Animal{

    @Override
    public void playSound() {
        System.out.println("Miauu ");
    }

    @Override
    public void eat() {
        System.out.println("Kibble");
    }

    @Override
    public void walk() {
        System.out.println("4 legs");
    }
    
}
