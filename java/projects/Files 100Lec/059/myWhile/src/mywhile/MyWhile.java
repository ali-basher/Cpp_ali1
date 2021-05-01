/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mywhile;

/**
 *
 * @author hassouna
 */
public class MyWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        int x = 1;
        while(x <= 5){
            System.out.println(x);
            x++;
        }
        */
        
        long L = 0;
        while(true){
            System.out.println(L);
            L++;
            if(L>100)break;
        }
    }
    
}
