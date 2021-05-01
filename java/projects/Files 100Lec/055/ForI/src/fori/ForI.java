/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fori;

/**
 *
 * @author hassouna
 */
public class ForI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        long L = 1;
        for (;;) {
            System.out.println(L);
            L++;
            if (L > 100) {
                break;
            }
        }

    }

}
