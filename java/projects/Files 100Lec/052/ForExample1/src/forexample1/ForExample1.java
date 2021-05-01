/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forexample1;

/**
 *
 * @author hassouna
 */
public class ForExample1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Input From User
        java.util.Scanner s = new java.util.Scanner(System.in);
        String std1 = "" , std2 = "", std3 = "";
        int g1 = 0, g2 = 0, g3 = 0;
        for(int x = 1;x<=3;x++){
            System.out.println("Enter name of student number " + x + ":");
            switch(x){
                case 1: std1 = s.next(); break;
                case 2: std2 = s.next(); break;
                case 3: std3 = s.next(); break;
            }
            System.out.println("Enter grade of student number " + x + ":");
            switch (x) {
                case 1: g1 = s.nextInt(); break;
                case 2: g2 = s.nextInt(); break;
                default: g3 = s.nextInt(); break;
            }                        
        }
        
        //Print To User
        String strResult = "";
        for(int y = 1; y <= 3; y++){
            switch(y){
                case 1: strResult = "Name: " + std1 + " ; Grade: " + g1; break;
                case 2: strResult = "Name: " + std2 + " ; Grade: " + g2; break;
                case 3: strResult = "Name: " + std3 + " ; Grade: " + g3; break;
            }
            System.out.println(strResult);
        }
    }
    
}
