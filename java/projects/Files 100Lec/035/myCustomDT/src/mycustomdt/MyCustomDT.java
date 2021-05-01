/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycustomdt;

/**
 *
 * @author ahmedhassouna
 */
public class MyCustomDT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.util.Date DT = new java.util.Date();
        java.text.SimpleDateFormat myF = new java.text.SimpleDateFormat("dd-MM-yyyy  |  hh:mm a");
        System.out.println(myF.format(DT));
    }
    
}
