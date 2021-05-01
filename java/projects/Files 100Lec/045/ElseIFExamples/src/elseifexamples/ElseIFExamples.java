/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elseifexamples;

/**
 *
 * @author hassouna
 */
public class ElseIFExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("Enter The Grade:");
        int grade = s.nextInt();
        char gradeMSG;

        if (grade >= 90) {
            gradeMSG = 'A';
        } else if (grade >= 80) {
            gradeMSG = 'B';
        } else if (grade >= 70) {
            gradeMSG = 'C';
        } else if (grade >= 60) {
            gradeMSG = 'D';
        } else if (grade >= 50) {
            gradeMSG = 'E';
        } else {
            gradeMSG = 'F';
        }

        System.out.println("Grade Is: " + gradeMSG);
         */

        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("Enter Name:");
        String strName = s.next();
        if (strName.equals("ahmed")) {
            System.out.println("Welcome Ahmed");
        } else if (strName.equals("gamal")) {
            System.out.println("Welcome Gamal");
        } else if (strName.equals("amr")) {
            System.out.println("Welcome Amr");
        }
        else{
            System.out.println("!!!!!!!!!!!!!!");
        }
    }

}
