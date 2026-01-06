package com.tcs.RCS.service.impl;

import com.tcs.RCS.mapper.UserMapper;
import com.tcs.RCS.pojo.User;
import com.tcs.RCS.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
  @Autowired
  private UserMapper userMapper;

  @Override
  public User getUser(User tUser) {
    return userMapper.selectByUser(tUser);
  }
}
