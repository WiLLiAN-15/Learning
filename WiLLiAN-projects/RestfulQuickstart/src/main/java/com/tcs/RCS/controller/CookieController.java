package com.tcs.RCS.controller;

import com.tcs.RCS.pojo.Result;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class CookieController {

  @GetMapping("/c1")
  public Result cookie1(HttpServletResponse response) {
    response.addCookie(new Cookie("login_username", "admin"));
    return Result.success();
  }

  @GetMapping("/c2")
  public Result cookie2(HttpServletRequest request) {
    Cookie[] cookies = request.getCookies();
    for (Cookie cookie : cookies) {
      if (cookie.getName().equals("login_username")) {
        log.info("login_username: {}", cookie.getValue());
      }
    }
    return Result.success();
  }
}
