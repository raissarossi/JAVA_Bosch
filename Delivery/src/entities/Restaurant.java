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
    public Food getFood(String food){
        for (Food comida : comidas) {
//            System.out.println("get: "+comida.getName());
            if (Objects.equals(comida.getName(), food)){
                return comida;
            }
        }
        return null;
    }


    public Restaurant(int id, String name){
        this.id = id;
        this.name = name;
    }
    public void addFood(String name, float price){
        if (getFood(name) != null){
            return;
        }
        comidas.add(new Food(id, name, price));
        idFood++;
    }

}

