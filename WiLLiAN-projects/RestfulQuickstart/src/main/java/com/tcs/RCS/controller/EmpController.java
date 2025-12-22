package com.tcs.RCS.controller;

import com.tcs.RCS.pojo.Emp;
import com.tcs.RCS.pojo.PageResult;
import com.tcs.RCS.pojo.Result;
import com.tcs.RCS.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;


@Slf4j
@RequestMapping("/emps")
@RestController
public class EmpController {
  @Autowired
  private EmpService empService;

  @GetMapping
  public Result page(@RequestParam(defaultValue = "1") Integer page,
                     @RequestParam(defaultValue = "10") Integer pageSize) {
    log.info("分割検索 page: {}, pageSize: {}", page, pageSize);
    PageResult<Emp> pageResult = empService.page(page, pageSize);
    return Result.success(pageResult);
  }

  @PostMapping
  public Result save(@RequestBody Emp emp) {
    emp.setCreateTime(LocalDateTime.now());
    emp.setUpdateTime(LocalDateTime.now());
    emp.setPassword("123456");
    log.info("Request Parm emp: {}", emp);

    empService.save(emp);
    return Result.success();
  }

  @DeleteMapping
  public Result delete(@RequestParam List<Integer> ids) {
    log.info("Delete ids: {}", ids);

    empService.deleteByIds(ids);
    return Result.success();
  }

  @PutMapping
  public Result change(@RequestParam Integer id,
                       @RequestParam String phone) {
    log.info("Change Phone Number: {}, {}", id, phone);

    empService.change(id, phone);
    return Result.success();
  }

}
