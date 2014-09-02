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
public class HourlyEmployee extends Employee {
    private int hourlyPay;
    private int hoursClocked;
    
  
    public HourlyEmployee(String name, String employeeId, String email, int hourlyPay) {
        super(name, employeeId, email);
        this.hourlyPay = hourlyPay;
        
    }

    public int getHourlyPay() {
        return hourlyPay;
    }

    
    public void payRaise(int raise) {
       hourlyPay += raise;
    }
    
    public void hoursWorked(int hours){
        this.hoursClocked += hours;
    }
    
    public int getPayCheck(){
        return (hourlyPay * hoursClocked);
    }
    
}
