package com.tcs.RestfulQuickstart.mapper;

import com.tcs.RestfulQuickstart.pojo.AGV;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface AGVMapper {
  /**
   * find all AGVs
   * @return
   */
  @Select("SELECT * FROM temp02")
  List<AGV> findAll();

  @Delete("DELETE FROM temp02 WHERE id = #{id}")
  void deleteByID(Integer id);

  @Insert("insert into db01.temp02 (e_name, create_time, update_time) values (#{name}, now(), now())")
  void insertAGV(String name);

}
