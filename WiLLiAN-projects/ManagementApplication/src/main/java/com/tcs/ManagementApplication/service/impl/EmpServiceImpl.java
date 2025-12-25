package com.tcs.ManagementApplication.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.tcs.ManagementApplication.mapper.EmpMapper;
import com.tcs.ManagementApplication.mapper.ExprMapper;
import com.tcs.ManagementApplication.pojo.DTO.*;
import com.tcs.ManagementApplication.pojo.Employee;
import com.tcs.ManagementApplication.pojo.Expr;
import com.tcs.ManagementApplication.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

  @Transactional(rollbackFor = {Exception.class})
  @Override
  public void deleteEmpsByID(List<Integer> ids) {
    empMapper.deleteEmpsByID(ids);
    exprMapper.delete(ids);
  }

  @Transactional(rollbackFor = {Exception.class})
  @Override
  public void addEmp(EmpRequest request) {
    Employee emp = new Employee(request);
    emp.setPassword("123456");

    empMapper.insertEmp(emp);
    Integer empId = emp.getId();
    if (!request.exprList().isEmpty()) {
      List<Expr> exprList = request.exprList().stream().map(this::toExprEntity).toList();
      exprList.forEach(expr -> expr.setEmpId(empId));
      exprMapper.insertBatch(exprList);
    }
  }

  @Override
  public EmpResponse getEmpByID(Integer id) {
    Employee emp = empMapper.getEmpByID(id);
    List<Expr> exprList = exprMapper.getExprByID(id);
    return EmpResponse.toEmpResponse(emp, exprList);
  }

  @Transactional(rollbackFor = {Exception.class})
  @Override
  public void modifyEmp(EmpFullRequest req) {
    Employee emp = toEmpEntity(req);
    List<Expr> exprList = req.exprList();

    empMapper.update(emp);

    exprMapper.deleteByEmpId(emp.getId());
    exprMapper.insertBatch(exprList);
  }

  private Expr toExprEntity(ExprDTO dto) {
    Expr expr = new Expr();
    expr.setBegin(dto.begin());
    expr.setEnd(dto.end());
    expr.setJob(dto.job());
    expr.setCompany(dto.company());
    return expr;
  }

  private Employee toEmpEntity(EmpFullRequest dto) {
    Employee emp = new Employee();
    emp.setId(dto.id());
    emp.setPassword(dto.password());
    emp.setUsername(dto.username());
    emp.setName(dto.name());
    emp.setGender(dto.gender());
    emp.setPhone(dto.phone());
    emp.setJob(dto.job());
    emp.setSalary(dto.salary());
    emp.setImage(dto.image());
    emp.setEntryDate(dto.entryDate());
    emp.setDeptId(dto.deptId());
    emp.setCreateTime(dto.createTime());
    emp.setUpdateTime(dto.updateTime());
    return emp;
  }
}
