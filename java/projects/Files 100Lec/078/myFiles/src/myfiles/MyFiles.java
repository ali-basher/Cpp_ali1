/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfiles;

import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author hassouna
 */
public class MyFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
            PrintWriter w = new PrintWriter("myFile.txt");
            w.println("Welcome");
            w.println("Hello");
            w.close();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
        
    }
    
}
