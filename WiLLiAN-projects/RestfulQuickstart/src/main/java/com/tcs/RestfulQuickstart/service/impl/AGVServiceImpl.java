package com.tcs.RestfulQuickstart.service.impl;

import com.tcs.RestfulQuickstart.mapper.AGVMapper;
import com.tcs.RestfulQuickstart.pojo.AGV;
import com.tcs.RestfulQuickstart.pojo.AGVResponse;
import com.tcs.RestfulQuickstart.service.AGVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AGVServiceImpl implements AGVService {

  @Autowired
  private AGVMapper agvMapper;

  @Override
  public List<AGV> findAll() {
    return agvMapper.findAll();
  }

  @Override
  public List<AGVResponse> checkAGVs() {
    return agvMapper.findAll().stream()
        .map(AGVResponse::new)
        .toList();
  }

  @Override
  public void deleteByID(Integer id) {
    agvMapper.deleteByID(id);
  }

  @Override
  public void insertAGV(String name) {
    agvMapper.insertAGV(name);
  }


}
