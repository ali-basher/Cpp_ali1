/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cto_test;

/**
 *
 * @author hassouna
 */
public class CTO_test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("Enter The Grade:");
        int g = s.nextInt();

        String strG = (g >= 50) ? "pass" : "fail";
        int intG = (g >= 50) ? 1 : 0;
        boolean bolG = (g >= 50) ? true : false;
        /*
        if (g >= 50) {
            strG = "pass";
        } else {
            strG = "fail";
        }
         */
        System.out.println(strG + "; " + intG + "; " + bolG);

    }

}
