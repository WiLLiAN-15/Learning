package com.tcs.ManagementApplication.pojo.DTO;

import java.time.LocalDate;
import java.util.List;


public record EmpRequest(
  String image,
  String username,
  String name,
  Integer gender,
  Integer job,
  LocalDate entryDate,
  Integer deptId,
  String phone,
  Integer salary,
  List<ExprResponse> exprList
) {}

