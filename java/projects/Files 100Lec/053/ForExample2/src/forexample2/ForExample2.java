/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forexample2;

/**
 *
 * @author hassouna
 */
public class ForExample2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("Enter The Number:");
        int num = s.nextInt();
        System.out.println("Enter The Count:");
        int count = s.nextInt();
        int temp = num;
        for (int x = 0; x < count; x++) {
            num *= temp;
        }
        System.out.println(num);
    }

}
