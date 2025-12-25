package com.tcs.ManagementApplication.pojo.DTO;

import com.tcs.ManagementApplication.pojo.Employee;
import com.tcs.ManagementApplication.pojo.Expr;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;


public record EmpResponse(
    Integer id,
    String username,
    String password,
    String name,
    Integer gender,
    String phone,
    Integer job,
    Integer salary,
    String image,
    LocalDate entryDate,
    Integer deptId,
    LocalDateTime createTime,
    LocalDateTime updateTime,
    List<Expr> exprList
) {
  public static EmpResponse toEmpResponse(Employee emp, List<Expr> exprList) {
    return new EmpResponse(
        emp.getId(),
        emp.getUsername(),
        emp.getPassword(),
        emp.getName(),
        emp.getGender(),
        emp.getPhone(),
        emp.getJob(),
        emp.getSalary(),
        emp.getImage(),
        emp.getEntryDate(),
        emp.getDeptId(),
        emp.getCreateTime(),
        emp.getUpdateTime(),
        exprList
    );
  }
}
