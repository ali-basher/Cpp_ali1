/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forexamples;

/**
 *
 * @author hassouna
 */
public class ForExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        for(int x = 0 ; x  <= 20 ; x += 4){
            System.out.println(x);
        } 
        */
        
        /*
        for(int y=10 ; y>0 ; y -= 2){
            System.out.println(y);
        }
        */
        
        for(int x=1, y = 11, i = 21 ; x < 10 && y < 14 ; x++, y++, i += 20){
            System.out.println(x + " ; " + y + " ; " + i);
        }
        
    }
    
}
