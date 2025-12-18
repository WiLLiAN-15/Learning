package com.tcs.ManagementApplication.pojo.DTO;

import java.time.LocalDate;


public record Expr(
  String company,
  String job,
  LocalDate begin,
  LocalDate end
) {}
