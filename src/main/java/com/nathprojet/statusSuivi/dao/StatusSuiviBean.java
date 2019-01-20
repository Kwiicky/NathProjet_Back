package com.nathprojet.statusSuivi.dao;

import javax.persistence.*;

/**
 * Created by FP13694 on 20/01/2019.
 */
@Entity
@Table(name = "statusSuivi")
public class StatusSuiviBean {
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  Integer id;

  String status;

  String tracking;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getTracking() {
    return tracking;
  }

  public void setTracking(String tracking) {
    this.tracking = tracking;
  }
}
