package com.nathprojet.role.dao;

import javax.persistence.*;

/**
 * Created by FP13694 on 20/01/2019.
 */
@Entity
@Table(name = "role")
public class RoleBean {
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  Integer id;

  String role;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }
}
