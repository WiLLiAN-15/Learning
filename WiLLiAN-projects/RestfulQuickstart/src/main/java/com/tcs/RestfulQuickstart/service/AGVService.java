package com.tcs.RestfulQuickstart.service;

import com.tcs.RestfulQuickstart.pojo.AGV;
import com.tcs.RestfulQuickstart.pojo.AGVResponse;

import java.util.List;

public interface AGVService {
  List<AGV> findAll();

  List<AGVResponse> checkAGVs();

  void deleteByID(Integer id);

  void insertAGV(String name);
}
