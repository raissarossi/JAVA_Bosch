package classes;

import components.CartButton;

import javax.swing.*;
import java.awt.*;

public class Home extends JPanel {
    public JButton goLogin = new JButton();
    public JButton goRegister = new JButton();
    CartButton cartButton = new CartButton();
    public Home(){
        setLayout(null);
        setBackground(Color.RED);
        setSize(500, 800);
        setDefaultLocale(null);

        goLogin.setBounds(50,600, 150, 50);
        goLogin.setText("Login");
        add(goLogin);

        goRegister.setBounds(250,600, 150, 50);
        goRegister.setText("Register");
        add(goRegister);

        add(cartButton);
    }
}
