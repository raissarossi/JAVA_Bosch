package classes;

import components.CartButton;
import entities.Restaurant;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class RestaurantsList extends JPanel {
    private ArrayList<Restaurant> Restaurantes = new ArrayList<>();

    public ArrayList<Restaurant> getRestaurantes() {return Restaurantes;}

    public void setRestaurantes(ArrayList<Restaurant> restaurantes) {
        Restaurantes = restaurantes;
    }

    private final DefaultListModel<String> modelNomeRest = new DefaultListModel<>();
    public final JList<String> listaRestaurants = new JList<>(modelNomeRest);
    public CartButton cartButton = new CartButton();
    public RestaurantsList(){
        setLayout(null);
        setBackground(Color.BLUE);
        setDefaultLocale(null);

        listaRestaurants.setBounds( 100, 100, 200, 400);
        add(listaRestaurants);

        add(cartButton);

    }

    public void refresh(){
        modelNomeRest.removeAllElements();
        for (Restaurant restaurant : getRestaurantes() ){
            modelNomeRest.addElement(restaurant.getName());
        }
    }
}
