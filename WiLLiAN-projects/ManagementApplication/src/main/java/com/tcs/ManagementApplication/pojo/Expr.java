package com.tcs.ManagementApplication.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Expr {
  private Integer id;
  private String company;
  private String job;
  private LocalDate begin;
  private LocalDate end;
  private Integer empId;
}
