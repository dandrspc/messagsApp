package me.dapac.messagesapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MessagesDAO {

    private static Connection connection;

    private static Connection connect() {

        try {
            DbConnection dbConnection = new DbConnection();
            return dbConnection.connect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void createMessage(Message message) {

        PreparedStatement statement = null;
        connection = connect();
        try {
            String query = "INSERT INTO messages (message, author) " +
                    "VALUES (?, ?)";
            statement = connection.prepareStatement(query);
            statement.setString(1, message.getMessage());
            statement.setString(2, message.getMessageAuthor());

            statement.executeUpdate();
            System.out.println("Message created");
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println(e);
        }
    }

    public static void readAllMessages() {
        connection = connect();
        try {
            String query = "SELECT * FROM messages";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id_messages"));
                System.out.println("Message: " + resultSet.getString("message"));
                System.out.println("Author: " + resultSet.getString("author"));
                System.out.println("Date: " + resultSet.getString("date"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateMessage(Message message) {
        connection = connect();
        try {
            String query = "UPDATE messages SET message = ? WHERE id_messages = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, message.getMessage());
            statement.setInt(2, message.getIdMessage());

            statement.executeUpdate();
            System.out.println("Message updated successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteMessage(int id) {
        connection = connect();
        try {
            String query = "DELETE FROM messages WHERE id_messages = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);
            statement.executeUpdate();
            System.out.println("Message deleted");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
