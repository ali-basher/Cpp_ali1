/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myarraylist;

/**
 *
 * @author hassouna
 */
public class MyArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        java.util.List<String> nameList = new java.util.ArrayList<String>();
        nameList.add("Ahmed");
        nameList.add("Amr");
        nameList.add("Gamal");
        nameList.set(0, "Mohamed");
        System.out.println(nameList);
    }
    
}
