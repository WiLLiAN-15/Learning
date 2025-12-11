package com.tcs.RestfulQuickstart.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AGV {
  private Integer id;
  private Integer navType;
  private String eName;
  private String type;
  private LocalDateTime createTime;
  private LocalDateTime updateTime;

}
