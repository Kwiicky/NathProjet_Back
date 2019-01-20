package com.nathprojet.age.dao;

import javax.persistence.*;

/**
 * Created by FP13694 on 20/01/2019.
 */
@Entity
@Table(name = "age")
public class AgeBean {
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  Integer id;

  String age;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }
}
