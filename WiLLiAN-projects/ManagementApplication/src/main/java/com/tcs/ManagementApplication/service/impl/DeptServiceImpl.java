package com.tcs.ManagementApplication.service.impl;

import com.tcs.ManagementApplication.mapper.DeptMapper;
import com.tcs.ManagementApplication.pojo.Department;
import com.tcs.ManagementApplication.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
  @Autowired
  private DeptMapper deptMapper;

  @Override
  public List<Department> findAllDepartment() {
    return deptMapper.findAllDepartment();
  }

  @Override
  public void deleteDeptByID(Integer id) {
    deptMapper.deleteDeptByID(id);
  }

  @Override
  public void addDept(String name) {
    deptMapper.addDept(name);
  }

  @Override
  public List<Department> getDeptByID(Integer id) {
    return deptMapper.getDeptByID(id);
  }

  @Override
  public void changeDeptName(Integer id, String name) {
    deptMapper.changeDeptName(id, name);
  }
}
