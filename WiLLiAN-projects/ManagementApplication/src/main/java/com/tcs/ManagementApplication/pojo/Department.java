package com.tcs.ManagementApplication.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
  private Integer id;
  private String name;
  private LocalDateTime createTime;
  private LocalDateTime updateTime;
}
