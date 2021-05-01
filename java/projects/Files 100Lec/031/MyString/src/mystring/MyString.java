/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystring;

/**
 *
 * @author ubuntu
 */
public class MyString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String FName = "Mohamed";
        String MName = "Kamal";
        String LName = "Wahdan";
        int Age = 35;
        double Salary = 1500.5;
        boolean Active = true;                
        String All = FName + " " + MName + " " + LName;
        All += " " + Age + Salary + Active;
        System.out.println(All);
    }
    
}
