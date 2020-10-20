package dao;

import entities.Role;

import java.util.List;

public interface IRole {
    public List<Role> findAll();
    public int add(Role r);
    public Role findById(int id);
    public void delete(Role role);
}
