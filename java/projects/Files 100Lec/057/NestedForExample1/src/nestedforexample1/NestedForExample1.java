/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedforexample1;

/**
 *
 * @author hassouna
 */
public class NestedForExample1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        for(int sps = 4, hrt = 1; sps >= 0 ; sps--,hrt +=2){
        
            for(int x =0 ; x < sps; x++){
                System.out.print(" ");
            }
            
            for(int x =0;x < hrt;x++){
                System.out.print("♥");
            } 
            System.out.println();
        }
        
    }
    
}
