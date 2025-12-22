package com.tcs.RCS.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AGVResponse {
  private Integer id;
  private String name;
  private LocalDateTime createTime;
  private LocalDateTime updateTime;

  public AGVResponse(AGV agv) {
    id         = agv.getId();
    name       = agv.getEName();
    createTime = agv.getCreateTime();
    updateTime = agv.getUpdateTime();
  }
}
