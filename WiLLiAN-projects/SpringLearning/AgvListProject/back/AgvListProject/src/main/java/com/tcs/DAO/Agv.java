package com.tcs.DAO;

import java.time.LocalDateTime;

public class Agv {
  private Integer id;
  private String enName;
  private String sn;
  private String name;
  private Integer type;
  private Integer navType;
  private LocalDateTime updateTime;

  public Agv(){
  }

  public Agv(Integer id,String enName,String sn,String name,
             Integer type,Integer navType,LocalDateTime updateTime){
    this.id = id;
    this.enName = enName;
    this.sn = sn;
    this.name = name;
    this.type = type;
    this.navType = navType;
    this.updateTime = updateTime;
  }

  public void setId(Integer id){
    this.id = id;
  }
  public Integer getId(){
    return id;
  }

  public void setEnName(String enName){
    this.enName = enName;
  }
  public String getEnName(){
    return enName;
  }

  public void setSn(String sn){
    this.sn = sn;
  }
  public String getSn(){
    return sn;
  }

  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return name;
  }

  public void setType(Integer type){
    this.type = type;
  }
  public Integer getType(){
    return type;
  }

  public void setNavType(Integer navType){
    this.navType = navType;
  }
  public Integer getNavType(){
    return navType;
  }

  public void setUpdateTime(LocalDateTime updateTime){
    this.updateTime = updateTime;
  }
  public LocalDateTime getUpdateTime(){
    return updateTime;
  }

}