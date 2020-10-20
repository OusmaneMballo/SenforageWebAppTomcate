package dao;

import entities.User;

import java.util.List;

public interface IUser {
    public List<User> findAll();
    public int add(User u);
    public User findById(int id);
    public void delete(User user);
}
