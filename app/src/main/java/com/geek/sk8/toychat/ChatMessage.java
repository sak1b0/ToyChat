package com.geek.sk8.toychat;

/**
 * Created by Acer PC on 9/18/2016.
 */
public class ChatMessage {
    String name;
    String message;

    public ChatMessage() {
    }

    public ChatMessage(String name, String message) {
        this.name = name;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }
}
