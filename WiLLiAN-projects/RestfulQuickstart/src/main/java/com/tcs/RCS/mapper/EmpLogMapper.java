package com.tcs.RCS.mapper;

import com.tcs.RCS.pojo.EmpLog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmpLogMapper {

  @Insert("")
  void insert(EmpLog log);
}
