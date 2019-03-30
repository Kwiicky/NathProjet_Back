package com.nathprojet.photo.dao;

import com.nathprojet.article.dao.ArticleBean;

import javax.persistence.*;
import java.awt.*;
import java.util.Set;

/**
 * Created by fp13694 on 03/02/2019.
 */
@Entity
@Table(name = "photo")
public class PhotoBean {

  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  Integer id;

  byte[] photo;

  @OneToMany(mappedBy = "age", cascade = CascadeType.ALL)
  private Set<ArticleBean> articles;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public byte[] getPhoto() {
    return photo;
  }

  public void setPhoto(byte[] photo) {
    this.photo = photo;
  }

  public Set<ArticleBean> getArticles() {
    return articles;
  }

  public void setArticles(Set<ArticleBean> articles) {
    this.articles = articles;
  }
}
