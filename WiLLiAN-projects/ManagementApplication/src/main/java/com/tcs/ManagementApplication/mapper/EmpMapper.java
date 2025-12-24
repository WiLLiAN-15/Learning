package com.tcs.ManagementApplication.mapper;

import com.tcs.ManagementApplication.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDate;
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

  /**
   * Select an Emp
   * @param id
   * @return
   */
  Employee getEmpByID(Integer id);

  List<Employee> selectEmp(
      @Param("name") String name,
      @Param("gender") Integer gender,
      @Param("begin") LocalDate begin,
      @Param("end") LocalDate end
      );

}
