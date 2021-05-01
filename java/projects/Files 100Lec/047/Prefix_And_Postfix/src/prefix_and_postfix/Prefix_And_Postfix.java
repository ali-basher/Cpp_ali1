/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prefix_and_postfix;

/**
 *
 * @author hassouna
 */
public class Prefix_And_Postfix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        int x = 5;
        //Prefix
        ++x;
        //Postfix
        x++;
        */
        
        int x = 5;
        int y = 5;
        int z = ++x + ++x + ++y;
        System.out.println(z);
        System.out.println(x);
    }
    
}
