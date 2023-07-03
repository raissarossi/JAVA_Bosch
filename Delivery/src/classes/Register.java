package classes;

import javax.swing.*;
import java.awt.*;

public class Register extends JPanel {
    public JButton enterBtn = new JButton();
    public JButton backHome =  new JButton();
    JTextField name = new JTextField();
    JLabel nameLabel = new JLabel("Name:");

    JPasswordField password = new JPasswordField();
    JLabel passwordLabel = new JLabel("Password:");

    JTextField enderecoX = new JTextField();
    JLabel enderecoXLabel = new JLabel("EnderecoX:");

    JTextField enderecoY = new JTextField();
    JLabel enderecoYLabel = new JLabel("EnderecoY:");


    public Register() {
        setLayout(null);
        setBackground(Color.CYAN);
        setDefaultLocale(null);

        nameLabel.setBounds(117, 160, 250, 50);
        add(nameLabel);
        name.setBounds(117, 200, 250, 50);
        add(name);

        passwordLabel.setBounds(117, 260, 250, 50);
        add(passwordLabel);
        password.setBounds(117, 300, 250, 50);
        add(password);

        enderecoXLabel.setBounds(117, 360, 100, 50);
        add(enderecoXLabel);
        enderecoX.setBounds(117, 400, 100, 50);
        add(enderecoX);

        enderecoYLabel.setBounds(267, 360, 100, 50);
        add(enderecoYLabel);
        enderecoY.setBounds(267, 400, 100, 50);
        add(enderecoY);

        backHome.setBounds(10, 10, 80, 20);
        backHome.setText("Back");
        add(backHome);

        enterBtn.setBounds(167, 600, 150, 50);
        enterBtn.setText("Enter");
        add(enterBtn);
        nameLabel.setVisible(true);
        passwordLabel.setVisible(true);
    }

    public String getName() {
        return name.getText();
    }

    public String getPassword() {
        return new String(password.getPassword());
    }

    public int getCoordenadaX() {
        return Integer.parseInt(enderecoX.getText());
    }

    public int getCoordenadaY() {
        return Integer.parseInt(enderecoY.getText());
    }
}
