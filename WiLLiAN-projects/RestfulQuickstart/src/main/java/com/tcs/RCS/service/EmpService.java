package com.tcs.RCS.service;

import com.tcs.RCS.pojo.Emp;
import com.tcs.RCS.pojo.PageResult;

import java.util.List;


public interface EmpService {
  PageResult<Emp> page(Integer page, Integer pageSize);

  /**
   * save new employee
   * @param emp
   */
  void save(Emp emp);

  void change(Integer id, String phone);

  void deleteByIds(List<Integer> ids);
}
