package com.tcs.ManagementApplication.service.impl;

import com.tcs.ManagementApplication.mapper.MyMapper;
import com.tcs.ManagementApplication.pojo.DTO.AddEmpsRequest;
import com.tcs.ManagementApplication.pojo.Department;
import com.tcs.ManagementApplication.pojo.Employee;
import com.tcs.ManagementApplication.service.DeptService;
import com.tcs.ManagementApplication.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class MyServiceImpl implements DeptService, EmpService {
  @Autowired
  private MyMapper myMapper;

  @Override
  public List<Department> findAllDepartment() {
    return myMapper.findAllDepartment();
  }

  @Override
  public void deleteDeptByID(int id) {
    myMapper.deleteDeptByID(id);
  }

  @Override
  public void addDept(String name) {
    myMapper.addDept(name);
  }

  @Override
  public List<Department> getDeptByID(int id) {
    return myMapper.getDeptByID(id);
  }

  @Override
  public void changeDeptName(int id, String name) {
    myMapper.changeDeptName(id, name);
  }

  @Override
  public List<Employee> findAllEmployee() {
    return myMapper.findAllEmployee();
  }

  @Override
  public List<Employee> getEmpsByQuery(String name, int gender, LocalDate begin, LocalDate end, int page, int pageSize) {
    return List.of();
  }

  @Override
  public void deleteEmpsByID(List<Integer> ids) {

  }

  @Override
  public void addEmp(AddEmpsRequest request) {

  }

  @Override
  public Employee getEmpByID(int id) {
    return null;
  }

  @Override
  public void modifyEmp(Employee emp) {

  }
}
