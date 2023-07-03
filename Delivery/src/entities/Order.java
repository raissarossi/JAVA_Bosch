package entities;

import java.util.ArrayList;
import java.util.Objects;

public class Order {
    private final User userPedido;
    private final Restaurant restaurantPedido;
    private ArrayList<String> foodsPedido;

    public Order(User userPedido, Restaurant restaurantPedido) {
        this.userPedido = userPedido;
        this.restaurantPedido = restaurantPedido;
    }

    public void addItem(String item){
        int qtd = 1;
        if (restaurantPedido.getFood(item) != null){
            float preco = restaurantPedido.getFood(item).getPrice();
            for (String comidaQtd : foodsPedido){
                qtd = Integer.parseInt(comidaQtd.split(",")[0]);
                String comida = comidaQtd.split(",")[1];
                if (Objects.equals(comida, item)){
                    qtd += 1;
                    foodsPedido.remove(comidaQtd);
                }
            }
            foodsPedido.add(qtd + "," + item + "," + preco);

        }else{
            System.out.println("food é null");
        }
    }


}
