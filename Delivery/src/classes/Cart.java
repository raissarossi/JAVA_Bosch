package classes;

import components.BackButton;

import javax.swing.*;
import java.awt.*;

public class Cart extends JPanel {
    public BackButton backButton = new BackButton();
    public Cart(){
        setLayout(null);
        setBackground(Color.MAGENTA);

        add(backButton);
    }

}
