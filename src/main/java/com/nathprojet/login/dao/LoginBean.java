package com.nathprojet.login.dao;

import com.nathprojet.role.dao.RoleBean;

import javax.persistence.*;

/**
 * Created by FP13694 on 20/01/2019.
 */
@Entity
@Table(name = "login")
public class LoginBean {
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  Integer id;

  String mail;

  String mdp;

  RoleBean role;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  public String getMdp() {
    return mdp;
  }

  public void setMdp(String mdp) {
    this.mdp = mdp;
  }

  public RoleBean getRole() {
    return role;
  }

  public void setRole(RoleBean role) {
    this.role = role;
  }
}
