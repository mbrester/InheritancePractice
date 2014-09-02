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
public class HourlyEmployee extends Employee {
     private double hourlyPay;
    private double hoursClocked;

    public HourlyEmployee(String name, String employeeId, String position, int hourlyPay) {
        super(name, employeeId, position);
        this.hourlyPay = hourlyPay;
    }

    @Override
    public void payRaise(double raise) {
       hourlyPay += raise;
    }

    @Override
    public double getPayCheck() {
        return (hourlyPay * hoursClocked);
    }
    
    public void hoursWorked(double hours){
        this.hoursClocked += hours;
    }
    
    public double getHourlyPay() {
        return hourlyPay;
    }
    
}
