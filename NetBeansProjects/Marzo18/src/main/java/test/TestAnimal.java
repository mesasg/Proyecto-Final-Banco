/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import animal.Animal;
import animal.Bee;
import animal.Cat;
/**
 *
 * @author saram
 */
public class TestAnimal {
  
    public static void main(String[] args) {
       /* Hereda el comportamiento de la clase padre 
        Tiene los atributos y  metodos de la clase que los construye.
        */
        Animal bee = new Bee();
        Animal cat = new Cat();

        executePlaySound(bee);
        executePlaySound(cat);
    }

    public static void executePlaySound(Animal animal) {
        animal.playSound();
    }
    
    /*
    *En este ejemplo, el método "hacerSonidoDeAnimal" acepta cualquier objeto que implemente la interfaz "Animal".
    *Luego, podemos pasar instancias de las clases "Perro" y "Gato" como argumentos a ese método,
    *y el polimorfismo nos permite llamar al método "hacerSonido" correspondiente a cada clase sin necesidad
    *de conocer el tipo específico en tiempo de compilación, en palabras sencillas, en el momento en que
    *ejecutemos la aplicación el método al que llamará será al método
    */
}
