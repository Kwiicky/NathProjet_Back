package com.nathprojet.article.dao;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.nathprojet.photo.dao.PhotoBean;

import javax.persistence.*;

/**
 * Created by FP13694 on 20/01/2019.
 */
public class ArticleSearchBean {

  String titre;

  String categorie;

  String age;

  String reference;

  String marque;

  String qualite;

  public String getTitre() {
    return titre;
  }

  public void setTitre(String titre) {
    this.titre = titre;
  }

  public String getCategorie() {
    return categorie;
  }

  public void setCategorie(String categorie) {
    this.categorie = categorie;
  }

  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }

  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public String getMarque() {
    return marque;
  }

  public void setMarque(String marque) {
    this.marque = marque;
  }

  public String getQualite() {
    return qualite;
  }

  public void setQualite(String qualite) {
    this.qualite = qualite;
  }
}
