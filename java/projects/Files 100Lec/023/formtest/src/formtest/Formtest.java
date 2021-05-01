/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formtest;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *
 * @author hassouna
 */
public class Formtest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here   
        int result;
        do
        {
        String[] items = {"One", "Two", "Three", "Four", "Five", "Six", "Seven"};
        JComboBox<String> combo = new JComboBox<>(items);
        JTextField field1 = new JTextField("Ahmed Hassouna");
        JTextField field2 = new JTextField("01119630932");
        JPanel panel = new JPanel(new GridLayout(0, 1));
        panel.add(combo);
        panel.add(new JLabel("Name:"));
        panel.add(field1);
        panel.add(new JLabel("Phone:"));
        panel.add(field2);
        result = JOptionPane.showConfirmDialog(null, panel, "JAVA Form Test By: Hassouna Academy",
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        String strAll;
        if(result == JOptionPane.OK_OPTION)
        {
            strAll = combo.getSelectedItem()
                    + "\n" + field1.getText()
                    + "\n" + field2.getText();
        }
        else strAll = "Cancelled";
        System.out.println(strAll);
        JOptionPane.showMessageDialog(null,strAll);
        }while(result == JOptionPane.OK_OPTION); 

        
    }
    
}
