package com.tcs.ManagementApplication.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

  private int id;
  private String username;
  private String password;
  private String name;
  private int gender;
  private String phone;
  private int job;
  private int salary;
  private String image;
  private LocalDateTime entryDate;
  private int deptId;
  private LocalDateTime createTime;
  private LocalDateTime updateTime;
}
