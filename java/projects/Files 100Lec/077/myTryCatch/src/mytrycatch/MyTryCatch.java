/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytrycatch;

import javax.swing.JOptionPane;

/**
 *
 * @author hassouna
 */
public class MyTryCatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        int num1 = 5;
        int num2 = 0;
        int r = num1 / num2;
        System.out.println(r);
        */
        
        /*
        String str[] = new String[5];
        str[0] = "123";
        System.out.println(str[5]);
        */
        
        try{
            int num1 = 5;
            int num2 = 1;
            int r = num1 / num2;
            System.out.println(r);
            String str[] = new String[5];
            str[0] = "123";
            System.out.println(str[5]);
            
        }
        catch(Exception ex){
            //System.out.println(ex);
            
            if(ex.getMessage().equals("/ by zero")){
                JOptionPane.showMessageDialog(null, "ممنوع القسمة علي الصفر");
            }
            else {
                JOptionPane.showMessageDialog(null, "خطأ آخر");
            }

        }
        
    }
    
}
