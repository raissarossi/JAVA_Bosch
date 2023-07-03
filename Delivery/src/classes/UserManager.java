package classes;

import entities.User;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private static final String USER_FILE = "users.txt";
    private static List<User> registeredUsers = new ArrayList<>();

    public static void createUser(String name, String password, int coordenadaX, int coordenadaY) {
        int id = generateId();
        User user = new User(id, name, password, coordenadaX, coordenadaY);
        registeredUsers.add(user);
        saveUser(user);
        System.out.println("foi");
    }

    public static boolean isRegisteredUser(String name, String password) {
        for (User user : registeredUsers) {
            if (user.getName().equals(name) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    private static int generateId() {
        return registeredUsers.size() + 1;
    }

    private static void saveUser(User user) {
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
