package me.dapac.messagesapp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MessagesDAOShould {

    @Before
    public void setUp() throws Exception {
        try{
            DbConnection connection = new DbConnection();
            connection.connect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void createMessage() {

    }

    @Test
    public void readMessages() {
        MessagesDAO.readAllMessages();
    }

    @Test
    public void updateMessage() {
    }

    @Test
    public void deleteMessage() {
    }
}