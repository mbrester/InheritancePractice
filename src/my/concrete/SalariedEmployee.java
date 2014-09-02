/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.concrete;

/**
 *
 * @author Mitch
 */
public class SalariedEmployee extends Employee {
    private int salary;
    

    public SalariedEmployee(String name, String employeeId, String position,int salary) {
        super(name, employeeId, position);
        this.salary = salary;
    }
    
    public void payRaise(int raise) {
       salary += raise;
    }

    public int getSalary() {
        return salary;
    }
    
    
    public int getPayCheck(){
       return (salary/24);   
    }
   
}
