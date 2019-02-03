package com.nathprojet.panier.dao;

import com.nathprojet.article.dao.ArticleBean;
import com.nathprojet.commande.dao.CommandeBean;

import javax.persistence.*;

/**
 * Created by FP13694 on 20/01/2019.
 */
@Entity
@Table(name = "panier")
public class PanierBean {
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  Integer id;

  @OneToOne
  ArticleBean articleBean;

  @OneToOne
  CommandeBean commandeBean;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ArticleBean getArticleBean() {
    return articleBean;
  }

  public void setArticleBean(ArticleBean articleBean) {
    this.articleBean = articleBean;
  }

  public CommandeBean getCommandeBean() {
    return commandeBean;
  }

  public void setCommandeBean(CommandeBean commandeBean) {
    this.commandeBean = commandeBean;
  }
}
