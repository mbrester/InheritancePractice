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
public class StartUp {
    public static void main(String[] args) {
        HourlyEmployee e1 = new HourlyEmployee("sal","111","Caller",12);
        SalariedEmployee e2 = new SalariedEmployee("pat","112","Programer",20000);
        SalaryPlusCommissionEmployee e3 = new SalaryPlusCommissionEmployee("tom","113","Sales Rep",1000000);
        
        e1.payRaise(1);
        System.out.print("sal gets paied: ");
        System.out.println(e1.getHourlyPay());
        e1.hoursWorked(2);
        System.out.print("sal pay check is: ");
        System.out.println(e1.getPayCheck());
        System.out.print("pats pay check is: ");
        System.out.println(e2.getPayCheck());
        e3.updateCommision(1000);
        System.out.print("toms pay commision is: ");
        System.out.println(e3.checkTotalCommision());
        System.out.print("toms pay check is: ");
        System.out.println(e3.getPayCheck());
    }
}
