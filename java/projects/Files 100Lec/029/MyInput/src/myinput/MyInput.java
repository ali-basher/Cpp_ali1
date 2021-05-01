/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myinput;

/**
 *
 * @author hassouna
 */
public class MyInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter Your Name:");
        
        java.util.Scanner scan = new java.util.Scanner(System.in);
        String strName =  scan.nextLine();
        
        System.out.println("Enter Your Age:");
        
        int Age = scan.nextInt();
        
        
        
        System.out.println("Your Name Is " + strName);
        System.out.println("Your Age Is " + Age);
    }
    
}
