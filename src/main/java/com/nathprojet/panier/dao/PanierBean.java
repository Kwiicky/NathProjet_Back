package com.nathprojet.panier.dao;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.nathprojet.article.dao.ArticleBean;
import com.nathprojet.commande.dao.CommandeBean;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by FP13694 on 20/01/2019.
 */
@Entity
@Table(name = "panier")
public class PanierBean {

  @Id
  String id;

  @Transient
  @JsonProperty("listeArticle")
  List<ArticleBean> listeArticle;

  @OneToOne
  CommandeBean commandeBean;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public List<ArticleBean> getListeArticle() {
    return listeArticle;
  }

  public void setListeArticle(List<ArticleBean> listeArticle) {
    this.listeArticle = listeArticle;
  }

  public CommandeBean getCommandeBean() {
    return commandeBean;
  }

  public void setCommandeBean(CommandeBean commandeBean) {
    this.commandeBean = commandeBean;
  }
}
