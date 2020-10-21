package dao;

import entities.User;

import javax.ejb.Local;
import java.util.List;

@Local
public interface IUser {
    public List<User> findAll();
    public int add(User u);
    public User findById(int id);
    public User findByLoginPasswd(String login, String passwd);
    public void delete(User user);
}
