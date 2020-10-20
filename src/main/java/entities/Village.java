package entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Village implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 30, unique = true, nullable = false)
    private String nom;

    @OneToMany(mappedBy = "village")
    private List<Client> clients;

    public Village() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
}
