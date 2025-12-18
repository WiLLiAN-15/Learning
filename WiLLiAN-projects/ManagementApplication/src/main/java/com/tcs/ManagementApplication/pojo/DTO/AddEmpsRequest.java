package com.tcs.ManagementApplication.pojo.DTO;

import java.time.LocalDate;


public record AddEmpsRequest(
  String image,
  String username,
  String name,
  int gender,
  int job,
  LocalDate entryDate,
  int deptId,
  String phone,
  int salary
) {}

