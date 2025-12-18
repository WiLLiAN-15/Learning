package com.tcs.RestfulQuickstart.service;

import com.tcs.RestfulQuickstart.pojo.Emp;
import com.tcs.RestfulQuickstart.pojo.PageResult;


public interface EmpService {
  PageResult<Emp> page(Integer page, Integer pageSize);
}
