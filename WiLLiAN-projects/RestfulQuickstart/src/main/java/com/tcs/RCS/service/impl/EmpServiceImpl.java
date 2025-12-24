package com.tcs.RCS.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.tcs.RCS.mapper.EmpExprMapper;
import com.tcs.RCS.mapper.EmpMapper;
import com.tcs.RCS.pojo.Emp;
import com.tcs.RCS.pojo.EmpExpr;
import com.tcs.RCS.pojo.EmpLog;
import com.tcs.RCS.pojo.PageResult;
import com.tcs.RCS.service.EmpLogService;
import com.tcs.RCS.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
  @Autowired
  private EmpMapper empMapper;

  @Autowired
  private EmpExprMapper empExprMapper;

  @Autowired
  private EmpLogService empLogService;

  @Override
  public PageResult<Emp> page(Integer page, Integer pageSize) {
//    //1. 総従業員数を取得
//    Long total = empMapper.count();
//
//    //2. 表示する従業員の情報を取得
//    Integer start = (page - 1) * pageSize;
//    List<Emp> list = empMapper.list(start, pageSize);

//    return new PageResult<>(total, list);

    // PageHelperを使った実装
    PageHelper.startPage(page, pageSize);
    List<Emp> empList = empMapper.listPageHelper();
    Page<Emp> p = (Page<Emp>) empList;
    return new PageResult<>(p.getTotal(), p.getResult());
  }

  @Override
  @Transactional(rollbackFor = {Exception.class})
  public void save(Emp emp) {
    try{
      emp.setCreateTime(LocalDateTime.now());
      emp.setUpdateTime(LocalDateTime.now());
      emp.setPassword("123456");
      empMapper.insert(emp);
      Integer i = 1/0;

      Integer empId = emp.getId();
      List<EmpExpr> exprList = emp.getExprList();
      if(!exprList.isEmpty()) {
        exprList.forEach(empExpr -> empExpr.setEmpId(empId));
        empExprMapper.insertBatch(exprList);
      }
    } finally {
      EmpLog emplog = new EmpLog();
      empLogService.insertlog(emplog);
    }
  }

  @Override
  public void change(Integer id, String phone) {
    empMapper.update(id, phone);
  }

  @Override
  public void deleteByIds(List<Integer> ids) {
    empMapper.deleteByIds(ids);
  }
}