package com.nathprojet.client.dao;

import com.nathprojet.codePostal.dao.CodePostalBean;
import com.nathprojet.pays.dao.PaysBean;
import com.nathprojet.ville.dao.VilleBean;

import javax.persistence.*;

/**
 * Created by FP13694 on 20/01/2019.
 */
@Entity
@Table(name = "client")
public class ClientBean {

  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  Integer id;

  String nom;

  String prenom;

  String adresse;

  @OneToOne
  CodePostalBean cp;

  @OneToOne
  VilleBean ville;

  @OneToOne
  PaysBean pays;

  @Column(length = 10)
  String telephone;

  String email;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getPrenom() {
    return prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  public String getAdresse() {
    return adresse;
  }

  public void setAdresse(String adresse) {
    this.adresse = adresse;
  }

  public CodePostalBean getCp() {
    return cp;
  }

  public void setCp(CodePostalBean cp) {
    this.cp = cp;
  }

  public VilleBean getVille() {
    return ville;
  }

  public void setVille(VilleBean ville) {
    this.ville = ville;
  }

  public PaysBean getPays() {
    return pays;
  }

  public void setPays(PaysBean pays) {
    this.pays = pays;
  }

  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
