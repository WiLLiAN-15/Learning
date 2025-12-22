package com.tcs.RCS.service.impl;

import com.tcs.RCS.mapper.AGVMapper;
import com.tcs.RCS.pojo.AGV;
import com.tcs.RCS.pojo.AGVResponse;
import com.tcs.RCS.service.AGVService;
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

  @Override
  public List<AGVResponse> CheckAGVByID(Integer id) {
    AGV agv = agvMapper.findByID(id);
    AGVResponse agvResponse = new AGVResponse(agv);
    return List.of(agvResponse);
  }

  @Override
  public void updateAGVByID(Integer id, String name) {
    agvMapper.updateByID(id, name);
  }


}
