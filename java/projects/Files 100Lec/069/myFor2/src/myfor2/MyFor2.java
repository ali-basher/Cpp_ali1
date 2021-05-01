/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfor2;

/**
 *
 * @author hassouna
 */
public class MyFor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        java.util.List<String> nameList = new java.util.ArrayList<>();
        nameList.add("Ahmed");
        nameList.add("Gamal");
        nameList.add("Amr");
        
        for(String str : nameList){
            System.out.println(str);
        }
        */
        
        int nums[] = new int[5];
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;
        
        for(int i : nums){
            System.out.println(i);
        }
        
    }
    
}
