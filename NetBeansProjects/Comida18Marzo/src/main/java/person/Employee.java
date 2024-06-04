/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package person;

/**
 *
 * @author saram
 */
public class Employee extends Person{
    
    private String charge;
    private double salary;
    private int id;
    private static int cont = 0;

    public Employee(String charge, double salary, int id, String name, String direccion) {
        super(name, direccion);
        this.charge = charge;
        this.salary = salary;
        this.id = id;
    }

    public Employee(String charge, double salary) {
        this(); //Invoca el constructor actual (instancia)
        this.charge = charge;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String direccion) {
        this.address = direccion;
    }
    
    public Employee(){
        id = ++cont;
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCont() {
        return cont;
    }

    public static void setCont(int cont) {
        Employee.cont = cont;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee{");
        sb.append("charge=").append(charge);
        sb.append(", salary=").append(salary);
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }


    
    
}
