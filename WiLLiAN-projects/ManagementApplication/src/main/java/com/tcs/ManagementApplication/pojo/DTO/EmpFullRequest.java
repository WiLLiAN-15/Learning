package com.tcs.ManagementApplication.pojo.DTO;

import com.tcs.ManagementApplication.pojo.Expr;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public record EmpFullRequest(
    Integer id,
    String password,
    String image,
    String username,
    String name,
    Integer gender,
    Integer job,
    LocalDate entryDate,
    Integer deptId,
    String phone,
    Integer salary,
    LocalDateTime createTime,
    LocalDateTime updateTime,
    List<Expr> exprList
) {}
