package com.nathprojet.codePostal.dao;

import javax.persistence.*;

/**
 * Created by FP13694 on 20/01/2019.
 */
@Entity
@Table(name = "code_postal")
public class CodePostalBean {
  @Id
  Integer id;

  String NomDepartement;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNomDepartement() {
    return NomDepartement;
  }

  public void setNomDepartement(String nomDepartement) {
    NomDepartement = nomDepartement;
  }
}
