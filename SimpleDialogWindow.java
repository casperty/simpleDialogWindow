/**
    The MIT License (MIT)

    Copyright (c) 2015 

    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:

    The above copyright notice and this permission notice shall be included in all
    copies or substantial portions of the Software.

    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
    SOFTWARE.
 */
package simpledialogwindow;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
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
    boolean isIconified=false;

    public SimpleDialogWindow() {
        
        this.setSize(1000,75);
        textField = new JTextField();
        Font font1 = new Font("SansSerif", Font.BOLD, 30);
        textField.setFont(font1);
        this.setFocusable(true);
        this.setFocusTraversalKeysEnabled(true);
        
        textField.addKeyListener(
            new KeyListener(){  
                public void keyPressed(KeyEvent e){
                    if(e.getKeyCode() == KeyEvent.VK_ESCAPE){
                        textField.setText("");
                    }else if(e.getKeyCode() == KeyEvent.VK_F1){
                        System.out.println("F1 keytouch trough the frame itself");
                        setExtendedState(JFrame.ICONIFIED);
                    }else if(e.getKeyCode() == KeyEvent.VK_F2){
                        System.out.println("F2 keytouch trough the textfield");
                        setExtendedState(JFrame.NORMAL);
                    }
                }

                @Override
                public void keyTyped(KeyEvent e) {
                    
                }

                @Override
                public void keyReleased(KeyEvent e) {}
            }
        );
        
        this.addKeyListener(
                new KeyListener(){  
                public void keyPressed(KeyEvent e){
                    if(e.getKeyCode() == KeyEvent.VK_F1){
                        System.out.println("F1 keytouch trough the frame itself");
                        setExtendedState(JFrame.ICONIFIED);
                    }else if(e.getKeyCode() == KeyEvent.VK_F2){
                        System.out.println("F2 keytouch trough the textfield");
                        setExtendedState(JFrame.NORMAL);
                    }else if(e.getKeyCode() == KeyEvent.VK_ENTER){
                        System.out.println("ENTER");
                    }
                }

                @Override
                public void keyTyped(KeyEvent e) {}

                @Override
                public void keyReleased(KeyEvent e) {}
            }
        );

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