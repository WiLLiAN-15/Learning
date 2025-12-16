package com.tcs.ManagementApplication.mapper;

import com.tcs.ManagementApplication.pojo.Department;
import com.tcs.ManagementApplication.pojo.Employee;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MyMapper {
  List<Employee> findAllEmployee();

  List<Department> findAllDepartment();

  void deleteDeptByID(int id);

  void addDept(String name);

  List<Department> getDeptByID(int id);

  void changeDeptName(@Param("id") int id, @Param("name") String name);
}
