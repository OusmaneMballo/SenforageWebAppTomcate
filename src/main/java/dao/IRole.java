package dao;

import entities.Role;

import javax.ejb.Local;
import java.util.List;

@Local
public interface IRole {
    public List<Role> findAll();
    public int add(Role r);
    public Role findById(int id);
    public void delete(Role role);
}
