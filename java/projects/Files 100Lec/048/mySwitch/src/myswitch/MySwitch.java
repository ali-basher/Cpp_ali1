/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myswitch;

/**
 *
 * @author hassouna
 */
public class MySwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        System.out.println("Enter number between 1 to 5:");
        java.util.Scanner s = new java.util.Scanner(System.in);
        int num = s.nextInt();
        
        String strNum;
        
        switch(num){
            case 1:
                strNum = "one";
                break;
            case 2:
                strNum = "two";
                break;
            case 3:
                strNum = "three";
                break;
            case 4:
                strNum = "four";
                break;
            case 5:
                strNum = "five";
                break;
            default:
                strNum = "other";
                break;
        }
        
        System.out.println(strNum);
         */

        System.out.println("Enter number between 1 to 5:");
        java.util.Scanner s = new java.util.Scanner(System.in);
        String strNum = s.next();
        int num;
        
        switch(strNum){
            case "one":
                num = 1;
                break;
            case "two":
                num = 2;
                break;
            case "three":
                num = 3;
                break;
            case "four":
                num = 4;
                break;
            case "five":
                num = 5;
                break;
            default:
                num = 0;
                break;
        }
        
        System.out.println(num);
        
    }

}
