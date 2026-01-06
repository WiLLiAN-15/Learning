package com.tcs.RCS.service;

import com.tcs.RCS.pojo.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
//  User login(String username, String password);
  User getUser(User tUser);
}
