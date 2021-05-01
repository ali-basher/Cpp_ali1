/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myimports;


import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author hassouna
 */
public class MyImports {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.next();
        out.println("hello " + name );
    }
    
}
