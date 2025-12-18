package com.tcs.ManagementApplication.pojo.DTO;

import java.time.LocalDate;


public record ExprResponse(
  String company,
  String job,
  LocalDate begin,
  LocalDate end
) {}
