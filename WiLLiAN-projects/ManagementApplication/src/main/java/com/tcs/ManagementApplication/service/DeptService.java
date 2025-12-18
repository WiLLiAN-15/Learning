package com.tcs.ManagementApplication.service;

import com.tcs.ManagementApplication.pojo.Department;

import java.util.List;

public interface DeptService {
  List<Department> findAllDepartment();

  void deleteDeptByID(int id);

  void addDept(String name);

  List<Department> getDeptByID(int id);

  void changeDeptName(int id, String name);
}
