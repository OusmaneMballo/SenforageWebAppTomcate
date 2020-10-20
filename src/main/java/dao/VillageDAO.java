package dao;

import entities.Village;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class VillageDAO implements IVillage {
    @Override
    public List<Village> findAll() {
        return null;
    }

    @Override
    public int add(Village v) {
        return 0;
    }

    @Override
    public Village findById(int id) {
        return null;
    }

    @Override
    public void delete(Village village) {

    }
}
