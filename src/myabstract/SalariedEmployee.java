/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myabstract;

/**
 *
 * @author Mitch
 */
public class SalariedEmployee extends Employee {
    private double salary;
    

    public SalariedEmployee(String name, String employeeId, String position,double salary) {
        super(name, employeeId, position);
        this.salary = salary;
    }

    @Override
    public void payRaise(double raise) {
       salary += raise;
    }

    @Override
    public double getPayCheck() {
        return (salary/24);
    }
    public double getSalary() {
        return salary;
    }
    
}
