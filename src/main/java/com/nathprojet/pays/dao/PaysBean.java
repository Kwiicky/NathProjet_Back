package com.nathprojet.pays.dao;

import javax.persistence.*;

/**
 * Created by FP13694 on 20/01/2019.
 */
@Entity
@Table(name = "pays")
public class PaysBean {
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  Integer id;

  String pays;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getPays() {
    return pays;
  }

  public void setPays(String pays) {
    this.pays = pays;
  }
}
