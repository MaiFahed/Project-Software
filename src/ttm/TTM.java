/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ttm;

/**
 *
 * @author Google Tceh
 */
public class TTM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
               // new Signup().setVisible(true);
               // new AddTask().setVisible(true);
            }
        });
    }
    
}
