package com.tcs.ManagementApplication.pojo.DTO;

import java.time.LocalDate;


public record PastJob(
  String company,
  String job,
  LocalDate begin,
  LocalDate end
) {}
