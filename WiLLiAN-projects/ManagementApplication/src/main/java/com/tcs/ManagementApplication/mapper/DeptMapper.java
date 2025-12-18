package com.tcs.ManagementApplication.mapper;

import com.tcs.ManagementApplication.pojo.Department;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DeptMapper {
  List<Department> findAllDepartment();

  void deleteDeptByID(Integer id);

  void addDept(String name);

  List<Department> getDeptByID(Integer id);

  void changeDeptName(@Param("id") Integer id, @Param("name") String name);
}
