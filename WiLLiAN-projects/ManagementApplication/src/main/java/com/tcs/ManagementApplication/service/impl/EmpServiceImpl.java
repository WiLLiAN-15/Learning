package com.tcs.ManagementApplication.service.impl;

import com.tcs.ManagementApplication.mapper.EmpMapper;
import com.tcs.ManagementApplication.pojo.DTO.AddEmpsRequest;
import com.tcs.ManagementApplication.pojo.Employee;
import com.tcs.ManagementApplication.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
  @Autowired
  private EmpMapper empMapper;

  @Override
  public List<Employee> findAllEmployee() {
    return empMapper.findAllEmployee();
  }

  @Override
  public List<Employee> getEmpsByQuery(String name, Integer gender, LocalDate begin, LocalDate end, Integer page, Integer pageSize) {
    return List.of();
  }

  @Override
  public void deleteEmpsByID(List<Integer> ids) {

  }

  @Override
  public void addEmp(AddEmpsRequest request) {

  }

  @Override
  public Employee getEmpByID(Integer id) {
    return null;
  }

  @Override
  public void modifyEmp(Employee emp) {

  }
}
