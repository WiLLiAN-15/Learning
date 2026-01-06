package com.tcs.RCS.controller;

import com.tcs.RCS.pojo.Result;
import com.tcs.RCS.pojo.User;
import com.tcs.RCS.service.UserService;
import com.tcs.RCS.utils.JwtUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping
public class UserController {
  @Autowired
  private UserService userService;

  @PostMapping("/login")
  public Result login(@RequestBody User tUser) {
    log.info("Try Login -- username: {}, password: {}", tUser.getUsername(), tUser.getPassword());
    User res = userService.getUser(tUser);
    if (res != null) {
      Map<String, Object> dataMap = new HashMap<>();
      dataMap.put("id", res.getId());
      dataMap.put("username", res.getUsername());

      res.setToken(JwtUtils.generateToken(dataMap));
      return Result.success(res);
    }
    return Result.error("ログイン失敗");
  }

}
