package com.tcs.ManagementApplication.pojo;

import com.tcs.ManagementApplication.pojo.DTO.EmpResponse;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class PageResult {
  long total;
  List<Employee> rows;
}
