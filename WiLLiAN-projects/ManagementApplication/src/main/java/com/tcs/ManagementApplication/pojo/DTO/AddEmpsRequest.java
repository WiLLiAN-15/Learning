package com.tcs.ManagementApplication.pojo.DTO;

import java.time.LocalDate;


public record AddEmpsRequest(
  String image,
  String username,
  String name,
  Integer gender,
  Integer job,
  LocalDate entryDate,
  Integer deptId,
  String phone,
  Integer salary
) {}

