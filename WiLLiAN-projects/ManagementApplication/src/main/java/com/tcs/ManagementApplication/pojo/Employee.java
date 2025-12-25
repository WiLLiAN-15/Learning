package com.tcs.ManagementApplication.pojo;

import com.tcs.ManagementApplication.pojo.DTO.EmpRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
  private Integer id;
  private String username;
  private String password;
  private String name;
  private Integer gender;
  private String phone;
  private Integer job;
  private Integer salary;
  private String image;
  private LocalDate entryDate;
  private Integer deptId;
  private LocalDateTime createTime;
  private LocalDateTime updateTime;

  public Employee(EmpRequest req) {
    username = req.username();
    name = req.name();
    gender = req.gender();
    phone = req.phone();
    job = req.job();
    salary = req.salary();
    image = req.image();
    entryDate = req.entryDate();
    deptId = req.deptId();
  }

}
