package com.tcs.ManagementApplication.controller;

import com.tcs.ManagementApplication.pojo.DTO.AddEmpsRequest;
import com.tcs.ManagementApplication.pojo.Employee;
import com.tcs.ManagementApplication.pojo.Result;
import com.tcs.ManagementApplication.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/emps")
public class EmpController {
  @Autowired
  private EmpService myService;

  @GetMapping
  public Result getEmpsByQuery(
      String name,
      int gender,
      LocalDate begin,
      LocalDate end,
      int page,
      int pageSize
      ) {
    List<Employee> result = myService.getEmpsByQuery(name, gender, begin, end, page, pageSize);
    return Result.success(result);
  }

  @DeleteMapping
  public Result deleteEmpsByID(List<Integer> ids) {
    myService.deleteEmpsByID(ids);
    return Result.success();
  }

  @PostMapping
  public Result addEmp(@RequestBody AddEmpsRequest request) {
    myService.addEmp(request);
    return Result.success();
  }

  @GetMapping("/{id}")
  public Result getEmpByID(@PathVariable int id) {
    Employee result = myService.getEmpByID(id);
    return Result.success(result);
  }

  @PutMapping
  public Result modifyEmp(@RequestBody Employee emp) {
    myService.modifyEmp(emp);
    return Result.success();
  }

  @GetMapping("/list")
  public Result getAllEmps() {
    List<Employee> result = myService.findAllEmployee();
    return Result.success(result);
  }
}
