package com.tcs.ManagementApplication.controller;

import com.tcs.ManagementApplication.pojo.DTO.AddEmpsRequest;
import com.tcs.ManagementApplication.pojo.Employee;
import com.tcs.ManagementApplication.pojo.Result;
import com.tcs.ManagementApplication.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/emps")
public class EmpController {
  @Autowired
  public MyService myService;

  @GetMapping
  public Result getEmpsByQuery(
      String name,
      int gender,
      @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate begin,
      @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate end,
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
  public Result addEmps(@RequestBody AddEmpsRequest request) {
    myService.addEmps(request);
    return Result.success();
  }
}
