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
   * check all AGVs or one by id
   * @param id AGV id
   * @return result
   */
//  @RequestMapping(value = "/AGVS", method = RequestMethod.GET)
  @GetMapping("/AGVS")
  public Result list(@RequestParam(required = false) Integer id) {

    if (id == null) {
      System.out.println("Check All AGVs");
      List<AGVResponse> agvList = agvService.checkAGVs();
      return Result.success(agvList);
    }
    else {
      System.out.println("Check AGV ID: " + id);
      List<AGVResponse> agv = agvService.CheckAGVByID(id);
      return Result.success(agv);
    }

  }

  /**
   * delete AGV by ID
   * @param id AGV id
   * @return result
   */
  @DeleteMapping("/AGVS")
  public Result delete(Integer id) {
    System.out.println("Delete by ID: " + id);
    agvService.deleteByID(id);
    return Result.success();
  }

  /**
   * insert new AGV
   * @param name AGV name
   * @return result
   */
  @PostMapping("/AGVS")
  public Result insert(String name) {
    System.out.println("Insert AGV: " + name);
    agvService.insertAGV(name);
    return Result.success();
  }

  /**
   * change AGV Name
   * @param id AGV id
   * @param name AGV new name
   * @return result
   */
  @PutMapping("/AGVS")
  public Result update(Integer id, String name) {
    System.out.println("Update AGV ID: " + id + ", New Name: " + name);
    agvService.updateAGVByID(id, name);
    return Result.success();
  }

}
