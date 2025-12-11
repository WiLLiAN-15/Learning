package com.tcs.RestfulQuickstart.controller;

import com.tcs.RestfulQuickstart.pojo.AGVResponse;
import com.tcs.RestfulQuickstart.pojo.Result;
import com.tcs.RestfulQuickstart.service.AGVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AGVController {

  @Autowired
  private AGVService agvService;

  /**
   * check All AGVs
   * @return
   */
//  @RequestMapping(value = "/AGVS", method = RequestMethod.GET)
  @GetMapping("/AGVS")
  public Result list() {
    System.out.println("Check All AGVs");
    List<AGVResponse> agvList = agvService.checkAGVs();
    return Result.success(agvList);
  }

  @DeleteMapping("/AGVS")
  public Result delete(Integer id) {
    System.out.println("Delete by ID: " + id);
    agvService.deleteByID(id);
    return Result.success();
  }

  @PostMapping("/AGVS")
  public Result insert(String name) {
    System.out.println("Insert AGV: " + name);
    agvService.insertAGV(name);
    return Result.success();
  }
}
