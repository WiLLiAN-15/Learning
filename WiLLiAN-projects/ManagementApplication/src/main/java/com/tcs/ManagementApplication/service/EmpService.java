package com.tcs.ManagementApplication.service;

import com.tcs.ManagementApplication.pojo.DTO.EmpRequest;
import com.tcs.ManagementApplication.pojo.DTO.EmpResponse;
import com.tcs.ManagementApplication.pojo.Employee;

import java.time.LocalDate;
import java.util.List;

public interface EmpService {
  List<Employee> findAllEmployee();

  List<Employee> getEmpsByQuery(String name, Integer gender,
                                LocalDate begin, LocalDate end,
                                Integer page, Integer pageSize);

  void deleteEmpsByID(List<Integer> ids);

  void addEmp(EmpRequest request);

  EmpResponse getEmpByID(Integer id);

  void modifyEmp(EmpRequest request);
}
