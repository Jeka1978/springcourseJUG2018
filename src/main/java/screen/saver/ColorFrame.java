package screen.saver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Component
public class ColorFrame extends JFrame {
    Random random = new Random();

    @Autowired
    private Color color;

    @PostConstruct
    public void init(){
        setSize(200,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void move() {
        setLocation(random.nextInt(1500),random.nextInt(800));
        color = getColorBean();
        getContentPane().setBackground(color);
        repaint();
    }

    @Lookup
    protected  Color getColorBean() {
        return null;
    }

}




