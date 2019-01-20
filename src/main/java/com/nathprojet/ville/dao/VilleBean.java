package com.nathprojet.ville.dao;

import javax.persistence.*;

/**
 * Created by FP13694 on 20/01/2019.
 */
@Entity
@Table(name = "ville")
public class VilleBean {
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  Integer villeId;

  String villeNom;

  public Integer getVilleId() {
    return villeId;
  }

  public void setVilleId(Integer villeId) {
    this.villeId = villeId;
  }

  public String getVilleNom() {
    return villeNom;
  }

  public void setVilleNom(String villeNom) {
    this.villeNom = villeNom;
  }
}
