package classes;

import components.BackButton;
import entities.Food;
import entities.Order;
import entities.User;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Cart extends JPanel {
    public BackButton backButton = new BackButton();
    private ArrayList<Order> orders = new ArrayList<>();
    private final DefaultListModel<Order> modelPedido = new DefaultListModel<>();
    public JList<Order> listaOrders = new JList<>(modelPedido);
    public Cart(){
        setLayout(null);
        setBackground(Color.MAGENTA);

        listaOrders.setBounds(100, 100, 230, 400);
        add(listaOrders);

        add(backButton);
    }

    public void refresh() {
        modelPedido.removeAllElements();
        modelPedido.addAll(orders);
    }
}
