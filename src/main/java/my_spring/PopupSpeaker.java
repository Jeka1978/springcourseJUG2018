package my_spring;

import javax.swing.*;

/**
 * @author Evgeny Borisov
 */
public class PopupSpeaker implements Speaker {
    public void speak(String message) {
        //50 lines of code
        JOptionPane.showMessageDialog(null,message);
    }
}
