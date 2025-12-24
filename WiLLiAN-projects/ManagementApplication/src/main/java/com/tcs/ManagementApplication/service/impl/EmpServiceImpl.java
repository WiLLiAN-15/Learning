package com.tcs.ManagementApplication.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.tcs.ManagementApplication.mapper.EmpMapper;
import com.tcs.ManagementApplication.mapper.ExprMapper;
import com.tcs.ManagementApplication.pojo.DTO.EmpQuery;
import com.tcs.ManagementApplication.pojo.DTO.EmpRequest;
import com.tcs.ManagementApplication.pojo.DTO.EmpResponse;
import com.tcs.ManagementApplication.pojo.Employee;
import com.tcs.ManagementApplication.pojo.Expr;
import com.tcs.ManagementApplication.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
  @Autowired
  private EmpMapper empMapper;

  @Autowired
  private ExprMapper exprMapper;

  @Override
  public List<Employee> findAllEmployee() {
    return empMapper.findAllEmployee();
  }

  @Override
  public List<Employee> getEmpsByQuery(EmpQuery query) {
    PageHelper.startPage(query.page(), query.pageSize());

    List<Employee> lst = empMapper.selectEmp(query.name(), query.gender(), query.begin(), query.end());
    Page<Employee> p = (Page<Employee>) lst;

    return p.getResult();
  }

  @Override
  public void deleteEmpsByID(List<Integer> ids) {
    empMapper.deleteEmpsByID(ids);
  }

  @Override
  public void addEmp(EmpRequest request) {

  }

  @Override
  public EmpResponse getEmpByID(Integer id) {
    Employee emp = empMapper.getEmpByID(id);
    List<Expr> exprList = exprMapper.getExprByID(id);
    return EmpResponse.toEmpResponse(emp, exprList);
  }

  @Override
  public void modifyEmp(EmpRequest request) {

  }
}
