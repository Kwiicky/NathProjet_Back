package com.nathprojet.categorie.dao;

import javax.persistence.*;

/**
 * Created by FP13694 on 20/01/2019.
 */
@Entity
@Table(name = "categorie")
public class CategorieBean {

  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  Integer id;

  String categorie;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getCategorie() {
    return categorie;
  }

  public void setCategorie(String categorie) {
    this.categorie = categorie;
  }
}
