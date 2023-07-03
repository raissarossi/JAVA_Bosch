package classes;

import entities.Usuario;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private static final String USER_FILE = "users.txt";
    private static List<Usuario> registeredUsers = new ArrayList<>(); // tornar estático

    public static void createUser(String name, String password, int coordenadaX, int coordenadaY) {
        int id = generateId();
        Usuario user = new Usuario(id, name, password, coordenadaX, coordenadaY);
        registeredUsers.add(user);
        saveUser(user);
        System.out.println("foi");
    }

    public static boolean isRegisteredUser(String name, String password) {
        for (Usuario user : registeredUsers) {
            if (user.getName().equals(name) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    private static int generateId() {
        // Implemente a lógica para gerar um ID único para cada usuário
        // Pode ser um número sequencial ou qualquer outra lógica de sua escolha
        // Aqui está um exemplo simples de um contador:
        return registeredUsers.size() + 1;
    }

    private static void saveUser(Usuario user) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(USER_FILE, true))) {
            String userLine = user.getId() + "," + user.getName() + "," + user.getPassword()
                    + "," + user.getCoordenadaX() + "," + user.getCoordenadaY();
            writer.write(userLine);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
