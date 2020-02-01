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
        Scanner sc = new Scanner(System.in);
        System.out.println("Write your new message");
        String message = sc.nextLine();

        System.out.println("Write the ID of the message to edit");
        int id = sc.nextInt();
        Message update = new Message();
        update.setIdMessage(id);
        update.setMessage(message);

        MessagesDAO.updateMessage(update);
    }

    public static void deleteMessage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the ID of the message to delete");
        int id = sc.nextInt();
        MessagesDAO.deleteMessage(id);
    }
}
