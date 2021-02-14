package com.example.demo;

public class Client {
    private int client_id;
    private int cash;
    private String card_num;

    public Client() {
    }

    public Client(int client_id, String name, int cash, String card_num) {
        this.client_id = client_id;
        this.cash = cash;
        this.card_num = card_num;
    }

    public int getClient_id() {
        return client_id;
    }

    public int getCash() {
        return cash;
    }

    public String getCard_num() {
        return card_num;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public void setCard_num(String card_num) {
        this.card_num = card_num;
    }
}
