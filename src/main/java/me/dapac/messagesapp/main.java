package me.dapac.messagesapp;

import java.sql.SQLException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        do {
            System.out.println("**************************************");
            System.out.println("Welcome to Message App. Choose your option");
            System.out.println("1. Create Message");
            System.out.println("2. Read Messages");
            System.out.println("3. Update Message");
            System.out.println("4. Delete Message");
            System.out.println("5. Exit");
            System.out.println(">>> ");

            option = sc.nextInt();

            switch (option) {
                case 1:
                    MessagesService.createMessage();
                    break;
                case 2:
                    MessagesService.readMessages();
                    break;
                case 3:
                    MessagesService.updateMessage();
                    break;
                case 4:
                    MessagesService.deleteMessage();
                    break;
                default:
                    break;
            }
        } while (option != 5);
    }
}
