package com.nathprojet.commande.dao;

import com.nathprojet.client.dao.ClientBean;
import com.sun.org.apache.xpath.internal.operations.Bool;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.Date;

/**
 * Created by FP13694 on 20/01/2019.
 */
@Entity
@Table(name = "commande")
public class CommandeBean {
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  Integer id;

  Integer commande;

  Integer facture;

  Date date;

  Boolean statusValid;

  Integer statusSuivi;

  @OneToOne
  ClientBean client;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getCommande() {
    return commande;
  }

  public void setCommande(Integer commande) {
    this.commande = commande;
  }

  public Integer getFacture() {
    return facture;
  }

  public void setFacture(Integer facture) {
    this.facture = facture;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public Boolean getStatusValid() {
    return statusValid;
  }

  public void setStatusValid(Boolean statusValid) {
    this.statusValid = statusValid;
  }

  public Integer getStatusSuivi() {
    return statusSuivi;
  }

  public void setStatusSuivi(Integer statusSuivi) {
    this.statusSuivi = statusSuivi;
  }

  public ClientBean getClient() {
    return client;
  }

  public void setClient(ClientBean client) {
    this.client = client;
  }
}
