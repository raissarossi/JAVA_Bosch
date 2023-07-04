package entities;

import javax.management.modelmbean.ModelMBean;
import java.util.ArrayList;
import java.util.Objects;

public class Order {
    private final User userPedido;

    public User getUserPedido() {
        return userPedido;
    }

    private final Restaurant restaurantPedido;

    public Restaurant getRestaurantPedido() {
        return restaurantPedido;
    }

    private ArrayList<String> foodsPedido = new ArrayList<>();
    private boolean pedidoFinalizado = false;
    public void finalizarPedido(){
        pedidoFinalizado = true;
    }

    public boolean isPedidoFinalizado() {
        return pedidoFinalizado;
    }

    public Order(User userPedido, Restaurant restaurantPedido) {
        this.userPedido = userPedido;
        this.restaurantPedido = restaurantPedido;
    }
    public void addItem(String item){
        String comidaNome = item.split(" - ")[0];
        int qtd = 1;
        boolean removerBool = false;
        String removerEsse = "";
        if (restaurantPedido.getFood(comidaNome) != null){
            float preco = restaurantPedido.getFood(comidaNome).getPrice();
                for (String comidaQtd : foodsPedido){
                    qtd = Integer.parseInt(comidaQtd.split(",")[0]);
                    String comida = comidaQtd.split(",")[1];
                    if (Objects.equals(comida, comidaNome)){
                        qtd ++;
                        removerBool = true;
                        removerEsse = comidaQtd;
                    }
                }
                if (removerBool){
                    foodsPedido.remove(removerEsse);
                }
            foodsPedido.add(qtd + "," + comidaNome + "," + preco);
            System.out.println("AAAAAAAAA:"+foodsPedido);
        }else{
            System.out.println("food é null");
        }
    }

    public void dimItem(String item){
        int qtd = 1;
        boolean removerBool = false;
        String removerEsse = "";
        if (restaurantPedido.getFood(item) != null){
            float preco = restaurantPedido.getFood(item).getPrice();
            for (String comidaQtd : foodsPedido){
                qtd = Integer.parseInt(comidaQtd.split(",")[0]);
                String comida = comidaQtd.split(",")[1];
                if (Objects.equals(comida, item)){
                    qtd --;
                    removerBool = true;
                    removerEsse = comidaQtd;
                }
            }
            if (removerBool){
                foodsPedido.remove(removerEsse);
            }
            if(qtd > 0){
                foodsPedido.add(qtd + "," + item + "," + preco);
            }else{
                System.out.println("aaaaaaaaaaaaaaaaa ");
            }
        }else{
            System.out.println("food é null");
        }
    }
    public boolean pedidoIsEmpty(){
        if (foodsPedido.isEmpty()){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        /*
        nome cliente, restaurante, foods pedido uni, qtd, preco total
         */

        return userPedido.getName()+","+restaurantPedido.getName()+","+foodsPedido;
    }
}
