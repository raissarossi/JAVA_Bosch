package entities;

import java.util.ArrayList;
import java.util.Objects;

public class Restaurant{
    private String name;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }


    private int id;
    private int idFood = 0;
    private ArrayList<Food> comidas = new ArrayList<>();
    public ArrayList<Food> getComidas() {
        return comidas;
    }
    public void setComidas(ArrayList<Food> comidas) {
        this.comidas = comidas;
    }



    public Restaurant(int id, String name){
        this.id = id;
        this.name = name;
    }
    public void addFood(String name, float price){
//        comidas.add(new Food(idFood,"Macarao", 15.00F));
        for (Food comida: comidas) {
            if (Objects.equals(comida.getName(), name)){
                return;
            }
        }
        comidas.add(new Food(id, name, price));
        idFood++;
    }

}

