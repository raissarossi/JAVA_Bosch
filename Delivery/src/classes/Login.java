package classes;


import components.BackButton;
import entities.User;

import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import java.awt.*;

public class Login extends JPanel {
    private List<User> registeredUsers;
    public JButton enterBtn = new JButton();
    public BackButton backButton = new BackButton();

    JLabel nameLabel = new JLabel("Name:");
    private JTextField nameField = new JTextField();
    public String getName() {
        return nameField.getText();
    }

    JLabel passwordLabel = new JLabel("Password:");
    private JPasswordField passwordField = new JPasswordField();
    public String getPassword() {
        return new String(passwordField.getPassword());
    }





    public Login(){
        this.registeredUsers = registeredUsers;
        registeredUsers = new ArrayList<>();

        setLayout(null);
        setBackground(Color.CYAN);
        setDefaultLocale(null);

        nameLabel.setBounds(117,160, 250, 50);
        add(nameLabel);
        nameField.setBounds(117,200, 250, 50);
        add(nameField);

        passwordLabel.setBounds(117,260, 250, 50);
        add(passwordLabel);
        passwordField.setBounds(117, 300, 250, 50);
        add(passwordField);

        add(backButton);

        enterBtn.setBounds(167,600, 150, 50);
        enterBtn.setText("Enter");
        add(enterBtn);
        nameLabel.setVisible(true);
        passwordLabel.setVisible(true);
    }
    public boolean isRegisteredUser(String name, String password) {
        for (User user : registeredUsers) {
            if (user.getName().equals(name) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}
