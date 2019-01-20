package com.nathprojet.article.dao;

import com.nathprojet.age.dao.AgeBean;

import javax.persistence.*;

/**
 * Created by FP13694 on 20/01/2019.
 */
@Entity
@Table(name = "article")
public class ArticleBean {

  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  Integer id;

  String titre;

  Integer categorie;

  Float prix;

  AgeBean age;

  String reference;

  Integer photo;

  Integer marque;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTitre() {
    return titre;
  }

  public void setTitre(String titre) {
    this.titre = titre;
  }

  public Integer getCategorie() {
    return categorie;
  }

  public void setCategorie(Integer categorie) {
    this.categorie = categorie;
  }

  public Float getPrix() {
    return prix;
  }

  public void setPrix(Float prix) {
    this.prix = prix;
  }

  public AgeBean getAge() {
    return age;
  }

  public void setAge(AgeBean age) {
    this.age = age;
  }

  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public Integer getPhoto() {
    return photo;
  }

  public void setPhoto(Integer photo) {
    this.photo = photo;
  }

  public Integer getMarque() {
    return marque;
  }

  public void setMarque(Integer marque) {
    this.marque = marque;
  }
}
