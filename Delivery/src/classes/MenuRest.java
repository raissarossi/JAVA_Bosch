package classes;

import components.BackButton;
import components.CartButton;
import entities.Food;
import entities.Restaurant;
import entities.User;

import javax.swing.*;
import java.awt.*;

public class MenuRest extends JPanel {
    private Restaurant restaurant;
    private String selectedFood;

    public String getSelectedFood() {
        return selectedFood;
    }

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
    public Restaurant getRestaurant() {
        return restaurant;
    }
    private final DefaultListModel<String> modelNomeComida = new DefaultListModel<>();
    public JList<String> listaComidas = new JList<>(modelNomeComida);
    public BackButton backButton = new BackButton();
    public JButton addButton = new JButton("+");
    public CartButton cartButton = new CartButton();

    public MenuRest() {
        setLayout(null);
        setBackground(Color.BLUE);

        add(backButton);

        listaComidas.setBounds(100, 100, 200, 400);
        add(listaComidas);

        addButton.setBounds(320, 100, 100, 40);
        add(addButton);

        add(cartButton);

        listaComidas.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()){
                return;
            }
            selectedFood = listaComidas.getSelectedValue();
        });
    }

    public void refresh() {
        modelNomeComida.removeAllElements();
        for (Food food : restaurant.getComidas()) {
            modelNomeComida.addElement(food.getName() +" - "+ food.getPrice());
        }
    }
}
