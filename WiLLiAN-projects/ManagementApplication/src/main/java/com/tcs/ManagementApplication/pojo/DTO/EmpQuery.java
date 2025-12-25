package com.tcs.ManagementApplication.pojo.DTO;

import java.time.LocalDate;

public record EmpQuery(
    String name,
    Integer gender,
    LocalDate begin,
    LocalDate end,
    Integer page,
    Integer pageSize
) {}
