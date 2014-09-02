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
public class SalaryPlusCommissionEmployee extends SalariedEmployee {
    private int commission;
    
    public SalaryPlusCommissionEmployee(String name, String employeeId, String position, int salary) {
        super(name, employeeId, position, salary);
    }

    
    
    public void updateCommision(int sale){
        commission =+ sale * 25;
                
    }
    
    public int checkTotalCommision(){
        return commission;
        
    }
    
    /**
     *
     * @return
     */
    @Override
    public int getPayCheck(){
       
               return (this.getSalary()/24)+commission;
    }
    
    
}
