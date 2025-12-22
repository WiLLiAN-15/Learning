package com.tcs.RCS.service;

import com.tcs.RCS.pojo.AGV;
import com.tcs.RCS.pojo.AGVResponse;

import java.util.List;

public interface AGVService {
  List<AGV> findAll();

  List<AGVResponse> checkAGVs();

  void deleteByID(Integer id);

  void insertAGV(String name);

  List<AGVResponse> CheckAGVByID(Integer id);

  void updateAGVByID(Integer id, String name);

}
