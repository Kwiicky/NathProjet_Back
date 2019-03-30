package com.nathprojet.adresse.dao;

import javax.persistence.*;

@Entity
@Table(name = "adresse")
public class AdresseBean {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    String cp;

    String ville;

    String pays;

    String Rue;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getRue() {
        return Rue;
    }

    public void setRue(String rue) {
        Rue = rue;
    }

}

