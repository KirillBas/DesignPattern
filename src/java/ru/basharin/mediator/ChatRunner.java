package ru.basharin.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRunner{
    public static void main(String[] args) {
        TextChat textChat = new TextChat();

        User admin = new Admin("admin", textChat);
        User user1 = new ChatUser("Tom", textChat);
        User user2 = new ChatUser("Bom", textChat);

        textChat.setAdmin(admin);

        textChat.addUserInChat(user1);
        textChat.addUserInChat(user2);

        user1.sendMessage("Hello world!");
        admin.sendMessage("Hi people!");
    }
}
