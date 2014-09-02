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
public class Employee {
    private String name;
    private final String employeeId;
    private String position;

  

    public Employee(String name, String employeeId, String position) {
        this.name = name;
        this.employeeId = employeeId;
    
        this.position = position;
    }
    
    public void nameChange(String newName){
      this.name = newName;
    }

    public String getPosition() {
        return position;
    }

    public void promotion(String position) {
        this.position = position;
    }
  
    public String getName() {
        return name;
    }

    public String getEmployeeId() {
        return employeeId;
    }
    
    

   
    
    
    
   
    
    
    
    
    
}
