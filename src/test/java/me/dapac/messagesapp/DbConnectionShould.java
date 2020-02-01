package me.dapac.messagesapp;

import org.junit.Test;
import static org.junit.Assert.*;
import java.sql.Connection;

public class DbConnectionShould {

    @Test
    public void dataBase_connection_not_null() {
        DbConnection dbConnection = new DbConnection();
        Connection connection = dbConnection.connect();
        assertNotNull(connection);
    }
}