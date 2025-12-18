package com.tcs.ManagementApplication.controller;

import com.tcs.ManagementApplication.pojo.Department;
import com.tcs.ManagementApplication.pojo.Result;
import com.tcs.ManagementApplication.service.impl.MyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/depts")
public class DeptController {
  @Autowired
  private MyServiceImpl myService;

  @GetMapping
  public Result getAllDept() {
    List<Department> result = myService.findAllDepartment();
    return Result.success(result);
  }

  @DeleteMapping
  public Result deleteDeptByID(int id) {
    myService.deleteDeptByID(id);
    return Result.success();
  }

  @PostMapping
  public Result addDept(String name) {
    myService.addDept(name);
    return Result.success();
  }

  @GetMapping("/{id}")
  public Result getDeptByID(@PathVariable int id) {
    List<Department> result = myService.getDeptByID(id);
    return Result.success(result);
  }

  @PutMapping()
  public Result changeDeptName(int id, String name) {
    myService.changeDeptName(id, name);
    return Result.success();
  }
}
