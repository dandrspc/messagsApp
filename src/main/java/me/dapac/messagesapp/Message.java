package me.dapac.messagesapp;

public class Message {

    private int idMessage;
    String message;
    String messageAuthor;
    String date;

    public Message(){

    }

    public Message(int idMessage, String message, String messageAuthor, String date) {
        this.idMessage = idMessage;
        this.message = message;
        this.messageAuthor = messageAuthor;
        this.date = date;
    }

    public int getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(int idMessage) {
        this.idMessage = idMessage;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessageAuthor() {
        return messageAuthor;
    }

    public void setMessageAuthor(String messageAuthor) {
        this.messageAuthor = messageAuthor;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
