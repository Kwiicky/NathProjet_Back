package com.nathprojet.client.dao;

import com.nathprojet.adresse.dao.AdresseBean;

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

  @ManyToOne
  AdresseBean adresse ;

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

  public AdresseBean getAdresse() {
    return adresse;
  }

  public void setAdresse(AdresseBean adresse) {
    this.adresse = adresse;
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
