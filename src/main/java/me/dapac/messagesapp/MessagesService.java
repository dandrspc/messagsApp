package me.dapac.messagesapp;

import java.util.Scanner;

public class MessagesService {

    public static void createMessage() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write your message");
        String message = sc.nextLine();

        System.out.println("Write your name");
        String author = sc.nextLine();
        Message register = new Message();

        register.setMessage(message);
        register.setMessageAuthor(author);
        MessagesDAO.createMessage(register);
    }

    public static void readMessages() {
        MessagesDAO.readAllMessages();
    }

    public static void updateMessage() {
    }

    public static void deleteMessage(){}
}
