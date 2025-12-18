package com.tcs.RestfulQuickstart.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.tcs.RestfulQuickstart.mapper.EmpMapper;
import com.tcs.RestfulQuickstart.pojo.Emp;
import com.tcs.RestfulQuickstart.pojo.PageResult;
import com.tcs.RestfulQuickstart.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
  @Autowired
  private EmpMapper empMapper;

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
}