package classes;

import components.CartButton;
import entities.Food;
import entities.Restaurant;
import javax.swing.*;
import java.awt.*;

public class MenuRest extends JPanel {
    private Restaurant restaurant;

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    private final DefaultListModel<String> modelNomeComida = new DefaultListModel<>();
    public JList<String> listaComidas = new JList<>(modelNomeComida);
    public JButton backRest = new JButton();
    public JButton addButton = new JButton("+");
    CartButton cartButton = new CartButton();

    public MenuRest() {
        setLayout(null);
        setBackground(Color.BLUE);

        backRest.setBounds(10, 10, 80, 20);
        backRest.setText("Back");
        add(backRest);

        listaComidas.setBounds(100, 100, 200, 400);
        add(listaComidas);

        addButton.setBounds(320, 100, 100, 40);
        add(addButton);

        add(cartButton);


    }

    public void refresh() {
        modelNomeComida.removeAllElements();
        for (Food food : restaurant.getComidas()) {
            modelNomeComida.addElement(food.getName() +" - "+ food.getPrice());
        }
    }
}
