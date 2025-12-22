package com.tcs.RCS.mapper;

import com.tcs.RCS.pojo.AGV;
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

  @Insert("insert into temp02 (e_name, create_time, update_time) values (#{name}, now(), now())")
  void insertAGV(String name);

  @Select("select * from temp02 where id = #{id}")
  AGV findByID(Integer id);

  @Update("update temp02 set e_name = #{name} where id = #{id}")
  void updateByID(Integer id, String name);

}
