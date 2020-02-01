package me.dapac.messagesapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MessagesDAO {

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
        Connection connection = connect();
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
        PreparedStatement statement = null;
        Connection connection = connect();
        try {
            String query = "SELECT * FROM messages";
            statement = connection.prepareStatement(query);
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
    }

    public static void deleteMessage(int id) {
    }
}
