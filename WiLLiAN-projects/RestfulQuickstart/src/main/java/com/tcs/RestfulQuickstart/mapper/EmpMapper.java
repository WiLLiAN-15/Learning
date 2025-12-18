package com.tcs.RestfulQuickstart.mapper;

import com.tcs.RestfulQuickstart.pojo.Emp;
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
}
