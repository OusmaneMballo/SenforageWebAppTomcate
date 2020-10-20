package dao;

import Util.HibernateUtil;
import entities.Role;
import org.hibernate.Session;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class RoleDAO implements IRole {

    Session session;

    public RoleDAO(){
            session= HibernateUtil.getSession();
    }

    @Override
    public List<Role> findAll() {
        return session.createQuery("select r from Role r", Role.class).list();
    }

    @Override
    public int add(Role r) {
        try {
            session.save(r);
            return 1;
        }catch (Exception exception){
            exception.getStackTrace();
        }

        return 0;
    }

    @Override
    public Role findById(int id) {
        return null;
    }

    @Override
    public void delete(Role role) {

    }
}
