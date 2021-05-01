/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seticontomyform;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author hassouna
 */
public class SetIconToMyForm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        frmTest f = new frmTest();
        f.setVisible(true);
        f.setLocationRelativeTo(null);

        try {
            //وضع ايقونة للبرنامج
            //File myFile = new File("emp.png");
            //Image img = ImageIO.read(myFile);            
            //f.setIconImage(img);
        } catch (Exception ex) {
            Logger.getLogger(SetIconToMyForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
