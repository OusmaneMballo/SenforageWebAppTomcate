package dao;

import entities.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class UserDAO implements IUser{

    private EntityManager em;


    public UserDAO() {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("GesForagePU");
        em=emf.createEntityManager();
    }

    @Override
    public List<User> findAll() {
        return em.createQuery("SELECT u from User u").getResultList();
        //return null;
    }

    @Override
    public int add(User u) {

        try{
            em.persist(u);
            return 1;
        }catch (Exception exception){
            exception.getStackTrace();
        }

        return 0;
    }

    @Override
    public User findById(int id) {
        return em.find(User.class, id);
        //return null;
    }

    @Override
    public void delete(User user) {
        try{
            em.remove(user);
        }catch (Exception exception){
            exception.getStackTrace();
        }

    }
}
