package com.example.demo;

import java.util.List;

public class Bank{

    private List<Client> clients;
    public Bank() {
    }

    public Bank(List<Client> accounts) {
        this.clients = accounts;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public void addAccount(Client client){
        this.clients.add(client);
    }
}
