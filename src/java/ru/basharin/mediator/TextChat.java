package ru.basharin.mediator;

import java.util.ArrayList;
import java.util.List;

public class TextChat implements Chat {
    private User admin;
    private List<User> users = new ArrayList<>();

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public void addUserInChat(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(User user, String message) {
        for (User client: users) {
            if (client !=user) {
                client.getMessage(message);
            }
        }
        admin.getMessage(message);
    }
}
