package com.tcs.ManagementApplication.mapper;

import com.tcs.ManagementApplication.pojo.Expr;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ExprMapper {
  List<Expr> getExprByID(Integer id);
}
