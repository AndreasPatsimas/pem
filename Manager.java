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
public class Manager extends Employee {
    
    private double bonus;
    
    public Manager(String name, String surname, int age, double wage,double bonus) {
        super(name, surname, age, wage);
        this.bonus=wage+wage*bonus/100;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus =bonus;
        
    }
    
}
