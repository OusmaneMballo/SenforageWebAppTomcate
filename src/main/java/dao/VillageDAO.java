package dao;

import Util.HibernateUtil;
import entities.Village;
import org.hibernate.Session;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class VillageDAO implements IVillage {

    Session session;

    public VillageDAO(){
        session= HibernateUtil.getSession();
    }
    @Override
    public List<Village> findAll() {

        return session.createQuery("select v from Village v",Village.class).list();
    }

    @Override
    public int add(Village v) {

        try{
            session.save(v);
            return 1;
        }catch (Exception exception){
            return 0;
        }
    }

    @Override
    public Village findById(int id) {
        return session.find(Village.class, id);
    }

    @Override
    public void delete(Village village) {
            try {
                session.delete(village);
            }catch (Exception exception){
                exception.getStackTrace();
            }
    }
}
