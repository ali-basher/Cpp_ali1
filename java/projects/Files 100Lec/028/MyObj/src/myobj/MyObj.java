/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myobj;

/**
 *
 * @author hassouna
 */
public class MyObj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Employee Emp_IS = new Employee();
        Emp_IS.EmpCount=10;
        Emp_IS.PrintEmpCount();
        
        Employee Emp_CS = new Employee();
        Emp_CS.EmpCount=15;
        Emp_CS.PrintEmpCount();
        
    }
    
}
