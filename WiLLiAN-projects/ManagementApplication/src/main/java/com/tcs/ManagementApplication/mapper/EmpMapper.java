package com.tcs.ManagementApplication.mapper;

import com.tcs.ManagementApplication.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmpMapper {
  /**
   * Select All Emp
   * @return
   */
  List<Employee> findAllEmployee();

  /**
   * Delete Multiple Emp
   * @param ids
   */
  void deleteEmpsByID(List<Integer> ids);

}
