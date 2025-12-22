package com.tcs.RCS.mapper;

import com.tcs.RCS.pojo.Emp;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface EmpMapper {
//  /**
//   * すべての社員情報を検索します
//   * @param start オフセット
//   * @param pageSize
//   * @return
//   */
//  @Select("SELECT emp.*, dept.name as dept_name FROM emp,dept WHERE emp.dept_id = dept.id LIMIT #{start},#{pageSize}")
//  List<Emp> list(Integer start, Integer pageSize);
  @Select("SELECT emp.*, dept.name as dept_name FROM emp LEFT JOIN dept ON emp.dept_id = dept.id")
  List<Emp> listPageHelper();

//  /**
//   * 総社員数を返します
//   * @return
//   */
//  @Select("SELECT count(*) FROM emp LEFT JOIN dept ON emp.dept_id = dept.id")
//  Long count();

  @Options(useGeneratedKeys = true, keyProperty = "id")
  @Insert("INSERT INTO emp(username, name, gender, phone, job, salary, image, entry_date, dept_id, create_time, update_time, password)\n" +
      "VALUES(#{username}, #{name}, #{gender}, #{phone}, #{job}, #{salary}, #{image}, #{entryDate}, #{deptId}, #{createTime}, #{updateTime}, #{password})")
  void insert(Emp emp);

  void deleteByIds(List<Integer> ids);

  @Update("UPDATE emp SET phone = #{phone} WHERE id = #{id}")
  void update(@Param("id") Integer id,
              @Param("phone") String phone);
}
