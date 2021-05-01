/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaloperators;

/**
 *
 * @author hassouna
 */
public class LogicalOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
        */
        
        /*
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
        */
        
        //System.out.println(!false);
        
        boolean b1 = (true && true);
        boolean b2 = (false || false);
        
        System.out.println(b1 && !b2);
    }
    
}
