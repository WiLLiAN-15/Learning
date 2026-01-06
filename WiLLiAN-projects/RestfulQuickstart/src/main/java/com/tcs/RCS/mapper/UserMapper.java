package com.tcs.RCS.mapper;

import com.tcs.RCS.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
  User selectByUser(User tUser);
}
