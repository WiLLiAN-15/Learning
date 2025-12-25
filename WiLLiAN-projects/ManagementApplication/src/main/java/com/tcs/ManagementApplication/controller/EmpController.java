package com.tcs.ManagementApplication.controller;

import com.tcs.ManagementApplication.pojo.DTO.EmpFullRequest;
import com.tcs.ManagementApplication.pojo.DTO.EmpQuery;
import com.tcs.ManagementApplication.pojo.DTO.EmpRequest;
import com.tcs.ManagementApplication.pojo.DTO.EmpResponse;
import com.tcs.ManagementApplication.pojo.Employee;
import com.tcs.ManagementApplication.pojo.Result;
import com.tcs.ManagementApplication.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emps")
public class EmpController {
  @Autowired
  private EmpService myService;

  @GetMapping
  public Result getEmpsByQuery(EmpQuery query) {
    List<Employee> result = myService.getEmpsByQuery(query);
    return Result.success(result);
  }

  @DeleteMapping
  public Result deleteEmpsByID(@RequestParam List<Integer> ids) {
    myService.deleteEmpsByID(ids);
    return Result.success();
  }

  @PostMapping
  public Result addEmp(@RequestBody EmpRequest request) {
    myService.addEmp(request);
    return Result.success();
  }

  @GetMapping("/{id}")
  public Result getEmpByID(@PathVariable Integer id) {
    EmpResponse result = myService.getEmpByID(id);
    return Result.success(result);
  }

  @PutMapping
  public Result modifyEmp(@RequestBody EmpFullRequest emp) {
    myService.modifyEmp(emp);
    return Result.success();
  }

  @GetMapping("/list")
  public Result getAllEmps() {
    List<Employee> result = myService.findAllEmployee();
    return Result.success(result);
  }
}
