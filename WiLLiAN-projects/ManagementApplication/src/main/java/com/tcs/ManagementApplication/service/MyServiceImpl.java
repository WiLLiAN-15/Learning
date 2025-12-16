package com.tcs.ManagementApplication.service;

import com.tcs.ManagementApplication.mapper.MyMapper;
import com.tcs.ManagementApplication.pojo.Department;
import com.tcs.ManagementApplication.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyServiceImpl implements MyService{
  @Autowired
  private MyMapper myMapper;

  @Override
  public List<Employee> findAllEmployee() {
    return myMapper.findAllEmployee();
  }

  @Override
  public List<Department> findAllDepartment() {
    return myMapper.findAllDepartment();
  }

  @Override
  public void deleteDeptByID(int id) {

  }

  @Override
  public void addDept(String name) {

  }

  @Override
  public List<Department> getDeptByID(int id) {
    return List.of();
  }

  @Override
  public void changeDeptName(int id, String name) {

  }
}
