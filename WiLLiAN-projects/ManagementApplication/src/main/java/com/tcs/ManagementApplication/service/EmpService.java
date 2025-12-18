package com.tcs.ManagementApplication.service;

import com.tcs.ManagementApplication.pojo.DTO.AddEmpsRequest;
import com.tcs.ManagementApplication.pojo.Employee;

import java.time.LocalDate;
import java.util.List;

public interface EmpService {
  List<Employee> findAllEmployee();

  List<Employee> getEmpsByQuery(String name, Integer gender,
                                LocalDate begin, LocalDate end,
                                Integer page, Integer pageSize);

  void deleteEmpsByID(List<Integer> ids);

  void addEmp(AddEmpsRequest request);

  Employee getEmpByID(Integer id);

  void modifyEmp(Employee emp);
}
