package com.tcs.ManagementApplication.pojo;

import com.tcs.ManagementApplication.pojo.DTO.EmpQuery;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
  private LocalDateTime entryDate;
  private Integer deptId;
  private LocalDateTime createTime;
  private LocalDateTime updateTime;
}
