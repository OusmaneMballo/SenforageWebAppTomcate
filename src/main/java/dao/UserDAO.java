package dao;

import Util.HibernateUtil;
import entities.User;
import org.hibernate.Session;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class UserDAO implements IUser{

    Session session;

    public UserDAO() {
       session= HibernateUtil.getSession();
    }

    @Override
    public List<User> findAll() {
        return session.createQuery("select u from User u", User.class).list();
    }

    @Override
    public int add(User u) {
        try{
            session.save(u);
            return 1;
        }catch (Exception exception){
            return 0;
        }
    }

    @Override
    public User findById(int id) {
        return session.find(User.class, id);
    }

    @Override
    public User findByLoginPasswd(String login, String passwd) {
        return session.createQuery("select u from User u where u.login=:login and u.passwd=:passwd",
                User.class).setParameter("login",login).setParameter("passwd", passwd).getSingleResult();
    }

    @Override
    public void delete(User user) {
        try {

        }catch(Exception exception){
            exception.getStackTrace();
        }
    }
}
