/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pem;

/**
 *
 * @author andre
 */
public class Employee implements Person {
    
    private String name;
    private String surname;
    private int age;
    private double wage;

    public Employee(String name, String surname, int age, double wage) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.wage = wage;
    }
    
    
    @Override
    public void getName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getSurname(String surname) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getAge(int age) {
        return age;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }
    
}
