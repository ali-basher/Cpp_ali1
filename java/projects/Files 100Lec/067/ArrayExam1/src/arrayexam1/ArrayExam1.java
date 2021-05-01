/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayexam1;

/**
 *
 * @author hassouna
 */
public class ArrayExam1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        java.util.Scanner s = new java.util.Scanner(System.in);
        String names[] = new String[5];
        int grades[] = new int[5];
        
        for(int x=0; x < names.length ; x++){
            if(x != 3){
                System.out.println("Enter Name Of Student Number" + String.valueOf(x + 1) +": ");
                names[x] = s.next();
                System.out.println("Enter Grade Of Student Number" + String.valueOf(x + 1) +": ");
                grades[x] = s.nextInt();
            }
        }
        
        for(int x =0; x < grades.length;x++){
            if(x!=3){
                System.out.println("Student Number " + String.valueOf(x+1) + " " + names[x] + " ; Grade: " + grades[x]);
            }
        }
        
    }
    
}
