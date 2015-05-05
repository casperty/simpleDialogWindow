package simpledialogwindow;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

/**
 *
 * @author Alexandre Ravaux Manuel Kevin Lopes
 */
public class SimpleDialogWindow extends JFrame{
    JTextField textField;

    public SimpleDialogWindow() {
        this.setSize(1000,75);
        textField = new JTextField();
        Font font1 = new Font("SansSerif", Font.BOLD, 30);
        textField.setFont(font1);

        /* When you click on escape touch, it erases your text */
        Action action = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
            }};
        String keyStrokeAndKey = "ESCAPE";
        KeyStroke keyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0);
        textField.getInputMap().put(keyStroke, keyStrokeAndKey);
        textField.getActionMap().put(keyStrokeAndKey, action);

        this.getContentPane().add(textField);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SimpleDialogWindow sdw = new SimpleDialogWindow();
    }

}
