package com.ikar.example.soap.server.test;

public class Message {

    private int id;
    private String head;
    private String body;

    public Message(int id, String head, String body) {
        this.id = id;
        this.head = head;
        this.body = body;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
