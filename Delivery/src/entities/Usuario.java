package entities;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private int id;
    private String name;
    private String password;
    private int coordenadaX;
    private int coordenadaY;

    public Usuario(int id, String name, String password, int coordenadaX, int coordenadaY) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }


}
