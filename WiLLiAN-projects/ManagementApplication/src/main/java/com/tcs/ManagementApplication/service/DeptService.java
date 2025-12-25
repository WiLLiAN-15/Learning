package com.tcs.ManagementApplication.service;

import com.tcs.ManagementApplication.pojo.Department;

import java.util.List;

public interface DeptService {
  List<Department> findAllDepartment();

  void deleteDeptByID(Integer id);

  void addDept(String name);

  List<Department> getDeptByID(Integer id);

  void changeDeptName(Integer id, String name);
}
