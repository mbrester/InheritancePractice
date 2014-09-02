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
public interface Employee {
    
    
    public abstract void nameChange(String name);
   
    public abstract String getPosition();

    public abstract void promotion(String newPosition);
  
    public abstract String getName();

    public abstract String getEmployeeId();
    
    public abstract void payRaise(double raise);
    
    public abstract double getPayCheck();

    
    }
    
    

   
    
    
    
   
    
    
    
    
    


