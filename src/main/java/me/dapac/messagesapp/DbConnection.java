package me.dapac.messagesapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    public Connection connect() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/message_app", "root", "toor");
            if(connection != null){
                System.out.println("Successful connection");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
