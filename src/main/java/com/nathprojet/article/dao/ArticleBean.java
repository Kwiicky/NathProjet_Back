package com.nathprojet.article.dao;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.nathprojet.photo.dao.PhotoBean;

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

  String categorie;

  Float prix;

  String age;

  String reference;

  String genre;

  @ManyToOne
  @JoinColumn
  @JsonIgnore
  PhotoBean photo;

  @ManyToOne
  @JoinColumn
  @JsonIgnore
  PhotoBean photo2;

  String marque;

  String qualite;

  String description;

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

  public String getCategorie() {
    return categorie;
  }

  public void setCategorie(String categorie) {
    this.categorie = categorie;
  }

  public Float getPrix() {
    return prix;
  }

  public void setPrix(Float prix) {
    this.prix = prix;
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

  public PhotoBean getPhoto() {
    return photo;
  }

  public void setPhoto(PhotoBean photo) {
    this.photo = photo;
  }

  public PhotoBean getPhoto2() {
    return photo2;
  }

  public void setPhoto2(PhotoBean photo2) {
    this.photo2 = photo2;
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

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }
}
