package com.tcs.ManagementApplication.service;

import com.tcs.ManagementApplication.mapper.MyMapper;
import com.tcs.ManagementApplication.pojo.Department;
import com.tcs.ManagementApplication.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyService {
  @Autowired
  private MyMapper myMapper;
  
  public List<Employee> findAllEmployee() {
    return myMapper.findAllEmployee();
  }

  public List<Department> findAllDepartment() {
    return myMapper.findAllDepartment();
  }
}
