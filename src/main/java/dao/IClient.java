package dao;

import entities.Client;

import java.util.List;

public interface IClient {
    public List<Client> findAll();
    public int add(Client c);
    public Client findById(int id);
    public void delete(Client client);

}
