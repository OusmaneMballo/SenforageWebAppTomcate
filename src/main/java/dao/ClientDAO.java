package dao;

import entities.Client;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class ClientDAO implements IClient {

    @Override
    public List<Client> findAll() {
        return null;
    }

    @Override
    public int add(Client c) {
        return 0;
    }

    @Override
    public Client findById(int id) {
        return null;
    }

    @Override
    public void delete(Client client) {

    }
}
