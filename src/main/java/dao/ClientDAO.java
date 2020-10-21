package dao;

import Util.HibernateUtil;
import entities.Client;
import org.hibernate.Session;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class ClientDAO implements IClient {

    Session session;
    public ClientDAO(){
        session= HibernateUtil.getSession();
    }

    @Override
    public List<Client> findAll() {

        return session.createQuery("select c from Client c", Client.class).list();
    }

    @Override
    public int add(Client c) {

        try{
            session.save(c);
            return 1;
        }catch (Exception exception){
            return 0;
        }
    }

    @Override
    public Client findById(int id) {
        return session.find(Client.class, id);
    }

    @Override
    public void delete(Client client) {
        try{
            session.delete(client);
        }catch (Exception exception){
            exception.getStackTrace();
        }
    }
}
