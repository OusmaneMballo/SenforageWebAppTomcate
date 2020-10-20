package dao;

import entities.Village;

import javax.ejb.Local;
import java.util.List;

@Local
public interface IVillage {
    public List<Village> findAll();
    public int add(Village v);
    public Village findById(int id);
    public void delete(Village village);
}
