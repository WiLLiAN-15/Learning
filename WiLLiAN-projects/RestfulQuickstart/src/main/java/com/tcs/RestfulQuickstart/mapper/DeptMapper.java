package com.tcs.RestfulQuickstart.mapper;

import com.tcs.RestfulQuickstart.pojo.Dept;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DeptMapper {

  @Select("SELECT * FROM dept")
  List<Dept> lis();
}
