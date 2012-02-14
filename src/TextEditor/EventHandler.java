/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TextEditor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
/**
 *
 * @author dio
 */
public class EventHandler implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().getClass().getName() == "javax.swing.JMenuItem") 
        {
            JMenuItem source = (JMenuItem)e.getSource();
            if(source.getName() == "exitMenuItem")
                System.exit(0);
        }
    }
    
}
