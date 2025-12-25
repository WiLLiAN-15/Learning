package com.tcs.ManagementApplication.service;

import com.tcs.ManagementApplication.pojo.DTO.EmpFullRequest;
import com.tcs.ManagementApplication.pojo.DTO.EmpQuery;
import com.tcs.ManagementApplication.pojo.DTO.EmpRequest;
import com.tcs.ManagementApplication.pojo.DTO.EmpResponse;
import com.tcs.ManagementApplication.pojo.Employee;

import java.util.List;

public interface EmpService {
  List<Employee> findAllEmployee();

  List<Employee> getEmpsByQuery(EmpQuery query);

  void deleteEmpsByID(List<Integer> ids);

  void addEmp(EmpRequest request);

  EmpResponse getEmpByID(Integer id);

  void modifyEmp(EmpFullRequest request);
}
