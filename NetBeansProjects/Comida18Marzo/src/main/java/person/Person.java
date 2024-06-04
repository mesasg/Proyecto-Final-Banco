/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package person;

/**
 *
 * @author saram
 */
public class Person {
    
    String name;
    String address;

    public Person(String name, String direccion) {
        this.name = name;
        this.address = direccion;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Person{");
        sb.append("name=").append(name);
        sb.append(", direccion=").append(address);
        sb.append('}');
        return sb.toString();
    }

    public String mostrarDatos() {
        //return super.mostrarDatos() + " sueldo: " + salary;
        return "organizar";
    }
    
}
