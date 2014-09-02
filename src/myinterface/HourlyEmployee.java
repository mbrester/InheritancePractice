/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myinterface;

/**
 *
 * @author Mitch
 */
public class HourlyEmployee implements Employee {
    private String name;
    private final String employeeId;
    private String position;
    private double hourlyPay;
    private double hoursClocked;

    public HourlyEmployee(String name, String employeeId, String position, double hourlyPay) {
        this.name = name;
        this.employeeId = employeeId;
        this.position = position;
        this.hourlyPay = hourlyPay;
    }
    
    
    
    

    @Override
    public String getPosition() {
        return position;
    }

   

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getEmployeeId() {
       return employeeId;
    }

    @Override
    public void nameChange(String name) {
        this.name = name;
    }

    @Override
    public void promotion(String newPosition) {
        this.position = newPosition;
    }
    
    @Override
    public void payRaise(double raise) {
       hourlyPay += raise;
    }
    
    public void hoursWorked(double hours){
        this.hoursClocked += hours;
    }
    
    @Override
    public double getPayCheck(){
        return (hourlyPay * hoursClocked);
    }
}
