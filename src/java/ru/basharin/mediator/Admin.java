package ru.basharin.mediator;

public class Admin implements User {
    private String name;
    private Chat chat;

    public Admin(String name, Chat chat) {
        this.name = name;
        this.chat = chat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(this, message);
    }

    @Override
    public void getMessage(String message) {
        System.out.println(this.name + " get message " + message);
    }
}
