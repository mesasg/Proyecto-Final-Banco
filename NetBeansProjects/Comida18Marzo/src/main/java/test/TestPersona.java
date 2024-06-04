/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import person.Employee;
import person.Person;

/**
 *
 * @author saram
 */
public class TestPersona {
    public static void main(String[] args){

        Person empleado = new Employee("Celador", 2000000);
        empleado.setName("LUIS");
        empleado.setAddress("Calle de la felicidad");
        polimorfismo(empleado);

    }

    private static void polimorfismo(Person person){
        String datos = person.mostrarDatos();
        System.out.println(datos);
    }

}
