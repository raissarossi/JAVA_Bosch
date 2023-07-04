package application;

import components.CartButton;
import entities.Order;
import entities.Restaurant;
import classes.*;
import entities.User;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Objects;

public class General extends JFrame {
    private User loggedUser;
    private Login login;
    private Home home;
    private Register register;
    private Cart cart;
    private ArrayList<Order> orders = new ArrayList<>();
    private RestaurantsList restaurantsList;
    private MenuRest menuRest;
    private UserManager userManager;
    private CartButton cartButton;
    private ArrayList<Restaurant> restaurants;
    private ArrayList<String> carrinho;
    private float valorTotal;


    public General(){
        setSize(500, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        initializeComponents();
        addAllListeners();
        setAllRestaurants();
        setAllFoods();

        setContentPane(home);
        home.setVisible(true);
        setVisible(true);
    }

    private void initializeComponents() {
        login = new Login();
        home = new Home();
        register = new Register();
        cart = new Cart();
        restaurantsList = new RestaurantsList();
        menuRest = new MenuRest();
        restaurants = new ArrayList<>();
        userManager = new UserManager();
        cartButton = new CartButton();
        carrinho = new ArrayList<>();
        valorTotal = 0.0f;
        userManager.createUser("", "", 1, 1);
    }

    private void setAllRestaurants() {
        restaurants.add(new Restaurant(0, "RaissasFoood"));
        restaurants.add(new Restaurant(1, "Dadora"));
    }

    private void setAllFoods() {
        restaurants.get(0).addFood("Lanchinho", 10F);
        restaurants.get(0).addFood("torta de limão", 20.99F);
        restaurants.get(1).addFood("torta de limão", 20.99F);
    }

    private void addAllListeners() {
        home.goLogin.addActionListener(e -> {
            home.setVisible(false);
            setContentPane(login);
            login.setVisible(true);
        });
        home.goRegister.addActionListener(e -> {
            home.setVisible(false);
            setContentPane(register);
            register.setVisible(true);
        });

        login.backButton.addActionListener(e -> {
            login.setVisible(false);
            setContentPane(home);
            home.setVisible(true);
        });
        login.enterBtn.addActionListener(e -> {
            String name = login.getName();
            String password = login.getPassword();
            System.out.println("AAAAAAAA");

            if (userManager.isRegisteredUser(name, password)) {
                System.out.println("RRRRRRRRR");
                for (User u : userManager.getRegisteredUsers()){
                    System.out.println(u);
                    if (Objects.equals(u.getName(), name)){
                        System.out.println(u);
                        loggedUser = u;
                    }
                }
                login.setVisible(false);
                setContentPane(restaurantsList);
                restaurantsList.setRestaurantes(restaurants);
                restaurantsList.refresh();
                restaurantsList.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Usuário não registrado!");
            }
        });

        register.enterBtn.addActionListener(e -> {
            register.setVisible(false);
            setContentPane(home);
            home.setVisible(true);
        });
        register.backButton.addActionListener(e -> {
            register.setVisible(false);
            setContentPane(home);
            home.setVisible(true);
        });
        register.enterBtn.addActionListener(e -> {
            String name = register.getName();
            String password = register.getPassword();
            int coordenadaX = register.getCoordenadaX();
            int coordenadaY = register.getCoordenadaY();
            userManager.createUser(name, password, coordenadaX, coordenadaY);
            System.out.println("Foi");
        });
        restaurantsList.listaRestaurants.addListSelectionListener(e -> {
            if (e.getValueIsAdjusting()) {
                return;
            }

            String nomeRest = restaurantsList.listaRestaurants.getSelectedValue();
            for (Restaurant rest : restaurants) {
                if (Objects.equals(nomeRest, rest.getName())) {
                    menuRest.setRestaurant(rest);
                    break;
                }
            }

            setContentPane(menuRest);
            menuRest.refresh();
            restaurantsList.setVisible(false);
            menuRest.setVisible(true);
        });
        restaurantsList.cartButton.addActionListener(e -> {
            cart.setOrders(getOrders);
            cart.refresh();
            System.out.println("Carrinhoooooo");
            restaurantsList.setVisible(false);
            setContentPane(cart);
            cart.setVisible(true);
        });
        // DE ONDE -> PRA ONDE
        menuRest.backButton.addActionListener(e -> {
            menuRest.setVisible(false);
            setContentPane(restaurantsList);
            restaurantsList.setVisible(true);
        });
        menuRest.addButton.addActionListener(e -> {
            String selectedFood = menuRest.listaComidas.getSelectedValue();
            if (selectedFood != null) {
                adicionarCarrinho();
            }
        });
        menuRest.cartButton.addActionListener(e -> {
            cart.refresh();
            System.out.println("cccc");
            menuRest.setVisible(false);
            setContentPane(cart);
            cart.setVisible(true);
        });

        cart.backButton.addActionListener(e -> {
            cart.setVisible(false);
            setContentPane(restaurantsList);
            restaurantsList.setVisible(true);
        });
    }

    public void adicionarCarrinho(){
        boolean newPedido = true;
        for (Order o : orders){
            if (o.getUserPedido() == loggedUser && o.getRestaurantPedido() == menuRest.getRestaurant()){
//                System.out.println("eita");
                o.addItem(menuRest.getSelectedFood());
                newPedido = false;
            }
//            System.out.println(o);
        }
        if (newPedido == true){
            orders.add(new Order(loggedUser, menuRest.getRestaurant()));
            adicionarCarrinho();
        }

//        System.out.println("Adicionou: " + menuRest.getSelectedFood());
    }


}
